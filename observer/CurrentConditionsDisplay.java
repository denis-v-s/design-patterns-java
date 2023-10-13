public class CurrentConditionsDisplay implements Observer, DisplayElement {
  private double m_temperature;
  private double m_humidity;
  private double m_pressure;

  public CurrentConditionsDisplay(final WeatherData a_weatherData) {
    a_weatherData.registerObserver(this);
  }

  public void update(final double a_t, final double a_h, final double a_p, final String a_f) {
    m_temperature = a_t;
    m_humidity = a_h;
    m_pressure = a_p;
    display();
  }
  
  @Override
  public void display() {
    System.out.println("--- Current Conditions ---\n" + 
      "Temperature: " + m_temperature + "F\n" +
      "Humidity: " + m_humidity + "%\n" + 
      "Pressure: " + m_pressure + " inHg\n"
    );
  }
}
