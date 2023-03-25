
package code;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

class MonThi{
    private String ma,ten,hinh;

    public MonThi(String ma, String ten, String hinh) {
        this.ma = ma;
        this.ten = ten;
        this.hinh = hinh;
    }

    public String getHinh() {
        return hinh;
    }

    public String getMa() {
        return ma;
    }

    
    @Override
    public String toString() {
        return ma+" "+ten+" "+hinh;
    }
    
}
public class test1 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc=new Scanner(new File("MONHOC.in"));
        List<MonThi>l=new ArrayList<>();
        HashSet<String>s=new HashSet<>();
        while(sc.hasNextLine()){
            String x=sc.nextLine();
            String y=sc.nextLine();
            String z=sc.nextLine();
            if(s.contains(x)==false){
                s.add(x);
            l.add(new MonThi(x,y,z));
            }
        }
        Collections.sort(l, (MonThi a,MonThi b)->{
            return a.getMa().compareTo(b.getMa());
    });
        for (MonThi monThi : l) {
            System.out.println(monThi);
        }
    }
}
