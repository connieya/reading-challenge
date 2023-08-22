package headfirst_design_pattern.pattern_observer;

public class CurrentConditionDisplay implements Observer ,DisplayElement  {
    private float temperature;
    private float humidity;
    private WeatherData weatherData;

    public CurrentConditionDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("현재 상태 : 온도 " + temperature + "F, 습도 +" + humidity + "%");
    }

    @Override
    public void update() {
        this.temperature = weatherData.getTemperature();
        this.humidity = weatherData.getHumidity();
        // 주제의 게터 메소드를 이용한다.
        display();
    }
}
