import java.util.*;
public class Main {

	public static void main(String[] args) {
		String name;
		String color;
		float cc;
		int speed;
		double price;
		int weight;
		int manufacturerDiscount;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the details of Sports Bike");
		System.out.println("Name of the bike :");
		name=input.next();
		System.out.println("Color of the bike :");
		color=input.next();
		System.out.println("Capacity(cc) of the bike :");
		cc=input.nextFloat();
		System.out.println("Speed of the bike :");
		speed = input.nextInt();
		System.out.println("Price of the bike :");
		price=input.nextDouble();
		System.out.println("Discount of the bike :");
		manufacturerDiscount=input.nextInt();
		System.out.println("Enter the details of Scooter");
		System.out.println("Name of the Scooter");
		name = input.next();
		System.out.println("Color of the Scooter :");
		color=input.next();
		System.out.println("Capacity(CC) of the Scooter :");
		cc=input.nextFloat();
		System.out.println("Speed of the Scooter :");
		speed=input.nextInt();
		System.out.println("Price of the Scooter :");
		price=input.nextDouble();
		System.out.println("Discount of the scooter :");
		manufacturerDiscount=input.nextInt();
		System.out.println("Weight of the scooter :");
		weight=input.nextInt();
		Sportbike sb= new Sportbike(name,color,cc,speed,price,weight,manufacturerDiscount);
		Scooter sc= new Scooter(name,color,cc,speed,price,weight,manufacturerDiscount);
		System.out.println(sb.display());
		System.out.println(sc.display());
	}

}


class Bike {
	private String color;
	private String name;
	private float cc;
	private int speed;
	private Double price;
	public Bike(String name,String color, Float cc, Integer speed, Double price)
	{
	this.name = name;
	this.color = color;
	this.cc = cc;
	this.speed = speed;
	this.price = price; }
	public String getColor() {
		return color;
	}

	public String getName() {
		return name;
	}

	public float getCc() {
		return cc;
	}

	public int getSpeed() {
		return speed;
	}

	public Double getPrice() {
		return price;
	}


}


class Scooter extends Bike {
	int weight;
	int manufacturerDiscount;

	public Scooter(String name, String color, Float cc, Integer speed, Double price, int weight,int manufacturerDiscount) {
		super(name, color, cc, speed, price);
		this.weight = weight;
		this.manufacturerDiscount=manufacturerDiscount;
	}

	public String display()
	{
      System.out.println("Scooter :");
      return "Name : "+getName()+"\nColor : "+getColor()+"\nCapacity : "+getCc()+"\nSpeed : "+getSpeed()+"\nPrice : "+getPrice()+"\nWeight : " + weight +"\nManufacturer Discount : "+ manufacturerDiscount+"\nScooter price is "+(getPrice()-manufacturerDiscount);

	}

}


 class Sportbike extends Bike{

	int weight;
	int manufacturerDiscount;

	public Sportbike(String name, String color, Float cc, Integer speed, Double price,int weight, int manufacturerDiscount) {
		super(name, color, cc, speed, price);
		this.weight=weight;
		this.manufacturerDiscount = manufacturerDiscount;


	}
	public String display()
	{
      System.out.println("Sports Bike :");
		return "Name : "+getName()+"\nColor : "+getColor()+"\nCapacity : "+getCc()+"\nSpeed : "+getSpeed()+"\nPrice : "+getPrice()+"\nManufacturer Discount : "+ manufacturerDiscount+"\nSports Bike price is "+(getPrice()-manufacturerDiscount);
	}


}
