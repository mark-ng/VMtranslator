// *SP=i
@111
D=A
@SP
A=M
M=D
// SP++
@SP
M=M+1
// *SP=i
@333
D=A
@SP
A=M
M=D
// SP++
@SP
M=M+1
// *SP=i
@888
D=A
@SP
A=M
M=D
// SP++
@SP
M=M+1
@SP
M=M-1
@SP
A=M
D=M
@StaticTest.8
M=D
@SP
M=M-1
@SP
A=M
D=M
@StaticTest.3
M=D
@SP
M=M-1
@SP
A=M
D=M
@StaticTest.1
M=D
@StaticTest.3
D=M
@SP
A=M
M=D
@SP
M=M+1
@StaticTest.1
D=M
@SP
A=M
M=D
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
// D=*SP-D
@SP
A=M
D=M-D
// *SP=D
@SP
A=M
M=D
// SP++
@SP
M=M+1
@StaticTest.8
D=M
@SP
A=M
M=D
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