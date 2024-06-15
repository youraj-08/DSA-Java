//remove all the duplicate characters from the string.

public class duplicate {
    public static void main(String[] args) {
        removeDublicates("ababccddeabcd", 0, "");
    }

    public static boolean[] map = new boolean[26];

    public static void removeDublicates(String str, int index, String newStr) {
        
        if (index == str.length()) {
            System.out.println(newStr);
            return;
        }

        char currentStr = str.charAt(index);

        if (map[currentStr - 'a'] == true) {
            removeDublicates(str, index + 1, newStr);
        } else {
            newStr += currentStr;
            map[currentStr - 'a'] = true;
            removeDublicates(str, index + 1, newStr);
        }

    }

}
