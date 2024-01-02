package asia.mengub.model;

/**
 * @Author Mengub
 * @Date 2024/1/2
 * @Description 命令模型
 */
public class Command {
    private String commandText;//命令文本
    public Command(String text){
        commandText=text;
    }
    public void setCommandText(String text){
        commandText=text;
    }

    public String getCommandText(){
        return commandText;
    }

    public boolean isExit(){
        return commandText.equals("/exit")||commandText.equals("/q");
    }

    public boolean isHelp() {
        return commandText.equals("/help")||commandText.equals("/h");
    }
}
