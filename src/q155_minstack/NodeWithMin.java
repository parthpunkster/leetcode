package q155_minstack;

import punksterutils.Node;

public class NodeWithMin {
    int min;
    int value;
    NodeWithMin next;

    public NodeWithMin(int value,int min){
        this.min = min;
        this.value = value;
    }
}
