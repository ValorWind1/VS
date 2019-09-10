// reversing a string using stringBuffer.reverse method 
import java.lang.*;

public class BackwardsString{

    public static void main(String[] args) {
        
        StringBuffer sbf = new StringBuffer("Hello World");

        System.out.println("String Builder output = " + sbf );

        // reverses the string buffer 

        sbf.reverse();

        System.out.println("reverse output string: " + sbf);


    }


}
