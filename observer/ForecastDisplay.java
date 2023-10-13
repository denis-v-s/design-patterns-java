public class ForecastDisplay implements DisplayElement, Observer {
  private String m_forecast;

  public ForecastDisplay(final WeatherData a_weatherData) {
    a_weatherData.registerObserver(this);
  }
  
  @Override
  public void update(double a_t, double a_h, double a_p, String a_f) {
    m_forecast = a_f;
    display();
  }

  @Override
  public void display() {
    System.out.println("--- Forecast ---\nForecast: " + m_forecast + "\n");
  }
}
