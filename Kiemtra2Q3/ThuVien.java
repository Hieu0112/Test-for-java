
package Kiemtra2Q3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Optional;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class ThuVien implements ChucNang{
    private Scanner sc=new Scanner(System.in);
    private List<taiLieu>list=new ArrayList<>();

    public ThuVien() {
        this.list=new ArrayList<>();
    }

    public void setList(List<taiLieu> list) {
        this.list = list;
    }
    @Override
    public void HienThi(){
        
        System.out.println("Danh Sach tat ca San Pham:");
        for (taiLieu lieu : list) {
                System.out.println(lieu);
        }
        System.out.println("-----------");
        System.out.println("Danh Sach sach:");
        for (taiLieu lieu : list) {
            if(lieu instanceof Sach)
                System.out.println(lieu);
        }
        System.out.println("Danh Sach Tap Chi:");
        for (taiLieu lieu : list) {
            if(lieu instanceof TapChi)
                System.out.println(lieu);
        }
        System.out.println("Danh Sach Bao:");
        for (taiLieu lieu : list) {
            if(lieu instanceof Bao)
                System.out.println(lieu);
        }
        System.out.println("Tong so:"+list.size());
        System.out.println("------------");
    }
    @Override
    public void TimTheoMaTaiLieu(){
        System.out.print("Nhap ma: ");
        String ma=sc.nextLine();
        boolean ok=true;
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getMaTL().equalsIgnoreCase(ma)){
                System.out.println(list.get(i));
                ok=false;
            }
        }
        if(ok)
            System.out.println("Khong ton tai");
    }
    @Override
    public void TimTheoNhaXuatBan(){
        System.out.print("Nhap ten NXB: ");
        String NXB=sc.nextLine();
        boolean ok=true;
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getTenNXB().equalsIgnoreCase(NXB)){
                System.out.println(list.get(i));
                ok=false;
            }           
        }
        if(ok)
            System.out.println("Khong ton tai");
    }
    @Override
    public void TimTheoTenTG(){
        List<Sach>l1=new ArrayList<>();
        for (taiLieu x: list) {
            if(x instanceof Sach)
                l1.add((Sach)x);
        }
        System.out.print("Nhap ten tac gia: ");
        String TenTG=sc.nextLine();
        boolean ok=true;
        for (Sach sach : l1) {
            if(sach.getTenTG().equalsIgnoreCase(TenTG)){
                ok=false;
                System.out.println(sach);
            }
        }
        if(ok)
            System.out.println("Khong ton tai");
    }
    @Override
    public void TimTheoTenSach(){
        List<Sach>l1=new ArrayList<>();
        for (taiLieu x: list) {
            if(x instanceof Sach)
                l1.add((Sach)x);
        }
        System.out.print("Nhap ten sach: ");
        String Tensach=sc.nextLine();
        boolean ok=true;
        for (Sach sach : l1) {
            if(sach.getTenSach().equalsIgnoreCase(Tensach)){
                ok=false;
                System.out.println(sach);
            }
        }
        if(ok)
            System.out.println("Khong ton tai");
    }
    @Override
    public void TimTheoNgayPhatHanh(){
        List<Bao>l1=new ArrayList<>();
        for (taiLieu x: list) {
            if(x instanceof Bao)
                l1.add((Bao)x);
        }
        String ngayPH;
        String re="\\d{1,2}/\\d{1,2}/\\d{4}";
        while(true){
            System.out.print("Nhap ngayPH: ");
            ngayPH=sc.nextLine();
            if(ngayPH.matches(re))
                break;
        }
        boolean ok=true;
        for (Bao x:l1) {
            if(x.getNgayPH().equalsIgnoreCase(ngayPH)){
                System.out.println(x);
                ok=false;
            }
        }
        if(ok)
            System.out.println("Khong tim thay");
    }
    
    @Override
    public void TimTheoThangDenThang() {
        List<TapChi>l1=new ArrayList<>();
        for (taiLieu x: list) {
            if(x instanceof TapChi)
                l1.add((TapChi)x);
        }
        int t1,t2;
        System.out.print("Nhap thang dau: ");
        t1=Integer.parseInt(sc.nextLine());
        System.out.print("Den thang: ");
        t2=Integer.parseInt(sc.nextLine());
        boolean ok=true;
        for (TapChi x:l1) {
            if(x.getThangPH()>=t1&&x.getThangPH()<=t2){
                System.out.println(x);
                ok=false;
            }
        }
        if(ok)
            System.out.println("Khong tim thay");
    }
    
    private boolean soSanhNgay(String x1,String x2,String x3){
        SimpleDateFormat sdf=new SimpleDateFormat("dd/mm/yyyy");
        try{
            Date d1=sdf.parse(x1);
            Date d2=sdf.parse(x2);
            Date d3=sdf.parse(x3);
            if(d1.before(d3)&&d2.after(d3))
                return true;
        return false;
        }
        catch(ParseException e){
            System.out.println(e); 
        }
        return false;
    }
    
    @Override
    public void TimTheoNgayPhatHanhTuNgayDenNgay(){
        List<Bao>l1=new ArrayList<>();
        for (taiLieu x: list) {
            if(x instanceof Bao)
                l1.add((Bao)x);
        }
        System.out.println("Nhap Ngay phat hanh: ");
        String ngayPH1,ngayPH2;
        String re="\\d{1,2}/\\d{1,2}/\\d{4}";
        while(true){
            System.out.print("Nhap ngayPH1: ");
            ngayPH1=sc.nextLine();
            if(ngayPH1.matches(re))
                break;
        }
        while(true){
            System.out.print("Nhap ngayPH2: ");
            ngayPH2=sc.nextLine();
            if(ngayPH2.matches(re))
                break;
        }
        boolean ok=true;
        for (Bao x:l1) {
            if(soSanhNgay(ngayPH1, ngayPH2, x.getNgayPH())){
                System.out.println(x);
                ok=false;
            }
        }
        if(ok)
            System.out.println("Khong tim thay");
    }
    
    @Override
    public void TimTheotrangDenTrang(){
        List<Sach>l1=new ArrayList<>();
        for (taiLieu x: list) {
            if(x instanceof Sach)
                l1.add((Sach)x);
        }
        int t1,t2;
        System.out.print("Nhap trang dau: ");
        t1=Integer.parseInt(sc.nextLine());
        System.out.print("Den Trang: ");
        t2=Integer.parseInt(sc.nextLine());
        boolean ok=true;
        for (Sach x:l1) {
            if(x.getSoTrang()>=t1&&x.getSoTrang()<=t2){
                System.out.println(x);
                ok=false;
            }
        }
        if(ok)
            System.out.println("Khong tim thay");
    }
    
    @Override
    public void TimTheoSoBanPHDenSoBanPH(){
        int t1,t2;
        System.out.print("Nhap SoBanPH dau: ");
        t1=Integer.parseInt(sc.nextLine());
        System.out.print("Den SoBanPH: ");
        t2=Integer.parseInt(sc.nextLine());
        boolean ok=true;
        for (taiLieu x:list) {
            if(x.getSoBanPH()>=t1&&x.getSoBanPH()<=t2){
                System.out.println(x);
                ok=false;
            }
        }
        if(ok)
            System.out.println("Khong tim thay");
    }
    
    public taiLieu Nhap(){
        String ma,name;
        int so;
        String re="^[ABC]\\d{3}";
        while(true){
            System.out.print("Nhap ma: ");
            ma=sc.nextLine();
            if(ma.matches(re))
                break;
        }
        System.out.print("Nhap ten NXB: ");
        name=sc.nextLine();
        System.out.print("Nhap So ban PH: ");
        so=Integer.parseInt(sc.nextLine());
        return (new taiLieu(ma, name, so));
    }
    public int TonTai(String x){
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getMaTL().equalsIgnoreCase(x)){
                return i;
            }
        }
        return -1;
    }
    @Override
    public void NhapSach() {
        taiLieu t=Nhap();
        if(TonTai(t.getMaTL())!=-1){
            System.out.println("Da Ton tai");
        }
        else{
            String tenTG,tenSach;
            int soTrang;
            System.out.print("Nhap ten TG: ");
            tenTG=sc.nextLine();
            System.out.print("Nhap ten sach: ");
            tenSach=sc.nextLine();
            System.out.print("Nhap So Trang: ");
            soTrang=Integer.parseInt(sc.nextLine());
            list.add(new Sach(t.getMaTL(), t.getTenNXB(), t.getSoBanPH(),
                tenTG, tenSach, soTrang));
        }
    }

    @Override
    public void NhapTapChi() {
        taiLieu t=Nhap();
        if(TonTai(t.getMaTL())!=-1){
            System.out.println("Da Ton tai");
        }
        else{
        int soPH,thangPH;
        System.out.print("Nhap soPH: ");
        soPH=Integer.parseInt(sc.nextLine());
        System.out.print("Nhap ThangPH: ");
        thangPH=Integer.parseInt(sc.nextLine());
        list.add(new TapChi(t.getMaTL(), t.getTenNXB(), t.getSoBanPH(),
                soPH,thangPH));
        }
    }

    @Override
    public void NhapBao() {
        taiLieu t=Nhap();
        if(TonTai(t.getMaTL())!=-1){
            System.out.println("Da Ton tai");
        }
        else{
        String ngayPH;
        String re="\\d{1,2}/\\d{1,2}/\\d{4}";
        while(true){
            System.out.print("Nhap ngayPH: ");
            ngayPH=sc.nextLine();
            if(ngayPH.matches(re))
                break;
        }
        list.add(new Bao(t.getMaTL(), t.getTenNXB(), t.getSoBanPH(),
                ngayPH));
        }
    }

    @Override
    public void Luu(String fname) {
        IOEFIle.Viet(fname, list);
    }

    @Override
    public void Doc(String fname) {
        setList(IOEFIle.Doc(fname));
    }

    @Override
    public void Xoa() {
        System.out.print("Nhap Ma Can Xoa: ");
        String ma=sc.nextLine();
        int x=TonTai(ma);
        if(x==-1)
            System.out.println("Ma Nay khong ton tai nen khong the xoa");
        else{
            list.remove(x);
        }
    }

    @Override
    public void Sua() {
        System.out.println("Nhap Ma Can Sua: ");
        String ma=sc.nextLine();
        int x=TonTai(ma);
        if(x==-1)
            System.out.println("Ma Nay khong ton tai nen khong the Sua");
        else{
            System.out.print("Ma tai Lieu: ");
            list.get(x).setMaTL(sc.nextLine());
            System.out.print("Ma Nha Xuat ban: ");
            list.get(x).setTenNXB(sc.nextLine());
            System.out.print("So Phat hanh:  ");
            list.get(x).setSoBanPH(Integer.parseInt(sc.nextLine()));
        }
    }

    @Override
    public void Tim1SoTruong() {
        
    }

    @Override
    public void SapXepTheoTenNXB() {
        list.sort(new Comparator<taiLieu>(){
            @Override
            public int compare(taiLieu o1, taiLieu o2) {
                return o1.getTenNXB().compareToIgnoreCase(o2.getTenNXB());
            }
        }
        );
    }

    @Override
    public void SapXepTheoSoBanPH() {
        list.sort(new Comparator<taiLieu>(){
            @Override
            public int compare(taiLieu o1, taiLieu o2) {
                return o1.getSoBanPH()-o2.getSoBanPH();
            }
        }
        );
    }

    @Override
    public void SapXepTheoTenTG() {
        List<Sach>l1=new ArrayList<>();
        for (taiLieu x: list) {
            if(x instanceof Sach)
                l1.add((Sach)x);
        }
        l1.sort(new Comparator<Sach>(){
            @Override
            public int compare(Sach o1, Sach o2) {
                String ten1=o1.getTenTG();
                String ten2=o2.getTenTG();
                String t1=ten1.substring(ten1.lastIndexOf(" ")+1)+ten1;
                String t2=ten2.substring(ten2.lastIndexOf(" ")+1)+ten2;
                return t1.compareToIgnoreCase(t2);
            }
        });
        System.out.println("Danh Sach Sach da sap xep: ");
        for (Sach sach1 : l1) {
            System.out.println(sach1);
        }
        System.out.println("Tong so: "+l1.size());
    }

    @Override
    public void SapXepTheoTenSach() {
        List<Sach>l1=new ArrayList<>();
        for (taiLieu x: list) {
            if(x instanceof Sach)
                l1.add((Sach)x);
        }
        Collections.sort(l1, Comparator.comparing(Sach::getTenSach));
        System.out.println("Danh Sach Sach da sap xep: ");
        for (Sach sach1 : l1) {
            System.out.println(sach1);
        }
        System.out.println("Tong so: "+l1.size());
    }

    @Override
    public void SapXepTheoSoTrang() {
        List<Sach>l1=new ArrayList<>();
        for (taiLieu x: list) {
            if(x instanceof Sach)
                l1.add((Sach)x);
        }
        Collections.sort(l1, Comparator.comparing(Sach::getSoTrang));
        System.out.println("Danh Sach Sach da sap xep theo so trang: ");
        for (Sach sach1 : l1) {
            System.out.println(sach1);
        }
        System.out.println("Tong so: "+l1.size());
    }

    @Override
    public void SapXepTheoNgayPH() {
        List<Bao>l1=new ArrayList<>();
        for (taiLieu x: list) {
            if(x instanceof Bao)
                l1.add((Bao)x);
        }
        Collections.sort(l1, Comparator.comparing(Bao::getNam).thenComparing(Bao::getThang).thenComparing(Bao::getNam));
        System.out.println("Sap Xep Theo So Ngay PH: ");
        for (Bao bao : l1) {
            System.out.println(bao);
        }
        System.out.println("Tong so: "+l1.size());
    }
    @Override
    public void SapXep2ThuocTinh_NgayPH_SoBanPH(){
        List<Bao>bao =new ArrayList<>();
        for (taiLieu t:list) {
            if(t instanceof Bao)
                bao.add((Bao)t);
        }
        //ngay PH va So ban PH
        bao.sort(new Comparator<Bao>(){
            @Override
            public int compare(Bao o1, Bao o2) {
                //nam-thang-ngay
                StringTokenizer n1=new StringTokenizer(o1.getNgayPH());
                StringTokenizer n2=new StringTokenizer(o2.getNgayPH());
                String ng1="";
                while(n1.hasMoreTokens()){
                    ng1=n1.nextToken()+ng1;
                }
                String ng2="";
                while(n2.hasMoreTokens()){
                    ng2=n2.nextToken()+ng2;
                }
                if(ng1.equalsIgnoreCase(ng2))
                    return o1.getSoBanPH()-o2.getSoBanPH();
                else 
                    return ng1.compareToIgnoreCase(ng2);
            }
        });
        System.out.println("Danh Sach Bao da sap xep: ");
        for (Bao x:bao) {
            System.out.println(x);
        }
        System.out.println("Tong so: "+bao.size());
    }

    @Override
    public void ThongKe() {
        List<Sach>l1=new ArrayList<>();
        List<TapChi>l2=new ArrayList<>();
        List<Bao>l3=new ArrayList<>();
        int tongso=0;
        for (taiLieu x: list) {
            tongso+=x.getSoBanPH();
            if(x instanceof Sach)
                l1.add((Sach)x);
            else if(x instanceof TapChi)
                l2.add((TapChi)x);
            else
                l3.add((Bao)x);
        }
        System.out.println("Tong so ban PH la: "+tongso);
        int PHSach=0,PHTapChi=0,PHBao=0;
        System.out.print("So Ban Phat Hanh Cua Sach la: ");
        for (Sach sach : l1) {
            PHSach+=sach.getSoBanPH();
        }
        System.out.println(PHSach);
        System.out.print("So Ban Phat Hanh Cua tap chi la:");
        for (TapChi tc :l2) {
            PHTapChi+=tc.getSoBanPH();
        }
        System.out.println(PHTapChi);
        System.out.print("So Ban Phat Hanh Cua bao la:");
        for (Bao b:l3) {
            PHBao+=b.getSoBanPH();
        }
        System.out.println(PHBao);
        System.out.println("------------------");
        System.out.println("Tong so theo tieu chi dieu kien: ");
        
        System.out.print("Tong So bai Bao theo Nam: ");
        int Nam_bao=Integer.parseInt(sc.nextLine());
        int sum_Bao_nam=0;
        for (Bao b:l3) {
            int x=b.getNam();
            if(x==Nam_bao)
                sum_Bao_nam++;
        }
        System.out.println(sum_Bao_nam);
        
        
        System.out.println("Thong ke sach theo ten tac gia :");
        String nameTG=sc.nextLine();
        int so_sach=0;
        for (Sach sach : l1) {
            if(sach.getTenTG().equalsIgnoreCase(nameTG))
                so_sach++;
        }
        System.out.println(so_sach);
        
        
        
        System.out.println("Thong ke sach theo so trang :");
        int So_Trang=Integer.parseInt(sc.nextLine());
        int so_sach_day=0;
        for (Sach sach : l1) {
            if(sach.getSoTrang()==So_Trang)
                so_sach_day++;
        }
        System.out.println(so_sach_day);
    }
    //So Ban Bao Phat Hanh Theo Cac Nam
    @Override
    public void ThongKeTheoTongSoPhatHanh_TheoNam() {
        List<Bao>bao=new ArrayList<>();
        for (taiLieu x: list) {
            if(x instanceof Bao)
                bao.add((Bao)x);
        }
        Map<Integer,Integer>sum_nam=bao.stream().collect(Collectors.groupingBy(Bao::getNam, Collectors.summingInt(Bao::getSoBanPH)));
        Iterator it=sum_nam.keySet().iterator();
        System.out.println("So Ban Phat Hanh Theo Tung Nam cua bao la: ");
        while(it.hasNext()){
            Object key=it.next();
            System.out.println(key+" :"+sum_nam.get(key));
        }
    }
    @Override
    public void ThongKeTheoTongSoPhatHanh_TheoThang() {
        List<TapChi>tapchi=new ArrayList<>();
        List<Bao>bao=new ArrayList<>();
        int tongso=0;
        for (taiLieu x: list) {
            if(x instanceof TapChi)
                tapchi.add((TapChi)x);
            else if(x instanceof Bao)
                bao.add((Bao)x);
        }
        
        Map<Integer,Integer>sum_thang_tapchi=tapchi.stream().collect(Collectors.groupingBy(TapChi::getThangPH, Collectors.summingInt(TapChi::getSoBanPH)));
        Iterator it1=sum_thang_tapchi.keySet().iterator();
        System.out.println("So Ban Phat Hanh Theo Tung thang cua tap chi la: ");
        while(it1.hasNext()){
            Object key=it1.next();
            System.out.println(key+" :"+sum_thang_tapchi.get(key));
        }
        
        Map<Integer,Integer>sum_thang=bao.stream().collect(Collectors.groupingBy(Bao::getThang, Collectors.summingInt(Bao::getSoBanPH)));
        Iterator it2=sum_thang.keySet().iterator();
        System.out.println("So Ban Phat Hanh Theo Tung thang cua bao la: ");
        while(it2.hasNext()){
            Object key=it2.next();
            System.out.println(key+" :"+sum_thang.get(key));
        }
    }
    @Override
    public void ThongKeTheoTongSoPhatHanh_TheoTenTacGia(){
        List<Sach>l1=new ArrayList<>();
        for (taiLieu x: list) {
            if(x instanceof Sach)
                l1.add((Sach)x);
        }
        Map<String,Integer>Sum_Sach_tg=l1.stream().collect
        (Collectors.groupingBy(t->t.getTenTG().toLowerCase(), Collectors.summingInt(Sach::getSoBanPH)));
        System.out.println("Thong Ke Tong So sach Phat Hanh Theo Ten tac gia: ");
        Iterator i=Sum_Sach_tg.keySet().iterator();
        while(i.hasNext()){
            Object key=i.next();
            System.out.println(key+": "+Sum_Sach_tg.get(key));
        }
        
    }
    @Override
    public void ThongKeTheoTongSoPhatHanh_TheoSoTrang(){
        List<Sach>l1=new ArrayList<>();
        for (taiLieu x: list) {
            if(x instanceof Sach)
                l1.add((Sach)x);
        }
        Map<Integer,Long>count_sach=l1.stream().collect(
        Collectors.groupingBy(Sach::getSoTrang,Collectors.counting())
        );
        System.out.println("Thong Ke Tong So trang cua sach: ");
        Iterator i=count_sach.keySet().iterator();
        while(i.hasNext()){
            Object key=i.next();
            System.out.println(key+": "+count_sach.get(key));
        }
    }
    @Override
    public void ThongKeTrungBinhSoBanPH_TheoTenNXB(){
        Map<String,Double>avg=list.stream().collect(
                Collectors.groupingBy(xb->xb.getTenNXB().toLowerCase(),Collectors.averagingDouble(taiLieu::getSoBanPH))
        );
        System.out.println("Thong Ke Trung Binh Ban PH theo Ten NXB: ");
        Iterator i=avg.keySet().iterator();
        while(i.hasNext()){
            Object key=i.next();
            System.out.println(key+ ": "+avg.get(key));
        }
    }
    
    @Override
    public void ThongKeTheoTongSoChiTieu_Nam() {
        
    }

    @Override
    public void ThongKeTheoTongSoChiTieu_Thang() {
        
    }

    @Override
    public void ThongKeTheoSoSachCuaTacGiaDo() {
        
    }
    

    @Override
    public void ThongKeTheoSoSachDay() {
        
    }

    @Override
    public void Max_TrangSach_Theo_NXB() {
        List<Sach>sach =new ArrayList<>();
        for (taiLieu t:list) {
            if(t instanceof Sach)
                sach.add((Sach)t);
        }
        
        Map<String,Sach>max=sach.stream().collect(
                Collectors.groupingBy(
                Sach::getTenNXB,Collectors.collectingAndThen(
                Collectors.reducing((Sach a1,Sach a2)->a1.getSoTrang()>a2.getSoTrang()?a1:a2)
                ,Optional::get))
        );
        System.out.println("Nha Xuat Ban co Trang Sach Lon Nhat la");
        Iterator i=max.keySet().iterator();
        while(i.hasNext()){
            Object key=i.next();
            System.out.println(key+": "+max.get(key));
        }
    }
    @Override
    public void Min_SoBanPH_Theo_Nam(){
        List<Bao>bao =new ArrayList<>();
        for (taiLieu t:list) {
            if(t instanceof Bao)
                bao.add((Bao)t);
        }
        
        Map<Integer,Bao>max=bao.stream().collect(
                Collectors.groupingBy(
                Bao::getNam,Collectors.collectingAndThen(
                Collectors.reducing((Bao a1,Bao a2)->a1.getSoBanPH()<a2.getSoBanPH()?a1:a2)
                ,Optional::get))
        );
        System.out.println("Nha Xuat Ban co So ban PH lon nhat theo nam la");
        Iterator i=max.keySet().iterator();
        while(i.hasNext()){
            Object key=i.next();
            System.out.println(key+": "+max.get(key));
        }
    }
}
