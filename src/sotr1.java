import java.util.ArrayList;
import java.util.List;
public class sotr1 {
    private String name;
    private String otdel;
    private sotr1 boss;
    private List<sotr1> sotrudnikiOtdela;

    String getName() {
        return name;

    }

    sotr1(String name) {
        this.name = name;
        this.sotrudnikiOtdela = new ArrayList<>();
    }

    public void naznachenie(String otdel, sotr1 boss) {
        this.otdel = otdel;
        this.boss = boss;
        if (this == boss) {
            this.sotrudnikiOtdela.add(this);
        }
        else {
            this.sotrudnikiOtdela = boss.getSotrudnikiOtdela();
            this.sotrudnikiOtdela.add(this);
        }
    }
    public List<sotr1> getSotrudnikiOtdela() {
        return sotrudnikiOtdela;
    }
//    public String toString() {
//        if (this == boss) {
//            return name + " начальник отдела " + otdel;
//        } else {
//            return name + " работает в отделе " + otdel + ", начальник которого " + boss.name;
//        }
//    }



}
