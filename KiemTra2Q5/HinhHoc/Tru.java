
package KiemTra2Q5.HinhHoc;

import KiemTra2Q5.Hinh_Hoc;
import java.io.Serializable;

public class Tru extends Hinh_Hoc implements Serializable{
    private double canh2,bk;

    public Tru() {
    }

    public Tru(double canh,double canh2, double bk) {
        super(canh);
        this.canh2 = canh2;
        this.bk = bk;
    }

    public double getCanh2() {
        return canh2;
    }

    public void setCanh2(double canh2) {
        this.canh2 = canh2;
    }

    public double getBk() {
        return bk;
    }

    public void setBk(double bk) {
        this.bk= bk;
    }
    
    
    
}
