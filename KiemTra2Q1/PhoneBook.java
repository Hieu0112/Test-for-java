
package KiemTra2Q1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Collections;
import java.util.Comparator;
public class PhoneBook {
    private List<PhoneNumber>list =new ArrayList<>();
    private Scanner sc=new Scanner(System.in);
    public PhoneBook() {
        this.list=new ArrayList<>();
        this.list.add(new PhoneNumber(24, 36407515));
        this.list.add(new PhoneNumber(227,3821213));
        this.list.add(new IntlPhoneNumber(24, 36407515,84));
    }
    public PhoneNumber nhap(){
        return new PhoneNumber(Integer.parseInt(sc.nextLine()),Long.parseLong(sc.nextLine()));
    }
    public void add_NoiVung(){
        PhoneNumber p=nhap();
        list.add(p);
    }
    public void add_NuocNgoai(){
        PhoneNumber p=nhap();
        IntlPhoneNumber p1=new IntlPhoneNumber(p.getMavung(),p.getSodienthoai(),Integer.parseInt(sc.nextLine()));
        list.add(p1);
    }
    public void HienThi(){
        System.out.print("noi vung or nuoc ngoai: ");
        String chon=sc.nextLine();
        if(chon.toLowerCase().contains("noi vung")){
        System.out.println("Noi Vung");
        for (PhoneNumber phoneNumber : list) {
            if(phoneNumber instanceof IntlPhoneNumber==false)
                System.out.println(phoneNumber);
        }
        }
        if(chon.toLowerCase().contains("nuoc ngoai")){
        System.out.println("Nuoc Ngoai: ");
        for (PhoneNumber phoneNumber : list) {
            if(phoneNumber instanceof IntlPhoneNumber)
                System.out.println(phoneNumber);
            }
        }  
    }
    public int tontai(int x,List std){
        for(int i=0;i<std.size();i++) {
            if((int)std.get(i)==x){
                return 1;
            }
        }
        return -1;
    }
    public void Tim_dt_theo_ma_vung(){
        boolean ok=true;
        System.out.print("ma vung: ");
        int x=Integer.parseInt(sc.nextLine());
        System.out.println("Danh Sach Dien thoai theo ma vung: ");
        for (PhoneNumber phoneNumber : list) {
            if(phoneNumber.getMavung()==x){
                System.out.println(phoneNumber);
                ok=false;
            }
        }
        if(ok){
            System.out.println("khong ton tai");
        }
    }
    
    public void TongSoDienThoaiTheoTungVung(){
        List<Integer>sdt=new ArrayList<>();
        for (PhoneNumber phoneNumber : list) {
                if(tontai(phoneNumber.getMavung(), sdt)==-1)
                    sdt.add(phoneNumber.getMavung());
            }
        for(int i=0;i<sdt.size();i++){
        System.out.println("Danh Sach Dien thoai theo ma vung: "+sdt.get(i));
        for (PhoneNumber phoneNumber : list) {
            if(phoneNumber.getMavung()==sdt.get(i)){
                System.out.println(phoneNumber);
            }
        }
    }
    }
    public void Tim_dt_theo_Duoi(){
        boolean ok=true;
        System.out.print("Duoi so sdt la: ");
        String x=sc.nextLine();
        System.out.println("Danh Sach Dien thoai theo duoi");
        for (PhoneNumber phoneNumber : list) {
            String res=String.valueOf(phoneNumber.getSodienthoai());
            if(res.endsWith(x)){
                System.out.println(phoneNumber);
                ok=false;
            }
        }
        if(ok){
            System.out.println("khong ton tai");
        }
    }
    public void SapXepSDT(){
        Collections.sort(list, Comparator.comparing(PhoneNumber::getSodienthoai));
    }
    
}
