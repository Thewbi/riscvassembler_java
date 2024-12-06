package com.mycompany.data;

import java.util.List;

import riscvasm.RISCVASMParser.ExprContext;

public class AsmLine {

    public String label;

    public Mnemonic mnemonic;

    public Register register_0 = Register.REG_UNKNOWN;
    public Register register_1 = Register.REG_UNKNOWN;
    public Register register_2 = Register.REG_UNKNOWN;

    public Long numeric_0 = null;
    public Long numeric_1 = null;
    public Long numeric_2 = null;

    public Integer offset_0 = null;
    public Integer offset_1 = null;
    public Integer offset_2 = null;

    public String offsetLabel_0 = null;
    public String offsetLabel_1 = null;
    public String offsetLabel_2 = null;

    public String identifier_0 = null;
    public String identifier_1 = null;
    public String identifier_2 = null;

    public AsmInstruction asmInstruction = null;

    public List<String> csvList = null;

    public Modifier modifier_0;
    public Modifier modifier_1;
    public Modifier modifier_2;

    public String stringValue;

    public ExprContext exprContext_0 = null;
    public ExprContext exprContext_1 = null;
    public ExprContext exprContext_2 = null;

    public String toString() {

        StringBuilder stringBuilder = new StringBuilder();

        if (label != null) {
            stringBuilder.append(label).append(": ");
        }

        if (asmInstruction != null) {
            stringBuilder.append(AsmInstruction.toString(asmInstruction));
            switch (asmInstruction) {

                case SECTION:
                case GLOBAL:
                    stringBuilder.append(" ").append(stringValue);
                    break;

                case ASCIZ:
                case FILE:
                case STRING:
                    stringBuilder.append(" \"").append(stringValue).append("\"");
                    break;

                default:
                    stringBuilder.append(" ");
                    break;
            }
        }

        if (csvList != null) {
            boolean first = true;
            for (String val : csvList) {
                if (!first) {
                    stringBuilder.append(", ");
                }
                stringBuilder.append(val);

                first = false;
            }
        }

        if (mnemonic == null) {
            return stringBuilder.toString();
        }

        stringBuilder.append(Mnemonic.toString(mnemonic)).append(" ");

        if (numeric_0 != null) {
            stringBuilder.append(String.format("0x%08X", numeric_0));
        }
        if (modifier_0 != null) {
            stringBuilder.append(", ");
            stringBuilder.append(Modifier.toString(modifier_0)).append("(");
            if (offsetLabel_0 != null) {
                stringBuilder.append(offsetLabel_0);
            }
            stringBuilder.append(")");
            if (register_0 != Register.REG_UNKNOWN) {
                stringBuilder.append("(");
                stringBuilder.append(Register.toStringAbi(register_0));
                stringBuilder.append(")");
            }
        } else if (identifier_0 != null) {
            stringBuilder.append(identifier_0);
        } else if (offset_0 != null) {
            stringBuilder.append(offset_0).append("(");
            if (register_0 != Register.REG_UNKNOWN) {
                stringBuilder.append(Register.toStringAbi(register_0));
            }
            stringBuilder.append(")");
        } else if (exprContext_0 != null) {
            // TODO: evaluate the tree
            stringBuilder.append(exprContext_0.toStringTree());
        } else {
            if (register_0 != Register.REG_UNKNOWN) {
                stringBuilder.append(Register.toStringAbi(register_0));
            }
        }

        if (numeric_1 != null) {
            stringBuilder.append(", ");
            stringBuilder.append(String.format("0x%08X", numeric_1));
        }
        if (modifier_1 != null) {
            stringBuilder.append(", ");
            stringBuilder.append(Modifier.toString(modifier_1)).append("(");
            if (offsetLabel_1 != null) {
                stringBuilder.append(offsetLabel_1);
            }
            stringBuilder.append(")");
            if (register_1 != Register.REG_UNKNOWN) {
                stringBuilder.append("(");
                stringBuilder.append(Register.toStringAbi(register_1));
                stringBuilder.append(")");
            }
        } else if (identifier_1 != null) {
            stringBuilder.append(", ");
            stringBuilder.append(identifier_1);
        } else if (offset_1 != null) {
            stringBuilder.append(", ");
            stringBuilder.append(offset_1).append("(");
            if (register_1 != Register.REG_UNKNOWN) {
                stringBuilder.append(Register.toStringAbi(register_1));
            }
            stringBuilder.append(")");
        } else if (exprContext_1 != null) {
            // TODO: evaluate the tree
            stringBuilder.append(", ");
            stringBuilder.append(exprContext_1.toStringTree());
        } else {
            if (register_1 != Register.REG_UNKNOWN) {
                stringBuilder.append(", ");
                stringBuilder.append(Register.toStringAbi(register_1));
            }
        }

        if (numeric_2 != null) {
            stringBuilder.append(", ");
            stringBuilder.append(String.format("0x%08X", numeric_2));
        }
        if (modifier_2 != null) {
            stringBuilder.append(", ");
            stringBuilder.append(Modifier.toString(modifier_2)).append("(");
            if (offsetLabel_2 != null) {
                stringBuilder.append(offsetLabel_2);
            }
            stringBuilder.append(")");
            if (register_2 != Register.REG_UNKNOWN) {
                stringBuilder.append("(");
                stringBuilder.append(Register.toStringAbi(register_2));
                stringBuilder.append(")");
            }
        } else if (identifier_2 != null) {
            stringBuilder.append(", ");
            stringBuilder.append(identifier_2);
        } else if (offset_2 != null) {
            stringBuilder.append(", ");
            stringBuilder.append(offset_2).append("(");
            if (register_2 != Register.REG_UNKNOWN) {
                stringBuilder.append(Register.toStringAbi(register_2));
            }
            stringBuilder.append(")");
        } else if (exprContext_2 != null) {
            // TODO: evaluate the tree
            stringBuilder.append(", ");
            stringBuilder.append(exprContext_2.toStringTree());
        } else {
            if (register_2 != Register.REG_UNKNOWN) {
                stringBuilder.append(", ");
                stringBuilder.append(Register.toStringAbi(register_2));
            }
        }

        return stringBuilder.toString();
    }

}
