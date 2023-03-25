
package Kt2_test;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        QLGT q=new QLGT();
        String fname="src/Kt2_test/KT1_txt.txt";
        int chon;
        Scanner sc=new Scanner(System.in);
        while(true){
            System.out.println("------MENU------");
            System.out.println("1.Nhap Oto");
            System.out.println("2.Nhap Xe May");
            System.out.println("3.Viet DS");
            
            System.out.println("4.Xoa");
            System.out.println("5.Sua");
            System.out.println("6.Sua Xe May");
            
            System.out.println("7.Tim theo ma");       
            System.out.println("8.Tim theo Hang");
            System.out.println("9.Tim Theo mau");
            System.out.println("10.Tim theo Nam");
            System.out.println("11.Tim Theo So Cho");
            
            System.out.println("12.Sap Xep theo ma");
            System.out.println("13.Sap Xep theo hang");
            System.out.println("14.Sap Xep theo nam");
            System.out.println("15.Sap Xep theo gia");
            
            System.out.println("16.Ghi FIle");
            System.out.println("17.Doc File");
            System.out.println("0.Thoat");
            System.out.print("Nhap Lua Chon Cua Ban: ");
            chon=Integer.parseInt(sc.nextLine());
            switch (chon) {
                case 0:
                    System.out.println("BYE!!!");
                    System.exit(0);
                    break;
                case 1:
                    q.nhapOto();
                    break;
                case 2:
                    q.NhapXeMay();
                    break;
                case 3:
                    q.vietDS();
                    break;
                case 4:
                    q.Xoa();
                    break;
                case 5:
                    q.Sua();
                    break;
                case 6:
                    q.SuaXeMay();
                    break;
                case 7:
                    q.TimTheoMa();
                    break;
                case 8:
                    q.TimTheoHang();
                    break;
                case 9:
                    q.TimTheoMau();
                    break;
                case 10:
                    q.TimTheoNam();
                    break;
                case 11:
                    q.TimTheoSoCho();
                    break;
                case 12:
                    q.SapXepTheoMa();
                    break;
                case 13:
                    q.SapXepTheoHang();
                    break;
                case 14:
                    q.SapXepTheoNam();
                    break;
                case 15:
                    q.SapXepTheoGiaGiamDan();
                    break;
                case 16:
                    q.ghiFile(fname);
                    break;
                case 17:
                    q.DocFile(fname);
                    break;
                default:
                    throw new AssertionError();
            }
        }
    }
}
