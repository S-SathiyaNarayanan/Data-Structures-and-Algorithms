class Solution {
    public boolean arraySortedOrNot(int[] arr) {
        if(arr.length==1) return true;
        for(int i=1;i<arr.length;i++){
            if(arr[i-1]>arr[i]){
                return false;
            }
        }
        return true;
    }
}
