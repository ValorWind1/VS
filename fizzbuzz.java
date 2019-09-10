public class fizzbuzz {

    public static void main(String[] args) {
        
        /**
         * fizz  = 3 == 0 
         * buzz = 5 == 0 
         * fizzbuzz =5 & 3 == 0 
         * 
         */

         for(int i = 0 ; i<500;i++){

            if (i % 3 == 0 && i % 5 == 0 ){
             System.out.println("fizzbuzz");
            }else if( i % 3 == 0 ) {
                System.out.println("fizz");
            }else if (i % 5 == 0 ){
                System.out.println("buzz");
            }else{
                System.out.println(i);
            }
         }


    }
}