class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        
        // init
        int n = s.length(), ans = 0;
        
        Map<Character, Integer> map = new HashMap<>();
        
        // try to extend the range of [i, j]
        
        for(int j = 0, i = 0; j < n; j++) {
            
            
            if(map.containsKey(s.charAt(j))) {
                i = Math.max(map.get(s.charAt(j)) + 1, i);
            }
            
            ans = Math.max(ans, j - i + 1);
            map.put(s.charAt(j), j);
        }
        
        return ans;
        
    }
}
