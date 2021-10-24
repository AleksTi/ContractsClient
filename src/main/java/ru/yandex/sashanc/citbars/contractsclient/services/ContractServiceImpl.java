package ru.yandex.sashanc.citbars.contractsclient.services;

import ru.yandex.sashanc.citbars.contractsclient.models.Contract;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ContractServiceImpl implements IContractService {

    @Override
    public List<Contract> getContractList() {
        List<Contract> contractList = new ArrayList<>();
        Contract contract;

        //TODO Заглушка
        for (int i = 1; i < 13; i++) {
            contract = new Contract();
                contract.setId(Long.valueOf(i));
                contract.setDateContract(LocalDate.now());
                contract.setDateUsing(LocalDate.of(2021, i, i));
                contract.setStatus("true");
            contractList.add(contract);
            System.out.println(contract);
        }
        return contractList;
    }
}
