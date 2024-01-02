package asia.mengub.model;

/**
 * @Author Mengub
 * @Date 2024/1/2
 * @Description
 */
public class Result {
    private String resultText;
    private boolean isSuccessful;
    public Result(String text){
        resultText=text;
        isSuccessful=true;
    }
    public void show(){
        if(!isSuccessful){
            resultText="\033[31m"+resultText+"\033[0m";
        }
        System.out.println(resultText);
    }
}
