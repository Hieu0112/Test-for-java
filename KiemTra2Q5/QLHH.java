package KiemTra2Q5;

import KiemTra2Q5.HinhHoc.BinhHanh;
import KiemTra2Q5.HinhHoc.Cau;
import KiemTra2Q5.HinhHoc.ChuNhat;
import KiemTra2Q5.HinhHoc.Hop;
import KiemTra2Q5.HinhHoc.NguGiac;
import KiemTra2Q5.HinhHoc.TamGiac;
import KiemTra2Q5.HinhHoc.Thoi;
import KiemTra2Q5.HinhHoc.Tron;
import KiemTra2Q5.HinhHoc.Tru;
import KiemTra2Q5.HinhHoc.Vuong;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QLHH implements ChuongtrinhNhap,ChucNang2D,ChucNang3D{
    
    private Scanner sc=new Scanner(System.in);
    private List<Hinh_Hoc>list=new ArrayList<>();

    public QLHH() {
        this.list=new ArrayList<>();
    }

    public void setList(List<Hinh_Hoc> list) {
        this.list = list;
    }
    public double Nhap1dodai(){
        double canh;
        while(true){
            canh=sc.nextDouble();
            if(canh>0)
                return canh;
        }
    }
    
    public Hinh_Hoc Nhap(){
        System.out.print("Nhap canh: ");
        double canh=Nhap1dodai();
        return new Hinh_Hoc(canh);
    }
    @Override
    public void NhaphinhVuong() {
        Hinh_Hoc h=Nhap();
        list.add(new Vuong(h.getCanh(), h.getCanh()));
    }

    @Override
    public void NhaphinhChuNhat() {
        Hinh_Hoc h=Nhap();
        System.out.print("Nhap canh 2: ");
        double canh=Nhap1dodai();
        list.add(new ChuNhat(h.getCanh(),canh));
    }

    @Override
    public void NhaphinhTamGiac() {
        Hinh_Hoc h=Nhap();
        double canh2,canh3;
        System.out.print("Nhap canh 2: ");
        canh2=Nhap1dodai();
        System.out.print("Nhap canh 3: ");
        canh3=Nhap1dodai();
        list.add(new TamGiac(h.getCanh(),canh2,canh3));
    }

    @Override
    public void NhaphinhThoi() {
        Hinh_Hoc h=Nhap();
        System.out.print("Nhap canh 2: ");
        double canh=Nhap1dodai();
        list.add(new Thoi(h.getCanh(),canh));
    }

    @Override
    public void NhaphinhBinhHanh() {
        Hinh_Hoc h=Nhap();
        System.out.print("Nhap canh 2: ");
        double canh=Nhap1dodai();
        list.add(new BinhHanh(h.getCanh(),canh));
    }

    @Override
    public void NhaphinhNguGiac() {
        Hinh_Hoc h=Nhap();
        System.out.print("Nhap canh 2: ");
        double canh2=Nhap1dodai();
        System.out.print("Nhap canh 3: ");
        double canh3=Nhap1dodai();
        System.out.print("Nhap canh 4: ");
        double canh4=Nhap1dodai();
        System.out.print("Nhap canh 5: ");
        double canh5=Nhap1dodai();
        list.add(new NguGiac(h.getCanh(),canh2, canh3, canh4, canh5));
    }

    @Override
    public void NhaphinhTron() {
        Hinh_Hoc h=Nhap();
        System.out.print("Nhap ban kinh: ");
        double bk=Nhap1dodai();
        list.add(new Tron(h.getCanh(),bk));
    }

    @Override
    public void NhaphinhCau() {
        Hinh_Hoc h=Nhap();
        System.out.print("Nhap ban kinh: ");
        double bk=Nhap1dodai();
        list.add(new Cau(h.getCanh(),bk));
    }

    @Override
    public void NhaphinhHop() {
        Hinh_Hoc h=Nhap();
        double canh2,canh3;
        System.out.print("Nhap canh 2: ");
        canh2=Nhap1dodai();
        System.out.print("Nhap ban kinh: ");
        canh3=Nhap1dodai();
        list.add(new Hop(h.getCanh(),canh2,canh3));
    }

    @Override
    public void NhaphinhTru() {
        Hinh_Hoc h=Nhap();
        double canh2,bankinh;
        System.out.print("Nhap canh 2: ");
        canh2=Nhap1dodai();
        System.out.print("Nhap ban kinh: ");
        bankinh=Nhap1dodai();
        list.add(new Tru(h.getCanh(),canh2,bankinh));
    }

    @Override
    public void ChuVi() {
        System.out.println("Chu vi cua cac Hinh la: ");
    }

    @Override
    public void DienTich() {
        System.out.println("Chu vi cua cac Hinh la: ");
    }

    @Override
    public void SoDinh() {
        System.out.println("Chu vi cua cac Hinh la: ");
    }

    @Override
    public void Socanh() {
        System.out.println("Chu vi cua cac Hinh la: ");
    }

    @Override
    public void TheTich() {
        System.out.println("Chu vi cua cac Hinh la: ");
    }

    @Override
    public void DienTichXungQuanh() {
        System.out.println("Chu vi cua cac Hinh la: ");
    }

}
