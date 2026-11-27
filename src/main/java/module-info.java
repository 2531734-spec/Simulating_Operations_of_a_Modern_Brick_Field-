module com.example.simulating_operation_of_a_modern_brick_field {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.simulating_operation_of_a_modern_brick_field to javafx.fxml;
    exports com.example.simulating_operation_of_a_modern_brick_field;
}