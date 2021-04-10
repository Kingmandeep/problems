package Assign;

import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        Square s=new Square();
        Rectangle r=new Rectangle();
        s.side=8;
        r.length=6;
        r.breadth=10;
        s.calcArea();
        s.calPer();
        r.calcArea();
        r.calPer();
    }
}