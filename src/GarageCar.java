import java.util.ArrayList;

public class GarageCar {
    private ArrayList<Auto> masCar=new ArrayList<Auto>();//массив с машинами
    public void addCar(Auto m){   //метод для добавления машины в гараж
        masCar.add(m);
    }
    public GarageCar (){
    }
    public Boolean findCar(Auto m){ //для выяснения: машина в гараже или нет
        return masCar.contains(m);
    }
    public GarageCar(ArrayList<Auto> n){//конструктор для внесения сущ-го списка машин
//Гараж
        masCar=n;
    }
    public void printGarage() { //для вывода на экран списка машин в гараже
        System.out.println("В гараже: ");
        for (Auto a:masCar){ //
            System.out.println("\t"+a.toString());
        }
    }
    public void deleteCar(Auto m){
        masCar.remove(m);
    }

}
