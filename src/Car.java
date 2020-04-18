
public class Car {
	
	private String maker;
	public int model;
	
	public void setMaker(String maker) {
		if(maker=="Toyota" || maker=="Nissan") {
		this.maker=maker;
		System.out.println("You are about to make a "+maker);
		}
		else
			System.out.println("The car brand is not available");
	}
    public void setModel(int model) {
    	if (model>2012) { 
    	this.model=model;
    	System.out.println("You are about to make a "+maker+" car in "+ model);
    	}
    	else
    		System.out.println("The car model is invalid");
    }
	public String getMaker() {
		return maker;
	}
	public int getModel() {
		return model;
	}

}
