package asia.mengub;

import asia.mengub.controller.CommandReceiver;
import asia.mengub.model.Command;
import asia.mengub.model.Result;
import asia.mengub.tool.Compiler;

/**
 * @Author Mengub
 * @Date 2024/1/2
 * @Description 笔记运行的入口文件
 */
public class Main {
    private static CommandReceiver commandReceiver=new CommandReceiver();
    private static Command command;
    private static Compiler compiler=new Compiler();
    private static Result result;
    public static void main(String[] args) {
        System.out.print("[java-note]");
        command = commandReceiver.getCommand();
        while(compiler.check(command)){
            result = compiler.run(command);
            result.show();
            command = commandReceiver.getCommand();
        }
        System.out.println("quit successfully");
    }
}