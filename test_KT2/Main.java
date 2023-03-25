package test_KT2;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        String fname="src/test_KT2/tailieu.dat";
        QLBH q=new QLBH();
        int chon;
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("-----MENU-----");
            System.out.println("1. Nhap ban si ");
            System.out.println("2. Nhap ban le");
            System.out.println("3. Hien Thi");
            
            System.out.println("4. Luu vao File");
            System.out.println("5. Doc tu File");
            
            System.out.println("6. TimKiem");
            System.out.println("7. SapXep");
            System.out.println("8. ThongKe");
           
            System.out.println("0. Thoat");
            System.out.println("--------------");
            System.out.print("Ban chon (0->8): ");
            chon = Integer.parseInt(sc.nextLine());
            switch(chon){
                case(0):
                    System.out.println("Bye!!");
                    System.exit(0);
                case(1):
                    q.Nhap1();
                    break;
                case(2):
                    q.Nhap2();
                    break;
                case(3):
                    q.HienThi();
                    break;   
                case(4):
                    q.Luu_vao_File(fname);
                    break;
                case(5):
                    q.Doc_tu_File(fname);
                    break;
                case 6:
                    q.TimKiem();
                    break;
                case 7:
                    q.SapXep();
                    break;
                case 8:
                    q.ThongKe();
                    break;
                default:
                    System.out.println("Nhap Lai!!!");
            }
        }
    }
}
