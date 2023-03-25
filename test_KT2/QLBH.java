package test_KT2;
import java.util.*;
import java.util.stream.Collectors;
public class QLBH implements IChucNang{
    private List<HoaDon>list=new ArrayList<>();
    private Scanner sc=new Scanner(System.in);

    public QLBH() {
        list=new ArrayList<>();
    }
    
    public List<HoaDon> getList() {
        return list;
    }

    public void setList(List<HoaDon> list) {
        this.list = list;
    }
    
    public int tontai(String ma){
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getMa().equalsIgnoreCase(ma))
                return i;
        }
        return -1;
    }
        
    public HoaDon nhap(){
//        bat dau bang a A hoac B Hoac C va co 3 chu so ke tiep
        String re="^[NX]\\d{3}";
        String ma;
        while(true){
            try{
                System.out.print("ma: ");
                ma=sc.nextLine().toUpperCase();
                if(tontai(ma)==-1&&ma.matches(re)){
                    break;
                }
                else{
                    throw new ValidException("Ma Bi trung hoac sai dinh dang");
                }
            }
            catch(ValidException e){
                System.err.println(e);
            }
        }
        System.out.print("ten: ");
        String ten=sc.nextLine();
        int so;
        while(true){
            try{
                System.out.print("So luong:  ");
                so=Integer.parseInt(sc.nextLine());
                break;
            }
            catch(NumberFormatException e){
                System.err.println(e);
            }
        }
        double gia;
        while(true){
            try{
                System.out.print("gia:  ");
                gia=Double.parseDouble(sc.nextLine());
                break;
            }
            catch(NumberFormatException e){
                System.err.println(e);
            }
        }
        return (new HoaDon(ma, ten, so, gia));
    }

    @Override
    public void Nhap1() {
        HoaDon h=nhap();
        System.out.print("tra truoc hay sau: ");
        boolean a=Boolean.parseBoolean(sc.nextLine());
        list.add(new HoaDonBanSi(h.getMa(), h.getName(), h.getSo(), h.getGia(), a));
    }

    @Override
    public void Nhap2() {
        HoaDon h=nhap();
        System.out.print("Ngay: ");
        String day=sc.nextLine();
        list.add(new HoaDonBanLe(h.getMa(), h.getName(), h.getSo(), h.getGia(), day));
    }

    @Override
    public void HienThi() {
        for (HoaDon x:list) {
            System.out.println(x);
        }
        
        System.out.println("-----------------------");
        System.out.println("Tong: "+list.size());
    }

    @Override
    public void Luu_vao_File(String fname) {
        IOEFile.Viet(fname, list);
    }

    @Override
    public void Doc_tu_File(String fname) {
        setList(IOEFile.Doc(fname));
        HienThi();
    }

    @Override
    public void TimKiem() {
        List<HoaDonBanLe>l1=new ArrayList<>();
        for (HoaDon hoaDon : list) {
                if(hoaDon instanceof HoaDonBanLe){
                    l1.add((HoaDonBanLe)hoaDon);
                }
        }
        System.out.print("Nhap nam dau: ");
        int n1=Integer.parseInt(sc.nextLine());
        System.out.print("Nhap nam cuoi: ");
        int n2=Integer.parseInt(sc.nextLine());
        System.out.println("Danh sach tim kiem");
        for (HoaDonBanLe hoaDonBanLe : l1) {
            int nam=hoaDonBanLe.getNam();
            if(nam>=n1&&nam<=n2)
                System.out.println(hoaDonBanLe);
        }
    }

    @Override
    public void SapXep() {
        Collections.sort(list, new Comparator<HoaDon>(){
            @Override
            public int compare(HoaDon o1, HoaDon o2) {
                return o1.getName().compareTo(o2.getName());
            }
            
        });
    }

    @Override
    public void ThongKe() {
        List<HoaDonBanLe>l1=new ArrayList<>();
        for (HoaDon hoaDon : list) {
                if(hoaDon instanceof HoaDonBanLe){
                    l1.add((HoaDonBanLe)hoaDon);
                }
        }
        Map<Integer,Long>Nam
                =l1.stream().collect(
                Collectors.groupingBy(HoaDonBanLe::getNam
                        ,Collectors.counting()
                ));
        System.out.println("Thong Ke Thu Nhap Theo Tung Nam");
        Iterator i=Nam.keySet().iterator();
        while(i.hasNext()){
            Object key=i.next();
            System.out.println(key+": "+Nam.get(key));
        }
    }
}
