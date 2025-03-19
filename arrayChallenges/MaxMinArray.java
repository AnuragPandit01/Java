import java.util.Scanner;

public class MaxMinArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the number of elements : ");
        int size = input.nextInt();
        int[] nums = new int[size];
        int i = 0;
        while(i<size){
            System.out.print("Enter the number no " + (i+1) + ": ");
            nums[i] = input.nextInt();
            i++;
        }
        int max = max(nums);
        int min = min(nums);
        System.out.println("The maximum number in the array is : "+ max);
        System.out.println("The minimum number in the array is : "+ min);
    }
    public static int max(int[]nums){
        if(nums.length == 0){
            return Integer.MIN_VALUE;
        }
        int max = nums[0];
        int i = 0;
        while(i<nums.length){
            if(max<nums[i]){
                max = nums[i];
            }
            i++;
        }
        return max;
    }
    public static int min(int[]nums){
        int min = Integer.MAX_VALUE;
        int i =0;
        while(i<nums.length){
            if(min>nums[i]){
                min = nums[i];
            }
            i++;
        }
        return min;
    }
}
