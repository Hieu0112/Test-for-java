
package kiemtra2Q4;
public class GVThinhGiang extends GiangVien implements TinhLuong {
    private String coquan;

    public GVThinhGiang() {
    }

    public GVThinhGiang(String ma, String ten, String email, String hocham, String hocvi, String dc, String sdt, int gioday,String coquan) {
        super(ma, ten, email, hocham, hocvi, dc, sdt, gioday);
        this.coquan = coquan;
    }

    public String getCoquan() {
        return coquan;
    }

    public void setCoquan(String coquan) {
        this.coquan = coquan;
    }
    
    public Double tinhHsl() {
        Double hsl=0.0;
        if(super.getHocham().equalsIgnoreCase("giao su")) {
            hsl+=0.2;
        }
        else if(super.getHocham().equalsIgnoreCase("pho giao su")) {
            hsl+=0.1;
        }
        
        if(super.getHocvi().equalsIgnoreCase("dai hoc")){
            hsl+=1.0;
        }
        else if(super.getHocvi().equalsIgnoreCase("thac si")){
            hsl+=1.1;
        }
        else{
            hsl+=1.2;
        }
        return hsl;
    }
    
    @Override
    public Double tinhLuong() {
        return (double)super.getGioday()*200000.0*tinhHsl();
    }
    
    @Override
    public String toString(){
        return super.getMa()+"\t"+super.getTen()+"\t"+super.getEmail()+"\t"+super.getHocham()+"\t"+super.getHocvi()+"\t"+
                super.getDc()+"\t"+super.getSdt()+"\t"+coquan+"\t"+ tinhHsl()+"\t"+tinhLuong();
    }
    
}
