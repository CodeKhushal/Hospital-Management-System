package HospitalManagement;

public class Doctor {
    String name;                //Name of doctor
    String qualification;       //Qualification of doctor
    String experience;       //Experience of doctor
    String salary;              //Given Salary of doctor

    public Doctor() {   //Default Constructor
        name = null;
        qualification = null;
        experience = null;
        salary = null;
    }

    //Set all info of doctors - parametrised constructor
    public Doctor(String drName,String quali,String expi,String sal){
        //sets info
        name = drName;
        qualification = quali;
        experience = expi;
        salary = sal;
    }

    public String toString() {
        return name + ", " + qualification + ", " + experience + ", " + salary+".";
    }
}
