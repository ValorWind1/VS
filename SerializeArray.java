import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class SerializeArray{
    public static void main(String[] args) {
        
        ArrayList<String> array1 = new ArrayList<String>();
        array1.add("Barcelona");
        array1.add("Madrid");
        array1.add("Granada");

        try{
            FileOutputStream fos = new FileOutputStream("/Users/valorwind/Dev/vs/array.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(array1);
            oos.close();
            fos.close();
        }catch(IOException ioe){
            ioe.printStackTrace();
        }

    }
}