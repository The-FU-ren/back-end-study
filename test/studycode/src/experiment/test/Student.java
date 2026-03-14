package experiment.test;

public class Student implements Comparable<Student> {
  private String name;
  private float score;
  private int SID;

  public Student(String name, float score, int SID) {
    this.name = name;
    this.score = score;
    this.SID = SID;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public float getScore() {
    return score;
  }

  public void setScore(float score) {
    this.score = score;
  }

  public int getSID() {
    return SID;
  }

  public void setSID(int sID) {
    SID = sID;
  }

  @Override
  public int compareTo(Student o) {
    return Float.compare(this.score, o.score);
  }

}
