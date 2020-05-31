class Solution {
    public boolean isAnagram(String s, String t) {
        if (s == t) {
            return true;
        }

        if (s == null || t == null) {
            return false;
        }

        if (s.length() != t.length()) {
            return false;
        }

        final int size = 256;
        int [] cntMap = new int[size];
        for (int i = 0; i < s.length(); i++) {
            cntMap[s.charAt(i)]++;
            cntMap[t.charAt(i)]--;
        }

        for (int i = 0; i < size; i++) {
            if (cntMap[i] != 0) {
                return false;
            }
        }
        
        return true;
    }
}
