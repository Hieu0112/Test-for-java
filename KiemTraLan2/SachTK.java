/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KiemTraLan2;

import java.io.Serializable;

/**
 *
 * @author trinh
 */
public class SachTK extends Sach implements Isach, Serializable{
    private boolean NgonNgu;

    public SachTK(String ma,String n1, String name, String nxb, double DonGia,
    boolean NgonNgu
    ) {
        super(ma, n1,name, nxb, DonGia);
        this.NgonNgu = NgonNgu;
    }

    public boolean isNgonNgu() {
        return NgonNgu;
    }

    public void setNgonNgu(boolean NgonNgu) {
        this.NgonNgu = NgonNgu;
    }

    

    @Override
    public String getMa() {
        String x="VN";
        if(NgonNgu==false) x="NN";
        return super.getMa().toUpperCase()+"-"+x;
    }

    @Override
    public String toString() {
        return getMa()+" "+getNameTG()+" "+getNameSach()+" "+getNxb()+" "+getDonGia()+" "+NgonNgu;
    }
    
}
