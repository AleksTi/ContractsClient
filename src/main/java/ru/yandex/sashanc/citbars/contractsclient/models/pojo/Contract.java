package ru.yandex.sashanc.citbars.contractsclient.models.pojo;

import java.time.LocalDate;

public class Contract {
    private Integer id;
    private String name;
    private LocalDate dateContract;
    private LocalDate dateUsing;
    private String status;

    public static String getFieldName(String field){
        return switch (field) {
            case "id" -> "ID";
            case "name" -> "Name";
            case "dateContract" -> "Дата договора";
            case "dateUsing" -> "Дата обновления";
            case "status" -> "Статус договора";
            default -> field;
        };
    }

    public Contract() {}

    public Contract(Integer id, String name, LocalDate dateContract, LocalDate dateUsing, String status) {
        this.id = id;
        this.name = name;
        this.dateContract = dateContract;
        this.dateUsing = dateUsing;
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDateContract() {
        return dateContract;
    }

    public void setDateContract(LocalDate dateContract) {
        this.dateContract = dateContract;
    }

    public LocalDate getDateUsing() {
        return dateUsing;
    }

    public void setDateUsing(LocalDate dateUsing) {
        this.dateUsing = dateUsing;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Contract{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dateContract=" + dateContract +
                ", dateUsing=" + dateUsing +
                ", status='" + status + '\'' +
                '}';
    }
}
