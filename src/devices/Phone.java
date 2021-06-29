package devices;

import com.company.Human;
import com.company.Salleable;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public class Phone extends Device implements Salleable {
    private static final String DEFAULT_APP_VERSION = "latest" ;
    private static final String DEFAULT_APP_SERVER = "https:db.pl" ;
    private static final String DEFAULT_APP_PROTOCOL = "https" ;
    private static final Integer DEFAULT_APP_PORT = 403;
    private List<String> url;
    String producer;
    String model;
    String operationSystem;
    Double screenSize;
    Integer yearOfProduction;

    public Phone( String producer, String model,Integer yearOfProduction, String operationSystem, Double screenSize){
        super(model,producer,yearOfProduction);
        this.operationSystem = operationSystem;
        this.screenSize = screenSize;
    }


    String getOsVersion(){
        return "5.32.1";
    }

    public void turnOn(){
        System.out.println("Telefon został włączony");
    }

    @Override
    public void sell(Human seller, Human buyer, Double price) {
        if(seller.getPhone() == null){
            System.out.println("Niestety sprzedający nie ma telefonu");
        }
        else{
            if(buyer.getCash() >= price){
                seller.setCash(seller.getCash()+price);
                buyer.setCash(buyer.getCash()-price);
                seller.setPhone(null);
                buyer.setPhone(seller.getPhone());
                System.out.println("Kupujący kupił telefon");
            }
            else{
                System.out.println("Niestety nie masz tyle kasy");
            }
        }
    }
    public void installAnApp(String appName){
        this.installAnApp(appName,DEFAULT_APP_VERSION);
    }
    public void installAnApp(String appName, String version){
        this.installAnApp(appName, version, DEFAULT_APP_SERVER);
    }
    public void installAnApp(String appName, String version, String address){
        URL url = null;

        try {
            url = new URL(DEFAULT_APP_PROTOCOL, address, DEFAULT_APP_PORT, appName + " " + version);
            this.installAnApp(url);
        }catch (MalformedURLException e){
            e.printStackTrace();
        }

    }
    public void installAnApp(List<String> appNames){
        for (String appName: appNames) installAnApp(appName);
    }
    public void installAnApp(URL url){
        System.out.println("Sprawdzanie miejsca na dysku");
        System.out.println("Sprawdzanie stanu konta");
        System.out.println("Sprawdzanie obsługa płatności");
        System.out.println("Potwierdzenie płatnośći");
        System.out.println("Pobieranie aplikacji");
        System.out.println("");
    }
}
