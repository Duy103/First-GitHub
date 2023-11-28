import java.util.Scanner;

public class GiaiHePTB1 {
    public void giaiHePTB1(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập hệ số a: ");
        double a = sc.nextInt();

        System.out.println("Nhập hệ số b: ");
        double b = sc.nextInt();

        System.out.println("Nhập hệ số c: ");
        double c = sc.nextInt();

        System.out.println("Nhập hệ số d: ");
        double d = sc.nextInt();

        System.out.println("Nhập hệ số e: ");
        double e = sc.nextInt();

        System.out.println("Nhập hệ số f: ");
        double f = sc.nextInt();

        double dinhThuc = a*e - d*b;
        double dinhThucX = c*e - f*b;
        double dinhThucY = a*f - d*c;
        if(dinhThuc != 0){
            System.out.println("Hệ pt có nghiệm duy nhất là: x = " + dinhThucX/dinhThuc
                               + ", y = " + dinhThucY/dinhThuc);
        }else {
            if(dinhThucX != 0 || dinhThucY != 0)
                System.out.println("Hệ pt vô nghiệm");
            if(dinhThucX == 0 && dinhThucY == 0)
                System.out.println("Hệ pt có vô số nghiệm");
        }
    }
}
