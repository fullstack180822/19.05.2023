package com.example;

public class Leaf extends Component {

    public Leaf(int size, String name) {
        super(size, name);
    }

    @Override
    public void addChild(Component component) {
        throw new IllegalStateException("leaf cannot execute this function");
    }

    @Override
    public void removeChild(Component component) {
        throw new IllegalStateException("leaf cannot execute this function");
    }

    @Override
    public void enlarge(int enlarge_by) {
        size = size + enlarge_by;
    }

    @Override
    public void display(String space) {
        System.out.println(space + this.name + " [" + size + "]");
    }
}
