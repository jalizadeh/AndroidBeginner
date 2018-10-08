package jalizadeh.com.androidbeginner.Classes;

//video #10

/**
 * this class will hold the data of each Person in the list
 */
public class PersonWithPhoto {
    private String name;
    private String birthday;
    private String gender;
    private String imgUrl;

    public PersonWithPhoto(String name, String birthday, String gender, String imgUrl) {
        this.name = name;
        this.birthday = birthday;
        this.gender = gender;
        this.imgUrl = imgUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }
}
