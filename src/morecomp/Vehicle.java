/**
 * 
 */
package morecomp;

/**
 * @author Joyce Yang
 *June 3 2017
 *This is the super class
 */ 
public class Vehicle {

	
	private String carType;
	private String color;
	private String brand;
	private int speed;
	
	
	public Vehicle()
	{};


	public Vehicle( String color1, String brand1, int speed1)
	{
		color=color1 ;
		brand=brand1;
		speed=speed1;
	
	}
	
	public String start() {

		return "The"+ color + brand+" is starting...";
	}
	
	public String accelerate() {
		return "The"+color+brand+" is accelerating...";
	}
	
	
	public String go(int speed) {
		return "The"+color+brand+" is going "+speed+" mph...";
	}
	
	public String stop() {
		return "The"+color+brand +" is stopped...";
	}
	
	
	public String getBrand() {
		return brand;
	}


	public void setBrand(String brand) {
		this.brand = brand;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public int getSpeed() {
		return speed;
	}


	public void setSpeed(int speed) {
		this.speed = speed;
	}
		
	
	
	public String passed(String car2){
		return "The "+this.color+" " +this.brand+ " just passed "+ "the "+ car2;
	}
}

