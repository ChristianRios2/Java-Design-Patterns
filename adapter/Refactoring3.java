import java.util.ArrayList;
import java.util.List;
 
public class Refactoring3 {
   
    public Refactoring3(){
       
    }
 
    public void run(){
        ArrayList<String> phones = new ArrayList();
        phones.add("803-111-2222");
        phones.add("803-222-3333");
        phones.add("803-333-4444");
        phones.add("803-222-3333");
        //phones.add("803-333-4444");
        //phones.add("803-222-3333");
        phones.add("803-444-5555");
        phones.add("803-555-6666");
        phones.add("803-444-5555");
        //phones.add("803-222-3333");
 
        displayPhoneList(phones);
    }
 
    /**
     * Displays the list of phone numbers to the console,
     * Indicates if items were removed from the list, due to duplicates
     * @param phones The phone numbers to disp;ay
     */
    public void displayPhoneList(List<String> phones) {
        if(removeDuplicates(phones)) {
            System.out.println("Duplicate phone numbers were removed");
        }
 
        for(String phone : phones){
            System.out.println(phone);
        }
    }
 
    /**
     * Removes and duplicate item in the list, returns true if items were removed, and
     * false otherwise.
     * @param items The list to remove duplicates from
     * @return true if an item was removed and false otherwise
     */
    public boolean removeDuplicates(List<String> items){
        boolean found = false;
        for(int i=1; i < items.size(); i++){
            int j = i-1;
            String temp1 = items.get(i);
            String temp2 = items.get(j);
            if(temp1.equals(temp2)){
                items.remove(i);
                i--;
                found = true;
            }
        }
        return found;
    }
 
    public static void main(String[] args) {
        Refactoring3 myMain = new Refactoring3();
        myMain.run();
    }
}
