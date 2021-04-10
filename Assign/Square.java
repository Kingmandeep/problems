package Assign;

public class Square implements polygon{
    float side;
     public void calcArea(){
         System.out.println("Area of Square : "+side*2);
     }
     public void calPer(){
          System.out.println("Perimeter of Square : "+4*side);
     }
 }