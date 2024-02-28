package itemsanddecay;
public class Beer implements Decaying, Item {

    private ItemHolder holder;
    private int remainingTime;

    public Beer(ItemHolder holder) {
        this.holder = holder;
        this.remainingTime = 5;
    }

    @Override
    public void tick() {
        if(remainingTime > 1) {
            remainingTime--;
        } else {
            destroy();
        }
    }

    public void changeHolder(ItemHolder o) {
        this.holder = o;
    }

    @Override
    public ItemHolder getHolder() {
        return holder;
    }

    @Override
    public String getName() {
        return "Szent sörös korsó";
    }

    private void destroy() {
        holder.destroy(this);
        this.holder = null;
    }
}
