public class Mang {
    private int[] a;
    private int[] b;
    private int[] result;

    public Mang(int[] a, int[] b){
        this.a = a;
        this.b = b;
        this.result = new int[a.length];
    }

    public void themMang(){
        int d = 0; // bien nho
        for(int i = 0; i<a.length; i++){
            int sum = a[i] + b[i] + d;
            if(sum >= 10){
                result[i] = sum % 10;
                d = 1;
            }else {
                result[i] = sum;
                d = 0;
            }
        }
    }

    public void printKQ(){
        for(int i = 0; i<result.length; i++){
            System.out.println(result[i] + "  ");
        }
    }
}
