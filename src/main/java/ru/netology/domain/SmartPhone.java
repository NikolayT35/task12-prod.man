package ru.netology.domain;

import java.util.Objects;

    public class SmartPhone extends Product {


        private String producer;

        public SmartPhone() {super();}

        public SmartPhone(int id, String name, int price, String producer) {
            super(id, name, price);
            this.producer = producer;
        }

        public String getProducer() {
            return producer;
        }

        public void setProducer(String producer) {
            this.producer = producer;
        }
    }

