module com.example.w22comp1011gctest2student {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.st200474598.w22comp1011gctest2student to javafx.fxml;
    exports com.st200474598.w22comp1011gctest2student;
}