// *SP=i
@7
D=A
@SP
A=M
M=D
// SP++
@SP
M=M+1
// *SP=i
@8
D=A
@SP
A=M
M=D
// SP++
@SP
M=M+1
// SP--
@SP
M=M-1
// D=*SP
@SP
A=M
D=M
// SP--
@SP
M=M-1
// D=D+*SP
@SP
A=M
D=D+M
// *SP=D
@SP
A=M
M=D
// SP++
@SP
M=M+1
