/*
 * there is an abstract superclass caled Vehicle.
 * it has 3 direct independent subclasses Car,Cycle and Rickshaw.
 * the Vehicle has an abstract member method named int noOfWheels().
 * 
 *  display the number of wheels for 1 Car,Cycle and Rickshaw
 */

abstract class Vehicle
{
	private int nwheels;
	Vehicle(int nwheels)
	{
		this.nwheels=nwheels;
	}
	
	int getNWheels()
	{
		return nwheels;
	}
	abstract int noOfWheels();
}

class Car extends Vehicle
{
	Car()
	{
		super(4);
		//here 4 gets passed into the constructor of superclass Vehicle and through parameter
		//of the constructor of superclass Vehicle gets assigned to the data member nwheels of superclass
		//Vehicle so the value of the nwheels data member in implicit object of superclass Vehicle in
		//the explicit object of Car is 4
		
	}
	
	int noOfWheels()
	{
		int nwheels=getNWheels();
		return nwheels;
		
	}
}

class Cycle extends Vehicle
{
	Cycle()
	{
		super(2);
		
		
	}
	
	int noOfWheels()
	{
		int nwheels=getNWheels();
		return nwheels;
		
	}
}

class Rickshaw extends Vehicle
{
	Rickshaw()
	{
		super(3);
		//here 4 gets passed into the constructor of superclass Vehicle and through parameter
		//of the constructor of superclass Vehicle gets assigned to the data member nwheels of superclass
		//Vehicle so the value of the nwheels data member in implicit object of superclass Vehicle in
		//the explicit object of Car is 4
		
	}
	
	int noOfWheels()
	{
		int nwheels=getNWheels();
		return nwheels;
		
	}
}
public class Pgm2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car c1=new Car();
		Cycle c2=new Cycle();
		Rickshaw r1=new Rickshaw();
		
		System.out.println("\n The number of wheels in Car is "+c1.noOfWheels()+"\n The number of wheels of cycle are "+c2.noOfWheels()+"\n The number of wheels of rickshaw is "+r1.noOfWheels());
	}

}
