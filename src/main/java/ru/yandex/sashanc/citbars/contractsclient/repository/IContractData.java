package ru.yandex.sashanc.citbars.contractsclient.repository;

import ru.yandex.sashanc.citbars.contractsclient.models.Contract;

import java.util.List;

public interface IContractData {
//    void createContract();
//    void updateContract(Contract contract);
//    void deleteContract(Long id);
//    Contract getContract(Long id);
    List<Contract> getContractList();
}
