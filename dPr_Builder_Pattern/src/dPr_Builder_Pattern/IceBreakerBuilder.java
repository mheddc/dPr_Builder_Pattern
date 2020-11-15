package dPr_Builder_Pattern;

public class IceBreakerBuilder implements IShipBuilder {

	private Ship ship;
	
	public IceBreakerBuilder() {
		ship=new Ship();
	}
	
	@Override
	public void manufactureShipHull() {
		// TODO Auto-generated method stub
		ship.setMaterial("Steel");
		ship.setDisplacement(30000);
	}

	@Override
	public void paintShip() {
		// TODO Auto-generated method stub
		ship.setColor("Red");
	}

	@Override
	public void installEngine() {
		// TODO Auto-generated method stub
		ship.setEngine("Nuclear Reactor");
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
		ship=new Ship();
		return dummyShip;
	}

}
