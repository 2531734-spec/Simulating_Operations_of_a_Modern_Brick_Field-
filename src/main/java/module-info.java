module com.example.group90_cse213finalprojectfolder {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.group90_cse213finalprojectfolder to javafx.fxml;
    exports com.example.group90_cse213finalprojectfolder;
}