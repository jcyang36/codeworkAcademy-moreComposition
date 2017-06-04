/**
 * 
 */
package morecomp;

/**
 * @author Joyce Yang
 * June 3, 2017
 * This is the application for the composition of the various classes.
 *
 */
public class CarApp {
public static void main(String[] args) {


	//Car c = new Car();
	Car p = new Car();	
	
			p.setColor(" Red " );
			p.setSpeed(50);
			p.setBrand("Porsche");
			
			
			print(p.getBrand());
			print(p.getColor());
			System.out.println(p.getSpeed());
			
			
	Car j = new Car();
		
	
	j.setColor(" Blue " );
	j.setBrand("Jetta");
	j.setSpeed(20);
	p.passed(j.getBrand());
	
	
	
	
	
	
	

	print(p.start());
	print(j.start());
	print(p.accelerate());
	print(j.accelerate());
	print(j.go(40));
	print(p.stop());
	print(j.stop());
	
	print(j.passed("Porsche"));
	

}
private static void print(String s){
	System.out.println(s);
}
}