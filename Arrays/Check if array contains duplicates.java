/*
Input: arr = [4, 5, 6, 4]
Output: true
Explaination: 4 is the duplicate value.
  */
class Solution {
    public boolean checkDuplicates(int arr[]) {
        // Code here
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0;i<arr.length;i++){
            if(set.contains(arr[i])){
                return true;
            }
            set.add(arr[i]);
        }
        return false;
    }
}
