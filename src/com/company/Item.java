package com.company;

public class Item {
    private Integer id;
    private String nazwa;

    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", nazwa='" + nazwa + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public String getNazwa() {
        return nazwa;
    }

    public Item(Integer id, String nazwa) {
        if (id == null || nazwa == null) {
            throw new IllegalArgumentException("Podaj nazwę oraz identyfikator");
        }
        this.id = id;
        this.nazwa = nazwa;


    }

    public void show() {
        System.out.println("(" + nazwa + ")");
    }
}
