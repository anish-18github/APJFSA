// Base class Doctor
package method;
// Method representing a surgery action
class Doctor{
    public void surgery() {
        System.out.println("Performing Surgery.......");
    }
}

    // Derived class Surgeon extending Doctor
class Surgeon extends Doctor{
    // Surgeon inherits the surgery() method from Doctor
}

    // Derived class Nurse extending Doctor 
    class Nurse extends Doctor {
    // Method representing a treatment action
    public void Treatment(){
        System.out.println("Providing Treatment.......");
    }
}

// Main class to test the hierarchy
public class MedicalStaff {
    public static void main(String[] args) {
        
        Doctor doctor = new Doctor();   // Create an instance of Doctor
        Surgeon surgeon = new Surgeon();    // Create an instance of Surgeon
        Nurse nurse = new Nurse();  // Create an instance of Nurse

        // Call method fron each class
        doctor.surgery();   // Call the surgery method from the Doctor instance
        surgeon.surgery();  // Call the surgery method from the surgeon instance
        nurse.surgery();    // Call the surgery method from the Nurse instance
        nurse.Treatment();  // Call the Treatment method from the nurse instance
    }
}
