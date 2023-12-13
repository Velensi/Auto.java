import java.util.Scanner;

public class test_1 {
    public static void main(String[] args) {
        Auto myAuto1=new Auto(); //создаем объект типа нашего класса
        Scanner in = new Scanner(System.in); //создаем сканер для ввода данных из консоли
        System.out.print("Введите фирму: ");
        String nazv=in.next(); //считываем название из консоли (1 слово)
//in.next() считывает только символы до пробела, остальные символы отправляет
//следующему оператору, связанному с консольным вводом
        myAuto1.setFirm(nazv); //задаем значение для параметра класса
        System.out.print("Введите MAX скорость: ");
        int s=in.nextInt();
        myAuto1.setMaxSpeed(s);
        System.out.println(myAuto1.getFirm()+" "+myAuto1.getMaxSpeed());
    }
}

