public class Main {
    public static void main(String[] args) {
        int target = 200000;
        int[] arr = {10000, 20000, 50000};

        int count = 0;

        for (int i = 0; i <= target / arr[0]; i++)
        {
            for (int j = 0; j <= target / arr[1]; j++)
            {
                for (int k = 0; k <= target / arr[2]; k++)
                {
                    int sum = i * arr[0] + j * arr[1] + k * arr[2];
                    if (sum == target)
                    {
                        count++;
                        System.out.println("Phuong an " + count + ": " + i + " to " + arr[0] + "d, " + j + " to " + arr[1] + "d, " + k + " to " + arr[2] + "d");
                    }
                }
            }
        }
    }
}