import java.util.Scanner;
public class Remove_Duplicates_from_Sorted_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter sorted array elements:");
        for (int k = 0; k < n; k++) {
            nums[k] = sc.nextInt();
        }
        int i = 1;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i - 1]) {
                nums[i] = nums[j];
                i++;
            }
        }
        System.out.println("Number of unique elements: " + i);
        System.out.print("Array after removing duplicates: ");
        for (int k = 0; k < i; k++) {
            System.out.print(nums[k] + " ");
        }
        sc.close();
    }
}