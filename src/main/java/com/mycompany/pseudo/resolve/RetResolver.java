package com.mycompany.pseudo.resolve;

import java.util.List;
import java.util.Map;

import com.mycompany.data.AsmInstructionListModifier;
import com.mycompany.data.AsmLine;
import com.mycompany.data.Mnemonic;
import com.mycompany.data.Register;
import com.mycompany.data.Section;

public class RetResolver implements AsmInstructionListModifier {

    @Override
    public void modify(List<AsmLine> asmLines, Map<String, Section> sectionMap) {

        for (AsmLine asmLine : asmLines) {

            if (asmLine.mnemonic != Mnemonic.I_RET) {
                continue;
            }

            asmLine.mnemonic = Mnemonic.I_JALR;
            asmLine.register_0 = Register.REG_ZERO;
            asmLine.register_1 = Register.REG_RA;
            asmLine.register_2 = Register.REG_UNKNOWN;
            asmLine.numeric_2 = 0L;
        }
    }

}
