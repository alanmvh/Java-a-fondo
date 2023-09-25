package InterfaceAndFactoryObject;

public class CriteriaStudentNoteAvg implements Criteria<Student>{

    @Override
    public int compare(Student a, Student b) {
        double diff=a.getAvgNote()-b.getAvgNote();
        return diff>0?1: diff <0 ? -1: 0;

    }
}
