import com.org.observer.impl.ConcurrentConditionsDisplay;
import com.org.observer.impl.StatisticsDisplay;
import com.org.observer.impl.WeatherData;

public class ObserverPatternWeatherStation {

    public static void main (String [] args){
        WeatherData weatherData = new WeatherData();
        ConcurrentConditionsDisplay concurrentConditionsDisplay = new ConcurrentConditionsDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);

        weatherData.setMeasurement(80, 65, 30.4f);
        weatherData.setMeasurement(82, 75, 29.2f);

    }
}
