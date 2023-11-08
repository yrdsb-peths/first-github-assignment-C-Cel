public class Student
{
  private String firstName;
  private String lastName;
  private int gradeLevel;

  public Student(String fname, String lname, int gradeLevel)
  {
    firstName = fname;
    lastName = lname;
    this.gradeLevel = gradeLevel;
  }
  public String getFName()
  {
    return firstName;
  }
  public String getLName()
  {
    return lastName;
  }
  public int getGrade()
  {
    return gradeLevel;
  }
}
