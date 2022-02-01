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
        /*
            SP--
            D=*SP
            SP--
            D=D+ *SP
            *SP=D
            SP++

            -----
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
            // D=D+ *SP
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

         */
        if (command.equals("add")) {
            System.out.println("called");
            br.write("@SP\n");
            br.write("M=M-1\n");
            br.write("@SP\n");
            br.write("A=M\n");
            br.write("D=M\n");
            br.write("@SP\n");
            br.write("M=M-1\n");
            br.write("@SP\n");
            br.write("A=M\n");
            br.write("D=D+M\n");
            br.write("@SP\n");
            br.write("A=M\n");
            br.write("M=D\n");
            br.write("@SP\n");
            br.write("M=M+1\n");
        }
    }

    /*
        Writes the assembly code that is the translation of the given command,
        where command is either C_PUSH or C_POP.
     */
    public void writePushPop(CommandType command, String segment, int index) throws IOException {
        // push constant x
        /*
            SP stored in RAM[0]
            Stack base address = 256

            PUSH CONSTANT 17
            *SP = 17
            SP++
            --------
            @17
            D=A

            @SP // RAM0 -> SP, A=0, M=256
            A=M // A=256
            M=D

            @SP
            M=M+1
            --------
         */
        if (command == CommandType.C_PUSH && segment.equals("constant")) {
            String firstLine = "@" + index;
            br.write(firstLine + "\n");
            br.write("D=A\n");
            br.write("@SP\n");
            br.write("A=M\n");
            br.write("M=D\n");
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
