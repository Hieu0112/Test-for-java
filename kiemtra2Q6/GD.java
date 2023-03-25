/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kiemtra2Q6;

/**
 *
 * @author ASUS2020
 */
public class GD implements Comparable<GD>{
    private String ma;
    private int ngay, thang, nam, sl;
    private double dongia;
    public GD() {
    }

    public GD(String ma, int ngay, int thang, int nam, int sl, double dongia) {
        this.ma = ma;
        this.ngay = ngay;
        this.thang = thang;
        this.nam = nam;
        this.sl = sl;
        this.dongia = dongia;
    }

    public double getDongia() {
        return dongia;
    }

    public void setDongia(double dongia) {
        this.dongia = dongia;
    }

    

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public int getNgay() {
        return ngay;
    }

    public void setNgay(int ngay) {
        this.ngay = ngay;
    }

    public int getThang() {
        return thang;
    }

    public void setThang(int thang) {
        this.thang = thang;
    }

    public int getNam() {
        return nam;
    }

    public void setNam(int nam) {
        this.nam = nam;
    }

    public int getSl() {
        return sl;
    }

    public void setSl(int sl) {
        this.sl = sl;
    }
    
    

    @Override
    public int compareTo(GD o) {
        return ngay-o.ngay;
    }
    
}
