package Backtracking;
// Print all the possbile permutations of the given string.

public class permutations {

    public static void stringPerm(String str, String perm) {

        if (str.length() == 0) {
            System.out.println(perm);
        }

        for (int i = 0; i < str.length(); i++) {
            char currentCh = str.charAt(i);
            String newStr = str.substring(0, i) + str.substring(i + 1);
            stringPerm(newStr, perm + currentCh);
        }
    }

    public static void main(String[] args) {
        stringPerm("abc", "");
    }
}
