package dPr_Builder_Pattern;

public class Ship {
	private String color;
	private String material;
	private int displacement;
	private String engine;
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public int getDisplacement() {
		return displacement;
	}
	public void setDisplacement(int displacement) {
		this.displacement = displacement;
	}
	public String getEngine() {
		return engine;
	}
	public void setEngine(String engine) {
		this.engine = engine;
	}
	
	public void printShipData() {
		System.out.println("Material:" + getMaterial());
		System.out.println("Displacement:" + getDisplacement());
		System.out.println("Engine:" + getEngine());
		System.out.println("Paint:" + getColor());
	}
}
