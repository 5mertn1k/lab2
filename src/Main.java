import java.util.Scanner;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //1.4
        int vremia;
        System.out.println("Сколько сущностей Время вы хотите создать?");
        while(true) {
            if (in.hasNextInt()) {
                vremia = in.nextInt();
                if (vremia>0){
                    break;
                }
                else{
                    System.out.println("Число должно быть положительным! Введите снова:");
                }

            }
            else {
                System.out.println("Ошибка: введенное значение не является числом! Введите снова:");
                in.next();
            }
        }
        for(int i = 1;i<=vremia;i++){
            System.out.println("Введите количество секунд для "+ i +" времени:");
            int sec=in.nextInt();
            time time = new time(sec);
            System.out.println(time.toString());
        }
        //1.5
        int d;
        System.out.println("Сколько сущностей дом вы хотите создать?");
        while (true){
            if (in.hasNextInt()){
                d= in.nextInt();
                if (d>0){
                    break;
                }
                else{
                    System.out.println("Число должно быть положительным! Введите снова:");
                }
            }
            else{
                System.out.println("Некоректный ввод! Введите снова:");
                in.next();
            }
        }
        for(int i = 1;i<=d;i++){
            System.out.println("Введите число для класса Дом:");
            int floor=in.nextInt();
            Dom Dom = new Dom(floor);
            System.out.println(Dom.toString());
        }

        //2.4
        sotrydnik petrov = new sotrydnik("Петров");
        sotrydnik kozlov = new sotrydnik("Козлов");
        sotrydnik sidorov = new sotrydnik("Сидоров");
        petrov.naznachenie("IT", kozlov);
        kozlov.naznachenie("IT", kozlov);
        sidorov.naznachenie("IT", kozlov);
        System.out.println(petrov.toString());
        System.out.println(kozlov.toString());
        System.out.println(sidorov.toString());
        //3.4
        sotr1 petrov1 = new sotr1("Петров");
        sotr1 kozlov1 = new sotr1("Козлов");
        sotr1 sidorov1 = new sotr1("Сидоров");
        sotr1 ivanov = new sotr1("Иванов");
        sotr1 dyrov = new sotr1("Дуров");
        petrov1.naznachenie("IT", kozlov1);
        kozlov1.naznachenie("IT", kozlov1);
        sidorov1.naznachenie("IT", kozlov1);
        ivanov.naznachenie("qwerty",ivanov);
        dyrov.naznachenie("qwerty", ivanov);
        List<sotr1> Sotrudniki = ivanov.getSotrudnikiOtdela();
        for (sotr1 i : Sotrudniki) {
            System.out.println(i.getName());
        }
        //4.3
        int d1;
        System.out.println("Сколько сущностей дом вы хотите создать?");
        while (true){
            if (in.hasNextInt()){
                d1= in.nextInt();
                if (d1>0){
                    break;
                }
                else{
                    System.out.println("Число должно быть положительным! Введите снова:");
                }
            }
            else{
                System.out.println("Некоректный ввод! Введите снова:");
                in.next();
            }
        }
        for(int i = 1;i<=d1;i++){
            System.out.println("Введите число для класса Дом:");
            int floor=in.nextInt();
            dom2 dom2 = new dom2(floor);
            System.out.println(dom2.toString());
        }
//        dom2 d35=new dom2(35);
//        d35.setFloor(45);// выдает ошибку если пытаемся изменить
        //5.1
        int pul;
        System.out.println("Введите количество патронов в пистолете:");
        while (true){
            if (in.hasNextInt()){
                pul= in.nextInt();
                if (pul>=0){
                    break;
                }
                else{
                    System.out.println("Число должно быть положительным! Введите снова:");
                }
            }
            else{
                System.out.println("Некоректный ввод! Введите снова:");
                in.next();
            }
        }
        pistolet piston = new pistolet(pul);
        System.out.println(piston.toString());
        System.out.println("Сколько раз хотите выстрелить?");
        int bax;
        while(true){
            if (in.hasNext()){
                bax= in.nextInt();
                if (bax>=0){
                    break;
                }
                else{
                    System.out.println("Число должно быть положительное! Введите снова:");
                }
            }
            else{
                System.out.println("Некоректный ввод! Введите снова:");
            }
        }
        piston.strelba(bax);
        System.out.println(piston.toString());
        in.close();

    }
}