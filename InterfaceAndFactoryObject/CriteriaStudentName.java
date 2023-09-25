package InterfaceAndFactoryObject;

public class CriteriaStudentName implements Criteria <Student>{
    @Override
    public int compare(Student a, Student b) {
        return a.getName().compareTo(b.getName());
    }
}
