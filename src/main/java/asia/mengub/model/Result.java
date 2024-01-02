package asia.mengub.model;

import asia.mengub.common.Output;

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

    public Result(String text,boolean isSuccessful){
        resultText=text;
        this.isSuccessful=isSuccessful;
    }

    public Result(String[]texts){
        resultText=texts[0];
        isSuccessful = texts.equals("true")?true:false;
    }

    public void show(){
        if(!isSuccessful){
            Output.error(resultText);
            return;
        }
        Output.successful(resultText);
    }
}
