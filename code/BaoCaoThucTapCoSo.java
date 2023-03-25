
package code;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
class sinhvien{
    private String id,name,sdt,mail;

    public sinhvien() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public sinhvien(String id, String name, String sdt, String mail) {
        this.id = id;
        this.name = name;
        this.sdt = sdt;
        this.mail = mail;
    }

    public String getId() {
        return id;
    }
    

}
class detai{
    private int id;
    private String gv,detai;

    public detai(int id, String gv, String detai) {
        this.id = id;
        this.gv = gv;
        this.detai = detai;
    }

    public String getId() {
        return String.format("DT%03d", id);
    }

    public String getDetai() {
        return detai;
    }

    public String getGv() {
        return gv;
    }
    
    @Override
    public String toString() {
        return getId()+" "+gv+" "+detai;
    }
}
class nhiemvu implements Comparable<nhiemvu>{
    private sinhvien sv;
    private detai dt;

    public nhiemvu(sinhvien sv, detai dt) {
        this.sv = sv;
        this.dt = dt;
    }

    @Override
    public int compareTo(nhiemvu o) {
        return this.dt.getDetai().compareTo(o.dt.getDetai());
    }

    @Override
    public String toString() {
        return sv.getId()+" "+sv.getName()+" "+sv.getSdt()+" "
                +sv.getMail()+" "+dt.getGv()+" "+dt.getDetai();
     }
    
    
}
public class BaoCaoThucTapCoSo {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc=new Scanner(new File("SINHVIEN.in"));
        int n=Integer.parseInt(sc.nextLine());
        List<sinhvien>sv=new ArrayList<>();
        for(int i=0;i<n;i++){
            sv.add(new sinhvien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        
        sc=new Scanner(new File("DETAI.in"));
        int n1=Integer.parseInt(sc.nextLine());
        List<detai>ldt=new ArrayList<>();
        for(int i=0;i<n1;i++){
            ldt.add(new detai(i+1,sc.nextLine(), sc.nextLine()));
        }
        
        sc=new Scanner(new File("NHIEMVU.in"));
        int n2=Integer.parseInt(sc.nextLine());
        List<nhiemvu>lnv=new ArrayList<>();
        for(int i=0;i<n2;i++){
            String[] as=sc.nextLine().split("\\s+");
            String msv=as[0];
            int kt=0;
            for(int j=0;j<sv.size();j++)
                if(msv.equalsIgnoreCase(sv.get(j).getId())) kt=j;
                String madetai=as[1];
                int checkdt=0;
                for(int j=0;j<ldt.size();j++)
                    if(madetai.equalsIgnoreCase(ldt.get(j).getId()))
                        checkdt=j;
                lnv.add(new nhiemvu(sv.get(kt),ldt.get(checkdt)));
        }
        Collections.sort(lnv);
        for (nhiemvu object : lnv) {
            System.out.println(object);
        }
    }
}
