package DSA;

class towerOfHanoi {
    public static void main(String[] args) {
        toh(3, "S", "H", "D");

    }

    public static void toh(int n, String src, String helper, String dest) {
        if (n == 1) {
            System.out.println("Transfer disk" + n + "from" + src + "to" + dest);
            return;
        }
        toh(n - 1, src, dest, helper);
        System.out.println("Transfer disk" + n + "from" + src + "to" + dest);
        toh(n - 1, helper, src, dest);
    }
}