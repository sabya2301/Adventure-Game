package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    private static Map<Integer, Location> locations = new HashMap<Integer, Location>();


    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);

        locations.put(0, new Location(0, "You are sitting infront of a computer learning java"));
        locations.put(1, new Location(1, "You are standing at the end of a road"));
        locations.put(2, new Location(2, "You are at the top of the hill"));
        locations.put(3, new Location(3, "You are inside a building"));
        locations.put(4, new Location(4, "You are in a valley beside the stream"));
        locations.put(5, new Location(5, "You are in the forest"));

        locations.get(1).addExit("W", 2);
        locations.get(1).addExit("E", 3);
        locations.get(1).addExit("S", 4);
        locations.get(1).addExit("N", 5);
//        locations.get(1).addExit("Q", 0);

        locations.get(2).addExit("N", 5);
//        locations.get(2).addExit("Q", 0);

        locations.get(3).addExit("W", 1);
//        locations.get(3).addExit("Q", 0);

        locations.get(4).addExit("N", 1);
        locations.get(4).addExit("W", 2);
//        locations.get(4).addExit("Q", 0);

        locations.get(5).addExit("S", 1);
//        locations.get(5).addExit("Q", 0);



//        System.out.println(locations.containsKey(6));
        int loc = 1;
        while(true){
            System.out.println(locations.get(loc).getDescription());
            if(loc ==0){
                break;
            }

            Map<String , Integer> exits = locations.get(loc).getExits();
            System.out.println("Available exits are ");
            for(String exit: exits.keySet()) {
                System.out.print(exit + ", ");
            }
            System.out.println();
            String[] str = sc.nextLine().split(" ");
            String direction = "";
            if(str.length == 1){
                direction = str[0].toUpperCase();
            } else{
                for(String s: str){
                    if(s.equalsIgnoreCase("North")){
                        direction = "N";
                    }
                    if(s.equalsIgnoreCase("South")){
                        direction = "S";
                    }
                    if(s.equalsIgnoreCase("West")){
                        direction = "W";
                    }
                    if(s.equalsIgnoreCase("East")){
                        direction = "E";
                    }
                }
            }

//            String direction = sc.nextLine().toUpperCase();

            if(exits.containsKey(direction)){
                loc = exits.get(direction);
            } else{
                System.out.println("You cannot go in that direction");
            }

//            else {
//                loc = sc.nextInt();
//                if(locations.containsKey(loc)){
//
//                } else {
//                    System.out.println("You cannot go in that direction");
//                }
//            }
        }

    }
}
