import java.util.*;
public class Running_sum_Array {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter size: ");
            int n = sc.nextInt();
            int[] nums = new int[n];
            System.out.println("Enter array elements:");
            for(int i = 0; i < n; i++) {
                nums[i] = sc.nextInt();
            }
            int sum = 0;
            for(int i = 0; i < n; i++) {
                sum = sum + nums[i];
                nums[i] = sum;
            }
            System.out.println("Running Sum:");
            for(int i = 0; i < n; i++) {
                System.out.print(nums[i] + " ");
            }
        }
    }

