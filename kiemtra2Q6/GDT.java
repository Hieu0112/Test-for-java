/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kiemtra2Q6;

/**
 *
 * @author ASUS2020
 */
public class GDT extends GD implements TinhTien {
    private double tigia;
    private String loai;

    public GDT() {
    }

    public GDT( String ma, int ngay, int thang, int nam, int sl, double dongia,double tigia, String loai) {
        super(ma, ngay, thang, nam, sl, dongia);
        this.tigia = tigia;
        this.loai = loai;
    }

    public double getTigia() {
        return tigia;
    }

    public void setTigia(double tigia) {
        this.tigia = tigia;
    }

    public String getLoai() {
        return loai;
    }

    public void setLoai(String loai) {
        this.loai = loai;
    }
    
    @Override
    public String toString(){
        return super.getMa()+"\t"+super.getNgay()+"/"+super.getThang()+"/"+super.getNam()+"\t"+super.getDongia()
                +"\t"+super.getSl()+"\t"+tigia+"\t"+loai;
    }

    @Override
    public Double thanhTien() {
        if(!loai.equalsIgnoreCase("viet nam")) return super.getDongia()*super.getSl()*tigia;
        return super.getDongia()*super.getSl();
    }
}
