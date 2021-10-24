module ru.yandex.sashanc.citbars.contractsclient {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.yandex.sashanc.citbars.contractsclient to javafx.fxml;
    exports ru.yandex.sashanc.citbars.contractsclient;
}
