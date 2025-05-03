class Solution {
    static ArrayList<Integer> sieveOfEratosthenes(int n) {
        ArrayList<Integer> PN = new ArrayList<>();
        if (n < 2) {
            return PN;
        }
        boolean[] arr = new boolean[n + 1];
        Arrays.fill(arr, true);
        arr[0] = false;
        arr[1] = false;
        for (int i = 2; i * i <= n; i++) {
            if (arr[i]) {
                for (int j = i * i; j <= n; j += i) {
                    arr[j] = false;
                }
            }
        }
        for (int i = 2; i <= n; i++) {
            if (arr[i]) {
                PN.add(i);
            }
        }
        return PN;
    }
}
