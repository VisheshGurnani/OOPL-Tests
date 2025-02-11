//Create a class MessagePrinter with a method printMessage(String name) which prints the message "hello <name>"

public class MessagePrinter
{
    public void printMessage(String name)
    {
        if (name == null || name.isEmpty())
        {
            System.out.println("Hello!");
        } else
        {
            System.out.println("Hello " + name + "!");
        }
    }
    public static void main(String[] args)
    {
        MessagePrinter printer = new MessagePrinter();
        printer.printMessage("Alice");
    }
}