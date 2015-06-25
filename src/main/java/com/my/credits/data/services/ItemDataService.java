package com.my.credits.data.services;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import com.my.credits.core.Item;
import com.my.credits.core.ItemType;

public class ItemDataService {

	public static final BigDecimal GOOD_TAX= new BigDecimal("10");
	public static final BigDecimal FOOD_TAX= new BigDecimal("0");
	public static final BigDecimal IMPORTED_TAX= new BigDecimal("5");
	public static final BigDecimal ROUND_TAX= new BigDecimal("0.05");
	
	public List<Item> getItemsbyUserId(int userid){
		// Assume this class connects to Database and get list of all items for that userid
		return InitInput1();
	}

	
	private List<Item> InitInput1() {
		List<Item> items = new ArrayList<Item>();
		Item item = new Item();
		item.setId(1);
		item.setName("book");
		item.setQuantity(1);
		item.setPrice(new BigDecimal("12.49"));
		item.setItemType(ItemType.books);
		item.setImported(false);
		items.add(item);
		item.setSalesTaxs(CalculateSalesTax(item));
		item = null;
		
		item = new Item();
		item.setId(2);
		item.setName("music CD");
		item.setQuantity(1);
		item.setPrice(new BigDecimal("14.99"));
		item.setItemType(ItemType.goods);
		item.setImported(false);
		item.setSalesTaxs(CalculateSalesTax(item));
		items.add(item);
		item = null;
		
		item = new Item();
		item.setId(3);
		item.setName("chocolate bar");
		item.setQuantity(1);
		item.setPrice(new BigDecimal("0.85"));
		item.setItemType(ItemType.foods);
		item.setImported(false);
		item.setSalesTaxs(CalculateSalesTax(item));
		items.add(item);
		return items;
	}


	private BigDecimal CalculateTaxPercentage(Item item) {
		BigDecimal taxPercentage = null;
		if (item.getItemType() == ItemType.books || 
				item.getItemType() == ItemType.foods ||
				item.getItemType() == ItemType.medicals){
			taxPercentage =  FOOD_TAX;
		} else {
			taxPercentage = GOOD_TAX;
		}
		if (item.isImported()){
			taxPercentage = taxPercentage.add(IMPORTED_TAX);
		}
		return taxPercentage;
		
	}


	public BigDecimal CalculateSalesTax(Item item) {
		BigDecimal taxPercentage = CalculateTaxPercentage(item);
		BigDecimal totalSalesTax = taxPercentage.multiply(item.getPrice()).divide(new BigDecimal("100"));
		return totalSalesTax;
	}
	
}
