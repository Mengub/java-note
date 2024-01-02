package asia.mengub.tool;

import asia.mengub.model.Note;

import java.io.File;

/**
 * @Author Mengub
 * @Date 2024/1/2
 * @Description
 */
public class NoteManager {
    /**
     * 创建一个笔记目录*/
    public boolean createNoteFile(Note note){
        File directory=new File("resources/"+note.getObject());
        return directory.mkdir();
    }
}
