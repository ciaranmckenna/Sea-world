/**
*
*/
package practicalTen;

/**
* @author Ciaran
*
*/
public class Animal {

	private String name;

	/**
	 * Default constructor
	 */
	public Animal() {
	}

	/**
	 * sets the name of the animal
	 * @param name
	 */
	public Animal(String name) {
		this.setName(name);
	}

	/**
	 * gets the name of the animal
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
}
