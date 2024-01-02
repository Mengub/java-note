package asia.mengub.model;

import lombok.Data;

import java.time.LocalDateTime;

/**
 * @Author Mengub
 * @Date 2024/1/2
 * @Description
 */
@Data
public class Note {
    public Note(String name,String object){
        this.name=name;
        this.object=object;
        createTime=LocalDateTime.now();
        updateTime=LocalDateTime.now();
    }
    private String name;
    private String object;
    private String code;//代码块文件链接
    private LocalDateTime createTime;
    private LocalDateTime updateTime;
}
