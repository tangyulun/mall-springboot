package com.springboot.mall.model;

public class CmsPrefrenceArea {
    /**
     * 
     */
    private Long id;

    /**
     * 
     */
    private String name;

    /**
     * 
     */
    private String subTitle;

    /**
     * 
     */
    private Integer sort;

    /**
     * 
     */
    private Integer showStatus;

    /**
     * 展示图片
     */
    private byte[] pic;

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
     * @return name 
     */
    public String getName() {
        return name;
    }

    /**
     * 
     * @param name 
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 
     * @return sub_title 
     */
    public String getSubTitle() {
        return subTitle;
    }

    /**
     * 
     * @param subTitle 
     */
    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle == null ? null : subTitle.trim();
    }

    /**
     * 
     * @return sort 
     */
    public Integer getSort() {
        return sort;
    }

    /**
     * 
     * @param sort 
     */
    public void setSort(Integer sort) {
        this.sort = sort;
    }

    /**
     * 
     * @return show_status 
     */
    public Integer getShowStatus() {
        return showStatus;
    }

    /**
     * 
     * @param showStatus 
     */
    public void setShowStatus(Integer showStatus) {
        this.showStatus = showStatus;
    }

    /**
     * 展示图片
     * @return pic 展示图片
     */
    public byte[] getPic() {
        return pic;
    }

    /**
     * 展示图片
     * @param pic 展示图片
     */
    public void setPic(byte[] pic) {
        this.pic = pic;
    }
}