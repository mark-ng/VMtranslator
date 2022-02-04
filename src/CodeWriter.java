import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class CodeWriter {

    BufferedWriter br;
    private static int variable_counter = 0;

    /*
        Opens the output file/ stream and gets ready to write into it.
     */
    public CodeWriter(String fileName) {
        try {
            br = new BufferedWriter(new FileWriter(fileName));
        } catch (Exception e) {
            return;
        }

    }

    /*
        Informs the code writer that the translation of a new VM file is started.
     */
    public void setFileName(String fileName) {

    }

    /*
        Writes the assembly code that is the translation of the given arithmetic command.
     */
    public void writeArithmetic(String command) throws IOException {
        variable_counter++;
        // Binary Commands (add, sub, eq, gt, lt, and, or)
        if (
                command.equals("add") ||
                command.equals("sub") ||
                command.equals("and") ||
                command.equals("or")
        ) {
            br.write("// SP--\n");
            br.write("@SP\n");
            br.write("M=M-1\n");

            br.write("// D=*SP\n");
            br.write("@SP\n");
            br.write("A=M\n");
            br.write("D=M\n");

            br.write("// SP--\n");
            br.write("@SP\n");
            br.write("M=M-1\n");

            if (command.equals("add")) {
                br.write("// D=D+*SP\n");
                br.write("@SP\n");
                br.write("A=M\n");
                br.write("D=D+M\n");
            } else if (command.equals("sub")) {
                br.write("// D=*SP-D\n");
                br.write("@SP\n");
                br.write("A=M\n");
                br.write("D=M-D\n");
            } else if (command.equals("and")) {
                br.write("// D=D&*SP\n");
                br.write("@SP\n");
                br.write("A=M\n");
                br.write("D=D&M\n");
            } else if (command.equals("or")) {
                br.write("// D=D|*SP\n");
                br.write("@SP\n");
                br.write("A=M\n");
                br.write("D=D|M\n");
            }

            br.write("// *SP=D\n");
            br.write("@SP\n");
            br.write("A=M\n");
            br.write("M=D\n");
        }

        if (
                command.equals("eq") ||
                command.equals("gt") ||
                command.equals("lt")
        ) {
            br.write("// SP--\n");
            br.write("@SP\n");
            br.write("M=M-1\n");

            br.write("// D=*SP\n");
            br.write("@SP\n");
            br.write("A=M\n");
            br.write("D=M\n");

            br.write("// SP--\n");
            br.write("@SP\n");
            br.write("M=M-1\n");

            if (command.equals("eq")) {
                br.write("// D=D-*SP\n");
                br.write("@SP\n");
                br.write("A=M\n");
                br.write("D=D-M\n");

                br.write("// *SP=-1 if D==0, else *SP=0\n");
                br.write(String.format("@EQUAL%s\n", variable_counter));
                br.write("D;JEQ\n");
                br.write("@SP\n");
                br.write("A=M\n");
                br.write("M=0\n");
                br.write(String.format("@ENDIF%s\n", variable_counter));
                br.write("0;JMP\n");
                br.write(String.format("(EQUAL%s)\n", variable_counter));
                br.write("@SP\n");
                br.write("A=M\n");
                br.write("M=-1\n");
                br.write(String.format("(ENDIF%s)\n", variable_counter));
            } else if (command.equals("gt")) {
                br.write("// D=*SP-D\n");
                br.write("@SP\n");
                br.write("A=M\n");
                br.write("D=M-D\n");

                br.write("// *SP=-1 if D>0, else *SP=0\n"); // up
                br.write(String.format("@GREATER%s\n", variable_counter));
                br.write("D;JGT\n"); // up
                br.write("@SP\n");
                br.write("A=M\n");
                br.write("M=0\n");
                br.write(String.format("@ENDIF%s\n", variable_counter));
                br.write("0;JMP\n");
                br.write(String.format("(GREATER%s)\n", variable_counter));
                br.write("@SP\n");
                br.write("A=M\n");
                br.write("M=-1\n");
                br.write(String.format("(ENDIF%s)\n", variable_counter));
            } else if (command.equals("lt")) {
                br.write("// D=*SP-D\n");
                br.write("@SP\n");
                br.write("A=M\n");
                br.write("D=M-D\n");

                br.write("// *SP=-1 if D<0, else *SP=0\n"); // up
                br.write(String.format("@LESS%s\n", variable_counter));
                br.write("D;JLT\n"); // up
                br.write("@SP\n");
                br.write("A=M\n");
                br.write("M=0\n");
                br.write(String.format("@ENDIF%s\n", variable_counter));
                br.write("0;JMP\n");
                br.write(String.format("(LESS%s)\n", variable_counter));
                br.write("@SP\n");
                br.write("A=M\n");
                br.write("M=-1\n");
                br.write(String.format("(ENDIF%s)\n", variable_counter));
            }
        }

        // Unary Commands (neg, not)
        if (
                command.equals("neg") ||
                command.equals("not")
        ) {
            br.write("// SP--\n");
            br.write("@SP\n");
            br.write("M=M-1\n");

            if (command.equals("neg")) {
                br.write("@SP\n");
                br.write("A=M\n");
                br.write("D=-M\n");
                br.write("@SP\n");
                br.write("A=M\n");
                br.write("M=D\n");
            } else if (command.equals("not")) {
                br.write("@SP\n");
                br.write("A=M\n");
                br.write("D=!M\n");
                br.write("@SP\n");
                br.write("A=M\n");
                br.write("M=D\n");
            }
        }

        br.write("// SP++\n");
        br.write("@SP\n");
        br.write("M=M+1\n");
    }

    /*
        Writes the assembly code that is the translation of the given command,
        where command is either C_PUSH or C_POP.
     */
    public void writePushPop(CommandType command, String segment, int index) throws IOException {
        if (command == CommandType.C_PUSH && segment.equals("constant")) {
            // *SP = i
            br.write("// *SP=i\n");
            String firstLine = "@" + index;
            br.write(firstLine + "\n");
            br.write("D=A\n");
            br.write("@SP\n");
            br.write("A=M\n");
            br.write("M=D\n");

            br.write("// SP++\n");
            br.write("@SP\n");
            br.write("M=M+1\n");
        } else if (command == CommandType.C_POP && (segment.equals("local") ||
                        segment.equals("argument") ||
                        segment.equals("this") ||
                        segment.equals("that"))) {
            String shortHand;
            if (segment.equals("local")) {
                shortHand = "LCL";
            } else if (segment.equals("argument")) {
                shortHand = "ARG";
            } else if (segment.equals("this")) {
                shortHand = "THIS";
            } else if (segment.equals("that")) {
                shortHand = "THAT";
            } else {
                shortHand = "";
            }
            br.write(String.format("// addr = %s+i, SP--, *addr=*SP\n", shortHand));
            br.write("@SP\n");
            br.write("M=M-1\n");
            br.write(String.format("@%s\n", index));
            br.write("D=A\n");
            br.write(String.format("@%s\n", shortHand));
            br.write("D=M+D\n");
            br.write("@R13\n");
            br.write("M=D\n");
            br.write("@SP\n");
            br.write("A=M\n");
            br.write("D=M\n");
            br.write("@R13\n");
            br.write("A=M\n");
            br.write("M=D\n");
        } else if (command == CommandType.C_PUSH && (segment.equals("local") ||
                segment.equals("argument") ||
                segment.equals("this") ||
                segment.equals("that"))) {
            String shortHand;
            if (segment.equals("local")) {
                shortHand = "LCL";
            } else if (segment.equals("argument")) {
                shortHand = "ARG";
            } else if (segment.equals("this")) {
                shortHand = "THIS";
            } else if (segment.equals("that")) {
                shortHand = "THAT";
            } else {
                shortHand = "";
            }
            br.write(String.format("// addr = %s+i, *SP=*addr, SP++\n", shortHand));
            br.write(String.format("@%s\n", index));
            br.write("D=A\n");
            br.write(String.format("@%s\n", shortHand));
            br.write("A=M+D\n");
            br.write("D=M\n");
            br.write("@SP\n");
            br.write("A=M\n");
            br.write("M=D\n");
            br.write("@SP\n");
            br.write("M=M+1\n");
        } else if (command == CommandType.C_PUSH && segment.equals("temp")) {
            br.write(String.format("@%s\n", index));
            br.write("D=A\n");
            br.write("@5\n");
            br.write("A=M+D\n");
            br.write("D=M\n");
            br.write("@SP\n");
            br.write("A=M\n");
            br.write("M=D\n");
            br.write("@SP\n");
            br.write("M=M+1\n");
        } else if (command == CommandType.C_POP && segment.equals("temp")) {
            br.write("@SP\n");
            br.write("M=M-1\n");
            br.write(String.format("@%s\n", index));
            br.write("D=A\n");
            br.write("@5\n");
            br.write("D=A+D\n");
            br.write("@R13\n");
            br.write("M=D\n");
            br.write("@SP\n");
            br.write("A=M\n");
            br.write("D=M\n");
            br.write("@R13\n");
            br.write("A=M\n");
            br.write("M=D\n");
        }
    }

    /*
        Closes the output file
     */
    public void close() throws IOException {
        br.close();
    }
}
