package com.itvdn.lesson9.task2;

public class Device {

    String manufacturer;
    float price;
    String serialNumber;

    Device(String manufacturer, float price, String serialNumber) {
        this.manufacturer = manufacturer;
        this.price = price;
        this.serialNumber = serialNumber;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    @Override
    public String toString() {
        return "Device: " + this.manufacturer + ", price: " + this.price + ", serialNumber: " + this.serialNumber + ".";
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}

    class Monitor extends Device {
        int resolutionX;
        int resolutionY;

        Monitor(String manufacturer, float price, String serialNumber,int resolutionX, int resolutionY){
            super(manufacturer,price,  serialNumber);
            this.resolutionX = resolutionX;
            this.resolutionY = resolutionY;
        }

        public int getResolutionX() {
            return resolutionX;
        }

        public void setResolutionX(int resolutionX) {
            this.resolutionX = resolutionX;
        }

        public int getResolutionY() {
            return resolutionY;
        }

        public void setResolutionY(int resolutionY) {
            this.resolutionY = resolutionY;
        }

        @Override
        public String toString(){
            return "Monitor: " + this.manufacturer + ", price: " + this.price + ", serialNumber: " + this.serialNumber +", X:" + this.resolutionX + ", Y:" + this.resolutionY + ".";
        }

    }

    class EthernetAdapter{
        int speed;
        String mac;

        EthernetAdapter(int speed, String mac){
            this.speed = speed;
            this.mac = mac;
        }

        public int getSpeed() {
            return speed;
        }

        public void setSpeed(int speed) {
            this.speed = speed;
        }

        public String getMac() {
            return mac;
        }

        public void setMac(String mac) {
            this.mac = mac;
        }
    }

