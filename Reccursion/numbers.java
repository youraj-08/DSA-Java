package DSA.Reccursion;

public class numbers {
    public static void main(String[] args) {
        printNumbers(1);
    }

    public static void printNumbers(int n) {
        if (n == 5) {
            System.out.println("5");
            return;
        } else
            System.out.println(n); 
        printNumbers(n + 1);

    }

}
