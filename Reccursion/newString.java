//remove all the "x" from the given string and add it to the end forming a new string.

public class newString {

    public static void main(String[] args) {
        string("axbcdxefxxg", 0, 0, "");
    }

    public static void string(String str, int index, int count, String newStr) {
        if (str.length() == index) {
            for (int i = 0; i < count; i++) {
                newStr += "x";
            }
            System.out.println(newStr);
            return;
        }
        if (str.charAt(index) == 'x') {
            count += 1;
            string(str, index + 1, count, newStr);
        } else {
            newStr += str.charAt(index);
            string(str, index + 1, count, newStr);
        }
    }
}