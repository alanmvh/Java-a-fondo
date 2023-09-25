package InterfaceAndFactoryObject;
public class Phone{
    private int number;
    private String model;
    private String carrier;

    public void setNumber(int a){
        this.number = a;
    }

    public int getNumber(){return this.number;}

    public void setModel(String m){this.model = m;}
    public String getModel(){return this.model;}

    public void setCarrier(String a){this.carrier = a;}
    public String getCarrier(){return this.carrier;}
}