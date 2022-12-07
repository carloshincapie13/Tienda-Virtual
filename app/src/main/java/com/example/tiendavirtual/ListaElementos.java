package com.example.tiendavirtual;

public class ListaElementos {
    public String name;
    public String gender;
    public String status;

    public ListaElementos(String name, String gender, String status) {
        this.name = name;
        this.gender = gender;
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}


