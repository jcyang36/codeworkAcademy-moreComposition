/**
 * 
 */
package morecomp;

/**
 * @author JC
 *This class is for a driver, who has a vehicle.
 */
public class Driver extends Person{
	
	private Vehicle vehicle;
	private String name;
	public Driver(){
		this.vehicle = new Vehicle();
		vehicle.setBrand("Porsche");
		vehicle.setColor("Red");
	}
	
	public String getBrand()
	{
		return vehicle.getBrand();
	}
	
	public String getColor()
	{
		return vehicle.getColor();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "The "+this.getColor()+" "+this.getBrand()+" is being driven by "+this.getName();
	}
	
	
	
	

}


