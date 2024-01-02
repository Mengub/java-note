package asia.mengub.tool;

import asia.mengub.common.Output;
import asia.mengub.config.HelpConfig;
import asia.mengub.model.Command;
import asia.mengub.model.Note;
import asia.mengub.model.Result;

import java.util.Arrays;
import java.util.HashMap;

/**
 * @Author Mengub
 * @Date 2024/1/2
 * @Description 命令编译器
 */
public class Compiler {
    private NoteManager noteManager=new NoteManager();
    /**
     * 对Command进行词法分析
     * */
    public boolean check(Command command){
        if(command.isExit()){
            return false;
        }
        return true;
    }

    /**
     * 运行 Command
     * create note -n Java文件 -o java.io.File
     * */
    public Result run(Command command){
        if(command.isHelp()){
            return new Result(HelpConfig.HELP_TEXT);
        }
        String text = command.getCommandText();
        String[]words=text.split(" ");
        if(words[0].equals("create")&&words[1].equals("note")){
            return new Result(createNote(Arrays.copyOfRange(words,2,words.length)));
        }
        if(words[0].equals("read")&&words[1].equals("note")){
            return new Result(readNote(Arrays.copyOfRange(words,2,words.length)));
        }
        return new Result("不合法的输入",false);
    }

    private String[]createNote(String[]info){
        String name="";
        String object="";
        String[]res = new String[2];
        for(int i=0;i<info.length;i++){
            if(info[i].equals("-n")){
                name = info[i+1];
                break;
            }
        }
        for(int i=0;i<info.length;i++){
            if(info[i].equals("-o")){
                object = info[i+1];
                break;
            }
        }
        try {
            Class.forName(object);
        } catch (ClassNotFoundException e) {
            res[0]="类 "+object+" 不存在于当前的 JRE 中";
            res[1]="false";
            return res;
        }
        Note note = new Note(name,object);
        if(noteManager.createNoteFile(note)){
            res[0]="create note -n "+note.getName()+" -o "+note.getObject()+" Successfully!";
            res[1]="true";
        }else{
            res[0]="note -n "+note.getName()+" -o "+note.getObject()+" exist";
            res[1]="false";
        }
        return res;
    }

    private String[]readNote(String[]info){
        return info;
    }
}
