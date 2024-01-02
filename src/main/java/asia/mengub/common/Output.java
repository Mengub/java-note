package asia.mengub.common;

/**
 * @Author Mengub
 * @Date 2024/1/2
 * @Description
 */
public class Output {
    public static void error(String text){
        String newText="\033[31m"+text+"\033[0m";
        System.out.println(newText);
    }

    public static void successful(String text){
        String newText="\033[32m"+text+"\033[0m";
        System.out.println(newText);
    }

    public static void info(String text){
        System.out.println(text);
    }
}
