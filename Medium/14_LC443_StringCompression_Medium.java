class Solution {
    public int compress(char[] chars) {

        int index = 0;
        int i = 0;

        while (i < chars.length) {

            char current = chars[i];
            int count = 0;

            while (i < chars.length &&
                   chars[i] == current) {

                count++;
                i++;
            }

            chars[index++] = current;

            if (count > 1) {

                String number = String.valueOf(count);

                for (int j = 0; j < number.length(); j++) {
                    chars[index++] = number.charAt(j);
                }
            }
        }

        return index;
    }
}
