package machine;

public class CoffeeMaker implements Interaction{
    private int Milk;
    private int Water;
    private int Beans;
    private int Cups;
    private int Money;

    private Boolean checkAmount(Coffee coffee){
        return this.Water >= coffee.getWater() && this.Milk >= coffee.getMilk() && this.Beans >= coffee.getBeans() && this.Cups > coffee.getCups();
    }

    private void makeCoffee(Coffee coffee){
        this.Water -= coffee.getWater();
        this.Milk -= coffee.getMilk();
        this.Beans -= coffee.getBeans();
        this.Cups -= coffee.getCups();
        this.Money += coffee.getMoney();
    }
    public CoffeeMaker(int Water, int Milk, int Beans, int Cups,int Money)
    {
        this.Water = Water;
        this.Milk = Milk;
        this.Beans = Beans;
        this.Cups = Cups;
        this.Money = Money;
    }

    public void fill(int waterAmount, int milkAmount, int beansAmount, int cupsAmount){
        this.Water += waterAmount;
        this.Milk += milkAmount;
        this.Beans += beansAmount;
        this.Cups += cupsAmount;
    }
    public void buy(String choice){
        switch (choice) {
            case "1" -> {
                if (checkAmount(new Espresso())) {

                    System.out.println("I have enough resources, making you a coffee!");
                    makeCoffee(new Espresso());

                }
                else System.out.println("Not enough materials.");
            }
            case "2" -> {
                if (checkAmount(new Latte())) {

                    System.out.println("I have enough resources, making you a coffee!");
                    makeCoffee(new Latte());

                }
                else System.out.println("Not enough materials.");
            }
            case "3" -> {
                if (checkAmount(new Cappuccino())) {

                    System.out.println("I have enough resources, making you a coffee!");
                    makeCoffee(new Cappuccino());

                }
                else System.out.println("Not enough materials.");
            }
            default -> System.out.println("Wrong option. Please try again");
        }
    }
    public void take(){
        System.out.printf("I gave you $%d\n",this.Money);
        this.Money=0;
    }

    public void remaining() {
        System.out.printf("""
                
                The coffee machine has:
                %d ml of water
                %d ml of milk
                %d g of coffee beans
                %d disposable cups
                $%d of money
                """,getWater(),getMilk(),getBeans(),getCups(),getMoney());
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
