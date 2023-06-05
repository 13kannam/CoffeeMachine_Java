package machine;

public class CoffeeMachine {
    public static void main(String[] args) {

        Interaction maker = new CoffeeMaker(400,540,120,9,550);
        Interaction.menu(maker);

    }
}
