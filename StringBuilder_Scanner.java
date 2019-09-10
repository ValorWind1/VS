import java.lang.*;
import java.util.Scanner;

public class StringBuilder_Scanner{

    public static void main(String[] args) {
        System.out.println("Type your String: ");
        Scanner sc = new Scanner(System.in);
        StringBuffer sbf = new StringBuffer(sc.nextLine());

        System.out.println("output : " + sbf);

        sbf.reverse();

        System.out.println("reverse output : " + sbf);

        

    }

}