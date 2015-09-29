package com.anselmo.amiibos.models;

/**
 * Created by Anselmo Hernandez on 9/28/15.
 */
public class ItemAmiiBos {
    private String title;
    private String serie;
    private String store;
    private String urlImage;

    public ItemAmiiBos() {}

    public ItemAmiiBos(String title, String serie, String store, String urlImage) {
        this.title = title;
        this.serie = serie;
        this.store = store;
        this.urlImage = urlImage;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public String getStore() {
        return store;
    }

    public void setStore(String store) {
        this.store = store;
    }

    public String getUrlImage() {
        return urlImage;
    }

    public void setUrlImage(String urlImage) {
        this.urlImage = urlImage;
    }
}
