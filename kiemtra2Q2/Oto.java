/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kiemtra2Q2;

import java.util.*;

/**
 *
 * @author ASUS2020
 */
public class Oto extends PTGT implements TinhGia{
    private String kieu;
    private int socho;

    public Oto() {
    }

    public Oto(String ma, String hang, int nam, double gia, String mau,String kieu, int socho) {
        super(ma, hang, nam, gia,mau);
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
    
    public double TinhGia(){
        Calendar c = Calendar.getInstance();
        int y = c.get(Calendar.YEAR);
        if(y-super.getNam() >= 2) return (super.getGia()*0.85);
        else return super.getGia();
    }
    public String toString(){
        return super.getMa()+"\t"+super.getHang()+"\t"+super.getNam()+"\t"+
                TinhGia()+"\t"+super.getMau()+"\t"+socho;
    }
}
