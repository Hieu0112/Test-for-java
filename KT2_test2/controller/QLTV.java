
package KT2_test2.controller;

import KT2_test2.model.Bao;
import KT2_test2.model.ChucNang;
import KT2_test2.model.Sach;
import KT2_test2.model.TaiLieu;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Optional;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class QLTV implements ChucNang{
    private List<TaiLieu> list;
    private Scanner sc=new Scanner(System.in);
    public QLTV() {
        list=new ArrayList<>();
    }

    public QLTV(List<TaiLieu> list) {
        this.list = list;
    }
    private int timViTri(String ma){
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getMa().equalsIgnoreCase(ma))
                return i;
        }
        return -1;
    }

    public void setList(List<TaiLieu> list) {
        this.list = list;
    }
    
    private TaiLieu Nhap(){
        String ma,tenNXB;
        int soPH;
        //Bat dau bang ABCD co 1 ky tu va sau do co 3 so
        String re ="^[ABCD]{1}\\d{3}";
        while(true){
            try{
                System.out.print("ma: ");
                ma=sc.nextLine().toUpperCase();
                if(timViTri(ma)==-1&&ma.matches(re)){
                    break;
                }
                else{
                    throw new ValidException("Ma Bi trung hoac sai dinh dang");
                }
            }
            catch(ValidException e){
                System.err.println(e);
            }
        }
        System.out.print("Ten NXB: ");
        tenNXB =sc.nextLine();
        while(true){
            try{
                System.out.print("So Ban PH: ");
                soPH=Integer.parseInt(sc.nextLine());
                break;
            }
            catch(NumberFormatException e){
                System.err.println(e);
            }
        }
        return (new TaiLieu(ma, tenNXB, soPH));
    }
    @Override
    public void NhapSach() {
        TaiLieu t=Nhap();
        String tenTG,tenSach;
        int soTrang;
        System.out.print("Ten Sach: ");
        tenSach=sc.nextLine();
        System.out.print("Ten tac gia: ");
        tenTG=sc.nextLine();
        while(true){
            try{
                System.out.print("So trang: ");
                soTrang=Integer.parseInt(sc.nextLine());
                break;
            }
            catch(NumberFormatException e){
                System.err.println(e);
            }
        }
        list.add(new Sach(t.getMa(), t.getTenNXB(), t.getSoBanPH(), tenTG, tenSach, soTrang));
    }

    @Override
    public void NhapBao() {
        TaiLieu t=Nhap();
        String ngay;
        String re ="\\d{1,2}/\\d{1,2}/\\d{4}";
        while(true){
            try{
                System.out.print("Ngay phat hanh ");
                ngay=sc.nextLine();
                if(ngay.matches(re)){
                    break;
                }
                else{
                    throw new ValidException("Ngay sai dinh dang");
                }
            }
            catch(ValidException e){
                System.err.println(e);
            }
        }
        list.add(new Bao(t.getMa(),t.getTenNXB(),ngay,t.getSoBanPH()));
    }

    @Override
    public void HienThiDS() {
        for (TaiLieu taiLieu : list) {
            System.out.println(taiLieu);
        }
        System.out.println("-------------");
        System.out.println("Tong: "+list.size());
    }

    @Override
    public void Luu(String fname) {
        IOEFIle.Viet(fname, list);
    }

    @Override
    public void Docra(String fname) {
        setList(IOEFIle.Doc(fname));
    }

    @Override
    public void Xoa() {
        System.out.print("Nhap Ma Can Xoa");
        String ma=sc.nextLine();
        int vt=timViTri(ma);
        if(vt==-1)
            System.out.println("Khong Tim Thay");
        else{
            System.out.println("Tai Lieu can xoa: "+list.remove(vt));
            System.out.println("Da Xoa");
        }
    }

    @Override
    public void Sua(){
        System.out.print("Nhap Ma Can Sua: ");
        String ma=sc.nextLine();
        int vt=timViTri(ma);
        if(vt==-1)
            System.out.println("Khong Tim Thay");
        else{
            TaiLieu t=list.get(vt);
            //Sua Phan Chung
            System.out.print("Ten NXB: ");
            String tenNXB =sc.nextLine();
            int soPH;
            while(true){
                try{
                    System.out.print("So Ban PH: ");
                    soPH=Integer.parseInt(sc.nextLine());
                    break;   
                }
                catch(NumberFormatException e){
                System.err.println(e);
                }
            }
            t.setTenNXB(tenNXB);
            t.setSoBanPH(soPH);
            if(t instanceof Sach){
                //Sua Sach
                String tenTG,tenSach;
                int soTrang;
                System.out.print("Ten Sach: ");
                tenSach=sc.nextLine();
                System.out.print("Ten tac gia: ");
                tenTG=sc.nextLine();
                while(true){
                    try{
                        System.out.print("So trang: ");
                        soTrang=Integer.parseInt(sc.nextLine());
                        break;

                    }
                    catch(NumberFormatException e){
                        System.err.println(e);
                }
                }
                ((Sach)t).setTenSach(tenSach);
                ((Sach)t).setTenTG(tenTG);
                ((Sach)t).setSoTrang(soTrang);
            }
            //sua bao
            if(t instanceof Bao){
                String ngay;
                String re ="\\d{1,2}/\\d{1,2}/\\d{4}";
                while(true){
                    try{
                        System.out.print("Ngay phat hanh ");
                        ngay=sc.nextLine();
                        if(ngay.matches(re)){
                            break;
                        }
                        else{
                            throw new ValidException("Ngay sai dinh dang");
                        }
                    }
                    catch(ValidException e){
                        System.err.println(e);
                    }
                }
                ((Bao)t).setNgayPH(ngay);
            }
            System.out.println("Sua Thanh Cong");
        }
    }

    @Override
    public void TimTheoTenSach() {
        List<Sach>sach =new ArrayList<>();
        for (TaiLieu t:list) {
            if(t instanceof Sach)
                sach.add((Sach)t);
        }
        System.out.print("Nhap ten can tim: ");
        String ten =sc.nextLine();
        int k=0;
        for(Sach i: sach){
            if(i.getTenSach().toLowerCase().indexOf(ten.toLowerCase())>=0){
                System.out.println(i);
                k++;
            }
        }
        if(k==0)
            System.out.println("Khong tim duoc");
        else
            System.out.println("Tong tim duoc: "+k);
    }

    @Override
    public void TimBaoTuNamDenNam() {
        List<Bao>bao =new ArrayList<>();
        for (TaiLieu t:list) {
            if(t instanceof Bao)
                bao.add((Bao)t);
        }
        System.out.print("Nhap tu nam: ");
        int nam1=Integer.parseInt(sc.nextLine());
        System.out.print("Den nam: ");
        int nam2=Integer.parseInt(sc.nextLine());
        int k=0;
        for(Bao i:bao){
            if(i.getNam()>=nam1&&i.getNam()<=nam2){
                System.out.println(i);
                k++;
            }
        }
        if(k==0)
            System.out.println("Khong tim duoc");
        else
            System.out.println("Tong tim duoc: "+ k);
    }

    @Override
    public void SapXepSoBanPH() {
        Collections.sort(list);
        HienThiDS();
    }

    @Override
    public void SXSachTheoTenTG() {
        List<Sach>sach =new ArrayList<>();
        for (TaiLieu t:list) {
            if(t instanceof Sach)
                sach.add((Sach)t);
        }
        sach.sort(new Comparator<Sach>(){
            @Override
            public int compare(Sach o1, Sach o2) {
                String ten1=o1.getTenTG();
                String ten2=o2.getTenTG();
                String t1=ten1.substring(ten1.lastIndexOf(" ")+1)+ten1;
                String t2=ten2.substring(ten2.lastIndexOf(" ")+1)+ten2;
                return t1.compareToIgnoreCase(t2);
            }
        });
        System.out.println("Danh Sach Sach da sap xep");
        for (Sach sach1 : sach) {
            System.out.println(sach1);
        }
        System.out.println("Tong so: "+sach.size());
    }

    @Override
    public void SapXepBao2TTTheoSoBanPH() {
        List<Bao>bao =new ArrayList<>();
        for (TaiLieu t:list) {
            if(t instanceof Bao)
                bao.add((Bao)t);
        }
        //ngay PH va So ban PH
        bao.sort(new Comparator<Bao>(){
            @Override
            public int compare(Bao o1, Bao o2) {
                //nam-thang-ngay
                StringTokenizer n1=new StringTokenizer(o1.getNgayPH());
                StringTokenizer n2=new StringTokenizer(o2.getNgayPH());
                String ng1="";
                while(n1.hasMoreTokens()){
                    ng1=n1.nextToken()+ng1;
                }
                String ng2="";
                while(n2.hasMoreTokens()){
                    ng2=n2.nextToken()+ng2;
                }
                if(ng1.equalsIgnoreCase(ng2))
                    return o1.getSoBanPH()-o2.getSoBanPH();
                else 
                    return ng1.compareToIgnoreCase(ng2);
            }
        });
        System.out.println("Danh Sach Bao da sap xep: ");
        for (Bao x:bao) {
            System.out.println(x);
        }
        System.out.println("Tong so: "+bao.size());
    }

    @Override
    public void ThongKe1() {
        Map<String,Long> count=list.stream().collect(
                Collectors.groupingBy(
                        tl->tl.getTenNXB().toLowerCase(),Collectors.counting()
                ));
        Iterator i=count.keySet().iterator();
        while(i.hasNext()){
            Object key=i.next();
            System.out.println(key+": "+count.get(key));
        }
    }

    //sum
    @Override
    public void ThongKe2() {
        List<Bao>bao =new ArrayList<>();
        for (TaiLieu t:list) {
            if(t instanceof Bao)
                bao.add((Bao)t);
        }
        Map<Integer,Integer> sum=bao.stream().collect(
                Collectors.groupingBy(Bao::getNam,Collectors.summingInt(Bao::getSoBanPH))
        );
        Iterator i=sum.keySet().iterator();
        while(i.hasNext()){
            Object key=i.next();
            System.out.println(key+": "+sum.get(key));
        }
    }
    //max toan bo
    public void ThongKe3() {
        List<Sach>sach =new ArrayList<>();
        for (TaiLieu t:list) {
            if(t instanceof Sach)
                sach.add((Sach)t);
        }
        Optional<Sach> max=sach.stream().collect(Collectors.maxBy(Comparator.comparing(Sach::getSoTrang)));
            System.out.println("Sach co so trang nhieu nhat la");
            System.out.println(max.isPresent()?max.get():"Khong ton tai");
        }
    //max group: sach co so trang lon theo nxb
    public void ThongKe4() {
        List<Sach>sach =new ArrayList<>();
        for (TaiLieu t:list) {
            if(t instanceof Sach)
                sach.add((Sach)t);
        }
        Map<String,Sach> max=sach.stream().collect(Collectors.groupingBy(
                Sach::getTenNXB,Collectors.collectingAndThen(
                Collectors.reducing((Sach s1,Sach s2)->s1.getSoTrang()>s2.getSoTrang()?s1:s2),Optional::get)));
        Iterator i=max.keySet().iterator();
        while(i.hasNext()){
            Object key=i.next();
            System.out.println(key+": "+max.get(key));
        }
    }

    //max so phat hanh theo cac nam-bao
    public void ThongKe5() {
        List<Bao>bao =new ArrayList<>();
        for (TaiLieu t:list) {
            if(t instanceof Bao)
                bao.add((Bao)t);
        }
        Map<Integer,Bao> max=bao.stream().collect(Collectors.groupingBy(
                Bao::getNam,Collectors.collectingAndThen(
                Collectors.reducing((Bao s1,Bao s2)->s1.getSoBanPH()>s2.getSoBanPH()?s1:s2),Optional::get)));
        Iterator i=max.keySet().iterator();
        while(i.hasNext()){
            Object key=i.next();
            System.out.println(key+": "+max.get(key));
        }
    }
}
