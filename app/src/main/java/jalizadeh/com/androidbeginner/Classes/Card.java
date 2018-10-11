package jalizadeh.com.androidbeginner.Classes;

//video #25
public class Card {

    private  String name;
    private  String imgAddr;

    public Card(String name, String imgAddr) {
        this.name = name;
        this.imgAddr = imgAddr;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImgAddr() {
        return imgAddr;
    }

    public void setImgAddr(String imgAddr) {
        this.imgAddr = imgAddr;
    }
}
