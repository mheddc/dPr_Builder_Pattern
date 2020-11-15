package dPr_Builder_Pattern;

public class ShipDirector {

	private IShipBuilder shipbuilder;
	
	public ShipDirector(IShipBuilder shipbuilder) {
		this.shipbuilder=shipbuilder;
	}
	
	public void setBuilder(IShipBuilder shipbuilder) {
		this.shipbuilder=shipbuilder;
	}
	
	public void construct() {
		shipbuilder.manufactureShipHull();
		shipbuilder.installEngine();
		shipbuilder.paintShip();
	}
}
