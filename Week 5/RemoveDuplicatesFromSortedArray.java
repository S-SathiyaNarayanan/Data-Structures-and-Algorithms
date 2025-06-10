class Solution {
    public int removeDuplicates(int[] arr) {
        // Initialize the New Index (NI) to 1, since the first element is always unique
        int NI = 1;
        // Start looping from the second element (index 1) to the end of the array
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {    // Compare current element with previous element
                // If current element is not equal to previous element, it's a unique element
                arr[NI] = arr[i];    // Assign it to the NI position in the array
                NI++;
            }
        }
        return NI;
    }
}

