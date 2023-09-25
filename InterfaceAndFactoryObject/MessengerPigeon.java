package InterfaceAndFactoryObject;
public class MessengerPigeon extends Bird implements Communicator{
    public void sendMessage(String message){
        System.out.println("Message : " + message);
    }
}