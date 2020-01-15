package inheritance;

import org.junit.Test;

import static org.junit.Assert.*;

public class ShopTest {
    @Test public void testShopConstructor() {
        Shop shop = new Shop("TestGrocery", "has variety of products",
                1);
        assertEquals(1, shop.priceCategory);
        assertEquals("TestGrocery", shop.name);
        assertEquals("has variety of products", shop.description);
    }
}