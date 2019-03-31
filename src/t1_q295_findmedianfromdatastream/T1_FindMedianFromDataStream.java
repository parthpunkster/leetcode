package t1_q295_findmedianfromdatastream;

public class T1_FindMedianFromDataStream {
    public static void main(String[] args){
        MedianForStream_UsingArray stream = new MedianForStream_UsingArray();
        stream.addElement_UsingBinarySearch(5);
        stream.addElement_UsingBinarySearch(5);
        stream.addElement_UsingBinarySearch(5);
        stream.addElement_UsingBinarySearch(5);
        stream.addElement_UsingBinarySearch(7);
        stream.addElement_UsingBinarySearch(7);
        stream.addElement_UsingBinarySearch(7);
        stream.addElement_UsingBinarySearch(5);
        stream.addElement_UsingBinarySearch(5);
        System.out.println(stream.getMedian());

//        for (int i = 1; i < 1000; i++){
//            stream.addElement(i);
//            i++;
//            stream.addElement(i);
//            System.out.println(stream.getMedian());
//            stream.addElement(++i);
//            System.out.println(stream.getMedian());
//        }



    }
}
