package Gof._02_structural_patterns._08_composite._01_before;

public class Client {
    public static void main(String[] args) {
        Item doranBlade = new Item("도란검", 450);
        Item healPotion = new Item("체력 물약", 50);

        Bag bag = new Bag();
        bag.add(doranBlade);
        bag.add(healPotion);

        Client client = new Client();
        client.printPrice(doranBlade);
        client.printPrice(bag);

    }

    private void printPrice(Item item) {
        System.out.println(item.getPrice());
    }

    private void printPrice(Bag bag) {
        int sum = bag.getItems().stream()
                .mapToInt(Item::getPrice)
                .sum();
        System.out.println(sum);

        //Client가 너무 많은 걸 알아야함.
        //가방이 아니라 어떤 캐릭터가 아이템을 들고있다면, 가방을 두개 들고있다면, 가방에 가방이 들어있다면 등등


    }
}
