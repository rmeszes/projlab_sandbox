package itemsanddecay;

public interface ItemHolder {
    void destroy(Item item);
    void pickUp(Item item);
    boolean holdsItem(Item item);
}
