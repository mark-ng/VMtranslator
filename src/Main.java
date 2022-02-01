public class Main {

    public static void main(String[] args) throws Exception {
        Parser parser = new Parser("./SimpleAdd.vm");
        CodeWriter codeWriter = new CodeWriter("./SimpleAdd.asm");
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
