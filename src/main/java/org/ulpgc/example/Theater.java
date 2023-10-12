package org.ulpgc.example;
import java.io.Serializable;

public class Theater implements Serializable {
    private int capacity;
    private String name;

    public Theater (int capacity, String name) {
        this.capacity = capacity;
        this.name = name;
    }
}
