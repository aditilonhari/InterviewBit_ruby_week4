public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int singleNumber(final List<Integer> A) {
        
        if (A.size() == 0)
            return 0;
            
        int result = 0;    
        for(int i:A)
            result ^= i;
        
        return result;
    }
}
