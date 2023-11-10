package design_patterns.iterator;
/**
 * @author Christian Rios
 */
public class Flight {
    private String flightNum;
    private String from;
    private String to;
    private int duration;
    private int transfers;
    /**
     * The flight constructor initializes the details of the flight.
     */
    public Flight(String flightNum, String from, String to, int duration, int transfers) {
        this.flightNum = flightNum;
        this.from = from;
        this.to = to;
        this.duration = duration;
        this.transfers = transfers;
    }
    /**
     * @return where the flight is coming from
     */
    public String getFrom() {
        return from;
    }
    /**
     * @return where the flight is going to
     */
    public String getTo() {
        return to;
    }
    /**
     * @return the duration of the flight in minutes
     */
    public int getDuration() {
        return duration;
    }
    /**
     * @return the number of transfers
     */
    public int getNumTransfers() {
        return transfers;
    }
    /**
     * The toString classes formats the flight information to display like the sample output. This class gets the flight details and displays them to the terminal. Since duration is in minutes,
     * the duration is divided by 60 and minutes is obtained by using the modulus to get the remainder. If there are no transfers, direct flight is output. If there is 1 or more transfers, the amount of transfers is displayed instead.
     */
    public String toString() {
        getFrom();
        getTo();
        getDuration();
        int hours = duration/60;
        int minutes = duration % 60;
        getNumTransfers();
        String result = "";
        result += "FlightNumber: " + flightNum + "\n";
        result += "From: " + from + "\n";
        result += "To: " + to + "\n";
        result += "Duration: " + hours + " hours " + minutes + " minutes\n";
        if(transfers == 0) {
            result += "Direct Flight\n";
        }
        else if(transfers == 1)
            result += "1 Transfer\n";
        else if(transfers > 1)
            result += transfers + " Transfers\n"; 
        return result;
    }

}
