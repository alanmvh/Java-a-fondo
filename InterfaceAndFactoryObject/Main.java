package InterfaceAndFactoryObject;
public class Main {

    public static void main(String[] args){
        Communicator t1 = new CellPhone();
        Communicator t2 = new MessengerPigeon();
        Communicator t3 = new CellPhone();

        t1.sendMessage("Hello");
    }
}
