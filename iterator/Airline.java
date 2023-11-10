package design_patterns.iterator;
/**
 * @author Christian Rios
 */
public class Airline {
    private String title;
    private Flight[] flights;
    private int size = 0;
    /**
     * The airline constructor initializes the airline title and and initializes the array of flights. Normally the array will start at two, but due to errors in the growarray class, I had to start at 5
     * si the code could print each flight correctly.
     * @param title The title of the airline
     */
    public Airline(String title) {
        this.title = title;
        flights = new Flight[5];
    }
    /**
     * The addflight class constructs a flight with the details of the flight as parameters. Functionality for growing the array was not completed, so right now this class just fills the flights list with the 5 flights.
     */
    public void addFlight(String flightNum, String from, String to, int duration, int transfers) {
        Flight flight = new Flight(flightNum,from,to,duration,transfers);
        //if(size < 2) {
            flights[size] = flight;
            size++;
        //}
        /*if(size >= 2) {
            Flight[] flightsresized = growArray(flights);
            flightsresized[size] = flight;
            size++;
        }
        */
    }
    /**
     * This class gets the title of the flight.
     * @return the title of the flight
     */
    public String getTitle() {
        return title;
    }
    /**
     * This incomplete class would have grown the array to twice the size once the original array becomes full.
     * @param flights the full array of flights that needs to increase in size
     * @return the size-increased array
     */
    private Flight[] growArray(Flight[] flights) {
        Flight[] nflights = new Flight[size*2];
        for(int i=0;i < size;i++) {
            nflights[i] = flights[i];
        }
        return nflights; 
    }
    /**
     * The createIterator class returns a new iterator of flights in order to utilize iterator methods.
     * @return
     */
    public FlightIterator createIterator() {
        return new FlightIterator(flights);
    }
}
