module com.javarush.cryptanalyzer.ponedelnikov.cryptanalyzer {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.javarush.cryptanalyzer.ponedelnikov.cryptanalyzer to javafx.fxml;
    exports com.javarush.cryptanalyzer.ponedelnikov.cryptanalyzer;
}