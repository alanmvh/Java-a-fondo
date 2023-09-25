package InterfaceAndFactoryObject;

public class Student implements Comparable<Student>{
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAvgNote(){return this.avgNote;}
    public void setAvgNote(double n){this.avgNote = n;}
    private String name;
    private int age;
    private double avgNote;

    // Constructor
    public Student(String nom, int e, double np)
    {
        this.name = nom;
        this.age = e;
        this.avgNote = np;

    }
    @Override
    public int compareTo(Student otherStudent) {
        return this.age - otherStudent.age;
    }

    @Override
    public String toString()
    {
        return name+", "+age+", "+avgNote;
    }

}
