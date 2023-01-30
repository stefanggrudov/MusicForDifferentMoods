
import java.util.ArrayList;


public class Songs {
    private int indx;
    private int size;
    private ArrayList<String> songs = new ArrayList<>();
    Songs()
    {
        indx = 0;
        size = 0;
    }
    void add_song(String song)
    {
        songs.add(song);
        size++;
    }
    String next()
    {
        if(indx<size-1)
        {
            indx++;
        }
        else
        {
            indx = 0;
        }
        return songs.get(indx);
    }
    void setIndx(int newIndx)
    {
        indx = newIndx;
    }
    int getIndx()
    {
        return indx;
    }
    String getSong(int indx)
    {
        return songs.get(indx);
    }
    void deleteSong(int indx)
    {
        songs.remove(indx);
        size--;
    }
}
