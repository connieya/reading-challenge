package pattern_observer;

public class ForecastDisplay implements Observer, DisplayElement {

    private WeatherData weatherData;
    private float currentPressure = 29.92f;
    private float lastPressure;


    public ForecastDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        lastPressure = currentPressure;
        currentPressure = weatherData.getPressure();
    }

    @Override
    public void display() {

    }

    @Override
    public void update() {

    }
}
