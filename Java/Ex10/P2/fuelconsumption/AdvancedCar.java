package fuelconsumption;

public class AdvancedCar extends SimpleCar{
    private float startt, endt, acfuelconsumption;
    public AdvancedCar(String maker, float fuelconsumption, float travel, float acfuelconsumption, float startt, float endt){
	super(maker, fuelconsumption, travel);
	this.acfuelconsumption = acfuelconsumption;
	this.startt = startt;
	this.endt = endt;
    }

    public float getstartt(){
	return startt;
    }

    public float getendt(){
	return endt;
    }

    public float getacfuelconsumption(){
	return acfuelconsumption;
    }

    public float getFuelConsumptionOldRegulations(){
	return (float)((gettravel()/getfuelconsumption()) + (endt - startt)/(acfuelconsumption));
    }

    public float getFuelConsumptionNewRegulations(){
	return (float)((gettravel()/getfuelconsumption()) + (endt - startt)/(acfuelconsumption));
    }
}