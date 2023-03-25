package Kiemtra2Q3;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String fname="src/Kiemtra2Q3/tailieuthuVien.dat";
        ThuVien tv=new ThuVien();
        int chon;
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("-----MENU-----");
            System.out.println("1. Nhap sach ");
            System.out.println("2. Nhap tap chi ");
            System.out.println("3. Nhap bao");
            System.out.println("4. Hien Thi");
            
            System.out.println("5. TimTheomaTaiLieu ");
            System.out.println("6. TimTheoNhaXuatBan ");
            System.out.println("7. TimTheoTenTG");
            System.out.println("8. TimTheoTenSach");
            System.out.println("9. TimTheoNgayPhatHanh");
            System.out.println("10. TimTheoThangPHDenThangPH");
            System.out.println("11. TimTheoNgayPhatHanhTuNgayDenNgay");
            System.out.println("12. TimTheotrangDenTrang");
            System.out.println("13. TimTheoSoBanPHDenSoBanPH");
            
            System.out.println("14. Luu File");
            System.out.println("15. Doc File");
            System.out.println("16. Sua Tai Lieu");
            System.out.println("17. Xoa Tai Lieu");
            
            System.out.println("18. SapXepTheoTenNXB");
            System.out.println("19. SapXepTheoSoBanPH");
            System.out.println("20. SapXepTheoTenTG");
            System.out.println("21. SapXepTheoTenSach");
            System.out.println("22. SapXepTheoSoTrang");
            System.out.println("23. SapXepTheoNgayPH");
            System.out.println("24. SapXep2ThuocTinh_NgayPH_SoBanPH");
            
            System.out.println("25. Thong Ke");
            System.out.println("26. ThongKeTheoTongSoPhatHanh_TheoNam");
            System.out.println("27. ThongKeTheoTongSoPhatHanh_TheoThang");
            System.out.println("28. ThongKeTheoTongSoPhatHanh_TheoTenTacGia");
            System.out.println("29. ThongKeTheoTongSoPhatHanh_TheoSoTrang");
            System.out.println("30. ThongKeTrungBinhSoBanPH_TheoTenNXB");
            System.out.println("31. Max_TrangSach_Theo_NXB");
            System.out.println("32. Min_SoBanPH_Theo_Nam");
            
            System.out.println("0. Thoat");
            System.out.println("--------------");
            System.out.print("Ban chon (0->25): ");
            chon = Integer.parseInt(sc.nextLine());
            switch(chon){
                case(0):
                    System.out.println("Bye!!");
                    System.exit(0);
                case(1):
                    tv.NhapSach();
                    break;
                case(2):
                    tv.NhapTapChi();
                    break;
                case(3):
                    tv.NhapBao();
                    break;   
                case(4):
                    tv.HienThi();
                    break;  
                case(5):
                    tv.TimTheoMaTaiLieu();
                    break;
                case(6):
                    tv.TimTheoNhaXuatBan();
                    break;  
                case(7):
                    tv.TimTheoTenTG();
                    break;  
                case(8):
                    tv.TimTheoTenSach();
                    break;  
                case(9):
                    tv.TimTheoNgayPhatHanh();
                    break;  
                case(10):
                    tv.TimTheoThangDenThang();
                    break;  
                case(11):
                    tv.TimTheoNgayPhatHanhTuNgayDenNgay();
                    break;
                case(12):
                    tv.TimTheotrangDenTrang();
                    break;
                case(13):
                    tv.TimTheoSoBanPHDenSoBanPH();
                    break;  
                case(14):
                    tv.Luu(fname);
                    break;  
                case(15):
                    tv.Doc(fname);
                    break; 
                case(16):
                    tv.Sua();
                    break; 
                case(17):
                    tv.Xoa();
                    break;
                case(18):
                    tv.SapXepTheoTenNXB();
                    break;
                case(19):
                    tv.SapXepTheoSoBanPH();
                    break;
                case(20):
                    tv.SapXepTheoTenTG();
                    break;
                case(21):
                    tv.SapXepTheoTenSach();
                    break;
                case(22):
                    tv.SapXepTheoSoTrang();
                    break;
                case(23):
                    tv.SapXepTheoNgayPH();
                    break;
                case(24):
                    tv.SapXep2ThuocTinh_NgayPH_SoBanPH();
                    break;
                case(25):
                    tv.ThongKe();
                    break;
                case(26):
                    tv.ThongKeTheoTongSoPhatHanh_TheoNam();
                    break;
                case(27):
                    tv.ThongKeTheoTongSoPhatHanh_TheoThang();
                    break;
                case(28):
                    tv.ThongKeTheoTongSoPhatHanh_TheoTenTacGia();
                    break;
                case(29):
                    tv.ThongKeTheoTongSoPhatHanh_TheoSoTrang();
                    break;
                case(30):
                    tv.ThongKeTrungBinhSoBanPH_TheoTenNXB();
                    break;
                case(31):
                    tv.Max_TrangSach_Theo_NXB();
                    break;    
                case(32):
                    tv.Min_SoBanPH_Theo_Nam();
                    break; 
                default:
                    System.out.println("Vui Long Nhap Lai");
            }
        }
    }
}
