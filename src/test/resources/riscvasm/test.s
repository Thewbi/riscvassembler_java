
        .globl main

        .data
buffer: .space 8                # 0x10000

        .text
main:
        la t0, buffer           # 0
        li t1, 8                # 4
        sw t1, 0(t0)            # 8
        lw t2, 0(t0)            # 12
        bne t1, t2, failure     # 16
        li t3, 56               # 20
        sw t3, 4(t0)            # 24
        addi t0, t0, 4          # 28
        lw t4, 0(t0)            # 32
        bne t3, t4, failure     # 36  -- bne x28, x29, 88
        lw t5, -4(t0)           # 40
        bne t5, t1, failure     # 44
        li t1, 0xFF00F007       # 48
#        li t1, 0xFF             # 48
                                # 52
        sw t1, 0(t0)            # 56
        lb t2, 0(t0)            # 60
        li t3, 7                # 64
        bne t2, t3, failure     # 68
        lb t2, 1(t0)            # 72
        li t3, 0xFFFFFFF0       # 76
#        li t3, 0xFF             # 76
                                # 80
        bne t2, t3, failure     # 84
        lbu t2, 1(t0)           # 88
        li t3, 0xF0             # 92
                                # 96
        bne t2, t3, failure     # 100
success:
        li a0, 42               # 104
                                # 108
        li a7, 93               # 112
                                # 116
        ecall                   # 120
failure:
        li a0, 0                # 124

        li a7, 93               # 128

        ecall                   # 132