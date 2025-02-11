public class Biggest
{
    private final int[] array;

    public Biggest (int[] array)
    {
        this.array = array;

    }
    public void display() {
        if (array == null || array.length == 0) {
            System.out.println("Array is empty or null.");
            return;
        }

        int largest = array[0];
        System.out.println("Initial largest: " + largest);
        for (int i = 1; i < array.length; i++)
        {
            if (array[i] > largest)
            {
                largest = array[i];
            }
        }

        // Display the largest element
        System.out.println("The largest element in the array is: " + largest);
    }
    public static void main(String[] args)
    {
        int[] MyArray = {3, 5, 7, 2, 8, -1, 4, 10, 12};
        Biggest biggest = new Biggest(MyArray);
        biggest.display();
    }

}