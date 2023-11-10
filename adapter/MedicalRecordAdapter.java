/**
 * @author Christian Rios
 */
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
public class MedicalRecordAdapter implements MedicalRecord {
    private HealthRecord record;
    /**
     * The constructor initializes the private record object.
     */
    public MedicalRecordAdapter(HealthRecord record) {
        this.record = record;
    }
    /**
     * getFirstName splits the record object's name into first and last, and returns the first name.
     */
    public String getFirstName() {
        String fullName = record.getName();
        String[] names = fullName.split(" ", 2);
        return names[0];
    }
    /**
     * getLastName splits the record object's name into first and last, and returns the last name.
     */
    public String getLastName() {
        String fullName = record.getName();
        String[] names = fullName.split(" ", 2);
        return names[1];
    }   
    /**
     * getBirthday returns the record object's birth date. This date will be correctly formatted in the toString.

     */
    public Date getBirthday() {
        Date birthday = record.getBirthdate();
        return birthday;
    }
    /**
     * getGender finds the string representation of the record object's gender and will return the enum version of the gender.
     */
    public Gender getGender() {
        String gender = record.getGender();
        if(gender.equalsIgnoreCase("male")) {
            return Gender.MALE;
        }
        else if(gender.equalsIgnoreCase("female")) {
            return Gender.FEMALE;
        }
        return Gender.OTHER;
    }
    /**
     * addVisit just adds to the history array list in the record object.
     */
    public void addVisit(Date date, boolean well, String description) {
        record.addHistory(date, well, description);
    }
    /**
     * getVisitHistory constructs an array list of visits and an array list of the patient's history.
     * As the history has the information of a visit, just in String format, I had to convert the strings into a Date, a boolean, and the string description.
     * For each visit in the patient's history, the info is converted to the new "visit" format and the array list of visits is returned.
     */
    public ArrayList<Visit> getVisitHistory() {
        ArrayList<Visit> visits = new ArrayList<Visit>();
        
        ArrayList<String> history = record.getHistory();
        for(String his : history) {
            String[] section = his.split("\n", 3);
            String date = section[0];
            String[] datesection = date.split(" ", 5);
            String day = datesection[2];
            String dayNoComma = day.substring(0, 2);
            int dayAsNumber = Integer.parseInt(dayNoComma);
            String month = datesection[3];
            String monthNoComma = month.substring(0,2);
            int monthAsNumber = Integer.parseInt(monthNoComma);
            int year = Integer.parseInt(datesection[4]);
            Calendar myCalendar = new GregorianCalendar(year, monthAsNumber - 1, dayAsNumber);
            Date newdate = myCalendar.getTime();
            String wellness = section[1];
            String[] wellnessSection = wellness.split(" ",3);
            boolean well = true;
            if(wellnessSection[2].equalsIgnoreCase("false")) {
                well = false;
            }
            String description = section[2];
            String[] descriptionSection = description.split(": ",2);
            String newDescription = descriptionSection[1];
            visits.add(new Visit(newdate, well, newDescription));
        }
        
        return visits;
    }
    /**
     * toString is more or less a copy of SCMedicalRecord's toString, with different variables to work with the adapter's formatting.
     */
    public String toString(){
        String result = "***** " + getFirstName() + " " + getLastName() + " *****\n";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM/dd/yyyy");
        String formattedBirthday = simpleDateFormat.format(getBirthday());
        result += "Birthday: " + formattedBirthday + "\n";
        result += "Gender: " + getGender() + "\n";
        result += "Medical Visit History: \n";
        ArrayList<Visit> visits = getVisitHistory();
        if(visits.size() == 0){
            result += "No visits yet";
        } else {
            for(Visit visit : visits){
                result += visit.toString();
            }
        }

        return result;
    }
}
