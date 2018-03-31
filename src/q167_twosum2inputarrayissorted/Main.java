package q167_twosum2inputarrayissorted;

public class Main {

    public static int[] twoSum(int[] numbers, int target) {
        int[] index = new int[2];
        if (numbers.length <2 ){
            return index;
        }
        int start = 0;
        int end = numbers.length-1;
        while(start < end){
            if (numbers[start] + numbers[end] == target){
                index[0] = start;
                index[1] = end;
                break;
            }
            else if (numbers[start] + numbers[end] > target){
                end--;
            }
            else{
                start++;
            }
        }
        return index;

    }

    public static void main(String[] args){
        int[] array= new int[]{2,3,4};
        punksterutils.ArrayUtilities.printArray(twoSum(array,6));

    }
}
