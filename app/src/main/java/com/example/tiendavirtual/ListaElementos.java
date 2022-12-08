package com.example.tiendavirtual;

public class ListaElementos {
    public String name;
    public String gender;
    public String status;
    private int iconImage; //aqui

    public ListaElementos(String name, String gender, String status,int iconImage) {
        this.name = name;
        this.gender = gender;
        this.status = status;
        this.iconImage= iconImage;
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
    } //aqui

    public int geticonImage() {
        return iconImage;
    }

    public void seticonImage(int idImagen) {
        this.iconImage = iconImage;
    }

    @Override
    public String toString() {
        return "Articulo{" +
                "nombre='" + name + '\'' +
                ", genero='" + gender + '\'' +
                ", estado='" + status + '\'' +

                ", idImagen=" + iconImage +
                '}';
    }
}


