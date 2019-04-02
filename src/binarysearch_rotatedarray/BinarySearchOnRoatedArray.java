package binarysearch_rotatedarray;

public class BinarySearchOnRoatedArray {
    public static int binarySearch(int[] array, int s, int e, int value){
        int mid = s + (e-s)/2;
        if (array[mid] == value) return mid;
        if (value >= array[s] && value> array[mid]) {
            return binarySearch(array,s,mid-1,value);
        }
        return binarySearch(array,mid+1,e,value);
    }


    public static void main(String args[]){
        int[] array = new int[]{6,7,1,2,3,4,5};
        System.out.println(binarySearch(array,0,array.length-1,7));
    }
}
