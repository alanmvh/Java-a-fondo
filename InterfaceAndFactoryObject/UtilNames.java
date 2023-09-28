package InterfaceAndFactoryObject;

import java.util.ArrayList;
import java.util.List;

public class UtilNames {
    public static List<String> getList()
    {
        ArrayList<String> a = new ArrayList<>();
        // Assign some values
        a.add("Pedro");
        a.add("Juanu");
        a.add("Pablo");

        return a;

    }
}
