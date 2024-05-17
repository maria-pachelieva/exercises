package metodsNakovBookExercise;

public class FirstBigger {
    public static void main(String[] args) {
        int arr[] = new int[]{10,9,8,7,6,5};
        firstElBigger(arr);
    }

    public static void firstElBigger(int arr[]) {
        int number = 0;
        for (int i = 2; i < arr.length; i++) {

            if (arr[i] > arr[i - 1] && arr[i] > arr[i - 2]) {
                number = i;
                break;
            } else if (arr[i] < arr[i - 1] && arr[i] < arr[i - 2]){
                number = -1;
            }
        }
        System.out.println(number);

    }
}
