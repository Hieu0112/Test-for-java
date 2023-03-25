package test_KT2;
import java.io.Serializable;
public class HoaDonBanSi extends HoaDon implements Serializable,IHOADON{
    
    private boolean tra;

    public HoaDonBanSi(String ma, String name, int so, double gia,
            boolean tra) {
        super(ma, name, so, gia);
        this.tra = tra;
    }

    public boolean isTra() {
        return tra;
    }

    public void setTra(boolean tra) {
        this.tra = tra;
    }
    
    @Override
    public double getTienTT() {
        if(tra) return (super.getThanhtien()*0.85);
        else return super.getThanhtien()*0.9;
    }

    @Override
    public String toString() {
        return getMa()+" "+getName()+" "+getSo()+" "+getGia() 
                +" "+getThanhtien()+" "+ tra; 
    }
    
}
