package computer;

public class Case {

	private String model;
	private String manufacturer;
	private String powerSupply;
	private Dimensions dimensions1;
	
	public Case(String model, String manufacturer, String powerSupply, Dimensions dimensions1) {
		
		this.model = model;
		this.manufacturer = manufacturer;
		this.powerSupply = powerSupply;
		this.dimensions1 = dimensions1;
	}
	
	public void pressPowerButton() {
		System.out.println("Power button pressed");
	}

	public String getModel() {
		return model;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public String getPowerSupply() {
		return powerSupply;
	}

	public Dimensions getDimensions1() {
		return dimensions1;
	}
	
	
	
}
