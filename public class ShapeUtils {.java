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
            
         public void increaseRectanglelength(Shape[] shapeArray, double incrementLength) {
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

       public void checkAllRectangleIntersections(Shape[] shapes) {
        for (int i = 0; i < shapes.length; i++) {
            if (shapes[i] instanceof Rectangle) {
                Rectangle r1 = (Rectangle) shapes[i];

                for (int j = i + 1; j < shapes.length; j++) {
                    if (shapes[j] instanceof Rectangle) {
                        Rectangle r2 = (Rectangle) shapes[j];

                        boolean result = RectanglesIntersecting(r1, r2);
                        System.out.println("Rectangle " + i + " and Rectangle " + j +
                                (result ? " intersect." : " do NOT intersect."));
                    }
                }
            }
        }
    }
}
  
        
    
