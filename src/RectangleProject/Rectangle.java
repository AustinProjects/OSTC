package RectangleProject;

public class Rectangle {
    int length;
    int width;
    int answer;
    boolean squareIs;
    public Rectangle(int convlength, int convwidth) {
        length = convlength;
        width = convwidth;
    }
    public void area() {
        answer = length * width;
    }
    public void perimeter() {
        answer = (length*2) + (width*2);
    }
    public void isSquare() {
        squareIs = length == width;
    }
}
