class Solution {
    public int romanToInt(String s) {

        int[] values = {
            1000, 500, 100, 50,
            10, 5, 1
        };

        String[] roman = {
            "M", "D", "C", "L",
            "X", "V", "I"
        };

        int result = 0;

        for (int i = 0; i < s.length(); i++) {

            int current = 0;
            int next = 0;

            for (int j = 0; j < roman.length; j++) {

                if (s.charAt(i) == roman[j].charAt(0)) {
                    current = values[j];
                }

                if (i + 1 < s.length() &&
                    s.charAt(i + 1) == roman[j].charAt(0)) {
                    next = values[j];
                }
            }

            if (current < next) {
                result = result - current;
            } else {
                result = result + current;
            }
        }

        return result;
    }
}