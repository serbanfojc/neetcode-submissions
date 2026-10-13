class Solution {
     public boolean isAnagram(String s, String t)
    {
        Map<Character, Integer>  charS = new HashMap<>();
        for(int i = 0; i < s.length(); i++)
            {
                char C = s.charAt(i);
                charS.put(C, charS.getOrDefault(C, 0)+1);
            } 

        Map<Character, Integer> charT = new HashMap<>();
        for(int j = 0; j < t.length(); j++)
            {
                char D = t.charAt(j);
                charT.put(D, charT.getOrDefault(D, 0)+1);
            }

        return charS.equals(charT);
    }
}
