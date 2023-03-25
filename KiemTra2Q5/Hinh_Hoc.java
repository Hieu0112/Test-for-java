
package KiemTra2Q5;

import java.io.Serializable;
public class Hinh_Hoc implements Serializable{
    private double canh;
    public Hinh_Hoc() {
    }

    public Hinh_Hoc(double canh) {
        this.canh = canh;
    }

    public void setCanh(double canh) {
        this.canh = canh;
    }

    public double getCanh() {
        return canh;
    }
}
