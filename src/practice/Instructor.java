
package practice;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;

/**
 *
 * @author Harjap Singh
 */
public class Instructor {
    private String firstName;
    private String lastName;
    private String streetAddress;
    private String city;
    private String postalCode;
    private LocalDate hireDate;
    private LocalDate birthday;
    private int employeeNum;
    private ArrayList<String> teachableCourses;


    public Instructor(String firstName, String lastName, String streetAddress, String city, String postalCode, LocalDate hireDate, LocalDate birthday, int employeeNum){
        setFirstName(firstName);
        setLastName(lastName);
        setStreetAddress(streetAddress);
        setCity(city);
        setPostalCode(postalCode);
        setEmployeeNum(employeeNum);
        setHireDate(hireDate);
        setBirthday(birthday);
        this.teachableCourses= new ArrayList<String>();

}
 //get method for Firstname
    public String getFirstName(){
        return firstName;
        
    }
    /**
     * This Method set the First name using String
     * @param firstName and throws an exception when wrong
     */
    public void setFirstName(String firstName){
       
        if(firstName.isEmpty())
           throw new IllegalArgumentException("Cannot be empty");
        else 
            this.firstName= firstName;
    }
    //get method for lastname
    public String getLastName(){
        return lastName;
    }
    /**
     * This Method set the Last name using String
     * @param lastName and throws an exception when wrong
     */
    public void setLastName(String lastName){
        if(lastName.isEmpty())
           throw new IllegalArgumentException("Cannot be empty");
        else 
            this.lastName= lastName;
    }
    //get method for streetAddress
    public String getStreetAddress(){
        return streetAddress;
        
    }
    /**
     * This Method set the street Address using String
     * @param streetAddress and throws an exception when wrong
     */
    public void setStreetAddress(String streetAddress){
        if(streetAddress.isEmpty())
           throw new IllegalArgumentException("Cannot be empty");
        else 
            this.streetAddress= streetAddress;
    }
    //get method for city name
    public String getCity(){
        return city;
    }
    /**
     * This Method set the city name  using String
     * @param city and throws an exception when wrong
     */
    public void setCity(String city){
       if(city.isEmpty())
           throw new IllegalArgumentException("Cannot be empty");
        else 
            this.city= city;  
    }
    //get method for postalcode
    public String getPostalCode(){
        return postalCode;
    }
    /**
     * This Method set the postal code using String
     * @param postalCode and throws an exception when wrong
     */
    public void setPostalCode(String postalCode){
       if(postalCode.isEmpty())
           throw new IllegalArgumentException("Cannot be empty");
        else 
            this.postalCode= postalCode;  
    }
    
      public int getEmployeeNum(){
        return employeeNum;
    }
    /**
     * This Method set the employee no using integer
     * @param employeeNum and throws an exception when wrong
     * 
     */
    public void setEmployeeNum(int employeeNum){
        if(employeeNum > 0)
            this.employeeNum = employeeNum;

        else
            throw new IllegalArgumentException("Employee Number cannot be less than 0 or 0");
 
    }
    public LocalDate getBirthday(){
        return birthday;
    }
    /**
     * This Method set the Birthday  using LocalDate
     * @param birthday and throws an exception when wrong
     */
    public void setBirthday(LocalDate birthday){
       
        this.birthday= birthday; 
    }
    /**
     * This Method set the   using String
     * @param yearBorn and throws an exception when wrong
     */
    int getYearBorn() {
        return birthday.getYear();
      
    }
    public ArrayList<String> getTeachableCourses() {
        return teachableCourses;
    }
    
    public LocalDate getHireDate() {
       return hireDate; 
    }
    /**
     * This Method set the HireDate  using LocalDate
     * @param hireDate and throws an exception when wrong
     */
    public void setHireDate(LocalDate hireDate) {
       int yearsHired = LocalDate.now().getYear() - hireDate.getYear();
       
       if(yearsHired > 80 || yearsHired < 0) {
            throw new IllegalArgumentException("Invalid Hiredate");
       }           
       else {
            this.hireDate = hireDate;
        }
    }
    // To String method returning first and last name
     public String toString()
    {
        return firstName+ " " + lastName ;
    }
/**
     * This Method set the Age 
     * and throws an exception when wrong
     * @return age in years
     */
    public int getAgeInYears() {
        int ageinyears = LocalDate.now().getYear()- this.getYearBorn()-1;
        return ageinyears;    }
/**
     * This Method set the year at college
     * and throws an exception when wrong
     * @return  years at college
     */
    public int getYearsAtCollege() {
        int yearsatcollege= LocalDate.now().getYear()-this.hireDate.getYear()-1;
        return yearsatcollege;
    }

 
    
    public boolean canTeach(String courseCode) {
        return this.teachableCourses.contains(courseCode.toUpperCase());
    }

    public String listOfSubjectsCertifiedToTeach() {
        return null;
    }

    public void addCourseToAbilities(String courseCode) {
        if(courseCode.isEmpty()){
           throw new IllegalArgumentException("It cannot be empty");
        } else {
        this.teachableCourses.add(courseCode.toUpperCase());
        }
        
    }

    

   

    

    
}



