package HospitalManagement;

public class Patient {
    String nameP;       //Name of patient
    String age;       //Age of patient
    String Illness;     //Disease
    String bloodGroup;  //Blood Group pf patient

    public Patient() {  //Default Constructor
        nameP = null;
        age = null;
        Illness = null;
        bloodGroup = null;
    }
    //Set all info of patients - parametrised constructor
    public Patient(String ptName,String ag,String ill,String bg){
        //sets info
        nameP = ptName;
        age = ag;
        Illness = ill;
        bloodGroup = bg;
    }

    public String toString() {
        return nameP + ", " + age + ", " + Illness + ", " + bloodGroup+".";
    }
}
