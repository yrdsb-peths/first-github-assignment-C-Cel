public class Student
{
  private String firstName;
  private String lastName;
  private int gradeLevel;
  private int height;

  public Student(String fname, String lname, int gradeLevel)
  {
    firstName = fname;
    lastName = lname;
    this.gradeLevel = gradeLevel;
  }

  public Student(int height)
  {
    this.height = height;
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
