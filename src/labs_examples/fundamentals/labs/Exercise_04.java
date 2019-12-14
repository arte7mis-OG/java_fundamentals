package labs_examples.fundamentals.labs;

/**
 * Fundamentals Exercise 4: Volume and Surface Area
 *
 *      Write the necessary code to calculate the volume and surface area of a cylinder
 *      with a radius of 3.14 and a height of 5. Print out the result.
 *
 */

public class Exercise_04 {

    public static void main(String[] args) {

        // write code here
        double a = 3.14;
        double b = 5;
        double pi = 3.14;
        double volume = (a*a)*b*pi;
        double surface_area = (2*pi*a*b) + (2*pi*a*a);

        System.out.println("The formula for the volume of a cylinder is: r^2 * pi * height");

        System.out.println("The Volume of a cylinder with a radius of 3.14 and height of 5 is: "+ volume);

        System.out.println("The formula for the surface area of a cylinder is: 2*pi*r*h + 2*pi*r^2");

        System.out.println("The surface area of a cylinder with radius of 3.14 and height of 5 is: "+ surface_area);
    }
}
