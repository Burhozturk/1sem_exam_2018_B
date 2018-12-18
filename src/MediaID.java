//Importere disse klasser

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *  Hver mediefil hos TV2 skal have et unikt ID, og denne klasse hjælper med at genrere unikke ID'er
 *
 */

//En public klasse som hedder MediaID
public class MediaID {

    //En privat og statisk primitiv variabel af typen integer, som bliver deklareret og instacereret
    private static int latestId = 100;

    //En public statisk integer metode, uden en parameter, og hvor den returnerer en integer
    public static int generate() {

        //En ny objekt af klassen File, som hedder file, hvor den bliver instanceres og deklareres med en parameter
        File file = new File("media_id.txt");

        // Låser filen op før adgang
        // file.setWritable(true);

        //En Try Catch Undtagelse
        //En try blok, er en blok hvor en undtagelse kan forekomme
        try {

            //En if løkke med en parameter, som kører hvis denne fil eksisterer
            //If løkken har en parameter, som er en metode af en objekts klasse
            if (file.exists()) {
                //En ny objekt af klassen Filereader, som bliver instancret og deklareret med en parameter som er en objekt
                FileReader fileReader = new FileReader(file);
                //En ny objekt af klassen Scanner som bliver instanceret og deklareret med en parameter som er en objekt
                Scanner scanner = new Scanner(file);
                //Integer variabel bliver instanceret med en objekts metode, som er en input metode, der bliver omdænnet til en integer
                latestId = (int) scanner.nextInt();
            }

            //En increment operator(+1) for en integer
            latestId++;

            //En ny objekt af klassen Filewriter med en instancering og deklarering med en objekt
            FileWriter fileWriter = new FileWriter(file);
            //En metode af objektet som har en parameter, hvor en metode af en klasse køres med en parameter,
            //ToString Metoden er en metode som laver en objekt om til en string.
            fileWriter.write(Integer.toString(latestId));
            //en objekts metode.
            fileWriter.close();

            //En catch blok, hvor undtagelsen bliver behandlet.
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Låser filen ned for at den ikke redigeres ved en fejl
        // file.setReadOnly();
        //Returner denne integer variabel
        return latestId;
    }

}