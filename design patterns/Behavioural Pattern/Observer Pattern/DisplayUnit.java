
public class DisplayUnit implements Observer {
    private String name;

    public DisplayUnit(String name) {
        this.name = name;
    }

    @Override
    public void update(float temperature, float humidity) {
        System.out.println(name + " - Temperature: " + temperature + ", Humidity: " + humidity);
    }
}