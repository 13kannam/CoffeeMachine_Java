package machine;
 class Coffee {
  private final int Milk;
  private final int Water;
  private final int Beans;
  private final int Cups;
  private final int Money;

    public Coffee(int Water, int Milk, int Beans, int Cups, int Money)
    {
        this.Water = Water;
        this.Milk = Milk;
        this.Beans = Beans;
        this.Cups = Cups;
        this.Money = Money;
    }
    public int getMilk() {
        return Milk;
    }

    public int getWater() {
        return Water;
    }

    public int getBeans() {
        return Beans;
    }

    public int getCups() {
        return Cups;
    }

    public int getMoney() {
        return Money;
    }
}

class Espresso extends  Coffee{

    public Espresso(){
        super(250,0,16,1,4);
    }
}
class Latte extends  Coffee{
    public Latte(){
        super(350,75,20,1,7);
    }
}
class Cappuccino extends Coffee{
    public Cappuccino() {
        super(200, 100, 12, 1, 6);
    }
}
