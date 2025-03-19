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
    }
}
