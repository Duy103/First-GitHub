import java.util.Scanner;

public class GiaiPTB2 {

    public void giaiPTB2(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập hệ số a: ");
        double a = sc.nextInt();

        System.out.println("Nhập hệ số b: ");
        double b = sc.nextInt();

        System.out.println("Nhập hệ số c: ");
        double c = sc.nextInt();
        if(a == 0){
            if(b == 0 && c == 0){
                System.out.println("PT vô nghiệm");
            }else if(b == 0 && c != 0){
                System.out.println("PT vô nghiệm");
            }else {
                System.out.println("PT có nghiệm là: "+ -(c/b));
            }
        }else{
            double delta = (b*b) - (4*a*c);
            if(delta < 0) System.out.println("PT vô nghiệm");
            else if(delta == 0) System.out.println("PT có nghiệm kép x1 = x2 = " + (-b/2*a));
            else System.out.println("PT có 2 nghiệm phân biệt: x1 = " + (-b + Math.sqrt(delta)/2*a) + ", x2 = " + (b + Math.sqrt(delta)/2*a));
        }
    }
}

