import java.util.Arrays;
import java.util.Stack;
public class Queue_Using_Stack_1 {
    static boolean singleelement(int arr[], int n, int x)
    {
        for(int i = 0; i < n; i++){
            for(int j = i+1; j < n; j++){
                if((arr[i]+arr[j]) == x){
                    System.out.println(arr[i]);
                    System.out.println(arr[j]);
                    return true;
                }
            }
        }
        return false;
    }

    // Driver code
    public static void main(String[] args)
    {
        int arr[] = {0, -1, 2, -3, 1};
        int size = arr.length;
        int x = -2;
        System.out.println(singleelement(arr, size, x));
    }
}
