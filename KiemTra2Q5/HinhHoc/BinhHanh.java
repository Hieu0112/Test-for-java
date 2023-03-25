
package KiemTra2Q5.HinhHoc;

import KiemTra2Q5.Hinh_Hoc;
import KiemTra2Q5.ChucNang2D;
import java.io.Serializable;

public class BinhHanh extends Hinh_Hoc implements Serializable,ChucNang2D{
    private double canh2;

    public BinhHanh() {
    }

    public BinhHanh(double canh2, double canh) {
        super(canh);
        this.canh2 = canh2;
    }

    public double getCanh2() {
        return canh2;
    }

    public void setCanh2(double canh2) {
        this.canh2 = canh2;
    }

    @Override
    public void ChuVi() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void DienTich() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void SoDinh() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void Socanh() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
