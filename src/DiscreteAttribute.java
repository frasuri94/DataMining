/** Classe concreta DiscreteAttribute che estende la classe Attribute 
 * e rappresenta un attributo discreto (categorico) 
 */
class DiscreteAttribute extends Attribute
{
	//Attributi
	
	/** Dominio dell'attributo discreto */
	private String values[];
	
	//Metodi
	
	/** Costruttore dell'attributo discreto , inizializza le propriet� dell'attributo discreto 
	 * 
	 * @param name			nome dell'attributo discreto
	 * @param index			indice dell'attributo discreto
	 * @param values		dominio dell'attributo discreto
	 */
	DiscreteAttribute(String name,int index,String[] values)
	{
		super(name,index);
		this.values=values;	
	}
	
	/** Restituisce il numero dei possibili valori del dominio dell'attributo discreto
	 * 
	 * @return		cardinalit� del dominio
	 */
	int getNumberOfDistinctValues()
	{
		return values.length;
	}
	
	/** Restituisce l'i-esimo valore del dominio 
	 * 
	 * @param i			indice del valore del dominio
	 * @return			i-esimo valore del dominio
	 */
	String getValue(int i)
	{
		return values[i];
	}
	
}
