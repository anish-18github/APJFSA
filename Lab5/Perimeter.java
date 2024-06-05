package labs.lab5;

public class Perimeter {
    // Method to calculate the perimeter of a square
    public double calculate(double side){
        return 4* side;
    }

    // Method to calculate the perimeter of a Rectangle
    public double calculate(double length, double breadth){
        return 2 * (length + breadth);
    }

    // Method to calculate the perimeter of a Circle
    public double calculate(double radius, boolean isCircle){
        if (isCircle){
            return 2*(22.0/7.0) * radius;
        }
        return 0;
    }

    public static void main(String[] args) {
        Perimeter perimeter = new Perimeter();

        double squarePerimeter = perimeter.calculate(5);
        System.out.println("Perimeter of the square is: " +squarePerimeter);

        double rectanglePerimeter = perimeter.calculate(2, 6);
        System.out.println("Perimeter of the Rectangle is: " +rectanglePerimeter);

        double circlePerimeter = perimeter.calculate(7, true);
        System.out.println("Perimeter of the square is: " +circlePerimeter);
    }

}
