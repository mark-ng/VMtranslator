import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Parser {

    private String currentCommand;
    private Scanner sc;

    public Parser(String fileName) throws FileNotFoundException {
        sc = new Scanner(new File(fileName));
    }

    public boolean hasMoreCommands() {
        return sc.hasNextLine();
    }

    /*
         Reads the next command from the input and makes it the current command.
         Should be called only if hasMoreCommands() is true.
         Initially there is no current command.
     */
    public void advance() {
        // TODO: Check empty line, skip that
        // TODO: Ignores comments
        currentCommand = sc.nextLine();
    }


    /*
         Returns the type of the current VM command.
         C_ARITHMETIC is returned for all the arithmetic commands.
     */
    public CommandType commandType() {
        // Split command by space, if the length of array is only one then is Arithmetic command
        String[] commands = currentCommand.split(" ");
        if (commands.length == 1) {
            return CommandType.C_ARITHMETIC;
        } else if (commands.length == 3 && commands[0].equals("push")){
            return CommandType.C_PUSH;
        } else if (commands.length == 3 && commands[0].equals("pop")) {
            return CommandType.C_POP;
        } else {
            // TODO: need to change
            return CommandType.C_GOTO;
        }
    }

    /*
         Returns the first argument of the current command.
         In the case of C_ARITHMETIC, the command itself (add, sub, etc.) is returned.
         Should not be called if the current command is C_RETURN.
     */
    public String arg1() throws Exception {
        if (commandType() == CommandType.C_RETURN) {
            throw new Exception("Should not be called if the current command is C_RETURN");
        }

        String[] commands = currentCommand.split(" ");
        if (commandType() == CommandType.C_ARITHMETIC) {
            return commands[0];
        } else {
            return commands[1];
        }
    }

    /*
         Returns the second argument of the current command.
         Should be called only if the current command is C_PUSH, C_POP, C_FUNCTION, or C_CALL.
     */
    public int arg2() throws Exception {
        if (
                commandType() == CommandType.C_PUSH ||
                commandType() == CommandType.C_POP ||
                commandType() == CommandType.C_FUNCTION ||
                commandType() == CommandType.C_CALL
        ) {
            String[] commands = currentCommand.split(" ");
            return Integer.parseInt(commands[2]);
        } else {
            throw new Exception("Should be called only if the current command is C_PUSH, C_POP, C_FUNCTION, or C_CALL");
        }
    }

}
