package exception;
import java.lang.*;


public class PassException extends Exception{

   public String getMessage(){

       return "SORRY THE PASSWORD IS TOO SHORT.";

   }


}