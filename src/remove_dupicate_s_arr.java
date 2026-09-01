import java.util.*;
public class remove_dupicate_s_arr {


        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            int n = sc.nextInt();
            int[] nums = new int[n];

            for (int i = 0; i < n; i++) {
                nums[i] = sc.nextInt();
            }

            int k = nums.length;

            for (int i = 0; i < k - 1; i++) {

                for (int j = i + 1; j < k; j++) {

                    if (nums[i] == nums[j]) {

                        for (int x = j; x < k - 1; x++) {
                            nums[x] = nums[x + 1];
                        }

                        k--;
                        j--;
                    }
                }
            }

            System.out.println("Number of unique elements: " + k);

            System.out.print("Array: ");
            for (int i = 0; i < k; i++) {
                System.out.print(nums[i] + " ");
            }
        }
    }

