package main;

import planet.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) {

    }

    public static Planet planet;


    static {
        try {
            readFromConsole();
        }catch (IOException e){
            e.printStackTrace();
        }

    }

    public static void readFromConsole() throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String read = reader.readLine();
        switch (read){
            case Planet.Earth:
                planet = Earth.getEarth();
                break;
            case Planet.Mars:
                planet = Mars.getMars();
                break;
            case Planet.Jupiter:
                planet = Jupiter.getJupiter();
                break;
            case Planet.Pluto:
                planet = Pluto.getPluto();
                break;
            default:
                planet = null;
                break;
        }
    }
}
