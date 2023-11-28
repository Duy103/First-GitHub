import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("==================MENU================");
        System.out.println("1.Giai phuong trinh bac 2: ax2 + bx + c = 0");
        System.out.println("2.Giai phuong trinh bac 1: ax + b = 0");
        System.out.println("3.Giai he phuong trinh bac 1: ax + by = c va dx + ey = f");
        System.out.println("4.Thoat chuong trinh!");
        System.out.println("==================================");
        Scanner sc = new Scanner(System.in);
        int n = 0;
        while (n != 4){
            System.out.println("Nhập yêu cầu của bạn: ");
            n = sc.nextInt();

            switch (n){
                case 1:
                    System.out.println("-- Giải PTB2");
                    GiaiPTB2 lc1 = new GiaiPTB2();
                    lc1.giaiPTB2();
                    break;
                case 2:
                    System.out.println("-- Giải PTB1");
                    GiaiPTB1 lc2 = new GiaiPTB1();
                    lc2.giaPTB1();
                    break;
                case 3:
                    System.out.println("-- Giải Hệ PTB1");
                    GiaiHePTB1 lc3 = new GiaiHePTB1();
                    lc3.giaiHePTB1();
                    break;
                case 4:
                    System.out.println("Thoát");
                    break;
                default:
                    System.out.println("Yêu cầu không hợp lệ. Mời nhập lại");
            }

        }
    }

}