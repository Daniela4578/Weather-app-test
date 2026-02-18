public class Temperature {
    private int temp;
    private int feels_like;
    private int min;
    private int max;

    public Temperature(int temp, int feels_like, int min, int max) {
        this.temp = temp;
        this.feels_like = feels_like;
        this.min = min;
        this.max = max;
    }

    public int getTemp() {
        return temp;
    }

    public void setTemp(int temp) {
        this.temp = temp;
    }

    public int getFeels_like() {
        return feels_like;
    }

    public void setFeels_like(int feels_like) {
        this.feels_like = feels_like;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

}
