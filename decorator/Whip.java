public class Whip extends CondimentDecorator {
  private Beverage m_beverage;

  public Whip(final Beverage a_beverage) {
    m_beverage = a_beverage;
  }

  @Override
  public String getDescription() {
    return m_beverage.getDescription() + ", Whip";
  }

  @Override
  public double cost() {
    return m_beverage.cost() + 0.10;
  }
}
