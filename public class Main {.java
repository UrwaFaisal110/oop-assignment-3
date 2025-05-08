public class Main {
    public static void main(String[] args) {
        Shape3D shape3d = new Shape3D();
        Shape2D shape2d = new Shape2D();

        Circle circle1 = new Circle();
        circle1.setRadius(5);
        double circleArea = circle1.area();

        Shape3D newshape = new Shape3D();
        newshape.volume();
        newshape.area();

        Sphere sphere1 = new Sphere();
        sphere1.setRadius(6.0);
        double sphereVolume = sphere1.volume();

        Cube cube = new Cube(2.0);
        double cubeVolume = cube.volume();
        double cubeArea = cube.area();

        Rectangle rectangle = new Rectangle();
        rectangle.setLength(5.0);
        rectangle.setWidth(4.0);

        Sphere sphere = new Sphere();
        sphere.setRadius(6.0);

        ShapeUtils utils = new ShapeUtils();
        utils.shapeDetails(circle1, cube, rectangle, sphere);

        Shape[] shapearray = new Shape[20];
        for (int i = 0; i < 5; i++) {
            shapearray[i] = new Rectangle(new Point(1 + i, 5 + i), new Point(4 + i, 2 + i));
        }
        for (int i = 5; i < 10; i++) {
            shapearray[i] = new Cube(2.0 + i);
        }
        for (int i = 10; i < 15; i++) {
            Sphere s = new Sphere();
            s.setRadius(3.0 + i);
            shapearray[i] = s;
        }
        for (int i = 15; i < 20; i++) {
            Circle c = new Circle();
            c.setRadius(1.0 + i);
            shapearray[i] = c;
        }

        utils.checkAllRectangleIntersections(shapearray);
    }
}
