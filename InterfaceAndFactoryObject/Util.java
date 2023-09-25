package InterfaceAndFactoryObject;

public class Util {
    public static <T> void sort(T arr[], Criteria<T> cr)
    {
        for (int n=0; n<arr.length;n++)
        {
            for(int i=0;i<arr.length-1;i++){
                if (cr.compare(arr[i], arr[i+1])>0)
                {
                    T aux = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = aux;
                }
            }
        }
    }
}
