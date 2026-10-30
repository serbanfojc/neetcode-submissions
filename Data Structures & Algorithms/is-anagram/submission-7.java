class Solution {
        public boolean isAnagram(String s, String t)
    {
       Map<Character, Integer> charS = new HashMap<>();
       for(int i = 0; i < s.length(); i++)
        {
            charS.put(s.charAt(i), charS.getOrDefault(s.charAt(i), 0) +1);
        }

        Map<Character, Integer> charT = new HashMap<>();
        for(int i = 0; i < t.length(); i++)
            {
                charT.put(t.charAt(i), charT.getOrDefault(t.charAt(i), 0) +1);
            }

        return charS.equals(charT);
    }
}
