public class RecursiveBinarySearch {
    public static int binarySearch(int arr[], int target, int low, int high){
        if(low<=high){
            int mid = low+(high-low)/2;
            if(arr[mid] == target){
                return mid;
            }
            else if(arr[mid] > target){
                return binarySearch(arr, target, low, mid-1);
            }
            else{
                return binarySearch(arr, target, mid+1, high);
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int arr[] = {1,2,3,4,5,6,7,8,9};
        int target = 2;
        System.out.println(binarySearch(arr, target, 0, arr.length-1));
    }
}
