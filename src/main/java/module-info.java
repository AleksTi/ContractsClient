open module ru.yandex.sashanc.citbars.contractsclient {
    requires javafx.controls;
    requires javafx.fxml;
//    requires log4j;

    exports ru.yandex.sashanc.citbars.contractsclient;
//    opens ru.yandex.sashanc.citbars.contractsclient to javafx.fxml, log4j;

    exports ru.yandex.sashanc.citbars.contractsclient.controllers;
//    opens ru.yandex.sashanc.citbars.contractsclient.controllers to javafx.fxml;

    exports ru.yandex.sashanc.citbars.contractsclient.models;
//    opens ru.yandex.sashanc.citbars.contractsclient.models to javafx.fxml;

//    exports ru.yandex.sashanc.citbars.contractsclient.services;
//    opens ru.yandex.sashanc.citbars.contractsclient.services to javafx.fxml;

//    exports ru.yandex.sashanc.citbars.contractsclient.repository;
//    opens ru.yandex.sashanc.citbars.contractsclient.repository to javafx.fxml;
}
