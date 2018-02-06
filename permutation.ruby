class Solution
    # @param a : array of integers
    # @return an array of array of integers
    def permute(a)

        return nil if a.nil?
        
        return a.permutation(a.length).to_a
    end
end
