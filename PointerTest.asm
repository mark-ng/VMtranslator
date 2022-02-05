// *SP=i
@3030
D=A
@SP
A=M
M=D
// SP++
@SP
M=M+1
// SP--, THIS/THAT = *SP
@SP
M=M-1
@SP
A=M
D=M
@THIS
M=D
// *SP=i
@3040
D=A
@SP
A=M
M=D
// SP++
@SP
M=M+1
// SP--, THIS/THAT = *SP
@SP
M=M-1
@SP
A=M
D=M
@THAT
M=D
// *SP=i
@32
D=A
@SP
A=M
M=D
// SP++
@SP
M=M+1
// addr = THIS+i, SP--, *addr=*SP
@SP
M=M-1
@2
D=A
@THIS
D=M+D
@R13
M=D
@SP
A=M
D=M
@R13
A=M
M=D
// *SP=i
@46
D=A
@SP
A=M
M=D
// SP++
@SP
M=M+1
// addr = THAT+i, SP--, *addr=*SP
@SP
M=M-1
@6
D=A
@THAT
D=M+D
@R13
M=D
@SP
A=M
D=M
@R13
A=M
M=D
// @*SP = THIS/THAT, SP++
@THIS
D=M
@SP
A=M
M=D
@SP
M=M+1
// @*SP = THIS/THAT, SP++
@THAT
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
// addr = THIS+i, *SP=*addr, SP++
@2
D=A
@THIS
A=M+D
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
// addr = THAT+i, *SP=*addr, SP++
@6
D=A
@THAT
A=M+D
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
