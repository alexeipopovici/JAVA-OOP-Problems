
/*Step 1:

Create a class named Rectangle with two integer fields length and breadth.
Create a constructor with integer parameters x and y.
Inside the constructor, initialize the value of length and breadth with x and y respectively.
Create a method named calculateArea() that computes the area using the above formula and prints it.
Step 2:

Create a main() method inside the Main class.
Inside the method, get two integer inputs for variables x and y.
Create an object of the Rectangle class and pass x and y as the argument to the Rectangle() constructor.
Call the calculateArea() method using the object.*/
import java.util.Scanner;
class Rectangle {
    int length;
    int breadth;
        public Rectangle(int x, int y){
            length = x;
            breadth = y;
        }
        void calculateArea(){
            int area = length * breadth;
            System.out.println("The area is : " + area);
        }
}
public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int y = input.nextInt();
        Rectangle myObj = new Rectangle(x,y);
        myObj.calculateArea();
    }
}
