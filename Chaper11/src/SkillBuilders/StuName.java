package SkillBuilders;
public class StuName {
  private String firstName;
  private String lastName;
  
 
   
  public StuName(String first, String last) {
      this.firstName = first;
      this.lastName = last;
  }
  
  public String toString() {
      return firstName + " " + lastName;
  }
}
