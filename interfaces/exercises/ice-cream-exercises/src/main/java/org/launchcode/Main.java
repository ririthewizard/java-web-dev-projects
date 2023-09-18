package org.launchcode;

import java.util.ArrayList;
import java.util.Comparator;


public class Main {
    public static void main(String[] args) {
        Case menu = new Case();
        ArrayList<Flavor> flavors = menu.getFlavors();
        ArrayList<Cone> cones = menu.getCones();

        // TODO: Use a Comparator class to sort the 'flavors' array alphabetically by the 'name' field.
//        for (Flavor flavor: flavors){
//            System.out.println(flavor);
//        }

        flavors.sort(new FlavorComparator());

//        for (Flavor flavor: flavors){
//            System.out.println(flavor);
//        }

        // TODO: Use a Comparator class to sort the 'cones' array in increasing order by the 'cost' field.
//        for(Cone cone: cones){
//            System.out.println(cone);
//        }

        cones.sort(new ConeComparator());

//        for(Cone cone: cones){
//            System.out.println(cone);
//        }

        // TODO: Print the 'flavors' and 'cones' lists (in a clear manner) to verify the sorting.
    }
}