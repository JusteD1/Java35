package OOP;

public class CallingCountry {
    public static void main(String[] args) {

        //Creating country class object

        Country latvia = new Country();
        latvia.setName("Latvia");
        latvia.setPopulation(18315586);
        latvia.setCapital("Riga");
        latvia.setCurrency("EUR");
        latvia.setInEU(true);

        latvia.countryInfo();
        latvia.isThisCountryInEU();

        Country china = new Country();
        china.setName("China");
        china.setPopulation(1454456803);
        china.setCapital("Beijing");
        china.setCurrency("CNY");
        china.setInEU(false);

        china.countryInfo();
        china.isThisCountryInEU();
    }
}
