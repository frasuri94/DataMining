
abstract class Item 
{
	//Attributi
	private Attribute attribute;
	private Object value;
	
	//Metodi
	
	Item(Attribute attribute, Object value)
	{
		this.attribute = attribute;
		this.value = value;
	}
	
	Attribute getAttribute()
	{
		return attribute;
	}
	
	Object getValue()
	{
		return value;
	}
	
	public String toString()
	{
		return value.toString();
	}
	
	
	abstract double distance(Object a);

}
