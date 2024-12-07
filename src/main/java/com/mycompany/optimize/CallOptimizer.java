package com.mycompany.optimize;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.mycompany.data.AsmLine;
import com.mycompany.data.Mnemonic;
import com.mycompany.data.Register;

public class CallOptimizer extends BaseOptimizer {

    @Override
    public void modify(List<AsmLine> asmLines) {

        boolean done = false;
        while (!done) {

            // build label table
            Map<String, Integer> map = new HashMap<>();
            buildLabelTable(asmLines, map);

            updateAddresses(asmLines);

            // find unoptimized call pseudo instruction
            AsmLine callPseudoAsmLine = null;
            int index = 0;
            boolean found = false;
            for (AsmLine asmLine : asmLines) {
                if ((asmLine.pseudoInstructionAsmLine != null)
                        && (asmLine.pseudoInstructionAsmLine.mnemonic == Mnemonic.I_CALL)
                        && (asmLine.pseudoInstructionAsmLine.optimized == false)) {
                    callPseudoAsmLine = asmLine.pseudoInstructionAsmLine;
                    found = true;
                    break;
                }
                index++;
            }

            if (!found) {
                done = true;
                continue;
            }

            // start with first child instruction
            AsmLine firstAsmLine = callPseudoAsmLine.pseudoInstructionChildren.get(0);
            AsmLine secondAsmLine = callPseudoAsmLine.pseudoInstructionChildren.get(1);

            // determine movement direction towards label (use label table for that)
            int direction = 0;
            if (firstAsmLine.address > map.get(firstAsmLine.offsetLabel_1)) {
                direction = -1;
            } else {
                direction = +1;
                throw new RuntimeException();
            }

            if (direction == -1) {

                // move upwards
                for (int i = index - 1; i > 0; i--) {

                    AsmLine currentAsmLine = asmLines.get(i);

                    // for each instruction, check if it is a real instruction (not pseudo)
                    if ((currentAsmLine.pseudoInstructionAsmLine != null) && (!currentAsmLine.pseudoInstructionAsmLine.optimized)) {
                        throw new RuntimeException("Cannot optimize!");
                    }

                    if (firstAsmLine.offsetLabel_1.equalsIgnoreCase(currentAsmLine.label)) {
                        break;
                    }
                }
            }

            // // DEBUG
            // System.out.println("first: " + firstAsmLine);
            // System.out.println("Second: " + secondAsmLine);
            // System.out.println("Label: " + firstAsmLine.offsetLabel_1);
            // System.out.println("absolute address of label: " + map.get(firstAsmLine.offsetLabel_1));

            // if arriving at the target label is possible only crossing real instructions
            // take the absolute value of the label and put it into the modifier.

            int address = map.get(firstAsmLine.offsetLabel_1);
            long highValue = 0;
            long lowValue = 0;

            switch (firstAsmLine.modifier_1) {

                case HI:
                    highValue = address >> 12 & 0xFFFFF;
                    break;

                case LO:
                    lowValue = address & 0xFFF;
                    break;

                default:
                    throw new RuntimeException();
            }

            switch (secondAsmLine.modifier_2) {

                case HI:
                    highValue = address >> 12 & 0xFFFFF;
                    break;

                case LO:
                    lowValue = address & 0xFFF;
                    break;

                default:
                    throw new RuntimeException();
            }

            // System.out.println("highValue: " + highValue);
            // System.out.println("lowValue: " + lowValue);

            // if the absolute label address is exactly 12-bit throw exception!

            // if the modifier returns 0, the instruction can be optimized
            if (highValue == 0) {

                asmLines.remove(firstAsmLine);
                asmLines.remove(secondAsmLine);

                AsmLine asmLine = new AsmLine();
                asmLine.mnemonic = Mnemonic.I_JAL;
                asmLine.register_0 = Register.REG_RA;
                asmLine.numeric_1 = lowValue;

                asmLines.add(index, asmLine);

                callPseudoAsmLine.optimized = true;
                callPseudoAsmLine.pseudoInstructionChildren.clear();
                callPseudoAsmLine.pseudoInstructionChildren.add(asmLine);
                asmLine.pseudoInstructionAsmLine = callPseudoAsmLine;

            } else {

                firstAsmLine.modifier_1 = null;
                firstAsmLine.offsetLabel_1 = null;
                firstAsmLine.numeric_1 = highValue;

                // System.out.println("firstAsmLine: " + firstAsmLine);

                secondAsmLine.modifier_2 = null;
                secondAsmLine.offsetLabel_2 = null;
                secondAsmLine.numeric_2 = highValue;

                // System.out.println("secondAsmLine: " + secondAsmLine);

            }
        }
    }

}