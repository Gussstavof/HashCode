import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        Student a1 = new Student("Gustavo", 7777);
        Student a2 = new Student("Ferreira", 6666);
        Student a3 = new Student("Alves", 5555);

        Set<Student> studentSet = new HashSet<>();
        studentSet.add(a1);
        studentSet.add(a2);
        studentSet.add(a3);

        Curso curso = new Curso("Engenharia da Computação", studentSet);

        String name = "Gustavo";
        Integer registration = 7777;

        System.out.println(curso.isEnrolled(new Student(name, registration)));

        System.out.println(Objects.hash(name, registration));
        System.out.println(Objects.hash(a1.getName(), a1.getRegistration()));
        System.out.println(Objects.hash("Gustav", 7878));
    }
}
