package Listning;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        Album a1 = new Album("Moon Light","A.R.rahman");

        a1.addNewSongToPlayList("Vibe",2.36);
        a1.addNewSongToPlayList("lover",3.46);
        a1.addNewSongToPlayList("sad",5.8);

        Album a2 = new Album("GVM","A.R.rahman");

        a2.addNewSongToPlayList("Hosona",2.36);
        a2.addNewSongToPlayList("manipaya",3.46);
        a2.addNewSongToPlayList("kanna",5.8);

        List<Song> playList = new ArrayList<>();

        a1.addSongToPlayList(1,playList);
        a1.addSongToPlayList("Vide",playList);
        a2.addSongToPlayList(2,playList);
        a2.addSongToPlayList("lover",playList);
    }

    public void printmenu()
    {
        System.out.println("1. play the first song");
        System.out.println("2. play the previous song");
        System.out.println("3. suffle the song");
        System.out.println("4. Repeat the song");
        System.out.println("5. delete the song");
    }
}