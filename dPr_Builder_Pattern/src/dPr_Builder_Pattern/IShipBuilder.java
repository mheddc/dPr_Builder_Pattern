package dPr_Builder_Pattern;

public interface IShipBuilder {
	
	public void manufactureShipHull();
	public void paintShip(); 
	public void installEngine();
	public void resetShip();
	public Ship returnShip();
	
}
