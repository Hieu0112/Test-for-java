
package test_KT2;
import java.io.Serializable;
public class HoaDonBanLe extends HoaDon implements Serializable,IHOADON{

    private String ngay;

    public HoaDonBanLe(String ma, String name, int so, double gia,String ngay) {
        super(ma, name, so, gia);
        this.ngay = ngay;
    }

    public String getNgay() {
        return ngay;
    }

    public void setNgay(String ngay) {
        this.ngay = ngay;
    }
    public int getNam(){
        return Integer.parseInt(ngay.substring(ngay.lastIndexOf("/")+1));
    }
    @Override
    public double getTienTT() {
        int n1=Integer.parseInt(ngay.substring(0,ngay.indexOf("/")));
        int t1=Integer.parseInt(ngay.substring(ngay.indexOf("/")+1,ngay.lastIndexOf("/")));
        if(n1==2&&t1==4)
            return super.getThanhtien()*0.95;
        else
            return super.getThanhtien();
    }

    @Override
    public String toString() {
        return getMa()+" "+getName()+" "+getSo()+" "+getGia() 
                +" "+getThanhtien()+" "+ngay;
    }
    
}
