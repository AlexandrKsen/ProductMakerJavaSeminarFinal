public class Bottle extends Product { //для примера создали класс бутылка и можно получать все параметры
    // от родительского класса Product с учетом класса TypeProduct

    double volume; //добавляем объем бутылки

    public Bottle(String name, double price, int quantity, TypeProduct typeProduct, double volume) {
        super(name, price, quantity, typeProduct);
    }
    //метод получения цены за литр
    @Override
    public double getPrice(){
        return getPrice() * getVolume();
    }
//получение объема бутылки
    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return super.toString() + " " + volume;
    }
}
