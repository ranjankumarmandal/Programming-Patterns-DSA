class Solution {
    public int searchInsert(int[] arr, int data) {
        int left = 0, right = arr.length - 1;

        while(left <= right) {
            int mid = (left + right) / 2;

            if(arr[mid] == data) {
                return mid;
            } else if(arr[mid] < data) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }


        return left;
    }
}
