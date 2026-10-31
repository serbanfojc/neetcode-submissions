class Solution {
        public int longestConsecutive(int[] nums) 
    {
        int best = 0;
        Set<Integer> numSet = new HashSet<>();
        for(int num : nums)
            {
                numSet.add(num);
            }
        
        for(int num : numSet)
            {
                if(!numSet.contains(num-1))
                    {
                        int length = 1;
                        while(numSet.contains(num+length))
                            {
                                length++;
                            }
                        if(best < length)
                            {
                                best = length;
                            }
                    }
            }
            return best;
    }
}
