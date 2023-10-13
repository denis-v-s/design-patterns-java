import java.util.*;

public class WeatherData {
  private List<Observer> m_observers = new ArrayList<>();
  private double m_temperature;
  private double m_humidity;
  private double m_pressure;
  private String m_forecast;
  
  public void registerObserver(final Observer o) {
    m_observers.add(o); 
  }
  
  public void removeObserver(final Observer o) {
    m_observers.remove(o);
  }
  
  public void notifyObservers() {
    for (final Observer o : m_observers) {
      o.update(m_temperature, m_humidity, m_pressure, m_forecast);
    }
  }
  
  public void setWeatherData(final double a_t, final double a_h, final double a_p, final String a_f) {
    m_temperature = a_t;
    m_humidity = a_h;
    m_pressure = a_p;
    m_forecast = a_f;
    notifyObservers();
  }
}
