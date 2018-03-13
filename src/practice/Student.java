
package practice;
import java.time.LocalDate;

/**
 *
 * @author Harjap Singh
 */
public class Student {
    private String firstName;
    private String lastName;
    private String streetAddress;
    private String City;
    private String postalCode;
    private LocalDate dateOfBirth;
    private LocalDate dateOfEnrol;
    private int studentNum;
    private boolean inGoodStanding;
   
    public Student(String firstName, String lastName, String streetAddress,String City,String postalCode,LocalDate dateOfBirth,LocalDate dateOfEnrol,int studentNum) 
    {
        setFirstName(firstName);
        setLastName(lastName);
        setStreetAddress(streetAddress);
        setCity(City);
        setPostalCode(postalCode);
        setDateOfBirth(dateOfBirth);
        setDateEnrolled(dateOfEnrol);
        inGoodStanding = true;
        setStudentNum(studentNum);
    }
    //get method for Firstname
    public String getFirstName(){
        return firstName;
        
    }
    //set method for firstname
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
    //set method for lastname
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
    //set method for street address
    public void setStreetAddress(String streetAddress){
        if(streetAddress.isEmpty())
           throw new IllegalArgumentException("Cannot be empty");
        else 
            this.streetAddress= streetAddress;
    }
    //get method for city name
    public String getCity(){
        return City;
    }
    //set method for city name
    public void setCity(String City){
       if(City.isEmpty())
           throw new IllegalArgumentException("Cannot be empty");
        else 
            this.City= City;  
    }
    //get method for postalcode
    public String getPostalCode(){
        return postalCode;
    }
    //set method for postalcode
    public void setPostalCode(String postalCode){
       if(postalCode.isEmpty())
           throw new IllegalArgumentException("Cannot be empty");
        else 
            this.postalCode= postalCode;  
    }
    //get method for studentNum
     public int getStudentNum(){
        return studentNum;
    }
    //set method for studentNum
    public void setStudentNum(int studentNum){
        if(studentNum<0)
            throw new IllegalArgumentException(" not a valid student number and should be caught");
        else
            this.studentNum= studentNum;
    }
    //get method for date of birth
    public LocalDate getDateOfBirth(){
        return dateOfBirth;
    }
    //set method for Date of birth
    public void setDateOfBirth(LocalDate dateOfBirth){
       
        this.dateOfBirth= dateOfBirth; 
    }
    //get method for date enrollment in school
    public LocalDate getDateEnrolled(){
        
        return this.dateOfEnrol;
    }
    //set method for date enrolled
    public void setDateEnrolled(LocalDate dateOfEnrol){
        
        this.dateOfEnrol= dateOfEnrol;
    }
    //boolean method 
    boolean isInGoodStanding() {
         return this.inGoodStanding;
    }
    //boolean method
    boolean suspendStudent() {
        return this.inGoodStanding= false;
        
    }
    //boolean method
    boolean reinstateStudent() {
        return this.inGoodStanding= true;
    }
    //int method for Birthyear
    int getYearBorn() {
        return dateOfBirth.getYear();
      
    }
    //for age
    int getAge() {
    int ageinyears = LocalDate.now().getYear()- this.getYearBorn();
        return ageinyears; 
     }
    // method for Year enrolled
    int getYearEnrolled() {
        return this.dateOfEnrol.getYear();  
    }
    //to string method
     public String toString()
    {
        return firstName+ " " + lastName + ", student number: " + studentNum ;
    }

    boolean inGoodStanding() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
   
    
   

    
    
    
    
    
}


