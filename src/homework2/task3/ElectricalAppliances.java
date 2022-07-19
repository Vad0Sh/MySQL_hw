package homework2.task3;

public class ElectricalAppliances implements Comparable<ElectricalAppliances> {
    private String name;
    private int power;

    public ElectricalAppliances(String name, int power) {
        this.name = name;
        this.power = power;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public int compareTo(ElectricalAppliances o) {
        return (this.getPower() - o.getPower());
    }


    public String toString() {
        return "{" + name + '\'' +
                ", power=" + power + " ватт"+
                '}';
    }
}
