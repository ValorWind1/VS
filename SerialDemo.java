import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;

public class SerialDemo {
    public static void main(String[] args) throws Exception {
        Save obj = new Save();
        obj.i = 5;
        
        //save
        File f = new File("/Users/valorwind/Dev/vs/obj.txt");
        FileOutputStream fos = new FileOutputStream(f);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(obj);

        // read
        FileInputStream fis = new FileInputStream(f);
        ObjectInputStream ois = new ObjectInputStream(fis);
        Save obj1 = (Save)ois.readObject(); // cast it with save

        System.out.println("Value of obj: "+obj1.i);



    }
}
// marker interface , we dont have to implement anything

class Save implements Serializable {

    int i;
}