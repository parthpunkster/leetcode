package t1_q295_findmedianfromdatastream;

import punksterUtils_new.ArrayUtils;

import java.util.Arrays;

public class MedianForStream_UsingArray {
    private float median;
    private int count;
    private int[] array;

    public MedianForStream_UsingArray(){
        array = new int[100];
        Arrays.fill(array,Integer.MAX_VALUE);
        count = 0;
    }

    // 1234567
    // 6712345
    public int binarySearch_helper(int[] array,int start,int end,int value){
        if (start >= end){
            return value >= array[start] ? ++start : start;
        }

        int mid = start + (end-start) / 2;
        if (value >= array[mid]) return binarySearch_helper(array,mid+1,end,value);
        return binarySearch_helper(array,start,mid-1,value);
    }

    public void shiftArraybyOneFromk(int k,int count){
        for (int i = count-1; i>=k;i--){
            array[i+1] = array[i];
        }
    }

    public void addElement_UsingSort(int val){
        if (array.length == count){
            int[] tmp = new int[array.length*2];
            Arrays.fill(tmp,Integer.MAX_VALUE);
            System.arraycopy(array,0,tmp,0,array.length);
            array = tmp;
        }
        array[count] = val;
        count++;
        Arrays.sort(array);
        if (count%2 == 0 && count != 1){
            median = ((float)array[count/2] + (float) array[(count/2)-1]) / 2;
        }
        else {
            median = (float) array[count/2];
        }
    }

    public void addElement_UsingBinarySearch(int val){
        if (array.length == count){
            int[] tmp = new int[array.length*2];
            Arrays.fill(tmp,Integer.MAX_VALUE);
            System.arraycopy(array,0,tmp,0,array.length);
            array = tmp;
        }
        count++;

        int pos = binarySearch_helper(array, 0, count - 1, val);
        shiftArraybyOneFromk(pos, count);
        array[pos] = val;
        if (count%2 == 0 && count != 1){
            median = ((float)array[count/2] + (float) array[(count/2)-1]) / 2;
        }
        else {
            median = (float) array[count/2];
        }
    }

    public float getMedian(){
        return median;
    }
}
