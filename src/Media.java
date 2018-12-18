//Importerer disse klasser

import java.io.File;
import java.time.Instant;
import java.util.Date;

//En public klasse som hedder Media
public class Media {

    //En privat(Kun tilgængelig i klassen)  variabel af typen Integer(Primitiv data type) som bliver deklareret
    private int assetId;
    //En privat(Kun tilgængelig i klassen)  variabel af typen String som bliver deklareret
    private String name;
    //En privat(Kun tilgængelig i klassen)  variabel af typen Date, som bliver deklareret og instanceret
    private Date created = new Date();
    //En privat(Kun tilgængelig i klassen)  variabel af typen String, som bliver deklareret
    private String fileName;


    //En constructor uden parametre
    public Media() {
        //Den private integer variabel instanceres med en klasse metode
        assetId = MediaID.generate();
        //Den private date instanceres med en klasse metode, som har en parametre, hvor den er en klasses metode
        created = Date.from(Instant.now());
    }

    //En getter metode  uden en parameter , som returner en integer
    public int getAssetId() {
        return assetId;
    }

    //En Sætter metode med en integer parameter, som sætter lokalvariabel til at have den samme værdi som klassevariabel
    public void setAssetId(int assetId) {
        this.assetId = assetId;
    }

    //En getter metode uden en metode, som returnere en string
    public String getName() {
        return name;
    }

    //En sætter metode med en string parameter, som sætter lokalvariabel til at have den samme værdi som klassevariabel
    public void setName(String name) {
        this.name = name;
    }

    //En getter metode uden en parameter, som returner en date
    public Date getCreated() {
        return created;
    }

    //En sætter metode med en date parameter, som sætter lokalvariabel til at have den samme værdi som klassevariabel
    public void setCreated(Date created) {
        this.created = created;
    }

    //En getter metode uden en parameter, som returnere en string
    public String getFileName() {
        return fileName;
    }

    //En sætter metode med en string parameter, som sætter lokalvariabel til at have den samme værdi som klassevariabel
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }


    //En public to toString metode af klassen String
    //En toString metoden returnere objektets String indhold..
    //Derudover konverterer en toString metode objektet til en string
    @Override
    public String toString() {
        //Tilføjer alle disse variabel til String metoden, hvor indkapslet værdier er string values..
        return "Media{" +
                "assetId=" + assetId +
                ", name='" + name + '\'' +
                ", created=" + created +
                ", fileName='" + fileName + '\'' +
                '}';
    }
}