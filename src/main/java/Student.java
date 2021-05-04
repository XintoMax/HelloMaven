import com.j256.ormlite.field.DatabaseField;


public class Student {

    private int id;
    private String name;
    private int grade_level;
    private String favorite_subject;

    public Student(int id, String name, int grade_level, String favorite_subject) {
        this.id = id;
        this.name = name;
        this.grade_level = grade_level;
        this.favorite_subject = favorite_subject;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrade_level() {
        return grade_level;
    }

    public void setGrade_level(int grade_level) {
        this.grade_level = grade_level;
    }

    public String getFavorite_subject() {
        return favorite_subject;
    }

    public void setFavorite_subject(String favorite_subject) {
        this.favorite_subject = favorite_subject;
    }
}
