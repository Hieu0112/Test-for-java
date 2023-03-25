package KiemTraLan2;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        String fname="src/KiemTraLan2/sach.dat";
        int chon;
        Scanner sc = new Scanner(System.in);
        QLSachTV s=new QLSachTV();
        while(true){
            System.out.println("-----MENU-----");
            System.out.println("1. Nhap Sach GK");
            System.out.println("2. Nhap Sach TK");
            System.out.println("3. Hien Thi");
            
            System.out.println("4. Luu vao File");
            System.out.println("5. Doc tu File");
            
            System.out.println("6. Tim Kiem");
            System.out.println("7. Sap Xep");
            System.out.println("8. Thong Ke");
           
            System.out.println("0. Thoat");
            System.out.println("---------------------------");
            System.out.print("Ban chon (0->8): ");
            chon = Integer.parseInt(sc.nextLine());
            switch(chon){
                case(0):
                    System.out.println("Bye!!");
                    System.exit(0);
                case(1):
                    s.Nhap1();
                    break;
                case(2):
                    s.Nhap2();
                    break;
                case(3):
                    s.HienThi();
                    break;   
                case(4):
                    s.Luu_vao_File(fname);
                    break;
                case(5):
                    s.Doc_tu_File(fname);
                    break;
                case 6:
                    s.TimKiem();
                    break;
                case 7:
                    s.SapXep();
                    break;
                case 8:
                    s.ThongKe();
                    break;
                default:
                    System.out.println("Nhap Lai!!!");
            }
        }
    }
}
