import java.util.*;
public class searchInsert {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            // Array size
            int n = sc.nextInt();

            // Array input
            int[] nums = new int[n];

            for (int i = 0; i < n; i++) {
                nums[i] = sc.nextInt();
            }

            // Target input
            int target = sc.nextInt();

            int low = 0;
            int high = nums.length - 1;

            while (low <= high) {
                int mid = low + (high - low) / 2;

                if (nums[mid] == target) {
                    System.out.println(mid);
                    return;
                }

                if (nums[mid] < target) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }

            System.out.println(low);
        }
    }

