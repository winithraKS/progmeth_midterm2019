package logic;

public abstract class Employee {
    protected String name;
    protected int id;
    protected int baseSalary;
    protected int bonus;

    public String getName() {
        return name;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = Math.max(0,bonus);
    }

    public int getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(int baseSalary) {
        this.baseSalary = Math.max(0,baseSalary);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
    public Employee(String name, int id, int baseSalary){
        setId(id); setBaseSalary(baseSalary);
        setName(name); setBonus(0);
    }
    public abstract int computeSalary();
    public abstract String getDescription();
}
