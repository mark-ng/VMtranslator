// *SP=i
@17
D=A
@SP
A=M
M=D
// SP++
@SP
M=M+1
// *SP=i
@17
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
// D=D-*SP
@SP
A=M
D=D-M
// *SP=-1 if D==0, else *SP=0
@EQUAL1
D;JEQ
@SP
A=M
M=0
@ENDIF1
0;JMP
(EQUAL1)
@SP
A=M
M=-1
(ENDIF1)
// SP++
@SP
M=M+1
// *SP=i
@17
D=A
@SP
A=M
M=D
// SP++
@SP
M=M+1
// *SP=i
@16
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
// D=D-*SP
@SP
A=M
D=D-M
// *SP=-1 if D==0, else *SP=0
@EQUAL2
D;JEQ
@SP
A=M
M=0
@ENDIF2
0;JMP
(EQUAL2)
@SP
A=M
M=-1
(ENDIF2)
// SP++
@SP
M=M+1
// *SP=i
@16
D=A
@SP
A=M
M=D
// SP++
@SP
M=M+1
// *SP=i
@17
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
// D=D-*SP
@SP
A=M
D=D-M
// *SP=-1 if D==0, else *SP=0
@EQUAL3
D;JEQ
@SP
A=M
M=0
@ENDIF3
0;JMP
(EQUAL3)
@SP
A=M
M=-1
(ENDIF3)
// SP++
@SP
M=M+1
// *SP=i
@892
D=A
@SP
A=M
M=D
// SP++
@SP
M=M+1
// *SP=i
@891
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
// D=*SP-D
@SP
A=M
D=M-D
// *SP=-1 if D<0, else *SP=0
@LESS4
D;JLT
@SP
A=M
M=0
@ENDIF4
0;JMP
(LESS4)
@SP
A=M
M=-1
(ENDIF4)
// SP++
@SP
M=M+1
// *SP=i
@891
D=A
@SP
A=M
M=D
// SP++
@SP
M=M+1
// *SP=i
@892
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
// D=*SP-D
@SP
A=M
D=M-D
// *SP=-1 if D<0, else *SP=0
@LESS5
D;JLT
@SP
A=M
M=0
@ENDIF5
0;JMP
(LESS5)
@SP
A=M
M=-1
(ENDIF5)
// SP++
@SP
M=M+1
// *SP=i
@891
D=A
@SP
A=M
M=D
// SP++
@SP
M=M+1
// *SP=i
@891
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
// D=*SP-D
@SP
A=M
D=M-D
// *SP=-1 if D<0, else *SP=0
@LESS6
D;JLT
@SP
A=M
M=0
@ENDIF6
0;JMP
(LESS6)
@SP
A=M
M=-1
(ENDIF6)
// SP++
@SP
M=M+1
// *SP=i
@32767
D=A
@SP
A=M
M=D
// SP++
@SP
M=M+1
// *SP=i
@32766
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
// D=*SP-D
@SP
A=M
D=M-D
// *SP=-1 if D>0, else *SP=0
@GREATER7
D;JGT
@SP
A=M
M=0
@ENDIF7
0;JMP
(GREATER7)
@SP
A=M
M=-1
(ENDIF7)
// SP++
@SP
M=M+1
// *SP=i
@32766
D=A
@SP
A=M
M=D
// SP++
@SP
M=M+1
// *SP=i
@32767
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
// D=*SP-D
@SP
A=M
D=M-D
// *SP=-1 if D>0, else *SP=0
@GREATER8
D;JGT
@SP
A=M
M=0
@ENDIF8
0;JMP
(GREATER8)
@SP
A=M
M=-1
(ENDIF8)
// SP++
@SP
M=M+1
// *SP=i
@32766
D=A
@SP
A=M
M=D
// SP++
@SP
M=M+1
// *SP=i
@32766
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
// D=*SP-D
@SP
A=M
D=M-D
// *SP=-1 if D>0, else *SP=0
@GREATER9
D;JGT
@SP
A=M
M=0
@ENDIF9
0;JMP
(GREATER9)
@SP
A=M
M=-1
(ENDIF9)
// SP++
@SP
M=M+1
// *SP=i
@57
D=A
@SP
A=M
M=D
// SP++
@SP
M=M+1
// *SP=i
@31
D=A
@SP
A=M
M=D
// SP++
@SP
M=M+1
// *SP=i
@53
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
// *SP=i
@112
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
// SP--
@SP
M=M-1
@SP
A=M
D=-M
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
// D=D&*SP
@SP
A=M
D=D&M
// *SP=D
@SP
A=M
M=D
// SP++
@SP
M=M+1
// *SP=i
@82
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
// D=D|*SP
@SP
A=M
D=D|M
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
@SP
A=M
D=!M
@SP
A=M
M=D
// SP++
@SP
M=M+1
