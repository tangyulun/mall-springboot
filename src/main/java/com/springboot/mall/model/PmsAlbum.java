package com.springboot.mall.model;

public class PmsAlbum {
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
    private String coverPic;

    /**
     * 
     */
    private Integer picCount;

    /**
     * 
     */
    private Integer sort;

    /**
     * 
     */
    private String description;

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
     * @return cover_pic 
     */
    public String getCoverPic() {
        return coverPic;
    }

    /**
     * 
     * @param coverPic 
     */
    public void setCoverPic(String coverPic) {
        this.coverPic = coverPic == null ? null : coverPic.trim();
    }

    /**
     * 
     * @return pic_count 
     */
    public Integer getPicCount() {
        return picCount;
    }

    /**
     * 
     * @param picCount 
     */
    public void setPicCount(Integer picCount) {
        this.picCount = picCount;
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
     * @return description 
     */
    public String getDescription() {
        return description;
    }

    /**
     * 
     * @param description 
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}