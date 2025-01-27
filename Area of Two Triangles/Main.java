/*Step 1:

Create a class named Triangle with integer fields base and height.
Create a constructor with integer parameters b and h.
Inside the constructor, initialize the base and height with values of b and h respectively.
Create a method named calculateArea() to compute the area of triangle using the above formula and print it.
Step 2:

Create the main() method inside a Main class.
Inside the method, create an object t1 of the Triangle class with arguments 5 and 14.
Call the calculateArea() method using the object.
Create a second object t2 of Triangle with arguments 12 and 32.
Call calculateArea() using the second object.
*/
class Triangle{
    int base;
    int height;
        public Triangle(int b , int h){
            base = b;
            height = h;
        }
            void calculateArea(){
            int area = (base * height) / 2 ;
            System.out.println("The area is : " + area);
            }
}
public class Main{
    public static void main(String[] args){
        Triangle t1 = new Triangle(5,14);
        t1.calculateArea();
        Triangle t2 = new Triangle(12,32);
        t2.calculateArea();
    }
}
