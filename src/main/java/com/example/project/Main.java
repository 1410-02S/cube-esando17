package com.example.project;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;

//import apple.laf.JRSUIConstants.Direction;

public class Main {
    public static final String CLOCKWISE = "clockwise";
    public static final String COUNTER_CLOCKWISE= "counterClockwise";
    public static void main(final String[] args) 
    throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        ArrayList<String> commands = new ArrayList<String>();
        Cube cube = new Cube();
        System.out.println("Please enter how you would like to mix code."
            +"Type: U, D, R, L, F, B, U', R', L', F', or B' then press enter ");
        String answer = reader.readLine();
        
        for(int i =0; i<answer.length(); i++){
            if(i+1 < answer.length() && answer.charAt(i+1) == '\'' ){
                    commands.add(answer.charAt(i)+ "'");
                    i = i+1;
            } 
            else{
                commands.add(answer.charAt(i)+ "");
            }

        }
        for(int i= 0; i < commands.size(); i++){
        //switches put here 
        switch(commands.get(i)){

        case"U":
            cube.turnFace(4, Main.CLOCKWISE); //4
        break;

        case"D":
            cube.turnFace(5, Main.CLOCKWISE);
        break;

        case"R":
            cube.turnFace(0, Main.CLOCKWISE);
        break;

        case"L":
        cube.turnFace(2, Main.CLOCKWISE);
        break;

        case"F":
            cube.turnFace(1, Main.CLOCKWISE);
        break;

        case"B":
            cube.turnFace(3, Main.CLOCKWISE);
        break;

        case"U'":
            cube.turnFace(4, Main.COUNTER_CLOCKWISE);
        break;

        case"D'":
            cube.turnFace(4, Main.COUNTER_CLOCKWISE);
        break;

        case"R'":
            cube.turnFace(0, Main.COUNTER_CLOCKWISE);
        break;

        case"L'":
            cube.turnFace(2, Main.COUNTER_CLOCKWISE);
        break;

        case"F'":
            cube.turnFace(1, Main.COUNTER_CLOCKWISE);
        break;

        case"B'":
            cube.turnFace(3, Main.COUNTER_CLOCKWISE);
        break;
        }

    }
    
    System.out.println("Your cube looks like this:" );    
    cube.print();

    System.out.print("This is how you solve it and what it looks like solved ");
    System.out.println();
    HashMap<String,String> backwards = new HashMap<>();
    backwards.put("U", "U'");
    backwards.put("D", "D'");
    backwards.put("R", "R'");
    backwards.put("L", "L'");
    backwards.put("F", "F'");
    backwards.put("B", "B'");
    backwards.put("U'", "U");
    backwards.put("D'", "D");
    backwards.put("R'", "R");
    backwards.put("L'", "L");
    backwards.put("F'", "F");
    backwards.put("B'", "B");
    for(int j = commands.size()-1; j>=0; j--){
        System.out.print(backwards.get(commands.get(j)));
    }
    System.out.println();

    Cube solvedCube = new Cube(); 
        solvedCube.print();
    
   
    
}
}
