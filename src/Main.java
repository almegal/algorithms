// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        final long startTime = System.nanoTime();
        // test binary and dump searching
        long[] array = new long [99999999];
        for (int i = 0; i < array.length ; i++) {
            array[i] = i + 1;
        }

        dumpSearching(99999999, array);
        binarySearching(99999999, array);

        final long duration = System.nanoTime() - startTime;
        System.out.println(duration/100000000);
    }

    public static void dumpSearching (int n, long[] array) {
        for (int i = 0; i < array.length; i++) {
            if(n == array[i]) {
                System.out.println("dumpSearching function founded element");
            }
        }
    }

    public static void binarySearching (int n, long[] array) {
        boolean flag = true;
        int low = 0;
        int high = array.length - 1;
        while (flag) {
            int mid = (low + high)/2;
            if (array[mid] == n) {
                flag = false;
                System.out.println("binariFunction founded element");
                break;
            } else if (array[mid] < n ){
                low = mid + 1;
            } else if (array[mid] > n) {
                high = mid - 1;
            } else {
                flag = false;
            }
        }
    }
}