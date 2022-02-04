// *SP=i
@10
D=A
@SP
A=M
M=D
// SP++
@SP
M=M+1
// addr = LCL+i, SP--, *addr=*SP
@SP
M=M-1
@0
D=A
@LCL
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
@21
D=A
@SP
A=M
M=D
// SP++
@SP
M=M+1
// *SP=i
@22
D=A
@SP
A=M
M=D
// SP++
@SP
M=M+1
// addr = ARG+i, SP--, *addr=*SP
@SP
M=M-1
@2
D=A
@ARG
D=M+D
@R13
M=D
@SP
A=M
D=M
@R13
A=M
M=D
// addr = ARG+i, SP--, *addr=*SP
@SP
M=M-1
@1
D=A
@ARG
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
@36
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
@6
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
@42
D=A
@SP
A=M
M=D
// SP++
@SP
M=M+1
// *SP=i
@45
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
@5
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
// addr = THAT+i, SP--, *addr=*SP
@SP
M=M-1
@2
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
// *SP=i
@510
D=A
@SP
A=M
M=D
// SP++
@SP
M=M+1
@SP
M=M-1
@6
D=A
@5
D=A+D
@R13
M=D
@SP
A=M
D=M
@R13
A=M
M=D
// addr = LCL+i, *SP=*addr, SP++
@0
D=A
@LCL
A=M+D
D=M
@SP
A=M
M=D
@SP
M=M+1
// addr = THAT+i, *SP=*addr, SP++
@5
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
// addr = ARG+i, *SP=*addr, SP++
@1
D=A
@ARG
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
// addr = THIS+i, *SP=*addr, SP++
@6
D=A
@THIS
A=M+D
D=M
@SP
A=M
M=D
@SP
M=M+1
// addr = THIS+i, *SP=*addr, SP++
@6
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
@6
D=A
@5
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
