package LamKiemTraLan2;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        String fname="src/TrinhVietHieuB20DCAT063_KiemTraLan2/TrinhVietHieuB20DCAT063.dat";
        int chon;
        Scanner sc = new Scanner(System.in);
        QuanLy click=new QuanLy();
        while(true){
            System.out.println("----------MENU----------");
            System.out.println("1. Nhap 1");
            System.out.println("2. Nhap 2");
            System.out.println("3. Hien Thi danh sach");
            
            System.out.println("4. Luu vao file: "+fname);
            System.out.println("5. Doc tu file : "+fname);
            
            System.out.println("6. Tim kiem");
            System.out.println("7. Sap xep");
            System.out.println("8. Thong ke");
           
            System.out.println("0. Thoat!");
            System.out.println("---------------------------");
            System.out.print("Vui long nhap lua chon(0->8): ");
            
            chon = Integer.parseInt(sc.nextLine());
            switch(chon){
                case(0):
                    System.out.println("Chuong trinh ket thuc!");
                    System.out.println("Bye!!!");
                    System.exit(0);
                case(1):
                    click.NhapDuLieu1();
                    break;
                case(2):
                    click.NhapDuLieu2();
                    break;
                case(3):
                    click.HienThiDanhSach();
                    break;   
                case(4):
                    click.LuuVaoFile(fname);
                    break;
                case(5):
                    click.DocTuFile(fname);
                    break;
                case 6:
                    click.TimKiem();
                    break;
                case 7:
                    click.SapXep();
                    break;
                case 8:
                    click.ThongKe();
                    break;
                default:
                    System.out.println("Du lieu nhap da sai!!!\nVui long nhap lai cac so tu 0 den 8.");
            }
        }
    }
}
