package csce247.assignments.singleton;

import java.util.ArrayList;

/**
 * @author Lauren Hodges
 * holds patient data
 */
public class Patient {
    int id;
    String firstName;
    String lastName;
    ArrayList<String> allergies = new ArrayList<>();

    /**
     * constructor
     * @param id id of patient
     * @param firstName first name of patient
     * @param lastName last name of patient
     */
    public Patient(int id, String firstName, String lastName){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    /**
     * adds allergy to patient
     * @param allergy allergy to be added
     */
    public void addAllergy(String allergy){
        allergies.add(allergy);
    }

    /**
     * prints out individual patient data
     * @return String with patient data
     */
    public String toString(){
        return "Patient "+(id+1)+": "+firstName+" "+lastName+"\n\tAllergies: "+allergies.toString()+"\n\n";
    }
}
