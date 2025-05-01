# digital design & computer architecture RISC V edition

#lui x21, 8
#lui x6, 0x77
#sw x6, 40(x21)
#lui x28, 0x3
#lui x18, 0x2
#lui x22, 0x6
#lw x23, 40(x21)
#and x24, x23, x28
#or x7, x22, x23
#sub x19, x23, x18

lui s5, 8
lui t1, 0x77
sw t1, 40(s5)
lui t3, 3
lui s2, 2
lui s6, 6
lw s7, 40(s5)
and s8, s7, t3
or t2, s6, s7
sub s3, s7, s2