/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KT2_test2.model;

import java.io.Serializable;
import java.util.StringTokenizer;

/**
 *
 * @author Trịnh Viết Hiếu
 */
public class Sach extends TaiLieu implements ITaiLieu,Serializable{
    
    private String tenTG,tenSach;
    private int SoTrang;

    public Sach() {
    }

    public Sach( String ma, String tenNXB, int soBanPH,
            String tenTG, String tenSach, int SoTrang) {
        super(ma, tenNXB, soBanPH);
        this.tenTG = tenTG;
        this.tenSach = tenSach;
        this.SoTrang = SoTrang;
    }

    public String getTenTG() {
        return tenTG;
    }

    public void setTenTG(String tenTG) {
        this.tenTG = tenTG;
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public int getSoTrang() {
        return SoTrang;
    }

    public void setSoTrang(int SoTrang) {
        this.SoTrang = SoTrang;
    }
    
    @Override
    public String getCode() {
        String c=getMa().toUpperCase();
        StringTokenizer s=new StringTokenizer(tenSach.trim().toUpperCase());
        while(s.hasMoreTokens()){
            c += s.nextToken().charAt(0);
        }
        return c;
    }

    @Override
    public String toString() {
        return getMa()+"\t"+tenSach+"\t"+tenTG+"\t"+SoTrang+"\t"+getTenNXB()+"\t"+getSoBanPH();
    }
}
