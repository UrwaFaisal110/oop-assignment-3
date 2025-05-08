public class Main {
    public static void main(String[] args) {
        Shape shapes = new Shape();
        Shape3D shape3d =  new Shape3D();
        Shape2D shape2d = new Shape2D();
        Circle circle1 = new Circle();
        circle1.getRadius();
        circle1.SetRadius(4);
        System.out.println(circle1.area);
        Rectangle newrect = new Rectangle();
        System.out.println(newrect.area);
        Shape3D newshape = new Shape3D();
        newshape.volume();
        newshape.area();
        Sphere sphere1 = new Sphere();
        System.out.println(sphere1.volume);
        Cube cube = new Cube();
        System.out.println(cube.volume);
        System.out.println(cube.area);
        Shape[] shapearray = new Shape[20]; 
        for (int i = 0; i < 5 ; i++) {
            shapearray[i] = new Rectangle();
        };
        for (int i = 5; i < 10; i++) {
            shapearray[i] = new Cube();

        };
        for (int i = 10; i < 15; i++) {
            shapearray[i] = new Sphere();
        }
        for (int i = 15; i < 20; i++) {
            shapearray[i] = new Circle();
        };
 };

   
}
