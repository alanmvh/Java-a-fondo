package InterfaceAndFactoryObject;

public class CommunicatorManager {
    public static Communicator createCommunicator(){
        // A messenger pigeon is a communicator
        return new MessengerPigeon();
    }
}
