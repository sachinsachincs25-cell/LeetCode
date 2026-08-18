import java.util.Scanner;
public class Minimum_operation_Array_Sum_Divisible_by_K {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter array size: ");
            int n = sc.nextInt();
            int[] nums = new int[n];
            System.out.println("Enter array elements:");
            for (int i = 0; i < nums.length; i++) {
                nums[i] = sc.nextInt();
            }
            System.out.print("Enter k: ");
            int k = sc.nextInt();
            int sum = 0;
            for (int i = 0; i < nums.length; i++) {
                sum += nums[i];
                nums[i] = nums[i] % k;
            }
            sum = sum % k;
            if (sum != 0) {
                System.out.println("Minimum operations: " + sum);
            } else {
                System.out.println("Minimum operations: 0");
            }
            sc.close();
        }
    }
