package Shapes;

public class ShapesTest {

    public static void main(String[] args) {

    Rectangle box1 = new Rectangle(5,4);

//       int result1 = box1.getArea();
//       int result2 = box1.getPerimeter();
//        System.out.println(result1);
//        System.out.println(result2);

    Rectangle box2 = new Square(5);
    int result3 = box2.getArea();
    int result4 = box2.getPerimeter();
        System.out.println(result3);
        System.out.println(result4);


    }
}
