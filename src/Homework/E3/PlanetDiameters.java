/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Homework.E3;

import java.util.*;

/**
 *
 * @author Admin
 */
public class PlanetDiameters {
     //array of planets’ name
    private static final String[] names = {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune", "Pluto" };

    //Array of planets’ diameter
    private static final float[] diameters = { 4800f, 12103.6f, 12756.3f, 6794f, 142984f, 120536f, 51118f, 49532f, 2274f };

    public static void main(String[] args) {
          //Use Map to store planets’ names and their corresponding
       //diameters.
        Map planets = new LinkedHashMap();
       
        // Add items (key , value) to the map
        for (int i = 0; i < names.length; i++)
            planets.put(names[i].toLowerCase(), diameters[i]);
       
        // Traverse the map
        Iterator it = planets.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry e = (Map.Entry) it.next();
            System.out.println(((String)e.getKey()).toUpperCase() + ": " + e.getValue());
        }
        System.out.println("--------------------");
       
        // Find a planet by name basing on key
        while (true) {
            System.out.print("Find planet (ENTER to quit): ");
            String name = (new Scanner(System.in)).nextLine();
            if (name.length() == 0) break;
           
            if (!planets.containsKey(name))
                System.out.println("Planet " + name + " not found!");
            else
                System.out.println("The diameter of " + name +
                  " is " + planets.get(name));
        }
    }

}
