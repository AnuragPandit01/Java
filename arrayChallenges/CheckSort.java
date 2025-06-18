import java.util.Scanner;
// This program checks if an array of integers is sorted in increasing or decreasing order.
public class CheckSort {
        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please input the numbers to check if they are sorted: ");
        System.out.print("Enter the number of elements : ");
        int size = input.nextInt();
        int[] nums = new int[size];
        int i = 0;
        while(i<size){
            System.out.print("Enter the number no " + (i+1) + ": ");
            nums[i] = input.nextInt();
            i++;
        }
        if(size == 0){
            System.out.println("The array is empty.");
        }else if(size == 1){
            System.out.println("The array is sorted in increasing order.");
        }else{
            // Check if the array is sorted in increasing or decreasing order
            // by using the isIncreasing and isDecreasing methods.
            // If the array is sorted in either order, print the result.
            // If the array is not sorted, print that it is not sorted.
            // The methods are called in the main method.
            // The methods are defined below the main method.

            boolean isInc = isIncreasing(nums);
            boolean isDec = isDecreasing(nums);
            if(isInc || isDec){
                System.out.println("The array is sorted in " + (isInc ? "increasing" : "decreasing") + " order.");
            }else{
                System.out.println("The array is not sorted.");
            }
        }
    }
    public static boolean isDecreasing(int[] nums){
        int i = 1;
        while (i<nums.length){
            if(nums[i] > nums[i-1]){
                return false;
            }
            i++;
        }
        return true;
    }
    public static boolean isIncreasing(int[] nums){
        int i =1;
        while (i<nums.length){
            if(nums[i] < nums[i-1]){
                return false;
            }
            i++;
        }
        return true;
    }
}