package itemsanddecay;

public interface Item {
    String getName();
    void changeHolder(ItemHolder o);
    ItemHolder getHolder();
}
