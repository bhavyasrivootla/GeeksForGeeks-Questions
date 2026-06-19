/*
Input: arr[] = [10, 20, 10, 5, 15]
Output: [10, 30, 40, 45, 60]
Explanation: For each index i, add all the elements from 0 to i:
prefixSum[0] = 10, 
prefixSum[1] = 10 + 20 = 30, 
prefixSum[2] = 10 + 20 + 10 = 40 and so on.
*/

class Solution {
    public ArrayList<Integer> prefSum(int[] arr) {
        // code here
        int n = arr.length;
        //creating new arraylist
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(arr[0]);
        for(int i = 1;i<n;i++){
            ans.add(ans.get(i-1) + arr[i]);
        }
        return ans;
    }
}
