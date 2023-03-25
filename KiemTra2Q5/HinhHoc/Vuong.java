
package KiemTra2Q5.HinhHoc;

import KiemTra2Q5.Hinh_Hoc;
import java.io.Serializable;
public class Vuong extends Hinh_Hoc implements Serializable{
    private double canh2;

    public Vuong() {
    }

    public Vuong(double canh,double canh2) {
        super(canh);
        this.canh2 = canh2;
    }

    public double getCanh2() {
        return canh2;
    }

    public void setCanh2(double canh2) {
        this.canh2 = canh2;
    }

    public void ChuVi() {
        System.out.print("Chu Vi la: ");
        System.out.println(String.format("%.2f", 4*super.getCanh()));
    }

    public void DienTich() {
        System.out.print("Dien tich la: ");
        System.out.println(String.format("%.2f", canh2*super.getCanh()));
    }
    public void SoDinh() {
        System.out.println("4 dinh");
    }

    public void Socanh() {
        System.out.println("4 canh");
    }
    

}
