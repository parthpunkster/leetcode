package leetcode_amazon;

public class ListNodeWithRandomPointer {
    int value;
    ListNodeWithRandomPointer next;
    ListNodeWithRandomPointer random;

    public ListNodeWithRandomPointer(){

    }

    public ListNodeWithRandomPointer(int value, ListNodeWithRandomPointer next, ListNodeWithRandomPointer random){
        this.value = value;
        this.next = next;
        this.random = random;
    }
}
