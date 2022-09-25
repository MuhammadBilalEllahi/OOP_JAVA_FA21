public class Address {
    private String city,country;
    private int st_no, zip_code;
    private String[] address_line;

    public Address (){
        this.city = city;
        this.country = country;
        this.st_no = st_no;
        this.zip_code = zip_code;
        this.address_line = address_line;

    }

    public int getSt_no() {
        return st_no;
    }

    public int getZip_code() {
        return zip_code;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

    public String[] getAddress_line() {
        return address_line;
    }
}
