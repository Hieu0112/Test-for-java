
package KT2_test2.run;
import KT2_test2.controller.QLTV;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        QLTV q=new QLTV();
        String fname="src/KT2_test2/run/tailieu.dat";
        while(true){
            System.out.println("-----MENU-----");
            System.out.println("1. Nhap sach ");
            System.out.println("2. Nhap bao");
            System.out.println("3. Hien Thi");
            
            System.out.println("4. Luu vao File ");
            System.out.println("5. Doc tu File");
            
            System.out.println("6. Xoa");
            System.out.println("7. Sua");
            System.out.println("8. Tim theo ten sach");
            System.out.println("9. Tim bao tu nam den nam");
            
            System.out.println("10. Sap xep theo So ban PH");
            System.out.println("11. Sap xep theo ten TG");
            System.out.println("12. SapXepBao2TTTheoSoBanPH");
            
            System.out.println("13. Thong Ke 1");
            System.out.println("14. Thong Ke 2");
            System.out.println("15. Thong Ke 3");
            System.out.println("16. Thong Ke 4");
            System.out.println("17. Thong Ke 5");
            
            System.out.println("0. Thoat");
            System.out.println("--------------");
            System.out.print("Ban chon (0->17): ");
            int chon;
            Scanner sc = new Scanner(System.in);
            chon = Integer.parseInt(sc.nextLine());
            
            switch(chon){
                case(0):
                    System.out.println("Bye!!");
                    System.exit(0);
                case(1):
                    q.NhapSach();
                    break;
                case(2):
                    q.NhapBao();
                    break;
                case(3):
                    q.HienThiDS();
                    break;   
                case(4):
                    q.Luu(fname);
                    break;
                case(5):
                    q.Docra(fname);
                    break;
                case 6:
                    q.Xoa();
                    break;
                case 7:
                    q.Sua();
                    break;
                case 8:
                    q.TimTheoTenSach();
                    break;
                case 9:
                    q.TimBaoTuNamDenNam();
                    break;
                case 10:
                    q.SapXepSoBanPH();
                    break;
                case 11:
                    q.SXSachTheoTenTG();
                    break;
                case 12:
                    q.SapXepBao2TTTheoSoBanPH();
                    break;
                case 13:
                    q.ThongKe1();
                    break;
                case 14:
                    q.ThongKe2();
                    break;
                case 15:
                    q.ThongKe3();
                    break;
                case 16:
                    q.ThongKe4();
                    break;
                case 17:
                    q.ThongKe5();
                    break;
                default:
                    System.out.println("Nhap Lai!!!");
            }
        }
    }
}
