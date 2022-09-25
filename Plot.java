public class Plot {
    private Person owner;
    private Address address;
    private Dimensions dimensions;
    private Location location;
    private String  Price;
    private String plot_num;


   public Plot (Person owner, Address address, Dimensions dimensions, Location location, String Price , String plot_num ){

       this.owner = owner;
       this.address = new Address();
       this.dimensions = new Dimensions();
       this.location = new Location();
       this.Price  = Price ;
       this.plot_num =  plot_num;

   }



    public Address getAddress() {
        return address;
   }

   public Person getowner()
   {
       return owner;
   }

    public Location getLocation() {
        return location;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    public String getPlot_num() {
        return plot_num;
    }



    public String getPrice() {
        return Price;
    }


}
