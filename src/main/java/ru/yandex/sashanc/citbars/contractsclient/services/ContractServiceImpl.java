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

        //TODO Заглушка
        for (int i = 1; i < 13; i++) {
            contractList.add(new Contract(Long.valueOf(i), LocalDate.now(), LocalDate.of(2021, i, i)));

        }
        System.out.println(contractList);
        return contractList;
    }
}
