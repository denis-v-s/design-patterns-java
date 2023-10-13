public class StatisticsDisplay implements Observer, DisplayElement {
  private double m_maxTemp = Integer.MIN_VALUE;
  private double m_minTemp = Integer.MAX_VALUE;
  private double m_cumulativeTemp;
  private int m_numTempsCollected;
  
  public StatisticsDisplay(final WeatherData a_weatherData) {
    a_weatherData.registerObserver(this);
  }

  @Override
  public void update(final double a_t, final double a_h, final double a_p, final String a_f) {
    m_cumulativeTemp += a_t;
    m_numTempsCollected++;
    m_maxTemp = Math.max(m_maxTemp, a_t);
    m_minTemp = Math.min(m_minTemp, a_t);
    display();
  }

  @Override
  public void display() {
    System.out.println("--- Statistics ---\n" +
      "Avg Temperature: " + m_cumulativeTemp / m_numTempsCollected + "\n" +
      "Max Temperature: " + m_maxTemp + "\n" +
      "Min Temperature: " + m_minTemp + "\n"
    );
  }
  
}
