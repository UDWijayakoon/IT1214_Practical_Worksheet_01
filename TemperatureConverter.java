class TemperatureConverter {
    double toFahrenheit(double celsius) {
        return (celsius * 9.0 / 5) + 32;
    }

    double toCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5.0 / 9;
    }
}
