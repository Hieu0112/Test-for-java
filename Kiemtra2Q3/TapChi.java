
package Kiemtra2Q3;

import java.io.Serializable;

/**
 *
 * @author Trịnh Viết Hiếu
 */
public class TapChi extends taiLieu implements Serializable{
    private int soPH,thangPH;

    public TapChi() {
    }

    public TapChi(String maTL, String TenNXB, int soBanPH,
            int soPH, int thangPH) {
        super(maTL, TenNXB, soBanPH);
        this.soPH = soPH;
        this.thangPH = thangPH;
    }

    public int getSoPH() {
        return soPH;
    }

    public void setSoPH(int soPH) {
        this.soPH = soPH;
    }

    public int getThangPH() {
        return thangPH;
    }

    public void setThangPH(int thangPH) {
        this.thangPH = thangPH;
    }
    @Override
    public String toString() {
        return getMaTL()+" "+getTenNXB()+" "+getSoBanPH()+" "+
                soPH+" "+thangPH;
    }
}
