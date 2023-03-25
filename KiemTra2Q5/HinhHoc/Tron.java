
package KiemTra2Q5.HinhHoc;

import KiemTra2Q5.Hinh_Hoc;
import java.io.Serializable;

public class Tron extends Hinh_Hoc implements Serializable{
    private double bk;

    public Tron() {
    }

    public Tron(double canh,double bk) {
        super(canh);
        this.bk = bk;
    }

    public void setBk(double bk) {
        this.bk = bk;
    }

    public double getBk() {
        return bk;
    }
    
    
}
