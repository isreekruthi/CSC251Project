/**
 * This code represents an insurance policy.
 */
public class Policy {
   private String policyNumber;
   private String providerName;
   
   /**
    * No-arg constructor and default values
    */
   public Policy() {
      this.policyNumber = "";
      this.providerName = "";
   }
   
   /**
    * Constructor accepting arguments
    *
    *@param policyNumber The policy number.
    *@param providerName The name of the insurance provider.
    */
   public Policy(String policyNumber, String providerName) {
      this.policyNumber = policyNumber;
      this.providerName = providerName;
   }
   
   /**
    * Gets the policy number
    *
    * @return the policy number.
    */
   public String getPolicyNumber() {
      return policyNumber;
   }
   
   /**
    * Sets the policy number
    *
    * @param policyNumber The policy number to set
    */
   public void setPolicyNumber(String policyNumber) {
      this.policyNumber = policyNumber;
   }
   
   /**
    * Gets the insurance provider name
    *
    * @return the provider name
    */
   public String getProviderName() {
      return providerName;
   }
   
   /**
    * Sets the insurance provider name
    *
    * @param providerName The provider name to set.
    */
   public void setProviderName(String providerName) {
      this.providerName = providerName;
   }

   /**
    * Returns a string representation of the Policy object.
    *
    * @return String representation of the Policy object
    */
    @Override
    public String toString() {
      return "Policy Number: " + policyNumber + "\nProvider Name: " + providerName;
    }
 
   /**
    * Calculates the insurance price based on the policyholder's attributes.
    * 
    * @return the insurance price
    */
   public double calculateInsurancePrice(PolicyHolder policyHolder) {
      double baseFee = 600;
      double additionalFee = 0;
      if (policyHolder.getAge() > 50) {
         additionalFee +=75;
      }
      if (policyHolder.getSmokingStatus().equals("smoker")) {
         additionalFee +=100;
      }
      double bmi = policyHolder.calculateBMI();
      if (bmi > 35) {
         additionalFee += (bmi - 35) * 20;
      }
      return baseFee + additionalFee;
   }
}