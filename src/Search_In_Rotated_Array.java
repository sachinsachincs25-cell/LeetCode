import java.util.*;
public class Search_In_Rotated_Array {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            // Array ka size input lo
            int n = sc.nextInt();

            // Array banao
            int[] nums = new int[n];

            // Array ke elements input lo
            for(int i=0;i<n;i++){
                nums[i] = sc.nextInt();
            }

            // Target input lo
            int target = sc.nextInt();

            // Target ko array mein search karo
            for(int i=0;i<n;i++){

                // Agar target mil gaya
                if(nums[i] == target){

                    // Index print karo
                    System.out.println(i);
                    return;
                }
            }

            // Agar target nahi mila
            System.out.println(-1);
        }
    }

