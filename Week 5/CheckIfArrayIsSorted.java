class Solution {
    public boolean arraySortedOrNot(int[] arr) {
        if(arr.length==1) return true;
        for(int i=1;i<arr.length;i++){
            if(arr[i]<arr[i-1]) return false;
        }
        return true;
    }
}
