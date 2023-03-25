
package kiemtra2Q4;
import java.util.*;
public class QLGV implements ChucNang{
    private ArrayList<GiangVien> ls = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);
    
    public int tontai(String ma){
        for(int i = 0; i < ls.size(); i++){
            if(ls.get(i).getMa().equalsIgnoreCase(ma)) return i;
        }
        return -1;
    }
    
    private GiangVien nhap() {
        
        String ma, ten, email, hocham, hocvi, dc, sdt;
        int gioday;
        double hsl;
        //kiem tra ma
        String reg="^[Gg]\\[Vv]\\d{3}[0-9]$";
        while(true){
            System.out.print("Nhap ma: ");
            ma = sc.nextLine();
            if(ma.matches(reg) && tontai(ma)==-1) break;
            System.err.println("Nhap lai!!!");
        }
        System.out.print("Nhap ten: ");
        ten = sc.nextLine();
        System.out.print("Nhap email:");
        email = sc.nextLine();
        System.out.print("Nhap hoc ham: ");
        hocham = sc.nextLine();
        System.out.print("Nhap hoc vi: ");
        hocvi = sc.nextLine();
        System.out.print("Nhap dia chi: ");
        dc = sc.nextLine();
        System.out.print("Nhap sdt: ");
        sdt = sc.nextLine();
        System.out.print("Nhap so gio day 1 thang: ");
        gioday = Integer.parseInt(sc.nextLine());
        
        return new GiangVien(ma,ten,email,hocham,hocvi,dc,sdt,gioday);
    }
    
    @Override
    public void nhapCH() {
        Double luongcung;
        GiangVien g = nhap();
        System.out.print("Nhap luong thoa thuan: ");
        luongcung = Double.parseDouble(sc.nextLine());
        ls.add(new GVCoHuu(g.getMa(),g.getTen(),g.getEmail()
                ,g.getHocham(),g.getHocvi(),g.getDc(),g.getSdt()
                ,g.getGioday(),luongcung));
        
    }

    @Override
    public void nhapTG() {
        String coquan;
        GiangVien g = nhap();
        System.out.print("Nhap luong co quan: ");
        coquan = sc.nextLine();
        ls.add(new GVThinhGiang(g.getMa(),g.getTen(),g.getEmail()
                ,g.getHocham(),g.getHocvi(),g.getDc(),g.getSdt()
                ,g.getGioday(),coquan));
    }
    
    @Override
    public void in() {
        for(GiangVien x:ls){
            if(x instanceof GVCoHuu){
                System.out.println(x);
            }
        }
        for(GiangVien x:ls){
            if(x instanceof GVThinhGiang){
                System.out.println(x);
            }
        }
        System.out.print("Tong so giang vien: "+ls.size());
        System.out.println();
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
            GiangVien p = ls.get(vitri);

            System.out.print("Nhap ten moi: ");
            p.setTen(sc.nextLine());
            System.out.print("Nhap email moi: ");
            p.setEmail(sc.nextLine());
            System.out.print("Nhap hoc ham moi: ");
            p.setHocham(sc.nextLine());
            System.out.print("Nhap hoc vi moi: ");
            p.setHocvi(sc.nextLine());
            System.out.print("Nhap dia chi moi: ");
            p.setDc(sc.nextLine());
            System.out.print("Nhap so dien thoai moi: ");
            p.setSdt(sc.nextLine());
            System.out.print("Nhap so gio day moi: ");
            p.setGioday(Integer.parseInt(sc.nextLine()));
            if(p instanceof GVThinhGiang){
                System.out.print("Nhap co quan moi: ");
                ((GVThinhGiang) p).setCoquan(sc.nextLine());
            }
            else{
                System.out.print("Nhap luong thoa thuan moi: ");
                ((GVCoHuu) p).setLuongcung(Double.parseDouble(sc.nextLine()));
            }
           
        }
        System.out.println("Sua thanh cong!!!");
    
    }

    @Override
    public void inGVCH() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void inGVTG() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void timTheoTen() {
        boolean check = false;
        System.out.print("Nhap ten: ");
        String ten = sc.nextLine();
        for(GiangVien i:ls){
            if(i.getTen().toLowerCase().contains(ten)) {
                check = true;
                System.out.println(i);
            }
        }
        if(check == false) System.out.println("Khong tim thay PT nao!!!");
    }

    @Override
    public void sxTheoTen() {
        Collections.sort(ls);
        for(GiangVien x:ls){
            if(x instanceof GVCoHuu){
                System.out.println(x);
            }
        }
        for(GiangVien x:ls){
            if(x instanceof GVThinhGiang){
                System.out.println(x);
            }
        }
        System.out.print("Tong so giang vien: "+ls.size());
        System.out.println();
    }

    @Override
    public void tongLuong() {
        Double sum = 0.0;
        for(GiangVien x:ls){
            if(x instanceof GVThinhGiang){        
                sum+=((GVThinhGiang) x).tinhLuong();
            }
            else{
                sum+=((GVThinhGiang) x).tinhLuong();
            }
        }
        System.out.println("Tong luong cua tat ca giang vien: "+sum);
        System.out.println("Luong trung binh: "+(double)(sum/ls.size()));
    }

    @Override
    public void nvLuongCaoNhat() {
        Double max = 0.0;
        GiangVien p = new GiangVien();
        for(GiangVien x:ls){
            if(x instanceof GVThinhGiang){     
                if(max < ((GVThinhGiang) x).tinhLuong()){
                    max=((GVThinhGiang) x).tinhLuong();
                    p = x;
                }
            }
            else{
                if(max < ((GVThinhGiang) x).tinhLuong()){
                    max=((GVThinhGiang) x).tinhLuong();
                    p = x;
                }
            }
        }
        System.out.println("Giang vien co luong cao nhat: ");
        if(p instanceof GVThinhGiang){     
                System.out.println((GVThinhGiang) p);
            }
        else{
            System.out.println((GVCoHuu) p);
        }
    }

   
    
}
