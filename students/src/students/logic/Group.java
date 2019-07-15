package students.logic;

public class Group {

    // поле ИД ГРУППЫ
    private int groupId;
    // поле ИМЯ ГРУППЫ
    private String nameGroup;
    // поле КУРАТОР
    private String curator;
    // поле СПЕЦИАЛЬНОСТЬ
    private String speciality;

    public int getGroupId() {
        return groupId;
    }

    public String getNameGroup() {
        return nameGroup;
    }

    public String getCurator() {
        return curator;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }

    public void setNameGroup(String nameGroup) {
        this.nameGroup = nameGroup;
    }

    public void setCurator(String curator) {
        this.curator = curator;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public String toSrtring(){
        return nameGroup;
    }
}
