package com.springboot.mall.model;

public class PmsAlbumPic {
    /**
     * 
     */
    private Long id;

    /**
     * 
     */
    private Long albumId;

    /**
     * 
     */
    private String pic;

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
     * @return album_id 
     */
    public Long getAlbumId() {
        return albumId;
    }

    /**
     * 
     * @param albumId 
     */
    public void setAlbumId(Long albumId) {
        this.albumId = albumId;
    }

    /**
     * 
     * @return pic 
     */
    public String getPic() {
        return pic;
    }

    /**
     * 
     * @param pic 
     */
    public void setPic(String pic) {
        this.pic = pic == null ? null : pic.trim();
    }
}