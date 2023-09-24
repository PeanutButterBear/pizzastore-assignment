package edu.cscc;

public class PizzaOrder {
	private int quantity;
	private String orderDate;
	private PizzaSize size;
	private PizzaType type;
	private PizzaTopping topping;
	
	public PizzaOrder(int quantity, String orderDate, PizzaSize size, PizzaType type, PizzaTopping topping) {
		super();
		this.quantity = quantity;
		this.orderDate = orderDate;
		this.size = size;
		this.type = type;
		this.topping = topping;
	}

	public int getQuantity() {
		return quantity;
	}

	public String getOrderDate() {
		return orderDate;
	}

	public PizzaSize getSize() {
		return size;
	}

	public PizzaType getType() {
		return type;
	}

	public PizzaTopping getTopping() {
		return topping;
	}
}
