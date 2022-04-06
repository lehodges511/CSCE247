package csce247.assignments.singleton;

import java.util.ArrayList;

/**
 * @author Lauren Hodges
 * System that implements Singleton class
 */
public class HospitalSystem {
    private ArrayList<Patient> patients = new ArrayList<>();
    private static HospitalSystem hospitalSystem = null;

    /**
     * constructor
     */
    private HospitalSystem(){
    }

    /**
     * creates instance of Hospital System
     * @return new instance of Hospital System
     */
    public static HospitalSystem getInstance(){
        if(hospitalSystem==null){
            hospitalSystem = new HospitalSystem();
        }
        return hospitalSystem;
    }

    /**
     * adds a patient to the list
     * @param firstName first name of patient
     * @param lastName last name of patient
     * @return id of patient
     */
    public int addPatient(String firstName, String lastName){
        int id = patients.size();
        Patient patient = new Patient(id, firstName, lastName);
        patients.add(patient);
        return id;
    }

    /**
     * gets data of patient
     * @param id id of patient
     * @return data of patient at index id
     */
    public Patient getRecord(int id){
        return patients.get(id);
    }

    /**
     * adds an allergy to the patient
     * @param id id of patient
     * @param allergy allergy to be added
     */
    public void addAllergy(int id, String allergy){
        Patient patient = patients.get(id);
        patient.addAllergy(allergy);
    }

    /**
     * gets all patients data
     * @return String with patient data
     */
    public String getAllPatientsData(){
        return patients.toString().replace("[","").replace("]","").replace(",","");
    }
}
