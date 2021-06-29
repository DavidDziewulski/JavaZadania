package devices;

import com.company.Human;

public class Application {
    String name;
    String version;
    Double price;
    public Application(String name, String version, Double price) {
        this.name = name;
        this.version = version;
        this.price = price;


    }
    @Override
    public boolean equals(Object obj) {
        Application other = (Application) obj;
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if(this.name != other.name)
            return false;
        if(this.version !=other.version)
            return false;
        if(this.price != other.price)
            return false;
        else
            return true;
    }
}
