package experiment.test;

public abstract class AbstractShape implements Shape {
  // 公共的属性和方法可以放在这里
  protected String name;

  public AbstractShape(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

}
