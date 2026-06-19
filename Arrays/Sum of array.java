/*
Input: arr[] = [1, 2, 3, 4]
Output: 10
Explanation: 1 + 2 + 3 + 4 = 10.
*/

class Solution {
    public int arraySum(int arr[]) {
        // code here
        int n = arr.length;
        int sum = 0;
        for(int i = 0;i<n;i++){
            sum += arr[i];
        }
        return sum;
    }
}
