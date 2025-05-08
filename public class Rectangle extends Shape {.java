public class Rectangle extends Shape {
    private double length;
    private Point topLeft;
    private Point bottomRight;
    private double width;
};

public Rectangle(Point topLeft, Point bottomRight){
    this.topLeft = topLeft;
    this.bottomRight = bottomRight;
}; 

void SetWidth(double Width){
    this.Width = Width;

};
void SetLength(double Length){
    this.Length = Length;
}
double GetWidth(){
    return Width;
}
double GetLength(){
    return Length;
};
public double area(){
    return Length * Width;
};
public Point getTopLeft() {
        return topLeft;
    }
    public Point getBottomRight() {
        return bottomRight;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a rectangle at top-left: (" + topLeft.getX() + "," + topLeft.getY() +
                           ") and bottom-right: (" + bottomRight.getX() + "," + bottomRight.getY() + ")");
    }
}


       
