public class Employee {
    private int id;
    private String name;
    private double sal;
    private String desg;

    public Employee(int id, String name, double sal, String desg) {
        this.id = id;
        this.name = name;
        this.sal = sal;
        this.desg = desg;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public String getDesg() {
        return desg;
    }
    public void setDesg(String desg) {
        this.desg = desg;
    }
    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sal=" + sal +
                ", desg='" + desg + '\'' +
                '}';
    }
}
