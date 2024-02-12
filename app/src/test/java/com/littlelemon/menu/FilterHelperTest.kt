package com.littlelemon.menu

import org.junit.Assert.assertEquals
import org.junit.Test

class FilterHelperTest {

    @Test
    fun filterProducts_filterTypeDessert_croissantReturned() {
        // Given: A list of products with various categories
        val sampleProductsList = mutableListOf(
            ProductItem(title = "Black tea", price = 3.00, category = "Drinks", image = R.drawable.black_tea),
            ProductItem(title = "Croissant", price = 7.00, category = "Dessert", image = R.drawable.croissant),
            ProductItem(title = "Bouillabaisse", price = 20.00, category = "Food", image = R.drawable.bouillabaisse)
        )

        // When: Filtering the list by the Dessert category
        val filteredList = FilterHelper().filterProducts(FilterType.Dessert, sampleProductsList)

        // Then: The result should contain only the product(s) in the Dessert category
        assertEquals(1, filteredList.size)
        assertEquals("Dessert", filteredList.first().category)
        assertEquals("Croissant", filteredList.first().title)
    }
}
