package pl.coderslab.servletyday4;

/**
 * Furniture class for Exam 2
 */
public class Furniture {
	
	
	private int id;
	private String name;
	private String description;
	private int quantity;

	public Furniture(int id, String name, String description, int quantity) {
		this.setId(id);
		this.name = name;
		this.description = description;
		this.quantity = quantity;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
