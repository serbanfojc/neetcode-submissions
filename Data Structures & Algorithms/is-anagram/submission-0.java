class Solution {
    public boolean isAnagram(String s, String t) 
    {
        Map<Character, Integer> anagramS = new HashMap<>();
        for(int i = 0; i < s.length(); i++)
            {
                char c = s.charAt(i);
                anagramS.put(c, anagramS.getOrDefault(c, 0)+1);
            }

        Map<Character, Integer> anagramT = new HashMap<>();
        for(int j = 0; j < t.length(); j++)
            {
                char d = t.charAt(j);
                anagramT.put(d, anagramT.getOrDefault(d, 0) +1);
            }

            return anagramS.equals(anagramT);
    }
}
