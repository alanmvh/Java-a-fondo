package InterfaceAndFactoryObject;

import java.util.Collections;
import java.util.List;
import java.util.Arrays;

public class ListArrCollections {

    public static void main(String[] args) {
        List<String> lst = UtilNames.getList();

        for(String nom:lst)
        {
            System.out.println(nom);
        }

        List<Integer> lst2 = Arrays.asList(4,5,2,256,6,7);
        Comparator<Integer> cmp1 = (a,b) -> a-b;
        Collections.sort(lst2, cmp1);
        System.out.println(lst2);
    }


}
