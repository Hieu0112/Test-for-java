
package Kt2_test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class QLGT implements ChucNang{
    private List<PTGT>list;
    private Scanner in=new Scanner(System.in);
    public QLGT() {
        list=new ArrayList<>();
        list.add(new Oto("VN876", "yaris", 2021, 800000, "do", "cho nu", 4));
        list.add(new XeMay("VN321", "Vision", 2014, 38000,"Xam",150));
        list.add(new XeMay("VN881", "spacy", 2000, 10000, "trang",200));
        list.add(new Oto("VN111", "yaris", 2000, 120000, "do", "cho nu", 7));
        list.add(new Oto("HN999", "yaris", 2012, 900000, "do", "cho nu", 16));
        list.add(new Oto("VN666", "yaris", 2016, 30000, "xanh", "cho nu", 7));
    }

    public QLGT(List<PTGT> list) {
        this.list = list;
    }
    //kiem tra vi tri xem co khong
    private int tontai(String ma){
        for (int i=0;i<list.size();i++) {
            if(list.get(i).getMa().equalsIgnoreCase(ma))
                return i;
        }
        return -1;
    }
    //nhap lop cha
    private PTGT nhap(){
        String ma,hang;
        int nam;
        double gia;
        String mau;
        //Bat dau = chu VN sau day co 3 so
        String reg="^VN\\d{3}";
        while(true){
            System.out.print("Nhap Ma: ");
            ma=in.nextLine().toUpperCase();
            if(tontai(ma)==-1&& ma.matches(reg))
                break;
            System.err.println("Nhap Lai!!!");
        }
        System.out.print("Nhap Hang: ");
        hang=in.nextLine();
        System.out.print("Nhap Nam: ");
        nam=Integer.parseInt(in.nextLine());
        System.out.print("Nhap Gia: ");
        gia=Double.parseDouble(in.nextLine());
        System.out.print("Nhap mau: ");
        mau=in.nextLine();
        return new PTGT(ma, hang, nam, gia, mau);
    }
    @Override
    public void nhapOto() {
        PTGT p=nhap();
        System.out.print("Nhap Kieu: ");
        String kieu=in.nextLine();
        System.out.print("Nhap So cho: ");
        int socho =Integer.parseInt(in.nextLine());
        list.add(new Oto(p.getMa(), p.getHang(), p.getNam(),
                p.getGia(), p.getMau(), kieu, socho));
    }

    @Override
    public void NhapXeMay() {
        PTGT p=nhap();
        System.out.print("Nhap Cong Suat: ");
        double congsuat=Double.parseDouble(in.nextLine());
        list.add(new XeMay(p.getMa(), p.getHang(), p.getNam(),
                p.getGia(), p.getMau(), congsuat));
    }

    @Override
    public void vietDS() {
        System.out.println("Danh Sach Oto: ");
        for (PTGT ptgt : list) {
            if(ptgt instanceof Oto){
                System.out.println(ptgt);
            }
        }
        
        System.out.println("Danh Sach Xe May: ");
        for (PTGT ptgt : list) {
            if(ptgt instanceof XeMay){
                System.out.println(ptgt);
            }
        }
        System.out.println("---------------------");
    }

    @Override
    public void Xoa() {
        System.out.print("Nhap Ma can Xoa: ");
        String ma=in.nextLine();
        int pos=tontai(ma);
        if(pos==-1){
            System.out.println("Khong ton tai!!!");
        }
        else{
            list.remove(pos);
            System.out.println("Da xoa");
        }
    }

    @Override
    public void Sua() {
        System.out.print("Nhap Ma can sua: ");
        String ma=in.nextLine();
        int pos=tontai(ma);
        if(pos==-1){  
            System.out.println("Khong ton tai!!!");
        }
        else{
            PTGT p=list.get(pos);
            System.out.print("Nhap Hang: ");
            String hang=in.nextLine();
            System.out.print("Nhap Nam: ");
            int nam=Integer.parseInt(in.nextLine());
            System.out.print("Nhap Gia: ");
            double gia=Double.parseDouble(in.nextLine());
            System.out.print("Nhap mau: ");
            String mau=in.nextLine();
            p.setHang(hang);
            p.setNam(nam);
            p.setGia(gia);
            p.setMau(mau);
            System.out.println("Da sua");
        }
    }
    public void SuaXeMay(){
        List<XeMay>l=new ArrayList<>();
        for (PTGT i:list) {
            if(i instanceof XeMay)
                l.add((XeMay)i);
        }
        System.out.print("Nhap ma xe may can sua: ");
        String ma=in.nextLine();
        for (int i=0;i<l.size();i++) {
            XeMay x=l.get(i);
            if(l.get(i).getMa().equalsIgnoreCase(ma)){
                System.out.print("Nhap Hang: ");
                String hang=in.nextLine();
                System.out.print("Nhap Nam: ");
                int nam=Integer.parseInt(in.nextLine());
                System.out.print("Nhap Gia: ");
                double gia=Double.parseDouble(in.nextLine());
                System.out.print("Nhap mau: ");
                String mau=in.nextLine();
                System.out.print("Nhap Cong Suat");
                double cs=Double.parseDouble(in.nextLine());
                x.setHang(hang);
                x.setNam(nam);
                x.setGia(gia);
                x.setMau(mau);
                x.setCongsuat(cs);
                System.out.println("Da sua");
            }
        }
        System.out.println("Khong Tim Thay");
    }
    @Override
    public void TimTheoHang() {
        System.out.print("Nhap Hang can tim: ");
        String hang=in.nextLine().toLowerCase();
        boolean ok=true;
        for (PTGT ptgt : list) {
            if(ptgt.getHang().toLowerCase().contains(hang)){
                System.out.println(ptgt);
                ok=false;
            }
        }
        if(ok)
            System.out.println("Khong tim thay");
    }

    @Override
    public void TimTheoMa() {
        System.out.print("Nhap Ma can tim: ");
        String ma=in.nextLine();
        int pos=tontai(ma);
        if(pos==-1){  
            System.out.println("Khong tim thay!!!");
        }
        else{
            System.out.print("Doi Tuong la: ");
            System.out.println(list.get(pos));
        }
    }

    @Override
    public void TimTheoNam() {
        System.out.print("Nhap Nam can tim: ");
        int n1=Integer.parseInt(in.nextLine());
        int n2=Integer.parseInt(in.nextLine());
        boolean ok=true;
        for (PTGT ptgt : list) {
            if(ptgt.getNam()>=n1&&ptgt.getNam()<=n2){
                System.out.println(ptgt);
                ok=false;
            }
        }
        if(ok)
            System.out.println("Khong tim thay");
    }

    @Override
    public void TimTheoMau() {
        System.out.print("Nhap Mau can tim: ");
        String mau=in.nextLine();
        boolean ok=true;
        for (PTGT ptgt : list) {
            if(ptgt.getMau().equalsIgnoreCase(mau)){
                System.out.println(ptgt);
                ok=false;
            }
        }
        if(ok)
            System.out.println("Khong tim thay");
    }
    //Tim Theo So Cho
    public void TimTheoSoCho() {
        List<Oto>l=new ArrayList<>();
        for (PTGT i : list) {
            if(i instanceof Oto)
                l.add((Oto)i);
        }
        System.out.print("Nhap cho can tim: ");
        int cho=Integer.parseInt(in.nextLine());
        boolean ok=true;
        for (Oto i:l) {
            if(i.getSocho()==cho){
                System.out.println(i);
                ok=false;
            }
        }
        if(ok)
            System.out.println("Khong tim thay");
    }
//    //Tim Theo Cong Suat
//    public void TimTheoConSuat() {
//        List<Oto>l=new ArrayList<>();
//        for (PTGT i : list) {
//            if(i instanceof Oto)
//                l.add((Oto)i);
//        }
//        System.out.print("Nhap cho can tim: ");
//        int cho=Integer.parseInt(in.nextLine());
//        boolean ok=true;
//        for (Oto i:l) {
//            if(i.getSocho()==cho){
//                System.out.println(i);
//                ok=false;
//            }
//        }
//        if(ok)
//            System.out.println("Khong tim thay");
//    }
    @Override
    public void SapXepTheoMa() {
        Collections.sort(list);
    }

    @Override
    public void SapXepTheoHang() {
        Collections.sort(list,new Comparator<PTGT>(){
            @Override
            public int compare(PTGT o1, PTGT o2) {
                return o1.getHang().compareToIgnoreCase(o2.getHang());
            }
            
        });
    }

    @Override
    public void SapXepTheoNam() {
        list.sort(new Comparator<PTGT>(){
            @Override
            public int compare(PTGT o1, PTGT o2) {
                // giam dan
                return o2.getNam()-o1.getNam();
            }
            
        });
    }
    

    @Override
    public void SapXepTheoGiaGiamDan() {
        list.sort(new Comparator<PTGT>(){
            @Override
            public int compare(PTGT o1, PTGT o2) {
                // giam dan
                return Double.compare(o2.getGia(),o1.getGia());
            }
            
        });
    }

    @Override
    public void SapXepTheoMau() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void SapXepOtoTheoGia() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void thongke() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    @Override
    public void ghiFile(String fname) {
        IOEFIle.Viet(fname, list);
        System.out.println("Da Duoc ghi vao File");
    }
    @Override
    public void DocFile(String fname) {
        List<PTGT>lists=IOEFIle.Doc(fname);
        System.out.println("File co noi dung la:");
        for (PTGT list1 : lists) {
            System.out.println(list1);
        }
    }
    
}
