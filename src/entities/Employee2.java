package entities;

public class Employee2 {
    private Integer id;
    private String name;
    private Double salary;

    public Employee2(){}

    public Employee2(int id, String name,double salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public void increaseSalary(double percent){
        salary += salary * percent / 100.0;
    }

    @Override
    public String toString() {
        return  id +
                ", "
                + name
                +", "
                + String.format("%.2f",salary);

    }
}
