package com.example.bracket;

import java.io.Console;

public class Main {
    public static void main(String[] args) {
        BracketSystem b = new BracketSystem();
        Console con = System.console();
        
        addWinner(con, b);
        addWinner(con, b);
        b.printAllWinners();
    }

    public static void addWinner(Console con, BracketSystem b){
        String s;
        while(true){
            s = con.readLine();
            if(s.equals("end")){
                break;
            }
            b.addWinner(s);
        }
    }
}