public class PolicyHolder {
   private String firstName;
   private String lastName;
   private int age;
   private String smokingStatus;
   private double height;
   private double weight;
   
   /**
    *
    * No-arg constructor and default values
    */
    
   public PolicyHolder() {
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
    *@param firstName The first name of the policyholder.
    *@param lastName The last name of the policyholder.
    *@param age The age of the policyholder.
    *@param smokingStatus The smoking status of the policyholder.
    *@param height The height of the policyholder in inches.
    *@param weight The weight of the policyholder in pounds.
    */
   public PolicyHolder(String firstName, String lastName, int age, String smokingStatus, double height, double weight) {
      this.firstName = firstName;
      this.lastName = lastName;
      this.age = age;
      this.smokingStatus = smokingStatus;
      this.height = height;
      this.weight = weight;
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
    * Returns a string representation of the PolicyHolder object.
    *
    * @return String representation of the PolicyHolder object.
    */
    @Override
    public String toString() {
      return "First Name: " + firstName + "\nLast Name: " + lastName + "\nAge: " + age + "\nSmoking Status: " + smokingStatus + "\nHeight: " + height + "\nWeight:" + weight;
    }
}