
package KiemTra2Q1;
public class PhoneNumber {
    private int mavung;
    private long sodienthoai;

    public PhoneNumber() {
    }

    public PhoneNumber(int mavung, long sodienthoai) {
        this.mavung = mavung;
        this.sodienthoai = sodienthoai;
    }

    public int getMavung() {
        return mavung;
    }

    public void setMavung(int mavung) {
        this.mavung = mavung;
    }

    public long getSodienthoai() {
        return sodienthoai;
    }

    public void setSodienthoai(long sodienthoai) {
        this.sodienthoai = sodienthoai;
    }

    @Override
    public String toString() {
        return String.valueOf(mavung)+"-"+sodienthoai;
    }
    
}
