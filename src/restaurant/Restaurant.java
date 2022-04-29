package restaurant;

import restaurant.MenuItem;

public class Restaurant {
    public static void main(String[] args) {
       MenuItem item1 = new MenuItem("Flan", 3.75, "wiggly", "Dessert", true);
       MenuItem item2 = new MenuItem("Chilaquiles", 12.95, "crispy gone soggy", "Breakfast", true);
       MenuItem item3 = new MenuItem("Chilaquiles", 12.95, "crispy gone soggy", "Breakfast", true);

      //test to string
//       System.out.println(item1);


//        //test equals
//        System.out.println(item2.equals(item3));
//        System.out.println(item1.equals(item3));


        Menu testMenu = new Menu();
        testMenu.addMenuItem(item1);
        testMenu.addMenuItem(item2);
        testMenu.addMenuItem(item3);

        System.out.println(testMenu);


//        testMenu.removeMenuItem(item3);
//        System.out.println(testMenu);
//
//        testMenu.addMenuItem(item3);
//        System.out.println(testMenu);




    }
}
