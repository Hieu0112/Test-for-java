package KiemTraLan2;
import java.util.*;
import java.util.stream.Collectors;
public class QLSachTV implements IChucNang{
    private List<Sach>list=new ArrayList<>();
    private Scanner sc=new Scanner(System.in);

    public QLSachTV() {
        list=new ArrayList<>();
    }
    
    
        public int tontai(String ma){
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getMa().equalsIgnoreCase(ma))
                return i;
        }
        return -1;
    }
    
    public List<Sach> getList() {
        return list;
    }

    public void setList(List<Sach> list) {
        this.list = list;
    }
    private String NhapNgay(){
        String ngay;
        String re ="\\d{1,2}/\\d{1,2}/\\d{4}";
        while(true){
            try{
                System.out.print("Nhap Ngay :");
                ngay=sc.nextLine();
                if(ngay.matches(re)){
                    break;
                }
                else{
                    throw new ValidException("Ngay sai dinh dang!!!");
                }
            }
            catch(ValidException e){
                System.err.println(e);
            }
        }
        return ngay;
    }
    
    private String NhapMaSinhVien(){
        String re="B\\d{2}[a-zA-Z]{4}\\d{3}$";
        String msv;
        while(true){
            try{
                System.out.print("Nhap ma Sinh Vien: ");
                msv=sc.nextLine().toUpperCase();
                if(msv.matches(re)){
                    break;
                }
                else{
                    throw new ValidException("Ma bi sai dinh dang!!!");
                }
            }
            catch(ValidException e){
                System.err.println(e);
            }
        }
        return msv;
    }
     
    private String NhapBoolean(){
        String kieubool;
        while(true){
            try{
                System.out.print("nhap true hoac false: ");
                kieubool=sc.nextLine();
                if(kieubool=="true"||kieubool=="false"){
                    break;
                }
                else{
                    throw new ValidException("Nhap lai true hoac false!!!");
                }
            }
            catch(ValidException e){
                System.err.println(e);
            }
        }
        return kieubool;
    }
    
    private String NhapMa(){
        String re="^[abcdegh]{2}\\d{2}";
        String ma;
        //Nhap String
        while(true){
            try{
                System.out.print("ma: ");
                ma=sc.nextLine();
                if(tontai(ma)==-1&&ma.matches(re)){
                    break;
                }
                else{
                    throw new ValidException("Ma Bi trung hoac sai dinh dang!!!");
                }
            }
            catch(ValidException e){
                System.err.println(e);
            }
        }
        return ma;
    }
    
    private int NhapSoInt(){
        int so;
        while(true){
            try{
                System.out.print("So:  ");
                so=Integer.parseInt(sc.nextLine());
                break;
            }
            catch(NumberFormatException e){
                System.err.println(e);
            }
        }
        return so;
    }
    
    private double NhapSoDouble(){
        double so;
        while(true){
            try{
                System.out.print("So:  ");
                so=Double.parseDouble(sc.nextLine());
                break;
            }
            catch(NumberFormatException e){
                System.err.println(e);
            }
        }
        return so;
    }
    
    
    private String NhapTen(){
        String re="[a-zA-Z ]+";
        String name;
        while(true){
            try{
                System.out.print("Nhap ten: ");
                name=sc.nextLine().toUpperCase();
                if(name.matches(re)){
                    break;
                }
                else{
                    throw new ValidException("Ten bi sai dinh dang!!!");
                }
            }
            catch(ValidException e){
                System.err.println(e);
            }
        }
        return name;
    }
    
    
    public Sach nhap(){
        String ma=NhapMa();
        String namesach=NhapTen();
        String nameTG=NhapTen();
        String nxb;
        System.out.println("Nhap ten nxb");
        int so=NhapSoInt();
        if(so==1) 
            nxb="giaoduc";
        else if(so==2) nxb="Khoa Hoc va ky thuat";
        else 
            nxb="Buu Dien";
        System.out.print("nhap gia :");;
        double gia=NhapSoDouble();
        return (new Sach(ma, namesach, nameTG, nxb, gia));
    }

    @Override
    public void Nhap1() {
        Sach s=nhap();
        System.out.print(" nhap lop co dau cach: ");
        list.add(new SachGK(s.getMa(), s.getNameSach(), s.getNameTG(), s.getNxb(), s.getDonGia(), sc.nextLine()));
    }

    @Override
    public void Nhap2() {
        Sach s=nhap();
        System.out.println("nhap true false");
        list.add(new SachTK(s.getMa(), s.getNameSach(), s.getNameTG(), s.getNxb(), s.getDonGia(), Boolean.parseBoolean(sc.nextLine())));
    }

    @Override
    public void HienThi() {
        for (Sach x: list) {
            System.out.println(x);
        }
        System.out.println("-------------");
        System.out.println("Tong: "+list.size());
    }

    @Override
    public void Luu_vao_File(String fname) {
        IOEFile.Viet(fname, list);
    }

    @Override
    public void Doc_tu_File(String fname) {
        setList(IOEFile.Doc(fname));
    }

    @Override
    public void TimKiem() {
        List<SachTK>l1=new ArrayList<>();
        for(Sach x:list){
            if(x instanceof SachTK)
                l1.add((SachTK)x);
        }
        System.out.println("tieng viet or ngoai ngu");
        String nn=sc.nextLine();
            boolean ok;
            if(nn.equalsIgnoreCase("tieng viet")) ok=true;
            else ok=false;
            System.out.println("Tai Lieu Tim Kiem"+ nn);
        for (SachTK sachTK : l1) {
            if(sachTK.isNgonNgu()==ok)
                System.out.println(sachTK);
        }
    }

    @Override
    public void SapXep() {
        List<SachGK>l1=new ArrayList<>();
        for(Sach x:list){
            if(x instanceof SachGK)
                l1.add((SachGK)x);
        }
        Collections.sort(l1,new Comparator<SachGK>(){
            @Override
            public int compare(SachGK o1, SachGK o2) {
                String ten1=o1.getNameTG();
                String ten2=o2.getNameTG();
                String t1=ten1.substring(ten1.lastIndexOf(" ")+1)+ten1;
                String t2=ten2.substring(ten2.lastIndexOf(" ")+1)+ten2;
                return t1.compareToIgnoreCase(t2);
            }
        });
        System.out.println(l1.size());
        System.out.println("-------------");
        for(SachGK x:l1){
            System.out.println(x);
        }
    }

    @Override
    public void ThongKe() {
        Map<String,Sach>max= list.stream().collect(Collectors.groupingBy(
                Sach::getNxb,Collectors.collectingAndThen(
                        Collectors.reducing((Sach s1,Sach s2)->s1.getDonGia()>s2.getDonGia()?s1:s2),Optional::get)));
        Iterator i=max.keySet().iterator();
        while(i.hasNext()){
            Object key=i.next();
            System.out.println(key+": "+max.get(key));
        }
    }
}
