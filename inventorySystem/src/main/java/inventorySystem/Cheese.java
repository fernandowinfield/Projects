package inventorySystem;

/**
 * Class represents the common states and behavior Cheese.
 */
public class Cheese extends AGrocery {

  public Cheese(Manufacturer manufacturer, ProductName productName, Price price, MinimumAge
      minimumAge, Weight weight) {
    super(manufacturer, productName, price, minimumAge, weight);
  }
}
