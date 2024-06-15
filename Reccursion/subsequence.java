// Print all the subsequences of the given String.

public class subsequence {

    public static void subStr(String str, int index, String newStr) {

        if (str.length() == index) {
            System.out.println(newStr);
            return;
        }

        char currentChar = str.charAt(index);

        // When the char decides to join in.
        subStr(str, index + 1, newStr + currentChar);

        // When the char doesnot join in.
        subStr(str, index + 1, newStr+"_");

    }

    public static void main(String[] args) {
        subStr("abc", 0, "");
    }
}
