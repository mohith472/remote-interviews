package interview;

class A
{
	
}
class B extends A
{
	
}
class C extends B
{
	
}
class D extends C
{
	
}
public class Myclass {
public static void main(String[] args) {
	B b = new C();
	A a = b;
	if(a instanceof A)
	{
		System.out.print("A");
	}
	if(a instanceof B)
	{
		System.out.print("B");
	}if(a instanceof C)
	{
		System.out.print("C");
	}if(a instanceof D)
	{
		System.out.print("D");
	}
}
}
