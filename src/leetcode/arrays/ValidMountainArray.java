package leetcode.arrays;

public class ValidMountainArray {
    public static void main(String[] args) {
        int [] nums = {2,1};
        System.out.println(validMountainArray(nums));
    }
    public static boolean validMountainArray(int[] arr) {
        int i = 0;
        while(i + 1< arr.length && arr[i]<arr[i+1]){
            i++;
        }
        if (i==arr.length-1 || i==0 ) return false;
        while(i + 1< arr.length && arr[i]>arr[i+1]){
            i++;
        }
        if (i==arr.length-1) return true;
        return false;
    }
}
