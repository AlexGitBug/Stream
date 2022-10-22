package CollectionLesson.Stream.HomeTask;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Дан список студентов с полями:
 * - Имя
 * - Фамилия
 * - Номер курса в университете
 * - Список оценок за учебу
 * <p>
 * Преобразовать этот список студентов в ассоциативный массив, где ключом является номер курса, а значением:
 * <p>
 * Средняя оценка студентов этого курса, количество оценок у которых больше 3-х
 * <p>
 * Список студентов данного курса, но только с полями Имя и Фамилия.
 * Список должен быть отсортированы по этим двум полям
 * <p>
 * Объект с двумя полями:
 * - Отсортированный список студентов с пункта 2
 * - Средняя оценка этих студентов
 * <p>
 * Подумать, как ассоциативный массив можно было представить в коде в виде отсортированного - TreeMap
 */

public class Student {

    private String name;
    private String lastName;
    private int kurs;
    private List<Integer> mark;

    private int result;

    public int getAverage(List<Integer> list) {
        int result = 0;
        for (Integer integer : list) {
            result += integer;
        }
        return result / list.size();
    }

    public String getFullName() {
        return getName() + " " + lastName;
    }

    public Student(String name, String lastName, int kurs, List<Integer> mark) {
        this.name = name;
        this.lastName = lastName;
        this.kurs = kurs;
        this.mark = mark;
    }


    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public int getKurs() {
        return kurs;
    }

    public List<Integer> getMarks() {
        return mark;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setKurs(int kurs) {
        this.kurs = kurs;
    }

    public void setMarks(List<Integer> marks) {
        this.mark = marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", kurs=" + kurs +
                ", marks=" + mark +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return kurs == student.kurs && Objects.equals(name, student.name) && Objects.equals(lastName, student.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, lastName, kurs);
    }


    }

