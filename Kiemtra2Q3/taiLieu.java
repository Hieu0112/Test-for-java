package Kiemtra2Q3;
import java.io.Serializable;

public class taiLieu implements Serializable{
    private String maTL,TenNXB;
    private int soBanPH;

    public taiLieu() {
    }

    public taiLieu(String maTL, String TenNXB, int soBanPH) {
        this.maTL = maTL;
        this.TenNXB = TenNXB;
        this.soBanPH = soBanPH;
    }

    public String getMaTL() {
        return maTL;
    }

    public void setMaTL(String maTL) {
        this.maTL = maTL;
    }

    public String getTenNXB() {
        return TenNXB;
    }

    public void setTenNXB(String TenNXB) {
        this.TenNXB = TenNXB;
    }

    public int getSoBanPH() {
        return soBanPH;
    }

    public void setSoBanPH(int soBanPH) {
        this.soBanPH = soBanPH;
    }
    
}
