package model;

public class Courier {
    private Integer courierId;
    private String name;
    private String phoneNumber;
    private String vehicleType;
    private String vehiclePlate;
    private Integer customerId;
    private Integer orderId;
    private Boolean availabilityStatus;


    public Courier(Integer courierId, String name, String phoneNumber, String vehicleType, String vehiclePlate, Integer customerId, Integer orderId, Boolean availabilityStatus) {
        this.courierId = courierId;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.vehicleType = vehicleType;
        this.vehiclePlate = vehiclePlate;
        this.customerId = customerId;
        this.orderId = orderId;
        this.availabilityStatus = availabilityStatus;
    }

    @Override
    public String toString() {
        return "Courier{" +
                "courierId=" + courierId +
                ", name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", vehicleType='" + vehicleType + '\'' +
                ", vehiclePlate='" + vehiclePlate + '\'' +
                ", customerId=" + customerId +
                ", orderId=" + orderId +
                ", availabilityStatus=" + availabilityStatus +
                '}';
    }

    public Integer getCourierId() {
        return courierId;
    }

    public void setCourierId(Integer courierId) {
        this.courierId = courierId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getVehiclePlate() {
        return vehiclePlate;
    }

    public void setVehiclePlate(String vehiclePlate) {
        this.vehiclePlate = vehiclePlate;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Boolean getAvailabilityStatus() {
        return availabilityStatus;
    }

    public void setAvailabilityStatus(Boolean availabilityStatus) {
        this.availabilityStatus = availabilityStatus;
    }
}