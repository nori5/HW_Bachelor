package fuelconsumption;

public class BusTaxi extends DeluxeCar{
    private int min_number_passengers;

    public BusTaxi(String maker, float fuelconsumption, float travel, float acfuelconsumption, float startt, float endt, float passenger, int min_number_passengers){
	super(maker, fuelconsumption, travel, acfuelconsumption, startt, endt, passenger);
	this.min_number_passengers = min_number_passengers;
    }
    public float getFuelConsumptionOldRegulations(){
	return (gettravel()/getfuelconsumption()) + (getendt() - getstartt())/(getacfuelconsumption()/(float)min_number_passengers);
    }

    public float getFuelConsumptionNewRegulations(){
	return (gettravel()/getfuelconsumption()) + (getpassenger())/(getacfuelconsumption()/(float)min_number_passengers);
    }
}