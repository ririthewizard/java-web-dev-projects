package org.launchcode;


public class MenuItem {
    private double price;
    private String description;
    private String category;
    static boolean isNew = true;

    public double getPrice() {
        return price;
    }

    private void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    private void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    private void setCategory(String category) {
        this.category = category;
    }

    public static boolean isNew() {
        return isNew;
    }

    private static void setNew(boolean aNew) {
        isNew = aNew;
    }

    public MenuItem(double price, String description, String category) {
        this.price = price;
        this.description = description;
        this.category = category;
    }

}
