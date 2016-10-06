package encapsulation;

public class Computer {
	private int memory;
	private double size;
	private double processor;
	private String brand;
	
	public Computer(int memory, double size, double processor, String brand){
		this.memory = memory; 
		this.size = size;
		this.processor = processor;
		this.brand = brand;
	}
	public int getMemory() {
		return this.memory;
	}
	public double getSize() {
		return this.size;
	}
	public double getProcessor() {
		return this.processor;
	}
	public String getBrand(){
		return this.brand;
	}
	public void addMemory(int newMemory) {
		if (this.memory + newMemory > 8) {
			return; 
		}
		else {
			this.memory = this.memory + newMemory;
		}
	}
	public void setProcessor(double newProcessor){
		this.processor = newProcessor;
	}
	public String toString() {
		return " Memory: " + this.memory + " Size: " + this.size + " Processor: " + this.processor
				+ " Brand:" + this.brand;

	}
public static void main(String[] args) {
	Computer myComputer = new Computer(8, 15.5, 2.4, "Lenovo");
	System.out.println(myComputer.getBrand());
	Computer yourComputer = new Computer(4, 13.3, 3.3, "Apple");
	System.out.println(yourComputer.getBrand());
	myComputer.addMemory(4);
	System.out.println(myComputer.getMemory());
	yourComputer.addMemory(3);
	System.out.println(yourComputer.getMemory());
	System.out.println(myComputer);
}
}
