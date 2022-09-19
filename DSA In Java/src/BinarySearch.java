public class BinarySearch {
    public static void main(String args[]){
        int[] arr = {1,2,3,5,6,7,10,11,12,15,20};
        int target = 11;
        System.out.println(question2(arr,target));
    }
    //binary search first question
    static int question(int[] arr,int target){
        int start = 0;
        int end = arr.length - 1;

        while(start<=end){
            int mid = start + (end - start) / 2;
            if(target < arr[mid]){
                end = mid - 1;
            }
            else if(target > arr[mid]){
                start = mid + 1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
    //algorithm for when you don't know the order
    static int question2(int[] arr,int target){
        int start = 0;
        int end = arr.length - 1;
        boolean isAc = arr[start]<arr[end];
        while(start<=end){
            int mid = start + (end - start) / 2;
            if(target==arr[mid]){
                return mid;
            }
            if(isAc){
                if(target < arr[mid]){
                    end = mid - 1;
                }
                else{
                    start = mid + 1;
                }
            }
            else{
                if(target > arr[mid]){
                    end = mid - 1;
                }
                else{
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
