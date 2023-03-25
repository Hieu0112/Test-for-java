
package KiemTra2Q5.HinhHoc;

import KiemTra2Q5.Hinh_Hoc;
import java.io.Serializable;

public class Cau extends Hinh_Hoc implements Serializable{
    private double bk;

    public Cau() {
    }

    public Cau( double canh,double bk) {
        super(canh);
        this.bk = bk;
    }

    public double getBk() {
        return bk;
    }

    public void setBk(double bk) {
        this.bk = bk;
    }
    
    
    
}
