
class Car extends Vehicle
{
	private int doors;
	private int passengers;
	
	public Car(String aMake, String aModel, String aPlate, int Doors, int Passengers)
	{
		super(aMake, aModel, aPlate);
		this.doors = Doors;
		this.passengers = Passengers;
	}
	
	public int getDoors()
	{
		return this.doors;
	}
	
	public int getPassengers()
	{
		return this.passengers;
	}
	
	public String toString()
	{
		return "" + this.door + "-door(s) " + super.getMake() 
		+ " " + super.getModel() + " with license " + super.getPlate();
	}
	
	public boolean equals(Object obj)
	{
		if(!(obj instanceof Car))
			return false;
		
		Car temp = (Car) obj;
		if(super.equals(temp) && this.doors == temp.getDoors() && this.passengers == temp.getPassengers())
			return true;
		return false;
	}
	
	public Car copy()
	{
		return new Car(super.getMake, super.getModel, super.getPlate, this.doors, this.passengers);
	}
}