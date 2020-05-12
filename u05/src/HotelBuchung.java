
public class HotelBuchung {
	int roomNumber;
	int endBooking;
	int startBooking;
	double roomCost;
	int discount;
	
	public HotelBuchung(int roomNumber1,int startBooking1,int endBooking1,double roomCost1,int discount1) {
		roomNumber=roomNumber1;
		startBooking=startBooking1;
		endBooking=endBooking1;
		roomCost=roomCost1;
		discount=discount1;
	}
	
	public double buchungsBetrag() {
		return roomCost*(endBooking-startBooking);
	}
}
