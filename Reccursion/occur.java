// First and last occurence of the given character in the String provided.


public class occur {

    public static int first = -1;
    public static int last = -1;

    public static void falo(int index, String str, char ch) {
        if (index == str.length() - 1) {
            System.out.println(first);
            System.out.println(last);
            return;
        }
        if (ch == str.charAt(index)) {
            if (first == -1) {
                first = index;
            } else {
                last = index;
            }
        }
        falo(index + 1, str, ch);
    }

    public static void main(String[] args) {
        falo(0, "abaacdaefaah", 'a');
    }
}
