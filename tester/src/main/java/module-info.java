module com.qhuy.tester {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.qhuy.tester to javafx.fxml;
    exports com.qhuy.tester;
}
