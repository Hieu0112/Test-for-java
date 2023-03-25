
package test_KT2;

import java.io.Serializable;

public class HoaDon implements Serializable{
    private String ma,name;
    private int so;
    private double gia,thanhtien;

    public HoaDon(String ma, String name, int so, double gia) {
        this.ma = ma;
        this.name = name;
        this.so = so;
        this.gia = gia;
        this.thanhtien = (double)so*gia;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSo() {
        return so;
    }

    public void setSo(int so) {
        this.so = so;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public double getThanhtien() {
        return thanhtien;
    }

    public void setThanhtien(double thanhtien) {
        this.thanhtien = thanhtien;
    }

    @Override
    public String toString() {
        return ma+" "+name+" "+so+" "+gia+" "+thanhtien+" ";
    }
    
}
