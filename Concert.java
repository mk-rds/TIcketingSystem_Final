/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finaldemo;

import java.util.ArrayList;

/**
 *
 * @author User
 */
public class Concert {
    private String conName;
    private String conTime;  
    
   

    public Concert() {

    }

    public Concert(String conName, String conTime) {
        this.conName = conName;
        this.conTime = conTime;
        
    }

    
    public Concert(String conName){
        this.conName = conName;
    }
    
    public String getConName() {
        return conName;
    }

    public void setConName(String conName) {
        this.conName = conName;
    }

    public String getConTime() {
        return conTime;
    }

    public void setConTime(String conTime) {
        this.conTime = conTime;
    }

    
    @Override
    public String toString() {
        return "Concert{" + "conName=" + conName + ", conTime=" + conTime + '}';
    }
    
    public void printSongListBP() {
        ArrayList<String> songList = new ArrayList<>();
        songList.add("\n\t\t\t\t\t\t\t   SONGS PERFORMING\t\n\n\t\t\t\t\t\t |\t'Kill This Love'\t\t|");
        songList.add("\t\t\t\t\t\t |\t'Don't Know What to Do'\t\t|");
        songList.add("\t\t\t\t\t\t |\t'Kick It'\t\t\t|");
        songList.add("\t\t\t\t\t\t |\t'Hope Not'\t\t\t|");
        songList.add("\t\t\t\t\t\t |\t'Ddu-Du Ddu-Du'\t\t\t|");

        for (int i = 0; i <= songList.size() - 1; i++) {

            System.out.println(songList.get(i));

        }
    }
     public void printSongListJay() {
        ArrayList<String> songList = new ArrayList<>();
        songList.add("\n\t\t\t\t\t\t\t   SONGS PERFORMING\t\n\n\t\t\t\t\t\t |\t'Mojito'\t\t|");
        songList.add("\t\t\t\t\t\t |\t'Won't Cry'\t\t|");
        songList.add("\t\t\t\t\t\t |\t'Love Confession'\t\t|");
        songList.add("\t\t\t\t\t\t |\t'Waiting For You'\t\t|");
        songList.add("\t\t\t\t\t\t |\t'Silence'\t\t\t|");

        for (int i = 0; i <= songList.size() - 1; i++) {

            System.out.println(songList.get(i));

        }
       

    }
}

