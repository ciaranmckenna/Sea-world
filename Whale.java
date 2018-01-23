/**
 *
 */
package practicalTen;

/**
 * @author Ciaran
 *
 */
public class Whale extends Animal {
	private String mainOcean;
	private int weight;
	private int maxSpeed;
	private int lenght;

	/**
	 * Default Constructor
	 */
	public Whale() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param mainOcean
	 * @param weight
	 * @param maxSpeed
	 * @param lenght
	 */
	public Whale(String name, String mainOcean, int weight, int maxSpeed, int lenght) {
		super(name);
		this.mainOcean = mainOcean;
		this.setWeight(weight);
		this.maxSpeed = maxSpeed;
		this.lenght = lenght;
	}

	/**
	 * @return the mainOcean
	 */
	public String getMainOcean() {
		return this.mainOcean;
	}

	/**
	 * @param mainOcean the mainOcean to set
	 */
	public void setMainOcean(String mainOcean) {
		this.mainOcean = mainOcean;
	}

	/**
	 * @return the weight
	 */
	public int getWeight() {
		return weight;
	}

	/**
	 * @param weight the weight to set
	 */
	public void setWeight(int weight) {
		if(weight<=0 || weight>= 100000) {
			weight = 0;
			System.out.println("Error in registering weight of whale");
		} else {
			this.weight = weight;
		}
	}

	/**
	 * @return the maxSpeed
	 */
	public int getMaxSpeed() {
		return this.maxSpeed;
	}

	/**
	 * @param maxSpeed the maxSpeed to set
	 */
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	/**
	 * @return the lenght
	 */
	public int getLenght() {
		return this.lenght;
	}

	/**
	 * @param lenght the lenght to set
	 */
	public void setLenght(int lenght) {
		this.lenght = lenght;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Whale [mainOcean=" + this.mainOcean + ", weight=" + this.weight + ", maxSpeed=" + this.maxSpeed
				+ ", lenght=" + this.lenght + "]";
	}
}
