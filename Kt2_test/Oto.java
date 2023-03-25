
package Kt2_test;

import java.util.Calendar;
public class Oto extends PTGT implements TinhGia{
    private String kieu;
    private int socho;

    public Oto() {
    }

    public Oto(String ma, String hang, int nam, double gia, String mau,
            String kieu, int socho) {
        super(ma, hang, nam, gia, mau);
        this.kieu = kieu;
        this.socho = socho;
    }

    public String getKieu() {
        return kieu;
    }

    public void setKieu(String kieu) {
        this.kieu = kieu;
    }

    public int getSocho() {
        return socho;
    }

    public void setSocho(int socho) {
        this.socho = socho;
    }
    public double getGia() {
        Calendar c=Calendar.getInstance();//Thoi gian hien thoi
        int y=c.get(Calendar.YEAR);
        if((y-super.getNam())>=2)
            return (super.getGia()*0.85);
        else 
            return (super.getGia());
//        if((2021-super.getNam())>=2)
//            return (super.getGia()*0.85);
//        else return (super.getGia());
    }
    public String toString() {
        return super.getMa()+"\t"+super.getHang()+"\t"+super.getNam()+"\t"+
                getGia()+"\t"+super.getMau()+"\t" + socho;
    }
    
    

    
}
