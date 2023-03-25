package Kiemtra2Q3;

import java.io.Serializable;

public class Sach extends taiLieu implements Serializable{
    private String TenTG,TenSach;
    private int SoTrang;

    public Sach() {
    }

    public Sach(String maTL, String TenNXB, int soBanPH,
    String TenTG, String TenSach, int SoTrang) {
        super(maTL, TenNXB, soBanPH);
        this.TenTG = TenTG;
        this.TenSach = TenSach;
        this.SoTrang = SoTrang;
    }

    public String getTenTG() {
        return TenTG;
    }

    public void setTenTG(String TenTG) {
        this.TenTG = TenTG;
    }

    public String getTenSach() {
        return TenSach;
    }

    public void setTenSach(String TenSach) {
        this.TenSach = TenSach;
    }

    public int getSoTrang() {
        return SoTrang;
    }

    public void setSoTrang(int SoTrang) {
        this.SoTrang = SoTrang;
    }

    @Override
    public String toString() {
        return getMaTL()+" "+getTenNXB()+" "+getSoBanPH()+" "+
                TenTG+" "+TenSach+" "+SoTrang;
    }
    
}
