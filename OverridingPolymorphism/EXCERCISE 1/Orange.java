package OverridingPolymorphism;

public class Orange extends Fruit {
	public Orange(String name,String taste,String size)
	{
	super(name,taste,size);
	}
	void eat()
	{
	System.out.println(name+" "+size);
	}
}
