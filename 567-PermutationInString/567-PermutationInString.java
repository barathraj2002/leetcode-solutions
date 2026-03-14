// Last updated: 3/14/2026, 11:50:32 AM
class Solution {
    public boolean checkInclusion(String s1, String s2) {
         if (s1.length() > s2.length()) return false; // ✅ Edge case

        int[] fmap1 = new int[26];

        for (int i = 0; i < s1.length(); i++) {
            fmap1[s1.charAt(i) - 'a']--;
        }

        int left = 0, right = 0, count = 0;

        while (right < s2.length()) { // ✅ Fix 1: avoid StringIndexOutOfBounds
            fmap1[s2.charAt(right) - 'a']++;
            count++;
            right++;

            if (count == s1.length()) {
                // ✅ Fix 2: move check to happen before sliding
                boolean bool = true;
                for (int i = 0; i < fmap1.length; i++) {
                    if (fmap1[i] != 0) {
                        bool = false;
                        break;
                    }
                }
                if (bool) return true;

                // ✅ Slide window
                fmap1[s2.charAt(left) - 'a']--;
                count--;
                left++;
            }
        }

        return false;
        }
    }
