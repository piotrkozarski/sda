package PrintHouse.model;

import java.util.Objects;

public class Material {
    private int id;
    private String name;
    private double multiplier;
    private String description;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMultiplier() {
        return multiplier;
    }

    public void setMultiplier(double multiplier) {
        this.multiplier = multiplier;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Material material = (Material) o;
        return id == material.id &&
                Double.compare(material.multiplier, multiplier) == 0 &&
                Objects.equals(name, material.name) &&
                Objects.equals(description, material.description);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, name, multiplier, description);
    }
}
