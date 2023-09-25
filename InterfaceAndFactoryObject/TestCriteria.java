package InterfaceAndFactoryObject;

public class TestCriteria {
    public static void main(String[] args) {
        Student arr[] = {
                new Student("Carlos", 23, 19.9),
                new Student("Carlos2", 25, 19.99),
                new Student("Carlos3", 26, 19.93),
                new Student("Carlos4", 22, 19.91)
        };



        Util.sort(arr, new CriteriaStudentNoteAvg());
        Util.sort(arr, new CriteriaStudentName());
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
