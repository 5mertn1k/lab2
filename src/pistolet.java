public class pistolet {
    private int kol;

    int setKol(int kol){
        this.kol=kol;
        return this.kol;
    }
    int getpul(){
        return this.kol;
    }

    pistolet(int kol) {
        this.kol = kol;
    }
    pistolet(){
        this.kol=5;
    }

    public void strelba(int n) {
        for (int i = 0; i < n; i++) {
            if (this.kol>0){
                System.out.println("Бах!");
                this.kol--;
            }
            else{
                System.out.println("Клац!");
            }

        }
    }
    public String toString(){
        if ((this.kol>19 || this.kol<11) && (this.kol%10==1))
            return "пистолет с " + this.kol + " патроном";
        else
            return "пистолет с " + this.kol + " патронами";
    }
}
