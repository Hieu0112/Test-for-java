
package KiemTra2Q5.HinhHoc;

import KiemTra2Q5.Hinh_Hoc;
import java.io.Serializable;

public class Thoi extends Hinh_Hoc implements Serializable{
    private double canh2;

    public Thoi() {
    }

    public Thoi(double canh2, double canh) {
        super(canh);
        this.canh2 = canh2;
    }

    public double getCanh2() {
        return canh2;
    }

    public void setCanh2(double canh2) {
        this.canh2 = canh2;
    }
    
    
}
