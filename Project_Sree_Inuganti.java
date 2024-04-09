import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Project_Sree_Inuganti {
   public static void main(String[] args) {
       ArrayList<Policy> policies = new ArrayList<>();
       int smokers = 0;
       int nonSmokers = 0;
   
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
            PolicyHolder policyHolder = new PolicyHolder(firstName, lastName, age, smokingStatus, height, weight);
            Policy policy = new Policy(policyNumber, providerName,policyHolder);
            policies.add(policy);
        
            
            //Count smokers and non-smokers
            if (smokingStatus.equals("smoker")) {
               smokers++;
            } else {
               nonSmokers++;
            }
        }
        
        fileScanner.close();
      } catch (FileNotFoundException e) {
          System.out.println("File not found: " + e.getMessage());
      }
      
   //Display info about policy
   for (Policy policy :  policies) {
       System.out.println(policy);
       System.out.println();
       
       }
       
       System.out.println("The number of policies with a smoker is: " + smokers);
       System.out.println("The number of policies with a non-smoker is: " + nonSmokers);
       System.out.println("Number of Policy objects created: " + Policy.getNumberOfPolicies());
    }
}