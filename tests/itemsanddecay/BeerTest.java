package itemsanddecay;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class BeerTest {
    Player holder;
    @BeforeEach
    void setUp() {
        holder = new Player();
    }

    @Test
    void tick() {
        Beer beer =  new Beer(holder);
        holder.pickUp(beer);
        beer.tick();
        beer.tick();
        beer.tick();
        beer.tick();
        assertTrue(holder.holdsItem(beer));
        beer.tick();
        assertFalse(holder.holdsItem(beer));
    }

    @Test
    void pickUp() {
        Beer beer =  new Beer(holder);
        holder.pickUp(beer);
        assertEquals(holder,beer.getHolder());
    }

    @Test
    void getName() {
        Beer beer = new Beer(holder);
        holder.pickUp(beer);
        assertEquals("Szent sörös korsó", beer.getName());
    }
}