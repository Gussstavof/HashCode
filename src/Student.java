import java.util.Objects;

public class Student {

    private String name;
    private Integer registration;

    public Student(String name, Integer registration) {
        this.name = name;
        this.registration = registration;
    }

    public String getName() {
        return name;
    }

    public Integer getRegistration() {
        return registration;
    }

    @Override
    public String toString() {
        return name + " : " + Objects.hash(name, registration);

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name) && Objects.equals(registration, student.registration);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, registration);
    }
}

