
package practice;

import java.util.ArrayList;


/**
 *
 * @author Harjap Singh
 */
public class Course {
    
    private Instructor instructor;
    private String courseName;
    private String courseCode;
    private String room;
    int maxStudents;
    

public Course(Instructor instructor, String courseCode, String courseName, String room, int maxStudents) {        
        setInstructor(instructor);
        setCourseName(courseName);
        setCourseCode(courseCode);
        setRoom(room);
        setMaxStudents(maxStudents);      
}    
      
    public Instructor getInstructor() {
        return instructor; 
    }
    /**
     * This Method set the Instructor name 
     * and throws an exception when wrong
     * @param instructor
     */
    public void setInstructor(Instructor instructor){
       this.instructor= instructor;
    }
    
    public String getCourseName(){
        return courseName;
    }
    /**
     * This Method set the courseName 
     * and throws an exception when wrong
     * @param courseName
     * 
     */
    public void setCourseName(String courseName){
        if(courseName.isEmpty())
            throw new IllegalArgumentException("CourseName cannot be Empty");
        else
            this.courseName= courseName;
    }
    
    public String getCourseCode() {
        return courseCode;
    }
   /**
     * This Method set the courseCode
     * and throws an exception when wrong
     * @param courseCode
     * 
     */
    public void setCourseCode(String courseCode) {
         if(courseCode.isEmpty())
            throw new IllegalArgumentException("It cannot be empty");
        else
            this.courseCode = courseCode;
        

    }
    public String getRoom(){
        return room;

    }
    /**
     * This Method set the room no 
     * and throws an exception when wrong
     * @param room
     * 
     */
    public void setRoom(String room){
        if(room.isEmpty())
            throw new IllegalArgumentException("Cannot be empty");
        else
            this.room= room;
    }
    
    // To String returning coursename and coursecode
     public String toString() {
        return String.format("%s %s", this.courseName, this.courseCode);
    }
     
    public int getMaxStudents() 
    {
        return maxStudents;
    }
    /**
     * This Method set the total students
     * and throws an exception when wrong
     * @param maxStudents
     * 
     */
    public  void setMaxStudents(int maxStudents){
        if (maxStudents >0 && maxStudents <46)
            this.maxStudents= maxStudents;
    else
          throw new IllegalArgumentException("Cannot be empty");  

}

    void addStudent(Student student) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    Object getStudents() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    


}
