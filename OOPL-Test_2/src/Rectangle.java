public class Rectangle
{
    private double length = 1.0;
    private double width = 1.0;

    public double getLength()
    {
        return length;
    }

    public void setLength(double length)
    {
        if (length > 0)
        {
            this.length = length;
        } else
        {
            System.out.println("Length must be a positive value.");
        }
    }

    public double getWidth()
    {
        return width;
    }

    public void setWidth(double width)
    {
        if (width > 0)
        {
            this.width = width;
        } else
        {
            System.out.println("Width must be a positive value.");
        }
    }

    public double calculateArea()
    {
        return length * width;
    }
    public static void main(String[] args)
    {
        Rectangle rectangle = new Rectangle();

        rectangle.setLength(5.0);
        rectangle.setWidth(3.0);

        System.out.println("Length: " + rectangle.getLength());
        System.out.println("Width: " + rectangle.getWidth());
        System.out.println("Area: " + rectangle.calculateArea());
    }
}