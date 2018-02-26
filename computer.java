class Computer
{
Computer()
{
System.out.println("constructor of class computer");
}
void computer_method()
{
System.out.println("Battery is low");
}
public static void main(String args[])
{
Computer in=new Computer();
Laptop you=new Laptop();
in.computer_method();
you.laptop_method();
}
}
class Laptop
{
Laptop()
{
System.out.println("constructor of class laptop");
}
void laptop_method()
{
System.out.println("Battery 99% is available");
}
}
