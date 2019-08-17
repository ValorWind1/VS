import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class DeserializationArray{
    public static void main(String[] args) {
        ArrayList<String>arrayList = new ArrayList<String>();
        try{
            FileInputStream fis = new FileInputStream("/Users/valorwind/Dev/vs/array.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            arrayList = (ArrayList) ois.readObject();
            ois.close();
            fis.close();

        }catch(IOException ioException){
            ioException.printStackTrace();
            return;
        }catch(ClassNotFoundException c ){
            System.out.println("Class not found");
            c.printStackTrace();
            return;
        }
        for(String i:arrayList){
            System.out.println(i);
        }
    }
}