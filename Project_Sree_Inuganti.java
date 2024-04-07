import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Project_Sree_Inuganti {
   public static void main(String[] args) {
   ArrayList<Policy> policies = new ArrayList<>();
   
   //Read policies from file
   try {
        File file = new File("PolicyInformation.txt");
        Scanner fileScanner = new Scanner(file);
        
        //Read each line and create Policy objects
        while (fileScanner.hasNextLine()) {
            String policyNumber = fileScanner.nextLine();
            String providerName = fileScanner.nextLine();
            String firstName = fileScanner.nextLine();
            String lastName = fileScanner.nextLine();
            int age = Integer.parseInt(fileScanner.nextLine());
            String smokingStatus = fileScanner.nextLine();
            double height = Double.parseDouble(fileScanner.nextLine());
            double weight = Double.parseDouble(fileScanner.nextLine());
            
            //Create Policy object and add to ArrayList
            Policy policy = new Policy(policyNumber, providerName, firstName, lastName, age, smokingStatus, height, weight);
            policies.add(policy);
        }
        
        fileScanner.close();
      } catch (FileNotFoundException e) {
          System.out.println("File not found: " + e.getMessage());
      }
   //Display info about policy
   for (Policy policy :  policies) {
   
       System.out.println("Policy Number: " + policy.getPolicyNumber());
       System.out.println("Provider Name: " + policy.getProviderName());
       System.out.println("Policyholder's Name: " + policy.getFirstName() + " " + policy.getLastName());
       System.out.println("Policyholder's Age: " + policy.getAge());
       System.out.println("Policyholder's Smoking Status: " + policy.getSmokingStatus());
       System.out.println("Policyholder's Height: " + String.format("%.2f", policy.getHeight()) + " inches");
       System.out.println("Policyholder's Weight: " + String.format("%.2f", policy.getWeight()) + " pounds");
       System.out.println("Policyholder's BMI: " + String.format("%.2f", policy.calculateBMI()));
       System.out.println("Policy Price: $" + String.format("%.2f", policy.calculateInsurancePrice()));
      
       }
    }
}