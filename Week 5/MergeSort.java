// Top-Down Recursive with Insertion Sort (Threshold=7)
class Solution {
    private static final int INSERTION_THRESHOLD = 7;
    void mergeSort(int[] arr, int l, int r) {
        if (arr.length == 0) return;
        int[] temp = new int[arr.length];
        mergeSortHelper(arr, l, r, temp);
    }
    private void mergeSortHelper(int[] arr, int l, int r, int[] temp) {
        if (l < r) {
            // Use insertion sort for small subarrays
            if (r - l <= INSERTION_THRESHOLD) {
                insertionSort(arr, l, r);
                return;
            }
            
            int m = l + (r - l) / 2;
            mergeSortHelper(arr, l, m, temp);
            mergeSortHelper(arr, m + 1, r, temp);
            
            // Skip merge if already sorted
            if (arr[m] > arr[m + 1]) {
                merge(arr, l, m, r, temp);
            }
        }
    }
    private void insertionSort(int[] arr, int l, int r) {
        for (int i = l + 1; i <= r; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= l && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }
    private void merge(int[] arr, int l, int m, int r, int[] temp) {
        System.arraycopy(arr, l, temp, l, r - l + 1);
        int i = l, j = m + 1, k = l;
        while (i <= m && j <= r) {
            arr[k++] = temp[i] <= temp[j] ? temp[i++] : temp[j++];
        }
        // Bulk copy remaining elements
        if (i <= m) System.arraycopy(temp, i, arr, k, m - i + 1);
        else System.arraycopy(temp, j, arr, k, r - j + 1);
    }
}
