package com.mycompany.encoder;

import java.io.ByteArrayOutputStream;
import java.util.Map;

import com.mycompany.data.AsmLine;
import com.mycompany.data.Mnemonic;
import com.mycompany.data.Register;

public class MnemonicEncoder {

    public int encodeMnemonic(final ByteArrayOutputStream byteArrayOutStream,
        final AsmLine asmLine, final Map<String, Long> labelAddressMap, final long currentAddress) {

        switch (asmLine.mnemonic) {

            case I_AUIPC:
                return encodeAUIPC(byteArrayOutStream, asmLine, labelAddressMap, currentAddress);

            case I_ADD:
                return encodeADD(byteArrayOutStream, asmLine);

            case I_ADDI:
                return encodeADDI(byteArrayOutStream, asmLine, labelAddressMap, currentAddress);

            // // ADDIW is part of RV64I not RV32I. Only generate this instruction if the
            // extension RV64I is enabled !!!
            case I_ADDIW:
                return encodeADDIW(byteArrayOutStream, asmLine);

            case I_AND:
                return encodeAND(byteArrayOutStream, asmLine);

            case I_ANDI:
                return encodeANDI(byteArrayOutStream, asmLine);

            case I_MUL:
                return encodeMUL(byteArrayOutStream, asmLine);

            case I_BEQ:
                return encodeBEQ(byteArrayOutStream, asmLine);

            case I_BNE:
                return encodeBNE(byteArrayOutStream, asmLine);

            // case I_BGE:
            // encoded_asm_line = encode_bge(byteArrayOutStream, asmLine);
            // break;

            // case I_BLT:
            // encoded_asm_line = encode_blt(byteArrayOutStream, asmLine);
            // break;

            case I_ECALL:
                return encodeECALL(byteArrayOutStream, asmLine);

            case I_JAL:
                return encodeJAL(byteArrayOutStream, asmLine);

            case I_JALR:
                return encodeJALR(byteArrayOutStream, asmLine);

            case I_LUI:
                return encodeLUI(byteArrayOutStream, asmLine);

            // case I_LB:
            // encoded_asm_line = encode_lb(byteArrayOutStream, asmLine);
            // break;

            case I_LBU:
                return encodeLBU(byteArrayOutStream, asmLine);

            // case I_LH:
            // encoded_asm_line = encode_lh(byteArrayOutStream, asmLine);
            // break;

            case I_LW:
                return encodeLW(byteArrayOutStream, asmLine);

            // case I_LD:
            // encoded_asm_line = encode_ld(byteArrayOutStream, asmLine);
            // break;

            // case I_SRLI:
            // encoded_asm_line = encode_srli(byteArrayOutStream, asmLine);
            // break;

            case I_SLLI:
                return encodeSLLI(byteArrayOutStream, asmLine);

            // case I_SD:
            // encoded_asm_line = encode_sd(byteArrayOutStream, asmLine);
            // break;

            case I_SW:
                return encodeSW(byteArrayOutStream, asmLine);

            // case I_SH:
            // encoded_asm_line = encode_sh(byteArrayOutStream, asmLine);
            // break;

            case I_SB:
                return encodeSB(byteArrayOutStream, asmLine);

            case I_UNKNOWN:
            default:
                throw new RuntimeException("Unknown mnemonic: " + asmLine);
        }
    }

    private int encodeAUIPC(final ByteArrayOutputStream byteArrayOutStream,
        final AsmLine asmLine, final Map<String, Long> labelAddressMap,
        final long currentAddress) {

        if ((asmLine.pseudoInstructionAsmLine != null) && (asmLine.pseudoInstructionAsmLine.mnemonic == Mnemonic.I_LA)) {

            final String label = asmLine.offsetLabel_1;

            long value = labelAddressMap.get(label);
            //value = 0x10000L;

            // Computation for auipc:
            //
            // data_1 = ((label-.)) >>U 12)
            // ((0x10000 - 4)) >>U 12) = b1111
            //
            // data_2 = ((label-.) & 0x00000800 ? 1 : 0)
            // ((0x10000 - 4) & 0x00000800 ? 1 : 0) is 1
            //
            // in total b1111 + 1 = 16 = 0x10

            long data_1 = ((value - currentAddress) >> 12);
            long data_2 = (((value - currentAddress) & 0x00000800L) != 0) ? 1L : 0L;

            byte opcode = 0b0010111;

            byte rd = (byte) asmLine.register_0.ordinal();
            int imm = (int) (data_1 + data_2);

            int result = encodeUType(imm, rd, opcode);

            System.out.println(asmLine + " -> " + result);
            EncoderUtils.convertToUint32_t(byteArrayOutStream, result);

        } else {

            byte opcode = 0b0010111;

            byte rd = (byte) asmLine.register_0.ordinal();
            int imm = asmLine.numeric_1.shortValue();

            int result = encodeUType(imm, rd, opcode);
            System.out.println(asmLine + " -> " + String.format("%08X", result));
            EncoderUtils.convertToUint32_t(byteArrayOutStream, result);

        }

        return 4;
    }

    private int encodeADD(final ByteArrayOutputStream byteArrayOutStream, final AsmLine asmLine) {

        byte funct7 = 0b0000000;
        byte funct3 = 0b000;
        byte opcode = 0b0110011;

        byte rd = (byte) asmLine.register_0.ordinal();
        byte rs1 = (byte) asmLine.register_1.ordinal();
        byte rs2 = (byte) asmLine.register_2.ordinal();

        int result = encodeRType(funct7, rs2, rs1, funct3, rd, opcode);
        System.out.println(asmLine + " -> " + String.format("%08X", result));
        EncoderUtils.convertToUint32_t(byteArrayOutStream, result);

        return 4;
    }

    private int encodeADDI(final ByteArrayOutputStream byteArrayOutStream,
        final AsmLine asmLine, final Map<String, Long> labelAddressMap,
        final long currentAddress) {

        if ((asmLine.pseudoInstructionAsmLine != null) && (asmLine.pseudoInstructionAsmLine.mnemonic == Mnemonic.I_LA)) {

            final String label = asmLine.offsetLabel_1;

            Long value = labelAddressMap.get(label);
            // value = 0x10000L;

            // Computation for addi:
            //
            // data_1 = ((label - .) & 0xfff)
            // ((0x10000-4) & 0xfff) = b 1111 1111 1100 = -4

            long data_1 = ((value - (currentAddress - 4)) & 0xfff);

            System.out.println(data_1);

            byte funct3 = 0b000;
            byte opcode = 0b0010011;
            byte rd = (byte) asmLine.register_0.ordinal();
            byte rs1 = (byte) asmLine.register_1.ordinal();
            short imm = (short) data_1;

            int result = encodeIType(imm, rs1, funct3, rd, opcode);

            System.out.println(asmLine + " -> " + result);
            EncoderUtils.convertToUint32_t(byteArrayOutStream, result);

        } else {

            byte funct3 = 0b000;
            byte opcode = 0b0010011;
            byte rd = (byte) asmLine.register_0.ordinal();
            byte rs1 = (byte) asmLine.register_1.ordinal();
            short imm = asmLine.numeric_2.shortValue();

            int result = encodeIType(imm, rs1, funct3, rd, opcode);
            System.out.println(asmLine + " -> " + String.format("%08X", result));
            EncoderUtils.convertToUint32_t(byteArrayOutStream, result);

        }

        return 4;
    }

    private int encodeADDIW(final ByteArrayOutputStream byteArrayOutStream, final AsmLine asmLine) {
        byte funct3 = 0b000;
        byte opcode = 0b0011011;

        byte rd = (byte) asmLine.register_0.ordinal();
        byte rs1 =  (byte) asmLine.register_1.ordinal();
        short imm = asmLine.numeric_2.shortValue();

        int result = encodeIType(imm, rs1, funct3, rd, opcode);
        System.out.println(asmLine + " -> " + String.format("%08X", result));
        EncoderUtils.convertToUint32_t(byteArrayOutStream, result);

        return 4;
    }

    private int encodeAND(final ByteArrayOutputStream byteArrayOutStream, final AsmLine asmLine) {
        byte funct7 = 0b0000000;
        byte funct3 = 0b111;
        byte opcode = 0b0110011;

        byte rs1 = (byte) asmLine.register_1.ordinal();
        byte rs2 = (byte) asmLine.register_2.ordinal();
        byte rd = (byte) asmLine.register_0.ordinal();

        int result = encodeRType(funct7, rs2, rs1, funct3, rd, opcode);
        System.out.println(asmLine + " -> " + String.format("%08X", result));
        EncoderUtils.convertToUint32_t(byteArrayOutStream, result);

        return 4;
    }

    private int encodeANDI(final ByteArrayOutputStream byteArrayOutStream, final AsmLine asmLine) {
        byte funct3 = 0b111;
        byte opcode = 0b0010011;

        byte rs1 = (byte) asmLine.register_1.ordinal();
        byte rd = (byte) asmLine.register_0.ordinal();
        short imm = asmLine.numeric_2.shortValue();

        int result = encodeIType(imm, rs1, funct3, rd, opcode);
        System.out.println(asmLine + " -> " + String.format("%08X", result));
        EncoderUtils.convertToUint32_t(byteArrayOutStream, result);

        return 4;
    }

    private int encodeMUL(final ByteArrayOutputStream byteArrayOutStream, final AsmLine asmLine) {
        byte funct7 = 0b0000001;
        byte funct3 = 0b000;
        byte opcode = 0b0110011;

        byte rs1 = (byte) asmLine.register_1.ordinal();
        byte rs2 = (byte) asmLine.register_2.ordinal();
        byte rd = (byte) asmLine.register_0.ordinal();

        int result = encodeRType(funct7, rs2, rs1, funct3, rd, opcode);
        System.out.println(asmLine + " -> " + String.format("%08X", result));
        EncoderUtils.convertToUint32_t(byteArrayOutStream, result);

        return 4;
    }

    private int encodeBEQ(final ByteArrayOutputStream byteArrayOutStream, final AsmLine asmLine) {
        byte funct3 = 0b000;
        byte opcode = 0b1100011;

        byte rs1 = (byte) asmLine.register_0.ordinal();
        byte rs2 = (byte) asmLine.register_2.ordinal();
        short imm = asmLine.numeric_2.shortValue();

        int result = encodeBType(imm, rs2, rs1, funct3, opcode);
        System.out.println(asmLine + " -> " + String.format("%08X", result));
        EncoderUtils.convertToUint32_t(byteArrayOutStream, result);

        return 4;
    }

    private int encodeECALL(final ByteArrayOutputStream byteArrayOutStream, final AsmLine asmLine) {
        byte funct3 = 0b000;
        byte opcode = 0b1110011;

        byte rs1 = (byte) Register.REG_ZERO.ordinal();
        byte rs2 = (byte) Register.REG_ZERO.ordinal();
        short imm = 0x00;

        int result = encodeIType(imm, rs2, rs1, funct3, opcode);
        System.out.println(asmLine + " -> " + String.format("%08X", result));
        EncoderUtils.convertToUint32_t(byteArrayOutStream, result);

        return 4;
    }

    private int encodeBNE(final ByteArrayOutputStream byteArrayOutStream, final AsmLine asmLine) {
        byte funct3 = 0b001;
        byte opcode = 0b1100011;

        byte rs1 = (byte) asmLine.register_0.ordinal();
        byte rs2 = (byte) asmLine.register_1.ordinal();
        short imm = asmLine.numeric_2.shortValue();

        int result = encodeBType(imm, rs2, rs1, funct3, opcode);
        System.out.println(asmLine + " -> " + String.format("%08X", result));
        EncoderUtils.convertToUint32_t(byteArrayOutStream, result);

        return 4;
    }

    private int encodeJAL(final ByteArrayOutputStream byteArrayOutStream, final AsmLine asmLine) {
        byte opcode = 0b1101111;

        byte rd = (byte) asmLine.register_0.ordinal();
        int imm = asmLine.numeric_1.intValue();

        int result = encodeJType(imm, rd, opcode);
        System.out.println(asmLine + " -> " + String.format("%08X", result));
        EncoderUtils.convertToUint32_t(byteArrayOutStream, result);

        return 4;
    }

    private int encodeJALR(final ByteArrayOutputStream byteArrayOutStream, final AsmLine asmLine) {
        byte funct3 = 0b000;
        byte opcode = 0b1100111;

        byte rd = (byte) asmLine.register_0.ordinal();
        byte rs1 = (byte) asmLine.register_1.ordinal();
        short imm = 0;
        if (asmLine.numeric_2 != null) {
            imm = asmLine.numeric_2.shortValue();
        } else if (asmLine.offset_1 != null) {
            imm = asmLine.offset_1.shortValue();
        }

        int result = encodeIType(imm, rs1, funct3, rd, opcode);
        System.out.println(asmLine + " -> " + String.format("%08X", result));
        EncoderUtils.convertToUint32_t(byteArrayOutStream, result);

        return 4;
    }

    private int encodeLUI(final ByteArrayOutputStream byteArrayOutStream, final AsmLine asmLine) {
        byte opcode = 0b0110111;
        byte rd = (byte) asmLine.register_0.ordinal();
        int imm = asmLine.numeric_1.shortValue();

        int result = encodeUType(imm, rd, opcode);
        System.out.println(asmLine + " -> " + String.format("%08X", result));
        EncoderUtils.convertToUint32_t(byteArrayOutStream, result);

        return 4;
    }

    private int encodeLBU(final ByteArrayOutputStream byteArrayOutStream, final AsmLine asmLine) {
        byte funct3 = 0b100;
        byte opcode = 0b0000011;

        byte rs1 = (byte) asmLine.register_1.ordinal();
        byte rd = (byte) asmLine.register_0.ordinal();
        short imm = asmLine.offset_1.shortValue();

        int result = encodeIType(imm, rs1, funct3, rd, opcode);
        System.out.println(asmLine + " -> " + String.format("%08X", result));
        EncoderUtils.convertToUint32_t(byteArrayOutStream, result);

        return 4;
    }

    private int encodeSB(final ByteArrayOutputStream byteArrayOutStream, final AsmLine asmLine) {
        byte funct3 = 0b000;
        byte opcode = 0b0100011;
        byte rs2 = (byte) asmLine.register_0.ordinal();
        byte rs1 = (byte) asmLine.register_1.ordinal();
        short imm = asmLine.offset_1.shortValue();

        int result = encodeSType(imm, rs2, rs1, funct3, opcode);
        System.out.println(asmLine + " -> " + String.format("%08X", result));
        EncoderUtils.convertToUint32_t(byteArrayOutStream, result);

        return 4;
    }

    private int encodeLW(final ByteArrayOutputStream byteArrayOutStream, final AsmLine asmLine) {
        byte funct3 = 0b010;
        byte opcode = 0b0000011;

        byte rs1 = (byte) asmLine.register_1.ordinal();
        byte rd = (byte) asmLine.register_0.ordinal();
        short imm = asmLine.offset_1.shortValue();

        int result = encodeIType(imm, rs1, funct3, rd, opcode);
        System.out.println(asmLine + " -> " + String.format("%08X", result));
        EncoderUtils.convertToUint32_t(byteArrayOutStream, result);

        return 4;
    }

    private int encodeSLLI(final ByteArrayOutputStream byteArrayOutStream, final AsmLine asmLine) {
        byte funct3 = 0b001;
        byte opcode = 0b0010011;

        byte rd = (byte) asmLine.register_0.ordinal();
        byte rs1 = (byte) asmLine.register_1.ordinal();
        short imm = asmLine.numeric_2.shortValue();

        int result = encodeIType(imm, rs1, funct3, rd, opcode);
        System.out.println(asmLine + " -> " + String.format("%08X", result));
        EncoderUtils.convertToUint32_t(byteArrayOutStream, result);

        return 4;
    }

    private int encodeSW(final ByteArrayOutputStream byteArrayOutStream, final AsmLine asmLine) {
        byte funct3 = 0b010;
        byte opcode = 0b0100011;
        byte rs2 = (byte) asmLine.register_0.ordinal();
        byte rs1 = (byte) asmLine.register_1.ordinal();
        short imm = asmLine.offset_1.shortValue();

        int result = encodeSType(imm, rs2, rs1, funct3, opcode);
        System.out.println(asmLine + " -> " + String.format("%08X", result));
        EncoderUtils.convertToUint32_t(byteArrayOutStream, result);

        return 4;
    }

    private int encodeRType(byte funct7, byte rs2, byte rs1, byte funct3, byte rd, byte opcode) {

        return ((opcode & 0b1111111) << 0) |
                ((rd & 0b11111) << 7) |
                ((funct3 & 0b111) << (7 + 5)) |
                ((rs1 & 0b11111) << (7 + 5 + 3)) |
                ((rs2 & 0b11111) << (7 + 5 + 3 + 5)) |
                ((funct7 & 0b1111111) << (7 + 5 + 3 + 5 + 5));
    }

    private int encodeIType(short imm, byte rs1, byte funct3, byte rd, byte opcode) {

        return ((opcode & 0b1111111) << 0) |
                ((rd & 0b11111) << 7) |
                ((funct3 & 0b111) << (7 + 5)) |
                ((rs1 & 0b11111) << (7 + 5 + 3)) |
                ((imm & 0b111111111111) << (7 + 5 + 3 + 5));
    }

    private int encodeSType(short imm, byte rs2, byte rs1, byte funct3, byte opcode) {

        int imm_4_0 = (imm >> 0) & 0b11111;
        int imm_11_5 = (imm >> 5) & 0b1111111;

        int result = ((opcode & 0b1111111) << 0) |
                ((imm_4_0) << 7) |
                ((funct3 & 0b111) << (7 + 5)) |
                ((rs1 & 0b11111) << (7 + 5 + 3)) |
                ((rs2 & 0b11111) << (7 + 5 + 3 + 5)) |
                ((imm_11_5 & 0b1111111) << (7 + 5 + 3 + 5 + 5));

        return result;
    }

    private int encodeBType(short imm, byte rs2, byte rs1, byte funct3, byte opcode) {

        int imm_11 = (imm >> 10) & 0b1;
        int imm_4_1 = (imm >> 1) & 0b1111;
        int imm_10_5 = (imm >> 5) & 0b111111;
        int imm_12 = (imm >> 11) & 0b1;

        return ((opcode & 0b1111111) << 0) |
                ((imm_11) << 7) |
                ((imm_4_1) << (7 + 1)) |
                ((funct3 & 0b111) << (7 + 1 + 4)) |
                ((rs1 & 0b11111) << (7 + 1 + 4 + 3)) |
                ((rs2 & 0b11111) << (7 + 1 + 4 + 3 + 5)) |
                ((imm_10_5 & 0b111111) << (7 + 1 + 4 + 3 + 5 + 5)) |
                ((imm_12 & 0b1) << (7 + 1 + 4 + 3 + 5 + 5 + 6));
    }

    private int encodeUType(int imm, byte rd, byte opcode) {

        return ((opcode & 0b1111111) << 0) |
                ((rd & 0b11111) << 7) |
                ((imm & 0b11111111111111111111) << (7 + 5));
    }

    private int encodeJType(int imm, byte rd, byte opcode) {

        int imm_20 = (imm >> 19) & 0b1; // 1
        int imm_10_1 = (imm >> 1) & 0b1111111111; // 10
        int imm_11 = (imm >> 10) & 0b1; // 1
        int imm_19_12 = (imm >> 11) & 0b11111111; // 8

        return ((opcode & 0b1111111) << 0) |
                ((rd & 0b11111) << 7) |
                ((imm_19_12 & 0b11111111) << (7 + 5)) |
                ((imm_11 & 0b1) << (7 + 5 + 8)) |
                ((imm_10_1 & 0b1111111111) << (7 + 5 + 8 + 1)) |
                ((imm_20 & 0b1) << (7 + 5 + 8 + 1 + 10));
    }

}
