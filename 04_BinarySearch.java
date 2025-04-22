import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter number: ");
        int data = scn.nextInt();
        System.out.println("======================");
        
        int[] arr = {1, 2, 4, 5, 6, 7, 8, 9};
        boolean result = bs(arr, data);
        
        System.out.println(result == true ? "Data Found!" : "Not Found!");
    }
    
    public static boolean bs(int[] arr, int data) {
        int left = 0, right = arr.length - 1;
        
        while(left <= right) {
            int mid = (left + right) / 2;
            
            if(arr[mid] == data) {
                return true;
            } else if(arr[mid] < data) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        
        return false;
    }
}
