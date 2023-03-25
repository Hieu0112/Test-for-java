package test_KT2;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class IOEFile {
    public static <T> List <T> Doc(String fname){
        List<T> list=new ArrayList<>();
        try{
            ObjectInputStream o=new ObjectInputStream(new FileInputStream(fname));
            list=(List<T>)o.readObject();
        }
        catch(IOException e){
            System.out.println(e);
        }
        catch(ClassNotFoundException e){
            System.out.println(e);
        }
        return list;
    }
    public static <T> void Viet(String fname,List arr){
        try{
            ObjectOutputStream o=new ObjectOutputStream(new FileOutputStream(fname));
            o.writeObject(arr);
            o.close();
        }
        catch(IOException e){
            System.out.println(e);
        }
    }
}
