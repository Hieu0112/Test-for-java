/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kiemtra2Q2;

/**
 *
 * @author ASUS2020
 */
import java.util.*;
public class XeTai extends PTGT implements TinhGia{
    private int trongtai;

    public XeTai() {
    }

    public XeTai( String ma, String hang, int nam, double gia, String mau,int trongtai) {
        super(ma, hang, nam, gia, mau);
        this.trongtai = trongtai;
    }

    public int getTrongtai() {
        return trongtai;
    }

    public void setTrongtai(int trongtai) {
        this.trongtai = trongtai;
    }
    public double TinhGia(){
        Calendar c = Calendar.getInstance();
        int y = c.get(Calendar.YEAR);
        if(y-super.getNam() >= 2) return (super.getGia()*0.85);
        else return super.getGia();
    }
    public String toString(){
        return super.getMa()+"\t"+super.getHang()+"\t"+super.getNam()+"\t"+
                getGia()+"\t"+super.getMau()+"\t"+trongtai;
    }
}
