open module ru.yandex.sashanc.citbars.contractsclient {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.base;
    requires com.fasterxml.jackson.core;
    requires com.fasterxml.jackson.databind;
    requires org.jetbrains.annotations;

    exports ru.yandex.sashanc.citbars.contractsclient;
    exports ru.yandex.sashanc.citbars.contractsclient.controllers;
    exports ru.yandex.sashanc.citbars.contractsclient.repository.dao;
    exports ru.yandex.sashanc.citbars.contractsclient.services;
    exports ru.yandex.sashanc.citbars.contractsclient.models.pojo;
    exports ru.yandex.sashanc.citbars.contractsclient.models.dto;
}


