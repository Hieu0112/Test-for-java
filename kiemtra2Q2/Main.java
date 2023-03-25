
package kiemtra2Q2;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        String fname = "src/Kiemtra2Q2/GiaoThong.dat";
        QuanLiGiaoThong q = new QuanLiGiaoThong();
        while(true){
            System.out.println("-----MENU-----");
            System.out.println("1. Nhap oto ");
            System.out.println("2. Nhap xe may");
            System.out.println("3. Viet ra ds");
            
            System.out.println("4. Xoa ");
            System.out.println("5. Tim theo ma");
            System.out.println("6. Tim theo hang");
            
            System.out.println("7. Tim theo pt dat do");
            System.out.println("8. Tim theo nam");
            
            System.out.println("9. Sua");
            
            System.out.println("10. Sap xep theo ma");
            System.out.println("11. Sap xep theo nam giam dan");
            System.out.println("12. Sap xep theo gia tang dan");
            System.out.println("13. sap xep oto theo so cho va mau");
            System.out.println("14. Tim theo mau");
            
            System.out.println("15. Luu vao File");
            System.out.println("16. Viet ra tu File");
            System.out.println("0. Thoat");
            System.out.println("--------------");
            System.out.print("Ban chon (0->14): ");
            int chon;
            Scanner sc = new Scanner(System.in);
            chon = Integer.parseInt(sc.nextLine());
            
            switch(chon){
                case(0):
                    System.out.println("Bye!!");
                    System.exit(0);
                case(1):
                    q.nhapOto();
                    break;
                case(2):
                    q.nhapXeMay();
                    break;
                case(3):
                    q.vietDS();
                    break;   
                case(4):
                    q.xoa();
                case(9):
                    q.sua();
                case(10):
                    q.thongKe3();
                    break;
                case(15):
                    q.luu(fname);
                    break;
                case(16):
                    q.doctufile(fname);
                    break;
                default:
                     System.out.println("Nhap lai!!!");
                    break;
            }
        }
    }
}
