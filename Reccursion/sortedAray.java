// check wether the given array is strictly sorted.
package DSA;

public class sortedAray {
    public static void main(String[] args) {
        int arr[] = { 61, 2, 3, 4 };
        sorted(0, arr);
    }

    public static void sorted(int index, int arr[]) {

        if (index == arr.length - 1) {
            System.out.println("The given array is sorted strictly.");
            return;
        }
        if (arr[index] >= arr[index + 1]) {
            System.out.println("The given array is not sorted strictly.");
        } else
            sorted(index + 1, arr);

    }
}
