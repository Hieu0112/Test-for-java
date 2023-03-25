package LamKiemTraLan2;
import java.util.*;
import java.util.stream.Collectors;
public class QuanLy implements IChucNang{
//    private List<Sach>list=new ArrayList<>();
    private Scanner sc=new Scanner(System.in);
    
    
    public int tontai(String ma){
//        for (int i = 0; i < list.size(); i++) {
//            if(list.get(i).getMa().equalsIgnoreCase(ma))
//                return i;
//        }
        return -1;
    }
        
    private String NhapMa(){
        String re="^[abcdegh]{2}\\d{2}";
        String ma;
        while(true){
            try{
                System.out.print("nhap ma: ");
                ma=sc.nextLine();
                if(tontai(ma)==-1&&ma.matches(re)){
                    break;
                }
                else{
                    throw new ValidException("Ma Bi trung hoac sai dinh dang!!!");
                }
            }
            catch(ValidException e){
                System.err.println(e);
            }
        }
        return ma;
    }
    
    private String NhapBoolean(){
        String kieubool;
        while(true){
            try{
                System.out.print("Nhap du lieu la boolean: ");
                kieubool=sc.nextLine();
                if(kieubool.equalsIgnoreCase("true")||kieubool.equalsIgnoreCase("false")){
                    break;
                }
                else{
                    throw new ValidException("Nhap lai du lieu la kieu boolean!!!");
                }
            }
            catch(ValidException e){
                System.err.println(e);
            }
        }
        return kieubool;
    }
    
    private int NhapSoInt(){
        int so;
        while(true){
            try{
                System.out.print("nhap so Integer:  ");
                so=Integer.parseInt(sc.nextLine());
                break;
            }
            catch(NumberFormatException e){
                System.err.println(e);
            }
        }
        return so;
    }
    
    
    private double NhapSoDouble(){
        double so;
        while(true){
            try{
                System.out.print("Nhap so double:  ");
                so=Double.parseDouble(sc.nextLine());
                break;
            }
            catch(NumberFormatException e){
                System.err.println(e);
            }
        }
        return so;
    }
    
    
    private String NhapTen(){
        String re="[a-zA-Z ]+";
        String name;
        while(true){
            try{
                System.out.print("Nhap ten: ");
                name=sc.nextLine().toUpperCase();
                if(name.matches(re)){
                    break;
                }
                else{
                    throw new ValidException("Ten bi sai dinh dang!!!");
                }
            }
            catch(ValidException e){
                System.err.println(e);
            }
        }
        return name;
    }
    
    private String NhapNgay(){
        String ngay;
        String re ="\\d{1,2}/\\d{1,2}/\\d{4}";
        while(true){
            try{
                System.out.print("Nhap ngay :");
                ngay=sc.nextLine();
                if(ngay.matches(re)){
                    break;
                }
                else{
                    throw new ValidException("Ngay sai dinh dang!!!");
                }
            }
            catch(ValidException e){
                System.err.println(e);
            }
        }
        return ngay;
    }
    
    private String NhapMaSinhVien(){
        String re="B\\d{2}[a-zA-Z]{4}\\d{3}$";
        String msv;
        while(true){
            try{
                System.out.print("Nhap ma sinh vien: ");
                msv=sc.nextLine().toUpperCase();
                if(msv.matches(re)){
                    break;
                }
                else{
                    throw new ValidException("Ma sinh vien bi sai dinh dang!!!");
                }
            }
            catch(ValidException e){
                System.err.println(e);
            }
        }
        return msv;
    }
    
    
    public void nhap(){
       
        
    }

    @Override
    public void NhapDuLieu1() {
        
        
        System.out.print(" nhap : ");
        
        
    }

    @Override
    public void NhapDuLieu2() {
        
        
        System.out.print("nhap : ");
        
        
    }

    
    @Override
    public void HienThiDanhSach() {
//        for () {
//            System.out.println(x);
//        }
//        System.out.println("----------------");
//        System.out.println("Tong: "+list.size());
    }

    
    @Override
    public void LuuVaoFile(String fname) {
//        IOEFile.Viet(fname, list);
        System.out.println("Danh sach da duoc luu vao file :"+fname);
    }

    
    @Override
    public void DocTuFile(String fname) {
//        setList(IOEFile.Doc(fname));
        System.out.println("Du lieu co trong file "+fname+" la: ");
        HienThiDanhSach();
    }

    
    @Override
    public void TimKiem() {
        
        
        System.out.println("Cac san pham da tim kiem duoc la:");
    }

    
    @Override
    public void SapXep() {
        
        
        System.out.println("Danh sach san pham sau khi da sap xep:");
        
    }

    
    @Override
    public void ThongKe() {
//        Map<String,Sach>max= list.stream().collect(Collectors.groupingBy(
//                Sach::getNxb,Collectors.collectingAndThen(
//                        Collectors.reducing((Sach s1,Sach s2)->s1.getDonGia()>s2.getDonGia()?s1:s2),Optional::get)));

        System.out.println("Thong ke danh sach :");
//        Iterator i=max.keySet().iterator();
//        while(i.hasNext()){
//            Object key=i.next();
//            System.out.println(key+": "+max.get(key));
//        }
    }
}
