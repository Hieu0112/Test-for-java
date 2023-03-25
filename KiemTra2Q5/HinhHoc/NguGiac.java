
package KiemTra2Q5.HinhHoc;

import KiemTra2Q5.Hinh_Hoc;
import java.io.Serializable;

public class NguGiac extends Hinh_Hoc implements Serializable{
    private double canh2,canh3,canh4,canh5;

    public NguGiac() {
    }

    public NguGiac(double canh,
            double canh2, double canh3, double canh4, double canh5) {
        super(canh);
        this.canh2 = canh2;
        this.canh3 = canh3;
        this.canh4 = canh4;
        this.canh5 = canh5;
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

    public double getCanh4() {
        return canh4;
    }

    public void setCanh4(double canh4) {
        this.canh4 = canh4;
    }

    public double getCanh5() {
        return canh5;
    }

    public void setCanh5(double canh5) {
        this.canh5 = canh5;
    }

   
    
    
}
