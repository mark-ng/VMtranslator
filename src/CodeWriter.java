import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class CodeWriter {

    BufferedWriter br;

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
        if (command.equals("add")) {
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

            br.write("// D=D+*SP\n");
            br.write("@SP\n");
            br.write("A=M\n");
            br.write("D=D+M\n");

            br.write("// *SP=D\n");
            br.write("@SP\n");
            br.write("A=M\n");
            br.write("M=D\n");

            br.write("// SP++\n");
            br.write("@SP\n");
            br.write("M=M+1\n");
        }
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
        }
    }

    /*
        Closes the output file
     */
    public void close() throws IOException {
        br.close();
    }
}
