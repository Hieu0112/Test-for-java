
package kiemtra2Q4;
public class GiangVien implements Comparable<GiangVien>{
    private String ma, ten, email, hocham, hocvi, dc, sdt;
    private int gioday;
    private double hsl;
    public GiangVien() {
    }

    public GiangVien(String ma, String ten, String email, String hocham, String hocvi, String dc, String sdt, int gioday) {
        this.ma = ma;
        this.ten = ten;
        this.email = email;
        this.hocham = hocham;
        this.hocvi = hocvi;
        this.dc = dc;
        this.sdt = sdt;
        this.gioday = gioday;
        
    }
    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getHocham() {
        return hocham;
    }

    public void setHocham(String hocham) {
        this.hocham = hocham;
    }

    public String getHocvi() {
        return hocvi;
    }

    public void setHocvi(String hocvi) {
        this.hocvi = hocvi;
    }

    public String getDc() {
        return dc;
    }

    public void setDc(String dc) {
        this.dc = dc;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public int getGioday() {
        return gioday;
    }

    public void setGioday(int gioday) {
        this.gioday = gioday;
    }

    @Override
    public int compareTo(GiangVien o) {
        return ten.compareToIgnoreCase(o.ten);
    }
    
}
