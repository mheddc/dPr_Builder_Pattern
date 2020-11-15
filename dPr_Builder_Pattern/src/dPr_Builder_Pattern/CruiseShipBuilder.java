package dPr_Builder_Pattern;

public class CruiseShipBuilder implements IShipBuilder{

	private Ship ship;
	
	public CruiseShipBuilder() {
		ship=new Ship();
	}
	
	@Override
	public void manufactureShipHull() {
		// TODO Auto-generated method stub
		ship.setMaterial("Steel");
		ship.setDisplacement(100000);
	}

	@Override
	public void paintShip() {
		// TODO Auto-generated method stub
		ship.setColor("White");
	}

	@Override
	public void installEngine() {
		// TODO Auto-generated method stub
		ship.setEngine("DieselEngine");
	}

	@Override
	public void resetShip() {
		// TODO Auto-generated method stub
		ship=new Ship();
	}

	@Override
	public Ship returnShip() {
		// TODO Auto-generated method stub
		Ship dummyShip=ship;
		resetShip();
		return dummyShip;
	}

}
