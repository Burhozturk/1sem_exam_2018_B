//Importerer disse klasser

import java.io.File;
import java.lang.reflect.Array;
import java.time.Instant;
import java.util.ArrayList;
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
    ArrayList<String> alist=new ArrayList<String>();


    private String creator;

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }






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


    public String logToConsolString()
    {
        return "Instansvariabel"+getName()+"Klassens medietype"+assetId+"Created"+created;

    }

    public void logToConsol()
    {
        System.out.println(logToConsolString());

    }

    public void logMediaFolder(String foldernavn)
    {
        foldernavn="/media";
        File folder= new File(foldernavn);
        File[] listofFiles=folder.listFiles();
        for (int i = 0; i < listofFiles.length; i++) {
            if (listofFiles[i].isFile()) {
                System.out.println("File " + listofFiles[i].getName());
            } else if (listofFiles[i].isDirectory()) {
                System.out.println("Directory " + listofFiles[i].getName());
            }
        }

    }


    public void readMediaFolder(String foldernavn)
    {

        try {
            foldernavn="/media";


            File folderNy=new File(foldernavn);
            File[] listofFilesNT=folderNy.listFiles();

            for (int i = 0; i < (listofFilesNT != null ? listofFilesNT.length : 0); i++)
            {
                if(listofFilesNT[i].isFile())
                {

                   this.alist.add(listofFilesNT[i].getName());
                   String checkForMediaType=listofFilesNT[i].getName();
                   if(checkForMediaType.contains("jpg"));
                   {
                       new Media();
                   }
                   if(checkForMediaType.contains("txt"))
                   {
                       new Media();
                   }
                   if(checkForMediaType.contains("mp4"))
                   {
                       new Media();
                   }
                   if(checkForMediaType.contains("m4v"))
                   {
                       new Media();

                   }


                }
                System.out.println(alist);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    if(getCreator()=="tv2")
    {
        System.out.println("Lavet af tv2");
    }
    if(getCreator()=="privat")
    {
        System.out.println("Lavet af private personer");
    }


    }




}