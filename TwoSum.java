import java.util.*;

public class TwoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many numbers you want inside an array: ");
        int arraySize = sc.nextInt();
        int[] nums = new int[arraySize];
        int index = 0;
        System.out.println("");
        while (index < arraySize) {
            System.out.print("Enter number " + (index + 1) + ": ");
            int num = sc.nextInt();
            nums[index] = num;
            index++;
            System.out.println("");
        }
        System.out.println("All numbers received.");
        System.out.print("Enter the target: ");
        int target = sc.nextInt();
        System.out.println("Array Size is: " + arraySize);
        System.out.println("Array is: " + Arrays.toString(nums));
        System.out.println("Target is: " + target);
        System.out.println("Fetching Possible Outcomes...");
        System.out.println(PossibleOutcomes(nums, target));
        System.out.println("Fetching Outcomes Index...");
        System.out.println(OutcomesIndexes(nums, target));
        sc.close();
    }

    public static ArrayList<ArrayList<Integer>> PossibleOutcomes(int[] nums, int target) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int sum = nums[i] + nums[j];
                if (sum == target) {
                    result.add(new ArrayList<Integer>(Arrays.asList(nums[i], nums[j])));
                }
            }
        }
        return result;
    }

    public static ArrayList<ArrayList<Integer>> OutcomesIndexes(int[] nums, int target) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int sum = nums[i] + nums[j];
                if (sum == target) {
                    result.add(new ArrayList<Integer>(Arrays.asList(i, j)));
                }
            }
        }
        return result;
    }
}
