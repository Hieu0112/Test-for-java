/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kiemtra2Q2;

import java.util.Calendar;

/**
 *
 * @author ASUS2020
 */
public class XeMay extends PTGT implements TinhGia{
    private double congsuat;

    public XeMay() {
    }

    public XeMay(String ma, String hang, int nam,double gia,String mau  ,double congsuat) {
        super(ma, hang, nam, gia,mau);
        this.congsuat = congsuat;
    }

    public double getCongsuat() {
        return congsuat;
    }

    public void setCongsuat(double congsuat) {
        this.congsuat = congsuat;
    }

    public double TinhGia(){
        Calendar c = Calendar.getInstance();
        int y = c.get(Calendar.YEAR);
        if(y-super.getNam() >= 2) return (super.getGia()*0.95);
        else return super.getGia();
    }
    public String toString(){
        return super.getMa()+"\t"+super.getHang()+"\t"+super.getNam()+"\t"+
                TinhGia()+"\t"+super.getMau()+"\t"+congsuat;
    }
    
    
}
