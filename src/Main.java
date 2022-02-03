import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws Exception {
        String filePath = args[0];
        String outputFile = args[1];
        Parser parser = new Parser(filePath);
        CodeWriter codeWriter = new CodeWriter(outputFile);
        while(parser.hasMoreCommands()) {
            parser.advance();
            CommandType commandType = parser.commandType();
            System.out.println(commandType);
            if (commandType == CommandType.C_PUSH || commandType == CommandType.C_POP) {
                codeWriter.writePushPop(commandType, parser.arg1(), parser.arg2());
            } else if (commandType == CommandType.C_ARITHMETIC) {
                codeWriter.writeArithmetic(parser.arg1());
            }
        }
        codeWriter.close();

    }

}
