package ai.jobiak.icecreams;

public class IceCream {

	String brandName;
	String flavour;
	double cost;
	double rating;
	boolean SugarFree;
	int count;
	String weight;
	String description;
	public IceCream() {
		super();
		// TODO Auto-generated constructor stub
	}
	public IceCream(String brandName, String flavour, double cost, double rating, boolean sugarFree, int count,
			String weight, String description) {
		super();
		this.brandName = brandName;
		this.flavour = flavour;
		this.cost = cost;
		this.rating = rating;
		SugarFree = sugarFree;
		this.count = count;
		this.weight = weight;
		this.description = description;
	}
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	public String getFlavour() {
		return flavour;
	}
	public void setFlavour(String flavour) {
		this.flavour = flavour;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	public boolean isSugarFree() {
		return SugarFree;
	}
	public void setSugarFree(boolean sugarFree) {
		SugarFree = sugarFree;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public String getWeight() {
		return weight;
	}
	public void setWeight(String weight) {
		this.weight = weight;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "IceCream [brandName=" + brandName + ", flavour=" + flavour + ", cost=" + cost + ", rating=" + rating
				+ ", SugarFree=" + SugarFree + ", count=" + count + ", weight=" + weight + ", description="
				+ description + "]";
	}
	
}
	