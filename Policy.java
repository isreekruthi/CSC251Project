/**
 * This code represents an insurance policy.
 */
public class Policy {
   private String policyNumber;
   private String providerName;
   private String firstName;
   private String lastName;
   private int age;
   private String smokingStatus;
   private double height;
   private double weight;
   
   /**
    * No-arg constructor and default values
    */
   public Policy() {
      this.policyNumber = "";
      this.providerName = "";
      this.firstName = "";
      this.lastName = "";
      this.age = 0;
      this.smokingStatus = "non-smoker";
      this.height = 0;
      this.weight = 0;
   }
   
   /**
    * Constructor accepting arguments
    *
    *@param policyNumber The policy number.
    *@param providerName The name of the insurance provider.
    *@param firstName The first name of the policyholder.
    *@param lastName The last name of the policyholder.
    *@param age The age of the policyholder.
    *@param smokingStatus The smoking status of the policyholder.
    *@param height The height of the policyholder in inches.
    *@param weight The weight of the policyholder in pounds.
    */
   public Policy(String policyNumber, String providerName, String firstName, String lastName, int age, String smokingStatus, double height, double weight) {
      this.policyNumber = policyNumber;
      this.providerName = providerName;
      this.firstName = firstName;
      this.lastName = lastName;
      this.age = age;
      this.smokingStatus = smokingStatus;
      this.height = height;
      this.weight = weight;
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
    * Gets the first name of the policyholder.
    *
    * @return the first name
    */
   public String getFirstName(){
      return firstName;
   }
   
   /**
    * Sets the first name of the policyholder
    *
    * @param firstName the first name to set.
    */
   public void setFirstName(String fristName) {
      this.firstName = firstName;
   }
   
   /**
    * Gets the last name of the policyholder
    *
    * @return the last name
    */
   public String getLastName() {
      return lastName;
   }
   
   /**
    * Sets the last name of the policyholder
    *
    * @param lastName the last name to set
    */
   public void setLastName(String lastName) {
      this.lastName = lastName;
   }
   
   /**
    * Gets the age of the policyholder
    *
    * @return the age
    */
   public int getAge() {
      return age;
   }
   
   /**
    * Sets the age of the policyholder
    *
    * @param age the age to set
    */
   public void setAge(int age) {
      this.age = age;
   }
   
   /**
    * Gets the smoking status of the policyholder
    *
    * @return the smoking status
    */
   public String getSmokingStatus() {
      return smokingStatus;
   }
   
   /**
    * Sets the smoking status of the policyholder
    *
    * @param smokingStatus the smoking status is set
    */
   public void setSmokingStatus(String smokingStatus) {
      this.smokingStatus = smokingStatus;
   }
   
   /**
    * Gets the height of the policyholder
    *
    * @return the height in inches
    */
   public double getHeight() {
      return height;
   }
   
   /**
    * Sets the height of the policyholder
    *
    * @param height the height to set in inches
    */
   public void setHeight(double height) {
      this.height = height;
   }
   
   /**
    * Gets the weight of the policyholder
    *
    * @return the weight in pounds
    */
   public double getWeight() {
      return weight;
   }
   
   /**
    * Sets the weight of the policyholder
    * 
    * @param weight the weight to set in pounds
    */
   public void setWeight(double weight) {
      this.weight = weight;
   }
   
   /**
    * Calculates the BMI of the policyholder.
    *
    * @return the BMI value
    */
   public double calculateBMI() {
      return (weight * 703) / (height * height);
   }

   /**
    * Calculates the insurance price based on the policyholder's attributes.
    * 
    * @return the insurance price
    */
   public double calculateInsurancePrice() {
      double baseFee = 600;
      double additionalFee = 0;
      if (age > 50) {
         additionalFee +=75;
      }
      if (smokingStatus.equals("smoker")) {
         additionalFee +=100;
      }
      double bmi = calculateBMI();
      if (bmi > 35) {
         additionalFee += (bmi - 35) * 20;
      }
      return baseFee + additionalFee;
   }
}