public class Car extends Auto{//файл Car.java
    private String model;
    private int numDoors;
    private Boolean fullTime; //привод
    public Car(){
        super();// вызываем конструктор класса-родителя без параметров
        model=""; // добавляем инициализацию новых членов
        numDoors=4;
        fullTime=false;
    }
    public Car(String firma, int speed, int gosNomer, String name, int n, Boolean f){
        super(firma,speed,gosNomer);
        model=name; // добавляем инициализацию новых членов
        numDoors=n;
        fullTime=f;
    }
    public void setModel(String name){
        model=name;
    }
    public String getModel(){
        return model;
    }
    public void setNumDoors(int n){
        numDoors=n;
    }
    public int getNumDoors(){
        return numDoors;
    }
    public void setFullTime(Boolean b){
        fullTime=b;
    }
    public Boolean isFullTime(){
        return fullTime;
    }
    public String toString(){
        return getFirm()+" "+getMaxSpeed()+getGovNumber()+" "+model+" "+numDoors+" "+fullTime;
    }
}

