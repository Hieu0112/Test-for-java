
package KiemTra2Q1;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        PhoneBook bp=new PhoneBook();
        Scanner sc=new Scanner(System.in);
        int chon;
        while(true){
            System.out.println("1.them noi vung");
            System.out.println("2.them ngoai vung");
            System.out.println("3.tim sdt vung");
            System.out.println("4.hien thi noi vung nuoc ngoai");
            System.out.println("5.tong so dien thoai trong vung");
            System.out.println("6.tim sdt theo duoi");
            System.out.println("7.sap xep");
            
            chon=Integer.parseInt(sc.nextLine());   
            switch (chon) {
                case 0:
                    System.exit(0);
                case 1:
                    bp.add_NoiVung();
                    break;
                case 2:
                    bp.add_NuocNgoai();
                    break;
                case 3:
                    bp.Tim_dt_theo_ma_vung();
                    break;
                case 4:
                    bp.HienThi();
                    break;
                case 5:
                    bp.TongSoDienThoaiTheoTungVung();
                    break;
                case 6:
                    bp.Tim_dt_theo_Duoi();
                    break;
                case 7:
                    bp.SapXepSDT();
                    break;
                default:
                    System.out.println("Nhap Lai");
            }
        }
    }
}
