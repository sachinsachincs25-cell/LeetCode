import java.util.Scanner;

public class LC_Two_Sum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int target=sc.nextInt();

        int [] arr=new int[a];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();}
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                    System.out.println("[" + i + ", " + j + "]");

                }

            }
        }

    }
}
