open module ru.yandex.sashanc.citbars.contractsclient {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.base;
    requires com.fasterxml.jackson.core;
    requires com.fasterxml.jackson.databind;

    exports ru.yandex.sashanc.citbars.contractsclient;
    exports ru.yandex.sashanc.citbars.contractsclient.controllers;
    exports ru.yandex.sashanc.citbars.contractsclient.repository.dao;
    exports ru.yandex.sashanc.citbars.contractsclient.services;
    exports ru.yandex.sashanc.citbars.contractsclient.models.pojo;
    exports ru.yandex.sashanc.citbars.contractsclient.models.dto;

//    opens ru.yandex.sashanc.citbars.contractsclient to javafx.fxml;
//    opens ru.yandex.sashanc.citbars.contractsclient.controllers to javafx.fxml;
//    opens ru.yandex.sashanc.citbars.contractsclient.models to javafx.fxml;
//    opens ru.yandex.sashanc.citbars.contractsclient.services to javafx.fxml;
//    opens ru.yandex.sashanc.citbars.contractsclient.repository to javafx.fxml;
}


