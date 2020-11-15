package dPr_Builder_Pattern;

public class Main {

	
	public static void main(String args[]) {
		
		CruiseShipBuilder cruiseShipBuilder=new CruiseShipBuilder();
		ShipDirector shipDirector=new ShipDirector(cruiseShipBuilder);
		shipDirector.construct();
		Ship cruiseShip=cruiseShipBuilder.returnShip();
		
		
		YachtBuilder yachtBuilder=new YachtBuilder();
		shipDirector.setBuilder(yachtBuilder);
		shipDirector.construct();
		Ship yacht=yachtBuilder.returnShip();
	
		IceBreakerBuilder iceBreakerBuilder=new IceBreakerBuilder();
		shipDirector.setBuilder(iceBreakerBuilder);
		shipDirector.construct();
		Ship iceBreaker=iceBreakerBuilder.returnShip();
		
		cruiseShip.printShipData();
		yacht.printShipData();
		iceBreaker.printShipData();
		
	}
}
