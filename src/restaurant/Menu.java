package restaurant;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private Date lastUpdated;
    private ArrayList<MenuItem> menuItems;

    // an empty constructor, it just creates an empty list for the menuItems and uses the current time for lastUpdated
    public Menu() {
        this.lastUpdated = Date.from(Instant.now());
        this.menuItems = new ArrayList<>();
    }

    // a constructor that allows the user to create the menu with a pre-existing list of menuItems
    public Menu(ArrayList<MenuItem> items) {
        this.lastUpdated = Date.from(Instant.now());
        this.menuItems = items;
    }

    // getter for .lastUpdated
    public Date getLastUpdated() {
        return lastUpdated;
    }

    // getter for .getMenuItems()
    public ArrayList<MenuItem> getMenuItems() {
        return menuItems;
    }


        // methods


    public void addMenuItem(MenuItem item) {
        for (MenuItem menuItem : menuItems) {
            if (menuItem.equals(item)) {
                System.out.println("Cannot add duplicate items");
                return;
            }
        }

                this.menuItems.add(item);
                this.lastUpdated = new Date();

            }

    public void removeMenuItem(MenuItem item) {
        this.menuItems.remove(item);
        this.lastUpdated = new Date();
    }


//    @Override
//    public String toString() {
//        return menuItems +
//                "Menu current as of: " + lastUpdated;
//    }
    @Override
    public String toString() {
        String returnString = "";
        for (MenuItem item : this.menuItems) {
            returnString += item.toString() + "\n";
        }
        return returnString + "Menu updated: " + lastUpdated;
    }

    // no setters --- as of now I don't think there is any reason to overwrite the properties
}