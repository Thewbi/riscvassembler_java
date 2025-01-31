package com.mycompany.encoder;

import java.io.ByteArrayOutputStream;

import com.mycompany.common.NumberParseUtil;
import com.mycompany.data.AsmLine;

public class AsmInstructionEncoder {

    public int encodeAssemblerInstruction(final ByteArrayOutputStream byteArrayOutStream, final AsmLine asmLine) {

        switch (asmLine.asmInstruction) {

            case SPACE:
                return encodeSpaceAssemblerInstruction(byteArrayOutStream, asmLine);

            case BYTE:
                return encodeByteAssemblerInstruction(byteArrayOutStream, asmLine);

            case WORD:
                return encodeWordAssemblerInstruction(byteArrayOutStream, asmLine);

            case ASCII:
                return encodeAsciiAssemblerInstruction(byteArrayOutStream, asmLine);

            case ASCIZ:
            case ASCIIZ:
            case STRING:
                return encodeStringAssemblerInstruction(byteArrayOutStream, asmLine);

            case FILE:
            case TEXT:
            case DATA:
            case GLOBAL:
            case SECTION:
            case EQU:
                System.out.println("Assembler Instruction is not implemented yet! " + asmLine);
                // nop
                break;

            default:
                throw new RuntimeException("Unknown assembler instruction: " + asmLine);
        }

        return 0;
    }

    private int encodeStringAssemblerInstruction(final ByteArrayOutputStream byteArrayOutStream,
            final AsmLine asmLine) {
        return EncoderUtils.encodeStringResolveEscapedCharacters(byteArrayOutStream, asmLine.stringValue, true);
    }

    private int encodeAsciiAssemblerInstruction(final ByteArrayOutputStream byteArrayOutStream,
            final AsmLine asmLine) {
        return EncoderUtils.encodeStringResolveEscapedCharacters(byteArrayOutStream, asmLine.stringValue, false);
    }

    private int encodeSpaceAssemblerInstruction(final ByteArrayOutputStream byteArrayOutStream, final AsmLine<?> asmLine) {

        String sizeAsString = asmLine.csvList.get(0);
        long sizeInBytes = NumberParseUtil.parseLong(sizeAsString);
        int length = (int) sizeInBytes;
        byte space[] = new byte[length];
        byteArrayOutStream.writeBytes(space);

        return length;
    }

    private int encodeByteAssemblerInstruction(final ByteArrayOutputStream byteArrayOutStream, final AsmLine<?> asmLine) {

        int length = 0;
        for (String dataAsString : asmLine.csvList) {
            long data = NumberParseUtil.parseLong(dataAsString);
            EncoderUtils.convertToUint8_t(byteArrayOutStream, (int) data);
            length++;
        }

        return length;
    }

    private int encodeWordAssemblerInstruction(final ByteArrayOutputStream byteArrayOutStream, final AsmLine<?> asmLine) {

        int length = 0;
        for (String dataAsString : asmLine.csvList) {
            long data = NumberParseUtil.parseLong(dataAsString);
            EncoderUtils.convertToUint32_t(byteArrayOutStream, (int) data);
            length += 4;
        }

        return length;
    }

}
