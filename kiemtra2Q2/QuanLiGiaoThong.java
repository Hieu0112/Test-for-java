
package kiemtra2Q2;

import java.util.*;
import java.util.stream.Collectors;
public class QuanLiGiaoThong implements ChucNang{
    private List<PTGT> ls;
    private Scanner sc = new Scanner(System.in);
    public QuanLiGiaoThong() {
        ls = new ArrayList<>();
        ls.add(new Oto("VN876", "yaris", 2021, 800000, "do", "cho nu", 4));
        ls.add(new XeMay("VN321", "Vision", 2014, 38000,"Xam",150));
        ls.add(new XeMay("VN881", "spacy", 2000, 10000, "trang",200));
        ls.add(new Oto("VN111", "yaris", 2000, 120000, "do", "cho nu", 7));
        ls.add(new Oto("HN999", "yaris", 2012, 900000, "do", "cho nu", 16));
        ls.add(new Oto("VN666", "yaris", 2016, 30000, "xanh", "cho nu", 7));
    }
    //khong trung ma
    private int tontai(String ma){
        for(int i = 0; i < ls.size(); i++){
            if(ls.get(i).getMa().equalsIgnoreCase(ma)) return i;
        }
        return -1;
    }
    private PTGT nhap(){
        String ma, hang, mau;
        int nam;
        double gia;
        
        //kiem tra nhap ma
        String regma="^VN\\d{3}";
        while(true){
            System.out.print("Nhap ma: ");
            ma = sc.nextLine().toUpperCase();
            if(tontai(ma) == -1 || ma.matches(regma)){
                break;
            }   
            System.err.println("Nhap lai ma!!");
        }
        
        //kiem tra nhap hang
        String reghang="^[a-zA-z0-9]+$";
        while(true){
            System.out.print("Nhap hang: ");
            hang = sc.nextLine();
            if(hang.matches(reghang)){
                break;
            }   
            System.err.println("Nhap lai hang!!");
        }
        
        //kiem tra nam
//        String regnam1="^[1]\\[9]\\d{2}$";
//        String regnam2="^[2]\\[0]\\[0-1]\\[0-9]$";
//        String regnam3="^[2]\\[0]\\[2]\\[0-2]$";
//        while(true){
//            System.out.print("Nhap nam: ");
//            nam = Integer.parseInt(sc.nextLine());
//            if(String.valueOf(nam).matches(regnam1) || String.valueOf(nam).matches(regnam2) || String.valueOf(nam).matches(regnam3)){
//                break;
//            }   
//            System.err.println("Nhap lai nam!!");
//        }
        System.out.print("Nhap nam: ");
        nam = Integer.parseInt(sc.nextLine());
        
        
        System.out.print("Nhap gia: ");
        gia = Double.parseDouble(sc.nextLine());
        System.out.print("Nhap mau: ");
        mau = sc.nextLine();
        return new PTGT(ma,hang,nam,gia,mau);
    }
    public void setList(List<PTGT> ls){
        this.ls=ls;
    }
     public List<PTGT> getList(){
         return this.ls;
     }
    @Override
    public void nhapOto() {
        PTGT p = nhap();
        System.out.print("Nhap kieu: ");
        String kieu = sc.nextLine();
        System.out.print("Nhap socho: ");
        int socho = Integer.parseInt(sc.nextLine());
        ls.add(new Oto(p.getMa(),p.getHang(),p.getNam(),p.getGia(),p.getMau(),kieu,socho));
        
    }

    @Override
    public void nhapXeMay() {
        PTGT p = nhap();
        System.out.print("Nhap cong suat: ");
        double congsuat = Double.parseDouble(sc.nextLine());
        ls.add(new XeMay(p.getMa(),p.getHang(),p.getNam(),p.getGia(),p.getMau(),congsuat));
    }

    @Override
    public void nhapXeTai() {
        PTGT p = nhap();
        System.out.print("Nhap trong tai: ");
        int trongtai = Integer.parseInt(sc.nextLine());
        ls.add(new XeMay(p.getMa(),p.getHang(),p.getNam(),p.getGia(),p.getMau(),trongtai));
    }

    @Override
    public void vietDS() {
        System.out.println("Danh sach oto:");
        for(PTGT i:ls){
            if(i instanceof Oto){
                System.out.println(i);
            }
        }
        System.out.println("Danh sach xe may: ");
        for(PTGT i: ls){
            if(i instanceof XeMay){
                System.out.println(i);
            }
        }
        System.out.println("---------------");
        System.out.println("Tong so phuong tien: "+ls.size());
       
    }

    @Override
    public void xoa() {
        System.out.print("Nhap ma can xoa: ");
        String ma = sc.nextLine();
        int vitri = tontai(ma);
        if(vitri == -1) System.out.println("Khong ton tai ma!!");
        else {
            ls.remove(vitri);
            System.out.println("Xoa thanh cong!!");
        }
    }

    @Override
    public void sua() {
        System.out.print("Nhap ma can sua: ");
        String ma = sc.nextLine();
        int vitri = tontai(ma);
        if(vitri == -1) System.out.println("Khong ton tai ma!!");
        else {
            PTGT p = ls.get(vitri);
        
            //kiem tra nhap hang
            String reghang="^[a-zA-z0-9]+$";
            while(true){
                System.out.print("Nhap hang: ");
                String hang = sc.nextLine();
                if(hang.matches(reghang)){
                    p.setHang(hang);
                    break;
                }   
                System.err.println("Nhap lai hang!!");
            }
        
            //kiem tra nam
//            String regnam1="^[1]\\[9]\\d{2}$";
//            String regnam2="^[2]\\[0]\\[0-1]\\[0-9]$";
//            String regnam3="^[2]\\[0]\\[2]\\[0-2]$";
//            while(true){
//                System.out.print("Nhap nam: ");
//                int nam = Integer.parseInt(sc.nextLine());
//                if(String.valueOf(nam).matches(regnam1) || String.valueOf(nam).matches(regnam2) || String.valueOf(nam).matches(regnam3)){
//                    p.setNam(nam);
//                    break;
//                }   
//                System.err.println("Nhap lai nam!!");
//            }
            System.out.print("Nhap nam: ");
            int nam = Integer.parseInt(sc.nextLine());
        
            System.out.print("Nhap gia: ");
            Double gia = Double.parseDouble(sc.nextLine());
            System.out.print("Nhap mau: ");
            String mau = sc.nextLine();
            System.out.println("Sua thanh cong!!");
            p.setGia(gia);
            p.setMau(mau);
        }
        
    }

    @Override
    public void timTheoHang() {
        //kiem tra nhap hang
        boolean check = false;
        String hang;
        String reghang="^[a-zA-z0-9]+$";
        while(true){
            System.out.print("Nhap hang muon tim kiem: ");
            hang = sc.nextLine();
            if(hang.matches(reghang)){
                break;
            }   
            System.err.println("Nhap lai hang!!");
        }
        for(PTGT i:ls){
            if(i.getHang().toLowerCase().contains(hang)) {
                check = true;
                System.out.println(i);
            }
        }
        if(check == false) System.out.println("Khong tim thay PT nao!!!");
    }

    @Override
    public void timTheoMa() {
        //kiem tra nhap ma
        boolean check= false;
        String ma;
        String regma="^VN\\d{3}";
        while(true){
            System.out.print("Nhap ma muon tim kiem: ");
            ma = sc.nextLine().toUpperCase();
            if(tontai(ma) == -1 || ma.matches(regma)){
                break;
            }   
            System.err.println("Nhap lai ma!!");
        }
        for(PTGT i:ls){
            if(i.getMa().toLowerCase().contains(ma)) {
                check = true;
                System.out.println(i);
            }
        }
        if(check == false) System.out.println("Khong tim thay PT nao!!!");
    }

    @Override
    public void timTheoMau() {
        boolean check = false;
        System.out.print("Nhap ma: ");
        String mau = sc.nextLine();
        for(PTGT i:ls){
            if(i.getMau().toLowerCase().contains(mau)) {
                check = true;
                System.out.println(i);
            }
        }
        if(check == false) System.out.println("Khong tim thay PT nao!!!");
    }

    @Override
    public void timTheoNam() {
        //kiem tra nam
        int nam1,nam2;
        boolean check = false;
        
        while(true){
            System.out.print("Nhap tu nam can tim kiem: ");
            nam1 = Integer.parseInt(sc.nextLine());
            if(nam1<2022 && nam1> 1860){
                break;
            }   
            System.err.println("Nhap lai tu nam can tim kiem!!");
        }
        while(true){
            System.out.print("Nhap den nam can tim kiem: ");
            nam2 = Integer.parseInt(sc.nextLine());
            if(nam2<2022 && nam2>1860){
                break;
            }   
            System.err.println("Nhap lai den nam can tim kiem!!");
        }
        for(PTGT i:ls){
            if(nam1 <= i.getNam() && nam2 >= i.getNam()) {
                check = true;
                System.out.println(i);
            }
        }
        if(check == false) System.out.println("Khong tim thay PT nao!!!");
    }
    
    @Override
    public void timOtoTheoSoCho(){
        System.out.print("Nhap so cho: ");
        int socho = Integer.parseInt(sc.nextLine());
        boolean check = false;
        for(PTGT i:ls){
            if(i instanceof Oto){
                if(((Oto) i).getSocho() == socho) {
                    check = true;
                    System.out.println(i);
                }
            }
        }
        if(check == false) System.out.println("Khong tim thay PT nao!!!");
    }
    
    @Override
    public void sapXepTheoMa() {
//        ls.sort(Comparator.comparing(PTGT::getMa));
//        for(PTGT i:ls){
//            System.out.println(i);
//        }
        Collections.sort(ls);
    }

    @Override
    public void sapXepTheoNam() {
        ls.sort(Comparator.comparing(PTGT::getNam));
        for(PTGT i:ls){
            System.out.println(i);
        }
    }

    @Override
    public void sapXepTheoMau() {
        ls.sort(Comparator.comparing(PTGT::getMau));
        for(PTGT i:ls){
            System.out.println(i);
        }
    }
    

    @Override
    public void sapXepTheoHang() {
        ls.sort(Comparator.comparing(PTGT::getHang));
        for(PTGT i:ls){
            System.out.println(i);
        }
    }

    @Override
    public void sapXepTheoGiaGiamdan() {
        ls.sort(Comparator.comparing(PTGT::getGia).reversed());
        for(PTGT i:ls){
            System.out.println(i);
        }
    }

    @Override
    public void sapXepOtoTheoGia() {
        ls.sort(Comparator.comparing(PTGT::getGia));
        for(PTGT i:ls){
            if(i instanceof Oto) System.out.println(i);
        }
    }
    
    @Override
    public void timOtoTheoGia(){
        System.out.print("Nhap gia tu: ");
        double gia1 = Double.parseDouble(sc.nextLine());
        System.out.print("Nhap gia den: ");
        double gia2 = Double.parseDouble(sc.nextLine());
        boolean check = false;
        for(PTGT i:ls){
            if(i instanceof Oto){
                if(((Oto) i).TinhGia() > gia1 && ((Oto) i).TinhGia() < gia2 ) {
                    check = true;
                    System.out.println(i);
                }
            }
        }
        if(check == false) System.out.println("Khong tim thay PT nao!!!");
    }
    //thong ke dem so xe theo hang sx
    @Override
    public void thongKe1() {
        System.out.println("Thong ke so xe theo hang san xuat: ");
        
        //so sanh ko phan biet chu hoa thuong
//        Map<String, Long> count = ls.stream().collect(Collectors.groupingBy(
//                PTGT -> PTGT.getHang().toLowerCase(),Collectors.counting()));
        
        //so sanh co phan biet hoa thuong 
        Map<String, Long> count = ls.stream().collect(Collectors.groupingBy(PTGT::getHang,Collectors.counting()));
        
        Iterator i  = count.keySet().iterator();
        while(i.hasNext()){
            Object key = i.next();
            System.out.println(key+": "+count.get(key));
        }
    }
    
    //thong ke tong tien theo nam
    public void thongKe2(){
//        List<Oto> oto = new ArrayList<>();
//        for(PTGT i:ls){
//            if(i instanceof Oto){
//                oto.add((Oto)i);
//            }
//        }
        System.out.println("Tong tien theo nam: ");
        Map<Integer, Double> sum = ls.stream().collect(Collectors.groupingBy(
                PTGT::getNam,Collectors.summingDouble(PTGT::getGia)));
        Iterator i  = sum.keySet().iterator();
        while(i.hasNext()){
            Object key = i.next();
            System.out.println(key+": "+sum.get(key));
        }
    }
    
    // phuong tien dat nhat
    public void thongKe3(){
        Optional<PTGT> max = ls.stream().collect(Collectors.maxBy(Comparator.comparing(PTGT::getGia)));
        System.out.println("Phuong tien dat nhat: ");
        System.out.println(max.isPresent()?max.get():"DS rong");
    }
    
    // phuong tien dat nhat theo mau
    public void thongKe4(){
        Map<String, PTGT> o = ls.stream().collect(Collectors.groupingBy(
                        PTGT::getMau,Collectors.collectingAndThen(
                        Collectors.reducing((PTGT p1, PTGT p2) -> p1.getGia()>p2.getGia()?p1:p2),
                        Optional::get)));
       Iterator i  = o.keySet().iterator();
        while(i.hasNext()){
            String key = (String)i.next();
            System.out.println(key+":\n"+(PTGT)o.get(key));
        }
    }
    
    //thong ke gia trung binh theo hang
    public void thongKe5(){
        Map<String, Double> count = ls.stream().collect(Collectors.groupingBy(
                PTGT::getHang,Collectors.averagingDouble(PTGT::getGia)));
        
        Iterator i  = count.keySet().iterator();
        while(i.hasNext()){
            Object key = i.next();
            System.out.println(key+": "+count.get(key));
        }
    }
    public void luu(String fname) {
        IOFile.viet(fname, ls);
    }

    
    public void doctufile(String fname) {
        setList(IOFile.doc(fname));
        vietDS();
    }

    
    
}
