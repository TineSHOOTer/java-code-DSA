import java.io.BufferedReader;
import java.util.Scanner;
public class SumOfTwoNumbers {
    public static void main(String[] args){
        SumOfTwoNumbers obj = new SumOfTwoNumbers();

        // Define an array of integers and a target sum
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        // Call the twoSum method and store the result
        int[] result = obj.twoSum(nums, target);

        // Output the result
        System.out.println("Indices: [" + result[0] + ", " + result[1] + "]");
    }
        public int[] twoSum(int[] nums, int target) {
            int[] arr= new int[2];
            int num1=0;
            int num2=0;
            int sum=0;
            for(int i=0;i<nums.length;i++){
                for(int j=i+1;j<nums.length;j++){
                    num1=nums[i];
                    num2= nums[j];
                    sum= num1+num2;
                    if(sum == target){
                        arr[0]=i;
                        arr[1]=j;
                    }
                }

            }
            return arr;
        }
    }


