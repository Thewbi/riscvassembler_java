# source: https://matrix89.github.io/writes/writes/experiments-in-riscv/
# assemble with: https://riscvasm.lucasteske.dev/#

.equ STACK_SIZE, 1024

.global _start

_start:
    # setup stacks per hart
    csrr t0, mhartid                # read current hart id
    slli t0, t0, 10                 # shift left the hart id by 1024
    la   sp, stacks + STACK_SIZE    # set the initial stack pointer
                                    # to the end of the stack space
    add  sp, sp, t0                 # move the current hart stack pointer
                                    # to its place in the stack space

    # park harts with id != 0
    csrr a0, mhartid                # read current hart id
    bnez a0, park                   # if we're not on the hart 0
                                    # we park the hart

    j    enter                      # jump to c

park:
    wfi
    j park

stacks:
    .skip STACK_SIZE * 4            # allocate 1024 * 4 space for the harts stacks