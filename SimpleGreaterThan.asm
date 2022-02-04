// RAM0 > RAM1, return -1 else return 0
// RAM0-RAM1 > 0 return -1 else return 0
@0
D=M
@1
D=D-M
@GREATER1
D;JGT
@2
M=0
@END_IF1
0;JMP
(GREATER1)
@2
M=-1
(END_IF1)

@0
D=M
@1
D=D-M
@GREATER2
D;JGT
@2
M=0
@END_IF2
0;JMP
(GREATER2)
@2
M=-1
(END_IF2)
