package experiment.test;

public class Employee {
  private String name;
  private String workid;
  private float salary;

  public Employee(String name, String workid, float salary) {
    this.name = name;
    this.workid = workid;
    this.salary = salary;
  }

  public String getName() {
    return name;
  }

  public String getWorkid() {
    return workid;
  }

  public float getSalary() {
    return salary;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setWorkid(String workid) {
    this.workid = workid;
  }

  public void setSalary(float salary) {
    this.salary = salary;
  }

}
