class Solution {
    ArrayList<Integer> removeDuplicates(int[] arr) {
        ArrayList<Integer> ans = new ArrayList<>();

        if (arr.length == 0) {
            return ans;
        }

        int i = 0;

        for (int j = 1; j < arr.length; j++) {
            if (arr[j] != arr[i]) {
                i++;
                arr[i] = arr[j];
            }
        }

        // Add unique elements to ArrayList
        for (int k = 0; k <= i; k++) {
            ans.add(arr[k]);
        }

        return ans;
    }
}
