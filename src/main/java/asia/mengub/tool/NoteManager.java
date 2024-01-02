package asia.mengub.tool;

import asia.mengub.model.Note;

import java.io.File;
import java.io.IOException;

import static asia.mengub.config.FileConfig.ROOT;

/**
 * @Author Mengub
 * @Date 2024/1/2
 * @Description
 */
public class NoteManager {
    /**
     * 创建一个笔记目录*/
    public boolean createNoteFile(Note note){
        File directory=new File(ROOT+note.getObject());
        File noteFile=new File(ROOT+note.getObject()+"/"+note.getName()+".md");
        if(noteFile.exists()){
            return false;
        }
        directory.mkdir();
        System.out.println("111");
        try {
            noteFile.createNewFile();
        } catch (IOException e) {
            return false;
        }
        return true;
    }
}
