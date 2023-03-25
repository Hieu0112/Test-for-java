/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KiemTraLan2;

import java.io.Serializable;

/**
 *
 * @author trinh
 */
public class Sach implements Serializable{
    private String ma,nameSach,nameTG,nxb;
    private double DonGia;

    public Sach(String ma, String nameSach, String nameTG, String nxb, double DonGia) {
        this.ma = ma;
        this.nameSach = nameSach;
        this.nameTG = nameTG;
        this.nxb = nxb;
        this.DonGia = DonGia;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getNameSach() {
        return nameSach;
    }

    public void setNameSach(String nameSach) {
        this.nameSach = nameSach;
    }

    public String getNameTG() {
        return nameTG;
    }

    public void setNameTG(String nameTG) {
        this.nameTG = nameTG;
    }

    public String getNxb() {
        return nxb;
    }

    public void setNxb(String nxb) {
        this.nxb = nxb;
    }

    public double getDonGia() {
        return DonGia;
    }

    public void setDonGia(double DonGia) {
        this.DonGia = DonGia;
    }


   
    
}
