/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kiemtra2Q6;

/**
 *
 * @author ASUS2020
 */
public class GDV extends GD implements TinhTien{
    private String loai;

    public GDV() {
    }

    public GDV( String ma, int ngay, int thang, int nam, int sl, double dongia,String loai) {
        super(ma, ngay, thang, nam, sl, dongia);
        this.loai = loai;
    }

    

    public String getLoai() {
        return loai;
    }

    public void setLoai(String loai) {
        this.loai = loai;
    }

    @Override
    public Double thanhTien() {
        return super.getSl()*super.getDongia();
    }
    
    @Override
    public String toString(){
        return super.getMa()+"\t"+super.getNgay()+"/"+super.getThang()+"/"+super.getNam()+"\t"+super.getDongia()
                +"\t"+super.getSl()+"\t"+loai;
    }
}
