package com.springboot.mall.model;

public class PmsProductWithBLOBs extends PmsProduct {
    /**
     * 商品描述
     */
    private String description;

    /**
     * 
     */
    private String detailDesc;

    /**
     * 产品详情网页内容
     */
    private String detailHtml;

    /**
     * 移动端网页详情
     */
    private String detailMobileHtml;

    /**
     * 商品描述
     * @return description 商品描述
     */
    public String getDescription() {
        return description;
    }

    /**
     * 商品描述
     * @param description 商品描述
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * 
     * @return detail_desc 
     */
    public String getDetailDesc() {
        return detailDesc;
    }

    /**
     * 
     * @param detailDesc 
     */
    public void setDetailDesc(String detailDesc) {
        this.detailDesc = detailDesc == null ? null : detailDesc.trim();
    }

    /**
     * 产品详情网页内容
     * @return detail_html 产品详情网页内容
     */
    public String getDetailHtml() {
        return detailHtml;
    }

    /**
     * 产品详情网页内容
     * @param detailHtml 产品详情网页内容
     */
    public void setDetailHtml(String detailHtml) {
        this.detailHtml = detailHtml == null ? null : detailHtml.trim();
    }

    /**
     * 移动端网页详情
     * @return detail_mobile_html 移动端网页详情
     */
    public String getDetailMobileHtml() {
        return detailMobileHtml;
    }

    /**
     * 移动端网页详情
     * @param detailMobileHtml 移动端网页详情
     */
    public void setDetailMobileHtml(String detailMobileHtml) {
        this.detailMobileHtml = detailMobileHtml == null ? null : detailMobileHtml.trim();
    }
}