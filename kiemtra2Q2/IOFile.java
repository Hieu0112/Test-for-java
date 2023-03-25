/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kiemtra2Q2;


import java.io.*;
import java.util.*;
/**
 *
 * @author ASUS2020
 */
public class IOFile {
    
    // doc ra
    public static <T> List<T> doc (String fname){
        List<T> ls = new ArrayList<>();
        try{
            ObjectInputStream o = new ObjectInputStream(new FileInputStream(fname));
            ls = (List<T>) o.readObject();
            o.close();
        }
        catch(IOException e){
            System.out.println(e);
        }
        catch(ClassNotFoundException e){
            System.out.println(e);
        }
        return ls;
    }
    
    public static <T> void viet(String fname, List<T> ls){
        try{
            ObjectOutputStream o = new ObjectOutputStream(new FileOutputStream(fname));
            o.writeObject(ls);
            o.close();
        }catch(IOException e){
            System.out.println(e);
        }
        
    }
}
