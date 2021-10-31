package ru.yandex.sashanc.citbars.contractsclient.services;

import ru.yandex.sashanc.citbars.contractsclient.models.dto.ContractDto;
import ru.yandex.sashanc.citbars.contractsclient.models.pojo.Contract;
import ru.yandex.sashanc.citbars.contractsclient.repository.dao.ContractDaoRestImpl;
import ru.yandex.sashanc.citbars.contractsclient.repository.dao.IContractDao;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ContractServiceImpl implements IContractService {

    @Override
    public List<Contract> getContractList() {
        IContractDao contractData = new ContractDaoRestImpl();
        List<Contract> contractList = new ArrayList<>();
        List<ContractDto> contractDtoList = contractData.getContractList();

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        Contract contract;
        for (ContractDto contractDto : contractDtoList) {
            contract = new Contract();
            contract.setId(contractDto.getId());
            contract.setName(contractDto.getName());
            contract.setDateContract(LocalDate.parse(contractDto.getContractDate(), dtf));
            contract.setDateUsing(LocalDate.parse(contractDto.getContractUsingDate(), dtf));
            contract.setStatus(contractDto.getStatus());
            contractList.add(contract);
        }
        return contractList;
    }
}
