package interview;

class Parent
{
	public Parent()
	{
		this.display();
	}
	public void display()
	{
		System.out.println("in parent display method");
	}
}
public class Child {
	public Child()
	{
		this.display();
	}
	public void display()
	{
		System.out.println("in child display method");
	}
public static void main(String[] args) {
	new Child();
}
}
