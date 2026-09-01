class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int n1=nums2.length;
        int arr[]=new int[n+n1];
        for(int i=0;i<n;i++){
            arr[i]=nums1[i];
        }
        for(int i=0;i<n1;i++){

            arr[n+i]=nums2[i];
        }
        Arrays.sort(arr);
        int n3=n+n1;
        if (n3 % 2 == 0) {
            int v = arr[n3 / 2];
            int v1 = arr[n3 / 2 - 1];
            return (v + v1) / 2.0;
        } else {
            return arr[n3 / 2];
        }


    }
    
}