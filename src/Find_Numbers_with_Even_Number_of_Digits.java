import java.util.Scanner;

public class Find_Numbers_with_Even_Number_of_Digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] arr = new int[a];
        int c = 0;
        int num = 0;
        for (int i = 0; i < a; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < a; i++) {
            num = arr[i];
            int d = 0;
            while (num != 0) {
                d++;
                num/= 10;
            }

            if (d % 2 == 0) {
                c++;
            }

        }
        System.out.println(c);
    }
    }

