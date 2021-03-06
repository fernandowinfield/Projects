package inventorySystem;

/**
 * Class represents the common states and behavior Salmon.
 */
public class Salmon extends AGrocery {

  public Salmon(Manufacturer manufacturer, ProductName productName, Price price, MinimumAge
      minimumAge, Weight weight) {
    super(manufacturer, productName, price, minimumAge, weight);
  }
}
