/*************************************************************************************************************
💎LeetCode 412 - Fizz Buzz
🪙GeeksforGeeks - Fizz Buzz
Fizz Buzz Problem involves that given an integer n, for every integer 0 < i <= n, the task is to output,
"FizzBuzz" if i is divisible by 3 and 5,
"Fizz" if i is divisible by 3,
"Buzz" if i is divisible by 5,
"i" as a string, if none of the conditions are true.
Return an array of strings.
Input: n = 20
Output: [“1”, “2”, “Fizz”, “4”, “Buzz”, “Fizz”, “7”, “8”, “Fizz”, “Buzz”, “11”, “Fizz”, “13”, “14”, “FizzBuzz”,
“16”, “17”, “Fizz”, “19”, “Buzz”]
*************************************************************************************************************/

class Solution {
    public static ArrayList<String> fizzBuzz(int n) {
        // code here
        ArrayList<String> list = new ArrayList<>();
        for(int i=1;i<=n;i++){
            if(i%3==0 && i%5==0){
                list.add("FizzBuzz");
            }else if(i%3==0){
                list.add("Fizz");
            }else if(i%5==0){
                list.add("Buzz");
            }else{
                list.add(String.valueOf(i));
            }
        }
        return list;
    }
}
