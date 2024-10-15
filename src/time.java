public class time {
    private int h,m,s,s1;

    int sets1(int s1){
        this.s1=s1;
        return this.s1;
    }
    int gets1(){
        return this.s1;
    }

    time(int s1){
        if (s1<0){
            throw new IllegalArgumentException("<0");
        }
        this.s1=s1;
        this.h=s1/60/60%24;
        this.m=s1/60%60;
        this.s=s1%60;

    }

    public String toString(){
        return h+":"+m/10+m%10+":"+s/10+s%10;
    }

}
