package com.example;

import lombok.Getter;

import java.util.ArrayList;

public abstract class Component {

    // Leaf
    // Composite -- container

    @Getter
    protected int size;

    @Getter
    protected String name;

    public Component(int size, String name) {
        this.size = size;
        this.name = name;
    }

    public abstract void addChild(Component component);

    public abstract void removeChild(Component component);

    public abstract void enlarge(int enlarge_by); // operation

    public abstract void display(String space); // operation

}
