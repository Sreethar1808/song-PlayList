package Listning;

import java.util.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


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


        System.out.println("Welcome to the Listenify playList");

        int currentIndex =0;

        System.out.println("Now playing"+ playList.get(currentIndex).toString());
        printmenu();
        startPlayList(playList);
    }

    public static void startPlayList(List<Song> playList)
    {

        Scanner sc = new Scanner(System.in);
        int currentIndex =0;
         boolean quickApplication =false;

         while(quickApplication==false)
         {
             System.out.println("Enter your choice");
             int choice =sc.nextInt();
             switch(choice)
             {
                 case 1: currentIndex=currentIndex+1;
                 if(currentIndex==playList.size())
                 {
                     currentIndex=0;
                 }
                     System.out.println("Now playing"+ playList.get(currentIndex).toString());

                     break;
                 case 2: currentIndex=currentIndex-1;
                     if(currentIndex==-1)
                     {
                         currentIndex=0;
                     }
                     System.out.println("Now playing"+ playList.get(currentIndex).toString());

                     break;

                 case 3:
                     System.out.println("Now playing"+ playList.get(currentIndex).toString());
                     break;
                 case 4:
                     Collections.shuffle(playList);
                     break;
                 case 5: playList.remove(currentIndex);
                 break;

                 case 6:
                     printmenu();
                     break;
                 case 7:
                     printPlayList(playList);
                 case 8:
                     quickApplication=true;
                     break;

             }

         }
    }
    public static void printmenu()
    {
        System.out.println("1. play the first song");
        System.out.println("2. play the previous song");
        System.out.println("3. suffle the song");
        System.out.println("4. Repeat the song");
        System.out.println("5. delete the song");
    }

    private static void printPlayList(List<Song> playList)
    {
         for(Song song: playList)
         {
             System.out.println(song.toString());
         }
    }
}