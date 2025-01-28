/*Step 1:

Create a class named ComplexNumber with two double fields real and imag.
Create a constructor with double parameters real and imag.
Inside the constructor, initialize the value of fields real and imag using the this keyword.
Step 2:

Create the main() method inside a Main class.
Get 4 double inputs for variables n1, n2 for the first Complex number and n3, n4 for the second complex number.
Create an object c1 of the ComplexNumber class with arguments n1 and n2.
Create another object c2 of ComplexNumber with arguments n3 and n4.
Add real fields of both objects c1 and c2 and store it in the realSum variable.
Add imag fields of both objects c1 and c2 and store it in the imagSum variable.
Print the sum in format realSum + imagSum i.
*/

import java.util.Scanner;
class ComplexNumber{
    double real;
    double imag;
        public ComplexNumber(double real, double imag){
            this.real = real;
            this.imag = imag;
        }

}
public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double n1 = input.nextDouble();
        double n2 = input.nextDouble();
        double n3 = input.nextDouble();
        double n4 = input.nextDouble();
        ComplexNumber c1 = new ComplexNumber(n1,n2);
        ComplexNumber c2 = new ComplexNumber(n3,n4);
        double realSum = c1.real + c2.real;
        double imagSum = c1.imag + c2.imag;
        System.out.println(realSum + "+" + imagSum + "i");
        input.close();
    }
}