package metodsNakovBookExercise;

public class FirstBigger {
    public static void main(String[] args) {
        int arr[] = new int[]{1, 6, 0, 2, 5, 7, 23, 23, 6, 2, 3, 5, 1, 1, 2};
        firstElBigger(arr);
    }

    public static void firstElBigger(int arr[]) {
        int number = 0;
        for (int i = 2; i < arr.length; i++) {

            if (arr[i] > arr[i - 1] && arr[i] > arr[i - 2]) {
                number = i;
                break;
            }
        }
        System.out.println(number);

    }
}
