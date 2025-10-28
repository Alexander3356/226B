package ch.samt;

import ch.samt.models.WeatherData;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class WeatherAnalyzer {
    public static void main(String[] args) {

        List<WeatherData> weatherData = Arrays.asList(
                new WeatherData("Roma", LocalDate.of(2024, 1, 15), 8.5, 12.0, 75),
                new WeatherData("Milano", LocalDate.of(2024, 1, 15), 2.0, 5.5, 80),
                new WeatherData("Roma", LocalDate.of(2024, 7, 20), 32.5, 0.0, 45),
                new WeatherData("Milano", LocalDate.of(2024, 7, 20), 29.0, 2.5, 55),
                new WeatherData("Napoli", LocalDate.of(2024, 1, 15), 12.0, 8.0, 70),
                new WeatherData("Napoli", LocalDate.of(2024, 7, 20), 35.0, 0.5, 40),
                new WeatherData("Torino", LocalDate.of(2024, 1, 15), -1.0, 15.0, 85),
                new WeatherData("Torino", LocalDate.of(2024, 7, 20), 28.5, 10.0, 60),
                new WeatherData("Roma", LocalDate.of(2024, 4, 10), 18.0, 3.0, 65),
                new WeatherData("Milano", LocalDate.of(2024, 4, 10), 15.5, 8.0, 70)
        );

        System.out.println("1. GIORNI CON TEMPERATURA > 25°C (CALDO):");
        weatherData.stream()
                .filter(w -> w.getTemperature() > 25).forEach(System.out::println);

        System.out.println("\n2. DATI ORDINATI PER TEMPERATURA (dal più caldo):");
        weatherData.stream()
                .sorted(Comparator.comparingDouble(WeatherData::getTemperature).reversed())
                .forEach(System.out::println);

        System.out.println("\n3. CITTA' CON PRECIPITAZIONI > 10mm (PIOGGIA INTENSA):");
        weatherData.stream()
                .filter(w -> w.getPrecipitation() > 10).map(WeatherData::getCity)
                .forEach(System.out::println);

        System.out.print("\n4. TEMP MASSIMA: ");
        weatherData.stream()
                .max(Comparator.comparingDouble(WeatherData::getTemperature))
                .ifPresent( w -> System.out.println(w.getTemperature() + "°C a " + w.getCity() + " il " + w.getDate()));
        System.out.print("   TEMP MINIMA: ");
        weatherData.stream()
                .min(Comparator.comparingDouble(WeatherData::getTemperature))
                .ifPresent( w -> System.out.println(w.getTemperature() + "°C a " + w.getCity() + " il " + w.getDate()));

        System.out.println("\n5. GIORNI ESTIVI CON UMIDITA' < 50% (CLIMA SECCO):");
        weatherData.stream()
                .filter(w -> w.getTemperature() > 25)
                .filter(w -> w.getHumidity() < 50)
                .forEach(w -> System.out.println(w.getCity() + " - " + w.getDate() + " - Umidità: " + w.getHumidity() + "%"));

    }
}