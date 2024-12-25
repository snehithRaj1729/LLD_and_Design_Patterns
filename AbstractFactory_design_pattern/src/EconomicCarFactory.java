public class EconomicCarFactory implements AbstractFactory {
    @Override
    public Car getInstance(int price) {
        if(price<=30000){
            return new EconomicCar1();
        }
        else{return new EconomicCar2();}
    }
}
