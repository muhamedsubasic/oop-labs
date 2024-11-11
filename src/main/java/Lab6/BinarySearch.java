package Lab6;

public class BinarySearch {
    public static boolean search(int[] array, int searchedValue){
        int num = 0;
        int length = array.length - 1;
        while (num <= length){
            int check = num + (length-num) / 2;
            if (array[check] == searchedValue){
                return true;
            }
            if (array[check] < searchedValue){
                num = check + 1;
            } else {
                length = check - 1;
            }
        }
        return false;
    }
}
