package com.ood.final_proj;

import junit.framework.TestCase;
import com.ood.final_proj.Data.*;


public class StaticDataTest extends TestCase {
    public void testInstance() {
        assertNotNull(StaticData.i());
    }

    public void testTableInitialized() {
        assertEquals(15, StaticData.i().tables().size());
    }

    public void testMenuInitialized() {
        assertTrue(StaticData.i().getMenu().contains(Pizza.class));
    }

    public void testDecoratorsInitialized() {
        assertTrue(StaticData.i().getItemDecorators().containsKey(Burger.class));
    }
}
