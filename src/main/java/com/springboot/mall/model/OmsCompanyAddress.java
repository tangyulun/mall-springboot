package com.springboot.mall.model;

public class OmsCompanyAddress {
    /**
     * 
     */
    private Long id;

    /**
     * 地址名称
     */
    private String addressName;

    /**
     * 默认发货地址：0->否；1->是
     */
    private Integer sendStatus;

    /**
     * 是否默认收货地址：0->否；1->是
     */
    private Integer receiveStatus;

    /**
     * 收发货人姓名
     */
    private String name;

    /**
     * 收货人电话
     */
    private String phone;

    /**
     * 省/直辖市
     */
    private String province;

    /**
     * 市
     */
    private String city;

    /**
     * 区
     */
    private String region;

    /**
     * 详细地址
     */
    private String detailAddress;

    /**
     * 
     * @return id 
     */
    public Long getId() {
        return id;
    }

    /**
     * 
     * @param id 
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 地址名称
     * @return address_name 地址名称
     */
    public String getAddressName() {
        return addressName;
    }

    /**
     * 地址名称
     * @param addressName 地址名称
     */
    public void setAddressName(String addressName) {
        this.addressName = addressName == null ? null : addressName.trim();
    }

    /**
     * 默认发货地址：0->否；1->是
     * @return send_status 默认发货地址：0->否；1->是
     */
    public Integer getSendStatus() {
        return sendStatus;
    }

    /**
     * 默认发货地址：0->否；1->是
     * @param sendStatus 默认发货地址：0->否；1->是
     */
    public void setSendStatus(Integer sendStatus) {
        this.sendStatus = sendStatus;
    }

    /**
     * 是否默认收货地址：0->否；1->是
     * @return receive_status 是否默认收货地址：0->否；1->是
     */
    public Integer getReceiveStatus() {
        return receiveStatus;
    }

    /**
     * 是否默认收货地址：0->否；1->是
     * @param receiveStatus 是否默认收货地址：0->否；1->是
     */
    public void setReceiveStatus(Integer receiveStatus) {
        this.receiveStatus = receiveStatus;
    }

    /**
     * 收发货人姓名
     * @return name 收发货人姓名
     */
    public String getName() {
        return name;
    }

    /**
     * 收发货人姓名
     * @param name 收发货人姓名
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 收货人电话
     * @return phone 收货人电话
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 收货人电话
     * @param phone 收货人电话
     */
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    /**
     * 省/直辖市
     * @return province 省/直辖市
     */
    public String getProvince() {
        return province;
    }

    /**
     * 省/直辖市
     * @param province 省/直辖市
     */
    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    /**
     * 市
     * @return city 市
     */
    public String getCity() {
        return city;
    }

    /**
     * 市
     * @param city 市
     */
    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    /**
     * 区
     * @return region 区
     */
    public String getRegion() {
        return region;
    }

    /**
     * 区
     * @param region 区
     */
    public void setRegion(String region) {
        this.region = region == null ? null : region.trim();
    }

    /**
     * 详细地址
     * @return detail_address 详细地址
     */
    public String getDetailAddress() {
        return detailAddress;
    }

    /**
     * 详细地址
     * @param detailAddress 详细地址
     */
    public void setDetailAddress(String detailAddress) {
        this.detailAddress = detailAddress == null ? null : detailAddress.trim();
    }
}