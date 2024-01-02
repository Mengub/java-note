package asia.mengub.controller;

import asia.mengub.model.Command;

import java.util.Scanner;

/**
 * @Author Mengub
 * @Date 2024/1/2
 * @Description 用于接收用户命令
 */
public class CommandReceiver {
    public Command getCommand(){
        Scanner scanner = new Scanner(System.in);
        return new Command(scanner.next());
    }
}
