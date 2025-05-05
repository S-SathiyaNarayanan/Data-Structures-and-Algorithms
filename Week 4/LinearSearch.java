import java.util.Scanner;
public class Main{
    static int LinearSearch(int[] array,int value){
        for(int i=0;i<array.length;i++){
            if(array[i]==value) return i;    
        }
        return -1;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[]{1,3,6,10,15,21,28,36,45,55};
        System.out.print("Enter the value to find in the array: ");
        int n=sc.nextInt();
        int Index=LinearSearch(arr,n);
        if(Index>=0) {
            System.out.println("The Index of the value in the array is "+Index);
        }else {
            System.out.println("The value is not found in the array");
        }
        sc.close();
    }
}
