import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
public class objectFile{
public static void main(String[] args) {
    
    Person person = new Person("Mr.Espresso",20,"Male");
    outObjectStream.writeObject(person);


    File outFile = new File ("/Users/valorwind/Dev/vs/objects.data");
    FileOutputStream outFileStream = new FileOutputStream(outFile);
    ObjectOutputStream outObjectStream = new ObjectOutputStream(outFileStream);

    

    outObjectStream.writeObject(name);
    outObjectStream.writeObject(age);
    outObjectStream.writeObject(gender);
    
}

class Person implements Serializable{
    private String name;
    private int age;
    private String gender;


    public Person(String name,int age,String gender){
        this.name = name;
        this.age = age;
        this.gender = gender;

    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getAge(){
        return name;
    }
    public void setName(int age){
        this.age = age;
    }
    public String getGender(){
        return name;
    }
    public void setGender(String gender){
        this.gender = setGender;
    }
    
    public String toString(){
        return "Person[name="+name+", age: "+age+" gender: "+gender+"]";

    }
   

    }

}