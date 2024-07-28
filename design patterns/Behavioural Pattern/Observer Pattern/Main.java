
public class Main {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();
        DisplayUnit display1 = new DisplayUnit("Display 1");
        DisplayUnit display2 = new DisplayUnit("Display 2");

        weatherStation.addObserver(display1);
        weatherStation.addObserver(display2);

        weatherStation.setMeasurements(25.0f, 65.0f);
        weatherStation.setMeasurements(28.0f, 70.0f);
    }
}
