/**
 * This code represents an insurance policy.
 */
public class Policy {
   private static int numberOfPolicies = 0;
   private String policyNumber;
   private String providerName;
   private PolicyHolder policyHolder; // Reference to a PolicyHolder
   
   /**
    * No-arg constructor and default values
    */
   public Policy() {
      this.policyNumber = "";
      this.providerName = "";
      this.policyHolder = new PolicyHolder();
      numberOfPolicies++;
   }
   
   /**
    * Constructor accepting arguments
    *
    *@param policyNumber The policy number.
    *@param providerName The name of the insurance provider.
    *@param policyHolder The PolicyHolder associated with this policy.
    */
   public Policy(String policyNumber, String providerName, PolicyHolder policyHolder) {
      this.policyNumber = policyNumber;
      this.providerName = providerName;
      this.policyHolder = policyHolder;
      numberOfPolicies++;
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
    * Gets the policy holder associated with this policy
    *
    * @return the policy holder
    */
   public PolicyHolder getPolicyHolder() {
      return policyHolder;
   }
   
   /**
    *Sets the policy holder associated with this policy
    *
    * @param policyHolder the policyholder to set
    */
   public void setPolicyHolder(PolicyHolder policyHolder) {
      this.policyHolder = policyHolder;
   }

   /**
    * Returns a string representation of the Policy object.
    *
    * @return String representation of the Policy object
    */
    @Override
    public String toString() {
      return "Policy Number: " + policyNumber + "\nProvider Name: " + providerName + "\nPolicyHolder: " + policyHolder.toString();
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
    /**
     * Gets the number of Policy objects created.
     *
     * @return The number of Policy objects created.
     */
    public static int getNumberOfPolicies() {
       return numberOfPolicies;
   }
}