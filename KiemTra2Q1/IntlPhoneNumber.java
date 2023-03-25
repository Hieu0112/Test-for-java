/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KiemTra2Q1;

/**
 *
 * @author trinh
 */
public class IntlPhoneNumber extends PhoneNumber{
    private int maQG;

    public IntlPhoneNumber() {
    }

    public IntlPhoneNumber(int mavung, long sodienthoai,int maQG) {
        super(mavung, sodienthoai);
        this.maQG = maQG;
    }

    public int getMaQG() {
        return maQG;
    }

    public void setMaQG(int maQG) {
        this.maQG = maQG;
    }

    @Override
    public String toString() {
        return String.valueOf(maQG)+"-"+super.getMavung()+"-"+super.getSodienthoai();
    }
    
    
}
