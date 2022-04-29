package restaurant;

import java.util.Objects;

public class MenuItem {
    private String name;
    private double price;
    private String description;
    private String category;
    private boolean isNew;

//constructor with all variables
    public MenuItem(String name, double price, String description, String category, boolean isNew) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.category = category;
        this.isNew = isNew;
    }

    //constructor with default variables
    public MenuItem(String name, double price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;

        this.category = "Not Defined";
        this.isNew = false;
    }

    // getters
    public double getPrice() {
        return this.price;
    }

    public String getDescription() {
        return description;
    }

    public String getCategory() {
        return category;
    }

    public boolean isNew() {
        return isNew;
    }

    // setters
    public void setPrice(double price) {
        this.price = price;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setNew(boolean isNew) {
        this.isNew = isNew;
    }

    //methods


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MenuItem menuItem = (MenuItem) o;
        return Double.compare(menuItem.price, price) == 0 && name.equals(menuItem.name) && description.equals(menuItem.description) && category.equals(menuItem.category);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description);
    }

    @Override
    public String toString() {
        return "Category: " + this.category + "\n" +
                "Name: " + this.name + "\n" +
                "Price: " + this.price + "\n" +
                "Description: " + this.description + "\n" +
                "New: " + this.isNew + "\n";
    }

}
