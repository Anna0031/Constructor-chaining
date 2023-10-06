class Vehicle{
	String make;
	String model;
	int year;
	String color;
		
		Vehicle(String make,String model,int year,String color){
		super();
		this.make = make;
		this.model = model;
		this.year = year;
		this.color = color;
	}
	
	Vehicle(String make,String model,int year){
		this.make = make;
		this.model = model;
		this.year = year;
		color = "Unknown";
	}
}
class Car extends Vehicle{
	int numDoor;
	boolean automatic;
	
	Car(String make,String model,int year,String color,int numDoor, boolean automatic){
		super(make, model, year, color);
		this.numDoor = numDoor;
		this.automatic = automatic;
	}
	Car(String make,String model,int year){
		super(make, model, year);
	}
	public String display() {
		return "Car Information \nMake: "+make+"\nModel: "+model+"\nYear: "+year+"\nColor: "+color+"\nNo of Doors: "+numDoor+"\nAutomatic: "+automatic;                         
				
	}
}
class Truck extends Vehicle {
	double payloadCapacity;
	double towingCapacity;
	
	
	Truck(String make,String model,int year,String color,double payloadCapacity, double towingCapacity){
		super(make, model, year, color);
		this.payloadCapacity = payloadCapacity;
		this.towingCapacity = towingCapacity;
	}
	Truck(String make,String model,int year){
		super(make, model, year);
	}
	public String display1() {
		return "Truck Information \nMake: "+make+"\nModel: "+model+"\nYear: "+year+"\nColor: "+color+"\nPayLoad: "+payloadCapacity+"\nTowing: "+towingCapacity;
	}
}
public class InfoVehicle {
	public static void main(String[] args) {

		Car c = new Car("Renault" , "Duster" , 2016, "Copper" , 4,true);
		System.out.println(c.display());
		System.out.println("");
		Truck t = new Truck("TATA" , "Signa" , 2016, "Copper" , 250, 30);
		System.out.println(t.display1());
		}
}
