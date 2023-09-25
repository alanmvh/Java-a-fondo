package InterfaceAndFactoryObject;

public class CellPhone extends Phone implements Communicator{
    public void sendMessage(String message){
        System.out.println("Message sent from communicator: " + message);
    }
}