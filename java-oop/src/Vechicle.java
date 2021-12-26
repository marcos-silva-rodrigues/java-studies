public class Vechicle {

    private String color;
    private Double topSpeed;

    public Vechicle(String color, Double speed) {
        this.color = color;
        this.topSpeed = speed;
    }

    public Vechicle() {
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Double getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(Double topSpeed) {
        this.topSpeed = topSpeed;
    }

    public void methodOverriding() {
        System.out.println("This is a method from father class override");
    }
}
