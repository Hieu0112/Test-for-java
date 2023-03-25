
package kiemtra2Q4;
public class GVCoHuu extends GiangVien implements TinhLuong{
    private Double luongcung;
    

    public GVCoHuu() {
    }

    public GVCoHuu( String ma, String ten, String email, String hocham, String hocvi, String dc, String sdt, int gioday,Double luongcung) {
        super(ma, ten, email, hocham, hocvi, dc, sdt, gioday);
        this.luongcung = luongcung;
       
    }

    public Double getLuongcung() {
        return luongcung;
    }

    public void setLuongcung(Double luongcung) {
        this.luongcung = luongcung;
    }

    @Override
    public Double tinhLuong() {
        Double luong = getLuongcung();
        if(super.getGioday() > 40) return luong*tinhHsl()+50000*(super.getGioday()-40);
        return luong*tinhHsl();
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
    public String toString(){
        return super.getMa()+"\t"+super.getTen()+"\t"+super.getEmail()+"\t"+super.getHocham()+"\t"+super.getHocvi()+"\t"+
                super.getDc()+"\t"+super.getSdt()+"\t"+luongcung+"\t"+ tinhHsl()+"\t"+tinhLuong();
    }
}
