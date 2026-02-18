public class Weather {
    private String condition;
    private Temperature temp;
    private int pressure;
    private int humidity;

    public Weather(String condition, Temperature temp, int pressure, int humidity) {
        this.condition = condition;
        this.temp = temp;
        this.pressure = pressure;
        this.humidity = humidity;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public Temperature getTemp() {
        return temp;
    }

    public void setTemp(Temperature temp) {
        this.temp = temp;
    }

    public int getPressure() {
        return pressure;
    }

    public void setPressure(int pressure) {
        this.pressure = pressure;
    }

    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }
}
