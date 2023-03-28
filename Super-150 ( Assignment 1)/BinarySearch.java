public class BinarySearch{
    public static int search(int[] arr , int k){
        int start = 0;
        int end = arr.length;
        while(start<=end){
            int mid = (start+end)/2;
            if(arr[mid] == k) return mid;
            else if(arr[mid]>k) end = mid-1;
            else start = mid+1;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,5,6,7,8,8,12,45,677,777};
        System.out.println(search(arr, 8));
    }
}