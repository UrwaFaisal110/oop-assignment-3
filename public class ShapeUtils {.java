public class ShapeUtils {

  

    static void shapeDetails(Circle circle, Cube cube, Rectangle rectangle, Sphere sphere) {
            
            System.out.println(" Circle Radius: " + circle.getRadius());
            System.out.println("Circle Area: " + circle.area());
         
            System.out.println("Cube Side: " + cube.getSide());
            System.out.println("Cube Area: " + cube.area());
            System.out.println("Cube Volume: " + cube.volume());

            System.out.println("Rectangle Length: " + rectangle.getLength());
            System.out.println("Rectangle Width: " + rectangle.getWidth());
            System.out.println("Rectangle Area: " + rectangle.area());
            
            System.out.println("Sphere Radius: " + sphere.getRadius());
            System.out.println("Sphere Area: " + sphere.area());
            System.out.println("Sphere Volume: " + sphere.volume());
    };
            
         public void increaseRectangle(Shape[] shapeArray, double incrementLength) {
                for (int i = 0; i < shapeArray.length; i++) {
                    if (shapeArray[i] instanceof Rectangle) {
                        Rectangle rect = (Rectangle) shapeArray[i]; 
                        double currentLength = rect.getLength();
                        rect.setLength(currentLength + incrementLength); 
                        System.out.println("Updated Rectangle " + i + " Length: " + rect.getLength());
                    };
                };
            };
             
        };




    public Class ShapeUtils() {
        
    }

    public boolean RectanglesIntersecting(Rectangle rect1, Rectangle rect2) {
       
        Point topLeft1 = rect1.getTopLeft();
        Point bottomRight1 = rect1.getBottomRight();

   
        Point topLeft2 = rect2.getTopLeft();
        Point bottomRight2 = rect2.getBottomRight();

       
        if (topLeft1.getX() == bottomRight2.getX() || topLeft2.getX() == bottomRight1.getX()) {
            return true; 

        if (topLeft1.getY() == bottomRight2.getY() || topLeft2.getY() == bottomRight1.getY()) {
            return true; 
        }

       return false;
    }
}
  
        
    
