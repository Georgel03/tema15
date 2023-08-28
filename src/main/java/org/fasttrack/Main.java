package org.fasttrack;

import org.fasttrack.tema15.Exercitiu1.TemperatureConverter;
import org.fasttrack.tema15.Exercitiu2.Person;

public class Main {

    public static void main(String[] args) {

        //EX 1
        System.out.println(TemperatureConverter.fahrenheitToCelsius(100));
        System.out.println(TemperatureConverter.celsiusToFahrenheit(100));
        System.out.println(TemperatureConverter.fahrenheitToCelsius(50));

        System.out.println("---------------------------------");
        //EX 2
        Person person = new Person(3, "Jorj", 28);

    }
}