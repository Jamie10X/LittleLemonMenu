package com.littlelemon.menu

private fun List<ProductItem>.sortByPriceAscending(): List<ProductItem> = sortedBy { it.price }

private fun List<ProductItem>.sortByPriceDescending(): List<ProductItem> = sortedByDescending { it.price }


class SortHelper {

    fun sortProducts(type: SortType, productsList: List<ProductItem>): List<ProductItem> {
        return when (type) {
            SortType.Alphabetically -> productsList.sortAlphabetically()
            SortType.PriceAsc -> productsList.sortByPriceAscending()
            SortType.PriceDesc -> productsList.sortByPriceDescending()
        }
    }

    private fun List<ProductItem>.sortAlphabetically(): List<ProductItem> {
        return sortedBy { it.title }
    }

}