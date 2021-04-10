package Assign;

class Rectangle implements polygon{
    float length;
    float breadth;
    public void calcArea(){
        System.out.println("Area of Rectangle : "+length*breadth);
    }
    public void calPer(){
         System.out.println("Perimeter of Rectangle : "+2*length+2*breadth);
    }
}