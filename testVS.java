import java.util.Scanner;

public class testVS{
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        System.out.println("Type your string : ");

        String string1 ; 

        string1 = sc.nextLine();

        String [] array1 = string1.split("");

        for(int i = array1.length-1;i>=0;i--){
            System.out.print(array1[i]);
        }
        System.out.println();
       
 }
}