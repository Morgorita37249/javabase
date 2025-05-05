package leetcode.arrays;
/*Given a fixed-length integer array arr, duplicate each occurrence of zero, shifting the remaining elements to the right.
Note that elements beyond the length of the original array are not written. Do the above modifications to the input array in place and do not return anything.
*
*Input: arr = [1,0,2,3,0,4,5,0]
Output: [1,0,0,2,3,0,0,4]
Explanation: After calling your function, the input array is modified to: [1,0,0,2,3,0,0,4]
*
* */
public class DuplicateZeros {
    public static void main(String[] args) {
        int [] arr = {1,5,2,0,0,6,8,0,6};
        System.out.println(duplicateZeros(arr).toString());
    }
    public static int[] duplicateZeros(int[] arr) {
        for (int i = 0; i<arr.length;i++){
            if (arr[i]==0) {
                if (i+1>=arr.length || i+2>=arr.length){
                    if (arr[arr.length-1-1] == 0){
                        arr[arr.length-1]=0;
                    }
                    break;
                }
                int next = arr[i + 1];
                int nextnext;
                for (int j = i; j < arr.length - 2; j++) {
                    nextnext=arr[j +2];
                    arr[j+2] = next;
                    next = nextnext;

                }
                arr[i + 1] = 0;
                i+=1;
            }
        }
        return arr;
    }
    public void duplicateZeros2(int[] A) {

        int n = A.length, count = 0;

        for (int num : A) if (num == 0) count++;
        int i = n - 1;
        int write = n + count - 1;

        while (i >= 0 && write >= 0)  {

            if (A[i] != 0) { // Non-zero, just write it in
                if (write < n) A[write] = A[i];

            } else { // Zero found, write it in twice if we can
                if (write < n) A[write] = A[i];
                write--;
                if (write < n) A[write] = A[i];
            }
            i--;
            write--;
        }
    }
}
