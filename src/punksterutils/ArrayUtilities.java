package punksterutils;

public class ArrayUtilities {
    public static void printArray(int[] array){
        for (int k: array){
            System.out.println(k);
        }
    }

    public static int indexOfMin(int[] array){
        int min = array[0];
        int index = 0;
        for (int i =1; i < array.length; i++){
            if (array[i] < min){
                min = array[i];
                index = i;
            }
        }
        return index;
    }

    public static int indexOfMax(int[] array){
        int max = array[0];
        int index = 0;
        for (int i = 1; i< array.length;i++){
            if (array[i] > max){
                max = array[i];
                index = i;
            }
        }
        return index;
    }

    public static int min(int[] array){
        int min = array[0];
        for (int i = 1; i<array.length; i++){
            if (array[i] < min){
                min = array[i];
            }
        }
        return min;
    }

    public static int max(int[] array){
        int max = array[0];
        for (int i = 1; i<array.length; i++){
            if (array[i] > max){
                max = array[i];
            }
        }
        return max;
    }
}
