// if x == y, return -1 (true), else return 0 (false)
// if x - y == 0, return -1, else return 0


// D=D-*SP
// D;JEQ
//

// (EQUAL_ZERO)
//    *SP=-1

@0
D=M
@1
D=D-M
@EQUAL
D;JEQ
@2
M=0
@END_IF
0;JMP
(EQUAL)
@2
M=-1
(END_IF)