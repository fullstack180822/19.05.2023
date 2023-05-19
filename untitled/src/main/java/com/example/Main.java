package com.example;

public class Main {

    public static void main(String[] args) {

        Component root = new Composite(100, "Canvas");
        Component triangle1 = new Leaf(10, "Right triangle");
        Component circle1 = new Leaf(8, "Right circle");
        Component left_container = new Composite(40, "Left container");
        Component right_container = new Composite(40, "Right container");
        Component small_right_container = new Composite(40, "Small right container");

        Component triangle2 = new Leaf(5, "Left triangle");
        Component small_container = new Composite(8, "small container");
        Component circle2 = new Leaf(4, "small circle");

        root.addChild(triangle1);
        root.addChild(circle1);
        root.addChild(left_container);
        root.addChild(right_container);
        right_container.addChild(small_right_container);

        left_container.addChild(triangle2);
        left_container.addChild(small_container);

        small_container.addChild(circle2);
        root.display("");

        root.enlarge(50);
        root.display("");

        left_container.display("");

        circle1.display("");
    }
}
