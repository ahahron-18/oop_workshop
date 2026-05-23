module com.example.topic7_benavidez {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;
    requires java.sql;
    requires org.postgresql.jdbc;

    opens com.example.topic7_benavidez to javafx.fxml;
    exports com.example.topic7_benavidez;
}