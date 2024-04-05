import java.util.Scanner;

public class Project_Sree_Inuganti {
   public static void main(String[] args) {
   Scanner scanner = new Scanner(System.in);
   
   //Get User Input
   System.out.println("Please enter the Policy Number:");
   String policyNumber = scanner.nextLine();
   
   System.out.println("Please enter the Provider Name:");
   String providerName = scanner.nextLine();
   
   System.out.println("Please enter the Policyholder's First Name:");
   String firstName = scanner.nextLine();
   
   System.out.println("Please enter the Policyholder's Last Name:");
   String lastName = scanner.nextLine();
   
   System.out.println("Please enter Policyholder's Age:");
   int age = Integer.parseInt(scanner.nextLine());
   
   System.out.println("Please enter the Policyholder's Smoking Status (smoker/non-smoker):");
   String smokingStatus = scanner.nextLine();
   
   System.out.println("Please enter the Policyholder's Height (in inches):");
   double height = Double.parseDouble(scanner.nextLine());
   
   System.out.println("Please enter the Policyholder's Weight (in pounds):");
   double weight = Double.parseDouble(scanner.nextLine());
   
   //Create instance of Policy Class
   Policy policy = new Policy(policyNumber, providerName, firstName, lastName, age, smokingStatus, height, weight);
   
   //Display info about policy
   System.out.println("Policy Number: " + policy.getPolicyNumber());
   System.out.println("Provider Name: " + policy.getProviderName());
   System.out.println("Policyholder's Name: " + policy.getFirstName() + " " + policy.getLastName());
   System.out.println("Policyholder's Age: " + policy.getAge());
   System.out.println("Policyholder's Smoking Status: " + policy.getSmokingStatus());
   System.out.println("Policyholder's Height: " + String.format("%.2f", policy.getHeight()) + " inches");
   System.out.println("Policyholder's Weight: " + String.format("%.2f", policy.getWeight()) + " pounds");
   System.out.println("Policyholder's BMI: " + String.format("%.2f", policy.calculateBMI()));
   System.out.println("Policy Price: $" + String.format("%.2f", policy.calculateInsurancePrice()));
      
   scanner.close();
    }
}