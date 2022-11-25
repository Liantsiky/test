package objet;
import java.util.Date;
public class Mp3{
    int Id;
    String Titre;
    String Artiste;
    String Album;
    String DateDeSortie;
    Date DateModif;

    public int getId(){return this.Id}
    public String getTitre(){return Titre;}
    public String getArtiste(){return Artiste;}
    public String getAlbum(){return Album;}
    public String getDateDeSortie(){return DateDeSortie;}
    public Date getDateModif(){return DateModif;}    

    public void setId(int i){this.Id=i;}
    public void setTitre(String t){this.Titre=t;}
    public void setArtiste(String t){this.Artiste=t;}
    public void setAlbum(String t){this.Album=t;}
    public void setDateDeSortie(String t){this.DateDeSortie=t;}
    public void setDateModif(Date t){this.DateModif=t;}

    public Mp3(String a,String b,String c,String d,Date e){
        setTitre(a);
        setArtiste(b);
        setAlbum(c);
        setDateDeSortie(d);
        setDateModif(e);
    }

    public 
}