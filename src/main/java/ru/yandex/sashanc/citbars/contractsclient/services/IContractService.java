package ru.yandex.sashanc.citbars.contractsclient.services;

import ru.yandex.sashanc.citbars.contractsclient.models.pojo.Contract;

import java.util.List;

public interface IContractService {
    List<Contract> getContractList();
}
