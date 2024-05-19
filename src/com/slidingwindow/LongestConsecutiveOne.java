package com.slidingwindow;

public class LongestConsecutiveOne {
        public static int longestConsecutiveOnes(String A) {
            int maxLen = 0;
            int count1 = 0;
            int count0 = 0;
            int left = 0;

            for (int right = 0; right < A.length(); right++) {
                char ch = A.charAt(right);

                if (ch == '1') {
                    count1++;
                } else {
                    count0++;
                }

                if (count0 > 1) {
                    if (A.charAt(left) == '1') {
                        count1--;
                    } else {
                        count0--;
                    }
                    left++;
                }

                int windowLen = count1 + count0;
                maxLen = Math.max(maxLen, windowLen);
            }

            return maxLen;
        }

        public static void main(String[] args) {
            String A1 = "111000";
            int result1 = longestConsecutiveOnes(A1);
            System.out.println(result1); // Output: 3

            String A2 = "111011101";
            int result2 = longestConsecutiveOnes(A2);
            System.out.println(result2); // Output: 7

            String A3 = "0000";
            int result3 = longestConsecutiveOnes(A3);
            System.out.println(result3); // Output: 0
        }
    }


