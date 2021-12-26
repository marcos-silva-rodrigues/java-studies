public class Car extends Vechicle{

    private Integer shifts;

    public Car() {
        super("Black", 160.0);
        this.shifts = 2;
    }

    public Car(String color, Double topSpeed, Integer shifts) {
        super(color, topSpeed);
        this.shifts = shifts;
    }

    public Integer getShifts() {
        return this.shifts;
    }

    public void setShifts(Integer shifts) {
        this.shifts = shifts;
    }

    @Override
    public void methodOverriding() {
        System.out.println("This is a method from Child class overriding");;
    }
}
