package org.ababup1192;

public class Tool {
    private final String name;
    public Tool(String name){
        this.name = name;
    }

    @Override
    public String toString(){
        return "[" + name + "]";
    }
}
