package asia.mengub.tool;

import asia.mengub.config.HelpConfig;
import asia.mengub.model.Command;
import asia.mengub.model.Result;

import java.util.HashMap;

/**
 * @Author Mengub
 * @Date 2024/1/2
 * @Description 命令编译器
 */
public class Compiler {
    /**
     * 对Command进行词法分析
     * */
    private HashMap wordMap = new HashMap();
    public boolean check(Command command){
        if(command.isExit()){
            return false;
        }
        return true;
    }

    /**
     * 运行 Command
     * */
    public Result run(Command command){
        if(command.isHelp()){
            return new Result(HelpConfig.HELP_TEXT);
        }
        String text = command.getCommandText();
        String[]words=text.split(" ");
        return null;
    }
}
