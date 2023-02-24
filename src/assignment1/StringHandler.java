package assignment1;

public class StringHandler {

    /**
     * 
     * @param str
     * @return a string where all characters 'c' is replaced by the character 's'
     * Case insensitive.
     */
    public String stringManipulation(String str) {
        //TODO Delete line below, and implement this method
        char[] charArr = str.toCharArray();
        for (int i = 0; i < charArr.length; i++) {
            if (charArr[i] == 'c' || charArr[i] == 'C') {
                charArr[i] = 's';
            }
        }
        String string = new String(charArr);
        return string;
    }

    /**
     * 
     * @param str
     * @return the length of str
     * If the input str is null or "" you must return 0
     * 
     */
    public int stringLength(String str) {
        //TODO Delete line below, and implement this method
        String string = str;
        if (string == null){
            return 0;
        } else if (string == ""){
            return 0;
        } else {
            return string.length();
        }

    }

    /**
     * 
     * @param arr
     * @return the cumulative length of all strings in arr
     * e.g. if arr is ["hi","hello","hej"] the method should return 10
     */
    public int stringArrayLength(String[] arr) {
        //TODO Delete line below, and implement this method
        int cumulateiveLength = 0;

        for (String str : arr) {
            cumulateiveLength += str.length();
        }
        return cumulateiveLength;
    }

    /**
     * 
     * @param str
     * @return reverse the characters in the String str
     * e.g. "Hello" -> "olleH"
     */
    public String stringReverse(String str) {
        //TODO Delete line below, and implement this method
        String reverseStr = "";

        for (int i = str.length() - 1; i >= 0 ; i--) {
            reverseStr += str.charAt(i);
        }
        return reverseStr;
    }

    /**
     * 
     * @param str any string
     * @param c the character to count
     * @return how many occurences of the character c in the String str
     * The method should not be case sensitive.
     * e.g. parameters: "Change comes through passion", 'g' should return 2
     */
    public int charCount(String str, char c) {
        //TODO Delete line below, and implement this method
        int amountOfChar = 0;

        String string = str.toLowerCase();
        char ch = Character.toLowerCase(c);
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == ch){
                amountOfChar++;
            }
        }
        return amountOfChar;
    }

    /**
     * Returns a string that contains exactly the amount of chars c, as stated by the given amount. So if amount => 4 and
     * char => c then the return value must be "cccc". If amount => 3 and c => X then the return value must be "XXX".
     *
     * @param amount The amount of chars in the return string
     * @param c      The chars the return string must consist of
     * @return The string created using the given parameters.
     */
    public String stringOfChars(int amount, char c) {
        //TODO Delete line below, and implement this method
        String str = "";
        for (int i = 0; i < amount; i++) {
            str += c;
        }
        return str;
    }
}
