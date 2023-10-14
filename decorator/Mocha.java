public class Mocha extends CondimentDecorator {
  public Mocha(final Beverage a_beverage) {
    m_beverage = a_beverage;
  }

  @Override
  public String getDescription() {
    return m_beverage.getDescription() + ", Mocha";
  }

  @Override
  public double cost() {
    return m_beverage.cost() + 0.20;
  }
}
