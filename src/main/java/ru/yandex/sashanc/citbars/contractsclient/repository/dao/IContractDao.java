package ru.yandex.sashanc.citbars.contractsclient.repository.dao;

import ru.yandex.sashanc.citbars.contractsclient.models.dto.ContractDto;

import java.util.List;

public interface IContractDao {
    List<ContractDto> getContractList();
}
