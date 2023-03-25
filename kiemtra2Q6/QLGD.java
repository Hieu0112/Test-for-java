/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kiemtra2Q6;

/**
 *
 * @author ASUS2020
 */
import java.util.*;
public class QLGD implements ChucNang {
    ArrayList<GD> ls = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    
    private int tontai(String ma){
        for(int i = 0; i < ls.size(); i++){
            if(ls.get(i).getMa().equalsIgnoreCase(ma)) return i;
        }
        return -1;
    }
    private GD nhap() {        
        String ma;
        int ngay, thang, nam, sl;
        double dongia; 
        
        //kiem tra ma
        String reg="^[Gg]\\[Dd]\\d{3}[0-9]$";
        while(true){
            System.out.print("Nhap ma: ");
            ma = sc.nextLine();
            if(ma.matches(reg) && tontai(ma)==-1) break;
            System.err.println("Nhap lai!!!");
        }
        System.out.print("Nhap ngay giao dich: ");
        ngay = Integer.parseInt(sc.nextLine());
        System.out.print("Nhap thang giao dich:");
        thang = Integer.parseInt(sc.nextLine());
        System.out.print("Nhap nam giao dich: ");
        nam = Integer.parseInt(sc.nextLine());
        System.out.print("Nhap so luong: ");
        sl = Integer.parseInt(sc.nextLine());
        System.out.print("Nhap don gia: ");
        dongia = Double.parseDouble(sc.nextLine()); 
       
        
        return new GD(ma,ngay,thang,nam,sl, dongia);
    }

    @Override
    public void nhapGDV() {
        GD g = nhap();
        System.out.print("Nhap loai vang: ");
        String loai = sc.nextLine();
        ls.add(new GDV(g.getMa(),g.getNgay(),g.getThang(),g.getNam(),g.getSl(),g.getDongia(),loai));
    }

    @Override
    public void nhapGDT() {
        GD g = nhap();
        System.out.print("Nhap ti gia: ");
        Double tigia = Double.parseDouble(sc.nextLine());
        System.out.print("Nhap loai tien: ");
        String loai = sc.nextLine();
        ls.add(new GDT(g.getMa(),g.getNgay(),g.getThang(),g.getNam(),g.getSl(),g.getDongia(),tigia,loai));
    }

    @Override
    public void in() {
        System.out.println("Danh sach giao dich vang:");
        for(GD x:ls){
            if(x instanceof GDV) System.out.print(x);
        }
        System.out.println("Danh sach giao dich tien:");
        for(GD x:ls){
            if(x instanceof GDT) System.out.print(x);
        }
        System.out.println("----------");
        System.out.println("Tong so giao dich: "+ls.size());
    }

    @Override
    public void sua() {
        System.out.print("Nhap ma can sua: ");
        String ma = sc.nextLine();
        int vitri = tontai(ma);
        if(vitri == -1) System.out.println("Khong ton tai ma!!");
        else{
            

            //kiem tra ma
            String reg="^[Gg]\\[Dd]\\d{3}[0-9]$";
            while(true){
                System.out.print("Nhap ma: ");
                ma = sc.nextLine();
                if(ma.matches(reg) && tontai(ma)==-1) break;
                System.err.println("Nhap lai!!!");
            }
            System.out.print("Nhap ngay giao dich moi: ");
            ls.get(vitri).setNgay(Integer.parseInt(sc.nextLine()));
            System.out.print("Nhap thang giao dich moi:");
            ls.get(vitri).setThang(Integer.parseInt(sc.nextLine()));
            System.out.print("Nhap nam giao dich moi: ");
            ls.get(vitri).setNam(Integer.parseInt(sc.nextLine()));
            System.out.print("Nhap so luong moi: ");
            ls.get(vitri).setSl(Integer.parseInt(sc.nextLine()));
            System.out.print("Nhap don gia moi: ");
            ls.get(vitri).setDongia(Double.parseDouble(sc.nextLine())); 
            if(ls.get(vitri) instanceof GDV){
                System.out.print("Nhap loai vang moi: ");
                ((GDV) ls.get(vitri)).setLoai(sc.nextLine());
            }
            else{
                System.out.print("Nhap ti gia moi: ");
                ((GDT) ls.get(vitri)).setTigia(Double.parseDouble(sc.nextLine()));
                System.out.print("Nhap loai tien moi: ");
                ((GDT) ls.get(vitri)).setLoai(sc.nextLine());
            }
        }
        System.out.println("Sua thanh cong!!!");
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
    public void tongSlGDV() {
        System.out.println("Tong so luong giao dich: "+ls.size());
    }
    

    @Override
    public void tongSlGDT() {
        int cnt = 0;
        for(GD x:ls){
            if(x instanceof GDT) cnt++;
        }
        System.out.println("Tong so luong giao dich tien: "+cnt);
    }

    @Override
    public void inDsTheoNgay() {
        Collections.sort(ls);
        System.out.println("Danh sach giao dich vang:");
        for(GD x:ls){
            if(x instanceof GDV) System.out.print(x);
        }
        System.out.println("Danh sach giao dich tien:");
        for(GD x:ls){
            if(x instanceof GDT) System.out.print(x);
        }
    }

    @Override
    public void timTheoNam() {
        int nam1,nam2;
        boolean check = false;
        String regnam1="^[1]\\[9]\\d{2}$";
        String regnam2="^[2]\\[0]\\[0-1]\\[0-9]$";
        String regnam3="^[2]\\[0]\\[2]\\[0-2]$";
        while(true){
            System.out.print("Nhap tu nam can tim kiem: ");
            nam1 = Integer.parseInt(sc.nextLine());
            if(String.valueOf(nam1).matches(regnam1) || String.valueOf(nam1).matches(regnam2) || String.valueOf(nam1).matches(regnam3)){
                break;
            }   
            System.err.println("Nhap lai tu nam can tim kiem!!");
        }
        while(true){
            System.out.print("Nhap den nam can tim kiem: ");
            nam2 = Integer.parseInt(sc.nextLine());
            if(String.valueOf(nam2).matches(regnam1) || String.valueOf(nam2).matches(regnam2) || String.valueOf(nam2).matches(regnam3)){
                break;
            }   
            System.err.println("Nhap lai den nam can tim kiem!!");
        }
        for(GD i:ls){
            if(nam1 <= i.getNam() && nam2 >= i.getNam()) {
                check = true;
                System.out.println(i);
            }
        }
        if(check == false) System.out.println("Khong tim thay PT nao!!!");
    }
}
