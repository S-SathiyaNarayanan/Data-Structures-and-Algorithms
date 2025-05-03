/*************************************************************************************************************
Write a program that gets n as input and print all the prime numbers till that number.
Input:
n = 11
Output:
2 3 5 7 11
*************************************************************************************************************/
class Solution {
    public int countPrimes(int n) {
        int count=0;
        ArrayList<Integer> PN=new ArrayList<>();
        if(n<2) return count;
        boolean[] arr=new boolean[n+1];
        Arrays.fill(arr,true);
        arr[0]=false;
        arr[1]=false;
        for(int i=2;i*i<=n;i++){
            if(arr[i]){
                for(int j=i*i;j<=n;j=j+i){
                    arr[j]=false;
                }
            }
        }
        for(int i=2;i<n;i++){
            if(arr[i]) count++;
        }
        return count;
    }
}
