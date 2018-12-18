import java.sql.SQLException;

/**
 * @author      Burhan Öztürk
 * @version     1.0                (current version number of program)
 */


//En public klasse, hvor klassens navn starter med stort navn.
public class Main {

    //En public statisk(Udnytter hukommelsen bedre) final(Peger på den samme reference på objektet)
    public static final String SOFTWARE_VERSION = "0.1.0";
    //En public statisk(Udnytter hukommelsen bedre) final(Peger på den samme reference på objektet)

    public static final String MEDIA_MAPPE = "media/";

    //En public statisk void metode med en parameter, som er en string array
    public static void main(String[] args) {

        //En metode af klassen Test.
        Test.test();
        Database nyData=new Database();
        try {
            nyData.database();
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }
}

