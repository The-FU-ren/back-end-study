package experiment.test;

public class Circle extends AbstractShape {
  private double radius;

  public Circle(String name, double radius) {
    super(name);
    this.radius = radius;
  }

  // @Override
  // public String getName() {
  // return name;
  // }

  @Override
  public double calculateArea() {
    return Math.PI * radius * radius;
  }

  // 计算圆的周长
  @Override
  public double calculatePerimeter() {
    return 2 * Math.PI * radius;
  }

}
