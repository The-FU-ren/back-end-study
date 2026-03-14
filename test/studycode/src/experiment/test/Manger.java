package experiment.test;

public class Manger extends Employee {
  private float bonus;

  public Manger(String name, String workid, float salary, float bonus) {
    super(name, workid, salary);
    this.bonus = bonus;
  }
  // 构造函数不能忘

  @Override
  public float getSalary() {
    return super.getSalary() + bonus;
  }
}
