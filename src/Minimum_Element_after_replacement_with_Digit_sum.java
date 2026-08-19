import java.util.*;
public class Minimum_Element_after_replacement_with_Digit_sum {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int[] nums = new int[n];
            for (int i = 0; i < n; i++) {
                nums[i] = sc.nextInt();
            }
            int min = Integer.MAX_VALUE;
            for (int num : nums) {
                int sum = 0;
                while (num > 0) {
                    sum = sum + num % 10;
                    num = num / 10;
                }
                if (sum < min) {
                    min = sum;
                }
            }
            System.out.println(min);
        }
    }

