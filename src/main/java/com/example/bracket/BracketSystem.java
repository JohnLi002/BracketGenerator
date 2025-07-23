package com.example.bracket;

import java.util.ArrayList;
import java.util.Collections;

public class BracketSystem {
    public ArrayList<String> WinnerBracket = new ArrayList<String>();
    public ArrayList<String> LoserBracket = new ArrayList<String>();


    public void addWinners(String[] s){
        for(int i = 0; i < s.length; i++){
            WinnerBracket.add(s[i]);
        }
    }

    public void addWinner(String s){
        WinnerBracket.add(s);
    }

    public void removeWinners(String s){
        WinnerBracket.remove(s);
    }

    public void printAllWinners(){
        WinnerBracket.forEach(n -> System.out.println(n));
    }

    public String[] getWinners(){
        return (String[]) WinnerBracket.toArray();
    }

    public void addLosers(String[] s){
        for(int i = 0; i < s.length; i++){
            LoserBracket.add(s[i]);
        }
    }

    public void shuffleWinners(){
        ArrayList<String> replace = new ArrayList<String>();
        int i;
        while(!WinnerBracket.isEmpty()){
            i = (int) (Math.random()*WinnerBracket.size());
            replace.add(WinnerBracket.get(i));
            WinnerBracket.remove(i);
        }
        WinnerBracket = replace;
    }

    public void shuffleLosers(){
        Collections.shuffle(LoserBracket);
    }

    public void removeLosers(String s){
        LoserBracket.remove(s);
    }

    public void printAllLosers(){
        LoserBracket.forEach(n -> System.out.println(n));
    }

    public String[] getLosers(){
        return (String[]) LoserBracket.toArray();
    }

    public void playerLoss(String s){
        int i = WinnerBracket.indexOf(s);
        LoserBracket.add(WinnerBracket.get(i));
        WinnerBracket.remove(i);
    }
}
