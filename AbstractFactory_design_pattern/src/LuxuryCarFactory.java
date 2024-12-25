public class LuxuryCarFactory implements AbstractFactory {
    @Override
    public Car getInstance(int price) {
        if(price>=400000 && price<=500000){
            return new LuxuryCar1();
        }
        else if (price>=600000){
            return new LuxuryCar2();
        }
        return null;
    }
}
