public class CheckIfNAndItsDoubleExist_1346 {

    public boolean checkIfExist(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = arr.length - 1; j > 0; j--) {
                if ((arr[i] == (arr[j] * 2) || (arr[i] * 2) == arr[j]) && i != j) {
                    return true;
                }
            }
        }
        return false;
    }
}
