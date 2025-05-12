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


// HybridMergeSort (Bottom-Up iterative with RUN=16)
public class Solution {
    private static final int RUN = 16;
    public static void sort(int[] arr) {
        if (arr == null || arr.length < 2) return;
        int n = arr.length;
        int[] tmp = new int[n];
        // Pre-sort small runs with insertion sort
        for (int start = 0; start < n; start += RUN) {
            insertionSort(arr, start, Math.min(start + RUN - 1, n - 1));
        }
        // Bottom-up merging
        for (int width = RUN; width < n; width <<= 1) {
            for (int left = 0; left < n; left += 2 * width) {
                int mid = Math.min(left + width, n);
                int right = Math.min(left + 2 * width, n);
                // Skip merge if already ordered
                if (mid < right && arr[mid - 1] > arr[mid]) {
                    merge(arr, left, mid, right, tmp);
                } else {
                    // Copy to temp if no merge needed
                    System.arraycopy(arr, left, tmp, left, right - left);
                }
            }
            // Copy merged blocks back to original array
            System.arraycopy(tmp, 0, arr, 0, n);
        }
    }
    private static void insertionSort(int[] a, int l, int r) {
        for (int i = l + 1; i <= r; i++) {
            int key = a[i], j = i - 1;
            while (j >= l && a[j] > key) {
                a[j + 1] = a[j--];
            }
            a[j + 1] = key;
        }
    }
    private static void merge(int[] a, int l, int mid, int r, int[] tmp) {
        int i = l, j = mid, k = l;
        while (i < mid && j < r) {
            tmp[k++] = a[i] <= a[j] ? a[i++] : a[j++];
        }
        // Copy remaining elements
        if (i < mid) System.arraycopy(a, i, tmp, k, mid - i);
        if (j < r) System.arraycopy(a, j, tmp, k, r - j);
    }
}
