package com.springboot.mall.model;

public class UmsMemberReceiveAddress {
    /**
     * 
     */
    private Long id;

    /**
     * 
     */
    private Long memberId;

    /**
     * 收货人名称
     */
    private String name;

    /**
     * 
     */
    private String phoneNumber;

    /**
     * 是否为默认
     */
    private Integer defaultStatus;

    /**
     * 邮政编码
     */
    private String postCode;

    /**
     * 省份/直辖市
     */
    private String province;

    /**
     * 城市
     */
    private String city;

    /**
     * 区
     */
    private String region;

    /**
     * 详细地址(街道)
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
     * 
     * @return member_id 
     */
    public Long getMemberId() {
        return memberId;
    }

    /**
     * 
     * @param memberId 
     */
    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    /**
     * 收货人名称
     * @return name 收货人名称
     */
    public String getName() {
        return name;
    }

    /**
     * 收货人名称
     * @param name 收货人名称
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 
     * @return phone_number 
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * 
     * @param phoneNumber 
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber == null ? null : phoneNumber.trim();
    }

    /**
     * 是否为默认
     * @return default_status 是否为默认
     */
    public Integer getDefaultStatus() {
        return defaultStatus;
    }

    /**
     * 是否为默认
     * @param defaultStatus 是否为默认
     */
    public void setDefaultStatus(Integer defaultStatus) {
        this.defaultStatus = defaultStatus;
    }

    /**
     * 邮政编码
     * @return post_code 邮政编码
     */
    public String getPostCode() {
        return postCode;
    }

    /**
     * 邮政编码
     * @param postCode 邮政编码
     */
    public void setPostCode(String postCode) {
        this.postCode = postCode == null ? null : postCode.trim();
    }

    /**
     * 省份/直辖市
     * @return province 省份/直辖市
     */
    public String getProvince() {
        return province;
    }

    /**
     * 省份/直辖市
     * @param province 省份/直辖市
     */
    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    /**
     * 城市
     * @return city 城市
     */
    public String getCity() {
        return city;
    }

    /**
     * 城市
     * @param city 城市
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
     * 详细地址(街道)
     * @return detail_address 详细地址(街道)
     */
    public String getDetailAddress() {
        return detailAddress;
    }

    /**
     * 详细地址(街道)
     * @param detailAddress 详细地址(街道)
     */
    public void setDetailAddress(String detailAddress) {
        this.detailAddress = detailAddress == null ? null : detailAddress.trim();
    }
}