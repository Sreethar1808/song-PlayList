package Listning;

import java.util.ArrayList;
import java.util.List;
public class Album {
    private String AlbumName;
    private String ArtistName;

    private List<Song> songList;

    public Album(String albumName, String artistName) {
        AlbumName = albumName;
        ArtistName = artistName;
        songList = new ArrayList<>();
    }

    public boolean findSong(String title)
    {
        for(Song song: songList)
        {
            if(song.getSongTitle().equals(title))
            {
                return true;
            }
        }
        return false;
    }

    public String addNewSongToPlayList(String title, double duration)
    {
        if(findSong(title)==false)
        {
            Song new_song = new Song(title,duration);
            songList.add(new_song);
            return "Song added";
        }
        else {
            return "song is already present";
        }
    }

    public void addSongToPlayList(int songNo, List<Song> playList)
    {
        int index = songNo-1;
        if(index<=songList.size()-1)
        {
            Song song = songList.get(index);
            playList.add(song);
        }
    }

    public void addSongToPlayList(String title,List<Song> playList)
    {
        for(Song song : songList)
        {
            if(song.getSongTitle().equals(title))
            {
                playList.add(song);
                return;
            }
        }
    }
}
