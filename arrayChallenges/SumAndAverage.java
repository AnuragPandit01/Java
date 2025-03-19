import java.util.Scanner;

public class SumAndAverage {
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
        long sum = sum(nums);
        int avg = average(nums);
        System.out.println("sum of the numbers is : "+ sum);
        System.out.println("Average of the numbers is : "+ avg);
    }
    public static long sum(int[] nums){
        long sum = 0 ;
        int i = 0;
        while(i<nums.length){
            sum += nums[i];
            i++;
        }
        return sum;
    }   

    public static int average(int[] nums){
        long sum = sum(nums);
        return(int) (sum/nums.length);
    }
}
