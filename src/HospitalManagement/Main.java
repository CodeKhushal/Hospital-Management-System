package HospitalManagement;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Patient> pt=new ArrayList<Patient>();
    static ArrayList<Doctor> dr=new ArrayList<Doctor>();

    public static void main(String[] args) {
        System.out.println("*************************************************");
        System.out.println("*            WELCOME TO MY HOSPITAL             *");
        System.out.println("*************************************************");
        System.out.println("Enter Choice\n");
        System.out.println("1. Add Doctor");
        System.out.println("2. Add Patient");
        System.out.println("3. Show Staff");
        System.out.println("4. Show Patient");
        System.out.println("5. Discharge Patients");
        Scanner ch = new Scanner(System.in);
        while (true) {
            System.out.print("Enter your choice: ");
            int x = ch.nextInt();

            switch (x) {
                case 1 : {
                    Scanner setD = new Scanner(System.in);
                    System.out.println("Enter information of Doctor");
                    System.out.println("---------------------------");
                    System.out.print("Name of Doctor: ");
                    String tempName = setD.nextLine();
                    System.out.print("Enter Qualification: ");
                    String tempQ = setD.nextLine();
                    System.out.print("Enter Experience: ");
                    String tempEx = setD.nextLine();
                    System.out.print("Enter Salary given to Doctor: ");
                    String tempSal = setD.nextLine();
                    dr.add(new Doctor(tempName, tempQ, tempEx, tempSal));
                    System.out.println("----------------------------------------------------");
                    break;
                }
                case 2 : {
                    Scanner setP = new Scanner(System.in);
                    System.out.println("Enter information of Patient");
                    System.out.println("----------------------------");
                    System.out.print("Name of Patient: ");
                    String tempNameP = setP.nextLine();
                    System.out.print("Enter Age: ");
                    String tempAg = setP.nextLine();
                    System.out.print("Enter Illness: ");
                    String tempIll = setP.nextLine();
                    System.out.print("Enter Blood Group: ");
                    String tempBg = setP.nextLine();
                    pt.add(new Patient(tempNameP, tempAg, tempIll, tempBg));
                    System.out.println("----------------------------------------------------");
                    break;
                }
                case 3 : {
                    System.out.print("NAME, QUALIFICATIONS, EXPERIENCE, SALARY:   ");
                    for (int k = 0; k < dr.size(); k++) {
                        System.out.println(dr.get(k));
                    }
                    break;
                }
                case 4 : {
                    System.out.print("NAME, AGE, ILLNESS, BLOOD GROUP:    ");
                    for (int k = 0; k < pt.size(); k++) {
                        System.out.println(pt.get(k));
                    }
                    break;
                }
                case 5 : System.out.println("Coming Soon....");
                break;
                default : System.out.println("Wrong Choice\n   Try Again!");
            }
        }
    }
}
