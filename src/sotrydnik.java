public class sotrydnik {
    private String name;
    private String otdel;
    private sotrydnik boss;

    String setName(String name){
        this.name=name;
        return this.name;
    }
    String getName(String name){
        return this.name;
    }

    sotrydnik(String name){
        this.name=name;
    }

    public void naznachenie(String otdel, sotrydnik boss){
        this.otdel=otdel;
        this.boss=boss;
    }
    public String toString() {
        if (this == boss) {
            return name + " начальник отдела " + otdel;
        } else {
            return name + " работает в отделе " + otdel + ", начальник которого " + boss.name;
        }
    }

}
