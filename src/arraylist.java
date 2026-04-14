import model.Student;

import java.util.ArrayList;

public class arraylist {
    public static void main(String[] args){
        ArrayList<Student> list = new ArrayList<>();
        Student student = new Student("규민",100);
        list.add(student);
        student = new Student("강현",90);
        list.add(student);

        for (Student s : list){
            System.out.println(s.toString());
        }
    }
}
