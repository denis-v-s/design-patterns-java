public class App {

  public static void main(String[] args) {
    final WeatherData weatherData = new WeatherData();
    new CurrentConditionsDisplay(weatherData);
    new StatisticsDisplay(weatherData);
    new ForecastDisplay(weatherData);
    
    weatherData.setWeatherData(72, 60, 29.92, "Sunny");
    weatherData.setWeatherData(75, 55, 30.00, "Cloudy");
  }

}