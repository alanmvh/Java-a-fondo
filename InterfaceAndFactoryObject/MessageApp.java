package InterfaceAndFactoryObject;

public class MessageApp
{
    public static void main(String[] args)
    {
        Communicator c = CommunicatorManager.createCommunicator();
        c.sendMessage("Hello im sending a message from create Communicator");
    }
}
