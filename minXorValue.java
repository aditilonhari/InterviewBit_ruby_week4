public class Solution {
    public int findMinXor(ArrayList<Integer> A) {
        
        if (A.size() == 0)
            return 0;
             
        Collections.sort(A);
        
        int min_xor = Integer.MAX_VALUE;
        for(int i=0; i<=A.size()-2; i++){
            int min = A.get(i) ^ A.get(i+1);
            if (min < min_xor)
                min_xor = min;
        }
        
        return min_xor;
    }
}
