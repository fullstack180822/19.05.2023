package com.example;

import java.util.ArrayList;

public class Composite extends Component {

    private ArrayList<Component> childs = new ArrayList<>();

    public Composite(int size, String name) {
        super(size, name);
    }

    @Override
    public void addChild(Component component) {
        childs.add(component);
    }

    @Override
    public void removeChild(Component component) {
        childs.remove(component);
    }

    @Override
    public void enlarge(int enlarge_by) {
        size = size + enlarge_by;
        for (Component component:childs) {
            component.enlarge(enlarge_by);
        }
    }

    @Override
    public void display(String space) {
        System.out.println(space + this.name + " [" + size + "]");
        for (Component component : childs) {
            component.display(space + "    ");
        }
    }
}
