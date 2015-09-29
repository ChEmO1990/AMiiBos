package com.anselmo.amiibos.models;

import java.util.ArrayList;

/**
 * Created by naranya on 9/29/15.
 */
public class AmiiBosModel {
    private ArrayList<Result> result;

    public AmiiBosModel() {}

    public AmiiBosModel(ArrayList<Result> result) {
        this.result = result;
    }

    public ArrayList<Result> getResult() {
        return result;
    }

    public void setResult(ArrayList<Result> result) {
        this.result = result;
    }

    public class Result {
        private String title;
        private String series;
        private String img;
        private ArrayList<Store> stores;

        public Result() {}

        public Result(String title, String series, String img, ArrayList<Store> stores) {
            this.title = title;
            this.series = series;
            this.img = img;
            this.stores = stores;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getSeries() {
            return series;
        }

        public void setSeries(String series) {
            this.series = series;
        }

        public String getImg() {
            return img;
        }

        public void setImg(String img) {
            this.img = img;
        }

        public ArrayList<Store> getStores() {
            return stores;
        }

        public void setStores(ArrayList<Store> stores) {
            this.stores = stores;
        }
    }

    public class Store {
        private String title;
        private String link;
        private String status;
        private String storeName;
        private String storeLogo;

        public Store() {}

        public Store(String title, String link, String status, String storeName, String storeLogo) {
            this.title = title;
            this.link = link;
            this.status = status;
            this.storeName = storeName;
            this.storeLogo = storeLogo;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getLink() {
            return link;
        }

        public void setLink(String link) {
            this.link = link;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public String getStoreName() {
            return storeName;
        }

        public void setStoreName(String storeName) {
            this.storeName = storeName;
        }

        public String getStoreLogo() {
            return storeLogo;
        }

        public void setStoreLogo(String storeLogo) {
            this.storeLogo = storeLogo;
        }
    }

}
