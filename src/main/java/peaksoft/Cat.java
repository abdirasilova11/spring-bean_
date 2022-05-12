package peaksoft;

public class Cat {
    private String name;
    private int year;
    private int weight;

    public Cat(String name, int year, int weight) {
        this.name = name;
        this.year = year;
        this.weight = weight;
    }

    public Cat() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
