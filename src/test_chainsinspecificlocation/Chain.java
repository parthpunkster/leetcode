package test_chainsinspecificlocation;

import java.util.List;

public class Chain {
    public String name;
    public int count;

    public Chain(String name, int count){
        this.name = name;
        this.count = count;
    }

    public Chain(){

    }

    @Override
    public String toString(){
        return String.format(name + ":" + count);
    }

}
