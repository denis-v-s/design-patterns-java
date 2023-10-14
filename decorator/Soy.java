public class Soy extends CondimentDecorator {
  public Soy(final Beverage a_beverage) {
    m_beverage = a_beverage;
  }

  @Override
  public String getDescription() {
    return m_beverage.getDescription() + ", Soy";
  }

  @Override
  public double cost() {
    return m_beverage.cost() + 0.15;
  }
}
