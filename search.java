public class search {

    //MÅ BRUKE EN ANNEN DATASTRUKTUR FOR Å SØKE GJENNOM ARRAYEN

    private static int[] arr = {4, 2, 7, 6, -3, -1, -2, 42, 0, -42, 9, -4, 5, -5, -6, -7, -8, -99, 42, 11, 20, 1, 2, 3};
    public static void main(String[] args) {
        //printSubaraysAddToZero(arr);
        printPairsAddToZero(arr);
    }

    //naive, O(n^2)
    public static void printSubaraysAddToZero(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];

                if (sum == 0) {
                    System.out.println("["+ i + "..." + j +"]");
                }
            }
        }
    }
    //naive, O(n^2)
    public static void printPairsAddToZero(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if ((arr[i] + arr[j]) == 0) {
                    System.out.println(arr[i] + " + " + arr[j] + " = 0");
                }
            }
        }
    }
    public static void printLocationLargestAndSmallestNum(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if ((arr[i] + arr[j]) == 0) {
                    System.out.println(arr[i] + " + " + arr[j] + " = 0");
                }
            }
        }
    }
}
