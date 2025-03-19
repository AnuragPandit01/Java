import java.util.Scanner;

public class OccurencesArray {
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
        System.out.println("Enter the number to find in the array : ");
        int num = input.nextInt();
        int Occurence = findOccurence(nums, num);
        System.out.println("The number "+ num + " occurs "+ Occurence + " times in the array");

    }
    public static int findOccurence(int[] nums,int num){
        int i =0;
        int count = 0;
        while(i<nums.length){
            if(nums[i] == num){
                count++;
            }
            i++;
        }
        return count;
    }
}
