public class Espresso extends Beverage {
  public Espresso() {
    m_description = "Espresso";
  }

  @Override
  public double cost() {
    return 1.99;
  }
}
