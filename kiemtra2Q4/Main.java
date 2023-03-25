
package kiemtra2Q4;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        QLGV q = new QLGV();
        while(true){
            System.out.println("-----MENU-----");
            System.out.println("1.  ");
            System.out.println("2. ");
            System.out.println("3. ");
            
            System.out.println("4.  ");
            System.out.println("5. ");
            System.out.println("6. ");
            
            System.out.println("7. ");
            System.out.println("8. ");
            
            System.out.println("9. ");
            
           
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
                    
                    break;
                case(2):
                    
                    break;
                case(3):
                    
                    break;   
                case(4):
                    
                    break;
                case(5):
                    
                    break;
                case(6):
                    
                    break;
                case(7):
                    
                    break;
                default:
                    System.out.println("Nhap lai!!!");
                    break;
                    
            }
        }
    }
}
