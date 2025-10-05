package Comparator;


import java.util.ArrayList;
import java.util.List;

public class Studentsort {
    public Studentsort(String name, double gpa) {
        this.name=name;
        this.gpa=gpa;
    }

    public static void main(String[] args) {

        List<Studentsort> studentsorts =new ArrayList<>();
        studentsorts.add(new Studentsort("alic",1.3));
        studentsorts.add(new Studentsort("sss",3.3));
        studentsorts.add(new Studentsort("sns",4.3));

        studentsorts.sort(
                (a,b)->{
            if(b.getGpa()- a.getGpa() >0) {
                return 1;
            } else if (b.getGpa()-a.getGpa()<0) {
                return -1;
            }
            else {
//                return 0;
                //or
                return b.getName().compareTo(a.getName());
            }

        });
        for(Studentsort s: studentsorts){
            System.out.println(s.getName()+":"+ s.getGpa());
        }


/*        //or
        students.sort((a, b) -> Double.compare(b.getGpa(), a.getGpa()));
        for(Student s:students) {
            System.out.println(s.getName() + ":" + s.getGpa());
        }*/



/*        //or using java 8 in asceding order,, :: method referece and compare predefined method
     *//*   Comparator<Student> comparator=Comparator.comparing(Student::getGpa);
        students.sort(comparator);
        System.out.println("asceding"+comparator);*//*
        //reverse
        Comparator<Student> comparator1=Comparator.comparing(Student::getGpa).reversed().thenComparing(Student::getName);
        students.sort(comparator1);
        System.out.println("reveresed"+comparator1);

        for(Student s:students) {
            System.out.println(s.getName() + ":" + s.getGpa());
        }*/

    }

    private String name;
    private  double gpa;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

}
