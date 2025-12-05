module com.example.updatedatajavafx {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.example.updatedatajavafx to javafx.fxml;
    exports com.example.updatedatajavafx;
}
