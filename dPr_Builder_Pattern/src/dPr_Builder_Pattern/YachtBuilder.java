package dPr_Builder_Pattern;

public class YachtBuilder implements IShipBuilder{

	private Ship ship;
	public YachtBuilder() {
		ship=new Ship();
	}
	@Override
	public void manufactureShipHull() {
		// TODO Auto-generated method stub
		ship.setMaterial("GFRP");
		ship.setDisplacement(50);
	}

	@Override
	public void paintShip() {
		// TODO Auto-generated method stub
		ship.setColor("White");
	}

	@Override
	public void installEngine() {
		// TODO Auto-generated method stub
		ship.setEngine("Outboard Engine");
		
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
