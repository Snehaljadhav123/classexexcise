//program to calculate area and circumference of the circle 


import java.util.Scanner;

public class AreaCircum {
public static void main(String[] args){
    double radius,area,circumference;
    Scanner input=new Scanner(System.in);
    System.out.println("enter radius : ");
    radius=input.nextInt();
    area =Math.PI*radius*radius;
    circumference=2*Math.PI*radius;
    System.out.println("area of circle is = "+area);
    System.out.println("area of circle is = "+circumference);
    input.close();
}
}