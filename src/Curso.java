import java.util.Set;

public class Curso {


    private String name;
    private Set<Student> students;

    public Curso(String name, Set<Student> students) {
        this.name = name;
        this.students = students;
    }

    public boolean isEnrolled(Student student){
        return students.contains(student);
    }

    @Override
    public String toString() {
        return "Curso{" +
                "nome='" + name + '\'' +
                ", students=" + students +
                '}';
    }

}
