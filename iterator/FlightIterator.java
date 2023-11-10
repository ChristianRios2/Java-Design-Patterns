package design_patterns.iterator;
import java.util.Iterator;
public class FlightIterator implements Iterator {
    private Flight[] flights;
    private int position = 0;
    /**
     * The FlightIterator constructor initializes the array list of flights.
     * @param flights the array list of flights
     */
    public FlightIterator(Flight[] flights) {
            this.flights = flights;
    }
    /**
     * The hasNext method will figure out if there are more flights in the array list of flights.
     * @return false if position is greater than the array size of flights or is equal to null
     * @return true otherwise
     */
    public boolean hasNext() {
        if(position >= flights.length || flights[position] == null) {
			return false;
		} else {
			return true;
		}
    }
    /**
     * The next method will modify the int position to move to the next flight in the array list.
     * @return the singular flight in the array list
     */
    public Flight next() {
        Flight flight = flights[position];
		position = position + 1;
		return flight;
    }
}
