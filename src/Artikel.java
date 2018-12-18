//En public klasse med en nedarvning fra klassen Media
public class Artikel extends Media
{
    //Klassevariabeller
    private String author;
    private String articletext;
    private String picture;


    public void logToConsol()
    {
        System.out.println(logToConsolString());

    }
}