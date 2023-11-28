import java.util.Scanner;

public class GiaiPTB1 {
    public void giaPTB1(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập hệ số a: ");
        double a = sc.nextInt();

        System.out.println("Nhập hệ số b: ");
        double b = sc.nextInt();

        if(a == 0 && b == 0){
            System.out.println("PT vô số nghiệm");
        }else if(a == 0 && b != 0) {
            System.out.println("PT vô nghiệm");
        }else {
            System.out.println("PT có nghiệm là: " + (-b/a));
        }
    }

}
