class Solution {
    public int numOfUnplacedFruits(int[] fruits,int[] baskets) {
        // Unplaced fruits ka count zero hai abhi done hai
        int unplace=0;
        // Basket use hui hai ya nahi track karne ke liye check karen 
        boolean[] used=new boolean[fruits.length];
        // Har fruit ko ek-ek karke check karenge hmm 
        for(int i=0;i<fruits.length;i++){
            // Initially fruit place nahi hua (haat yaar) 
            boolean placed=false;
            // Har basket ko check karenge
            for(int j=0;j<baskets.length;j++){
                // Basket unused hai aur fruit ke liye sufficient hai
                if(!used[j]&&baskets[j]>=fruits[i]){
                    // Basket ko used mark kar diya
                    used[j]=true;
                    // Fruit place ho gaya
                    placed=true;
                    // Suitable basket mil gayi,loop stop
                    break;
                }
            }
            // Agar fruit place nahi hua
            if(!placed){
                // Unplaced count increase
                unplace++;
            }
        }
        // Total unplaced fruits return
        return unplace;
    }
}