class Solution {
    public int removeDuplicates(int[] arr) {
        int NI = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                arr[NI] = arr[i];
                NI++;
            }
        }
        return NI;
    }
}

