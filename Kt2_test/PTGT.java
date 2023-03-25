
package Kt2_test;

import java.io.Serializable;

/**
 *
 * @author trinh
 */
public class PTGT implements Serializable,Comparable<PTGT>{
    private String ma,hang;
    private int nam;
    private double gia;
    private String mau;

    public PTGT() {
    }

    public PTGT(String ma, String hang, int nam, double gia, String mau) {
        this.ma = ma;
        this.hang = hang;
        this.nam = nam;
        this.gia = gia;
        this.mau = mau;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getHang() {
        return hang;
    }

    public void setHang(String hang) {
        this.hang = hang;
    }

    public int getNam() {
        return nam;
    }

    public void setNam(int nam) {
        this.nam = nam;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public String getMau() {
        return mau;
    }

    public void setMau(String mau) {
        this.mau = mau;
    }

    @Override
    public int compareTo(PTGT o) {
        //ma tang dan
        return ma.compareToIgnoreCase(o.ma);
        //ma giam dan
//        return (o.ma).compareToIgnoreCase(ma);
        //Sap Xep Theo Nam tang dan
//        return nam-o.nam;
        //sx theo gia -double
//        return Double.compare(gia, o.gia);
    }
}
