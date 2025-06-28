import java.util.HashMap;                                       //Importing HashMap and Map classes
import java.util.Map;

public class TwoSum {                                           //Main class
    public static int[] twoSum(int[] nums, int target) {        //Method that takes an arry (nums) and a target sum (target)
        Map<Integer, Integer> lookup = new HashMap<>();         //Create a HashMap, "lookup" stores the number in the array and index of the number (Is the number already seen before?)

        for (int i = 0; i < nums.length; i++)                   //For loop conditions
        {
            int complement = target - nums[i];                  //initialize integer complement function, which is target - each number in the array
            if (lookup.containsKey(complement)) {               //Check if complement exists 
                return new int[] {lookup.get(complement), i};   //When i = 1, nums[i] = 7, 2 is already stored at i = 0, the complement between the target (9) and nums[1] = 7 is 2 so [0,1] will return
            }
            lookup.put(nums[i], i);                             //Store the current number and its index in the Lookup map
        }
        return new int[] {};                                    // If no solution is found, return an empty array
    }

    public static void main(String[] args) {                    //Main method
        int[] nums = {2, 7, 11, 15};                            //Define array of integers
        int target = 9;                                         //Define target integer
        int[] result = twoSum(nums, target);                    //Call the method above

        System.out.print("Output: [");                        //Print the result
        for (int i = 0; i < result. length; i++) {
            System.out.print(result[i]);
            if (i < result.length - 1) 
            {
                System.out.print(", ");

            }   
        }
        System.out.print("]");
        System.out.print("Hello!)");
    }
}