public class App {
  public static void main(String[] args) {
    final Beverage beverage = new Espresso();
    System.out.println(beverage.getDescription() + " $" + beverage.cost());
    
    final Beverage beverage2 = new Whip(new Mocha(new Soy(new HouseBlend())));
    System.out.println(beverage2.getDescription() + " $" + beverage2.cost());
  }
}
