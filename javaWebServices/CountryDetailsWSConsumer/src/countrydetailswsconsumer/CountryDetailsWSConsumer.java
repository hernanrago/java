/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package countrydetailswsconsumer;

import net.webservicex.Country;
import net.webservicex.CountrySoap;

/**
 *
 * @author hernan
 */
public class CountryDetailsWSConsumer {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        Country country = new Country();
        CountrySoap countrySoap = country.getCountrySoap();
        String countries=countrySoap.getCurrencies();
        System.out.println(countries);
    }
    
}
