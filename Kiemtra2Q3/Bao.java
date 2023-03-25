
package Kiemtra2Q3;

import java.io.Serializable;

public class Bao extends taiLieu implements Serializable{
    private String NgayPH;

    public Bao() {
    }

    public Bao(String maTL, String TenNXB, int soBanPH,String NgayPH) {
        super(maTL, TenNXB, soBanPH);
        this.NgayPH = NgayPH;
    }

    public String getNgayPH() {
        return NgayPH;
    }

    public void setNgayPH(String NgayPH) {
        this.NgayPH = NgayPH;
    }

    public int getDay() {
        return Integer.parseInt(NgayPH.substring(0,NgayPH.indexOf("/")));
    }
    public int getThang() {
        return Integer.parseInt(NgayPH.substring(NgayPH.indexOf("/")+1,NgayPH.lastIndexOf("/")));
    }
    public int getNam() {
        return Integer.parseInt(NgayPH.substring(NgayPH.lastIndexOf("/")+1));
    }
    @Override
    public String toString() {
        return getMaTL()+" "+getTenNXB()+" "+getSoBanPH()+" "+
                NgayPH;
    }
    
    
}
