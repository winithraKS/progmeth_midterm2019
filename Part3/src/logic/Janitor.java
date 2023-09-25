package logic;

public class Janitor extends Employee{
    private String area;

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public Janitor(String name, int id, String area) {
        super(name, id, 15);
        setArea(area);
    }
    public int computeSalary(){
        return BackEndAPI.calculateMonthlySalary(getBaseSalary(),getBonus(),30);
    }

    @Override
    public String getDescription() {
        return BackEndAPI.getJanitorDescription(getId(),getName(),getArea(),getBonus());
    }
}
