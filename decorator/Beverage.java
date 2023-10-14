public abstract class Beverage {
  String m_description = "Unknown Beverage";

  public String getDescription() {
    return m_description;
  }
  
  public abstract double cost();
}
