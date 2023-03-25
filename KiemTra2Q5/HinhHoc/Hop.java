
package KiemTra2Q5.HinhHoc;

import KiemTra2Q5.Hinh_Hoc;
import java.io.Serializable;

public class Hop extends Hinh_Hoc implements Serializable{
    private double canh2,canh3;

    public Hop() {
    }

    public Hop(double canh,double canh2, double canh3) {
        super(canh);
        this.canh2 = canh2;
        this.canh3 = canh3;
    }

    public double getCanh2() {
        return canh2;
    }

    public void setCanh2(double canh2) {
        this.canh2 = canh2;
    }

    public double getCanh3() {
        return canh3;
    }

    public void setCanh3(double canh3) {
        this.canh3 = canh3;
    }
    
    
    
}
