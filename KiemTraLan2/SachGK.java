
package KiemTraLan2;

import java.io.Serializable;
public class SachGK extends Sach implements Serializable,Isach{
    private String lop;

    public SachGK(String ma,String n1, String name, String nxb, double DonGia,
            String lop
    ) {
        super(ma, n1,name, nxb, DonGia);
        this.lop = lop;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    @Override
    public String getMa() {
        return super.getMa().toUpperCase()+"-"+lop.substring(lop.lastIndexOf(" ")+1);
    }

    @Override
    public String toString() {
        return getMa()+" "+getNameTG()+" "+getNameSach()+" "+getNxb()+" "+getDonGia();
    }
    
    
}
