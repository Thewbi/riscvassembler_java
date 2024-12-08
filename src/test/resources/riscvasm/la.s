# https://michaeljclark.github.io/asm.html#:~:text=The%20la%20(load%20address)%20instruction,command%20line%20options%20or%20an%20.
#
# file: la.s
#
# Load Address
# The la (load address) instruction is an assembler pseudo- instruction used to
# load the address of a symbol or label. The instruction can emit absolute or
# relative addresses depending on the -fpic or -fno-pic assembler command line
# options or an .options pic or .options nopic assembler directive.
#
# Format: la rd, symbol
#
# Resolved by:
# auipc rd, symbol[31:12]
# addi rd, rd, symbol[11:0]
#
# auipc rd, %hi(symbol)
# addi rd, rd, %lo(symbol)

la t0, test_2