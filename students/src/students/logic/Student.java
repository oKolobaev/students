package students.logic;

import java.text.Collator;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class Student implements Comparable {

    // поле ИД СТУДЕНТА
    private int studentId;
    // поле ИМЯ
    private String firstName;
    // поле ФАМИЛИЯ
    private String surName;
    // поле ОТЧЕСТВО
    private String patronymic;
    // поле ДАТА РОЖДЕНИЯ
    private Date dateOfBirth;
    // поле ПОЛ
    private char sex;
    // поле ИД ГРУППЫ
    private int groupId;
    // поле ГОД ОБУЧЕНИЯ
    private int educationYear;

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }

    public void setEducationYear(int educationYear) {
        this.educationYear = educationYear;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSurName() {
        return surName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public char getSex() {
        return sex;
    }

    public int getGroupId() {
        return groupId;
    }

    public int getEducationYear() {
        return educationYear;
    }

    // DateFormat - класс для преобразования даты
    // в строку в определеннном формате.
    // Подробнее смотрите документацию по этому методу
    public String toString() {
        return surName + " " + firstName + " " + patronymic + ", "
                + DateFormat.getDateInstance(DateFormat.SHORT).format(dateOfBirth)
                + ", Группа ИД=" + groupId + " Год:" + educationYear;
    }

    @Override
    public int compareTo(Object obj) {
        Collator c = Collator.getInstance(new Locale("ru"));
        c.setStrength(Collator.PRIMARY);
        return c.compare(this.toString(), obj.toString());
    }
}
