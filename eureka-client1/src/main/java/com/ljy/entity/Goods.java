package com.ljy.entity;

import java.io.Serializable;

public class Goods implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods.id
     *
     * @mbg.generated Tue Dec 03 09:45:16 GMT+08:00 2019
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods.name
     *
     * @mbg.generated Tue Dec 03 09:45:16 GMT+08:00 2019
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods.price
     *
     * @mbg.generated Tue Dec 03 09:45:16 GMT+08:00 2019
     */
    private Integer price;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods.img_url
     *
     * @mbg.generated Tue Dec 03 09:45:16 GMT+08:00 2019
     */
    private String imgUrl;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods.status
     *
     * @mbg.generated Tue Dec 03 09:45:16 GMT+08:00 2019
     */
    private Integer status;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods.datas
     *
     * @mbg.generated Tue Dec 03 09:45:16 GMT+08:00 2019
     */
    private String datas;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table goods
     *
     * @mbg.generated Tue Dec 03 09:45:16 GMT+08:00 2019
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods.id
     *
     * @return the value of goods.id
     *
     * @mbg.generated Tue Dec 03 09:45:16 GMT+08:00 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods.id
     *
     * @param id the value for goods.id
     *
     * @mbg.generated Tue Dec 03 09:45:16 GMT+08:00 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods.name
     *
     * @return the value of goods.name
     *
     * @mbg.generated Tue Dec 03 09:45:16 GMT+08:00 2019
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods.name
     *
     * @param name the value for goods.name
     *
     * @mbg.generated Tue Dec 03 09:45:16 GMT+08:00 2019
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods.price
     *
     * @return the value of goods.price
     *
     * @mbg.generated Tue Dec 03 09:45:16 GMT+08:00 2019
     */
    public Integer getPrice() {
        return price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods.price
     *
     * @param price the value for goods.price
     *
     * @mbg.generated Tue Dec 03 09:45:16 GMT+08:00 2019
     */
    public void setPrice(Integer price) {
        this.price = price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods.img_url
     *
     * @return the value of goods.img_url
     *
     * @mbg.generated Tue Dec 03 09:45:16 GMT+08:00 2019
     */
    public String getImgUrl() {
        return imgUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods.img_url
     *
     * @param imgUrl the value for goods.img_url
     *
     * @mbg.generated Tue Dec 03 09:45:16 GMT+08:00 2019
     */
    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl == null ? null : imgUrl.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods.status
     *
     * @return the value of goods.status
     *
     * @mbg.generated Tue Dec 03 09:45:16 GMT+08:00 2019
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods.status
     *
     * @param status the value for goods.status
     *
     * @mbg.generated Tue Dec 03 09:45:16 GMT+08:00 2019
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods.datas
     *
     * @return the value of goods.datas
     *
     * @mbg.generated Tue Dec 03 09:45:16 GMT+08:00 2019
     */
    public String getDatas() {
        return datas;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods.datas
     *
     * @param datas the value for goods.datas
     *
     * @mbg.generated Tue Dec 03 09:45:16 GMT+08:00 2019
     */
    public void setDatas(String datas) {
        this.datas = datas == null ? null : datas.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods
     *
     * @mbg.generated Tue Dec 03 09:45:16 GMT+08:00 2019
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", price=").append(price);
        sb.append(", imgUrl=").append(imgUrl);
        sb.append(", status=").append(status);
        sb.append(", datas=").append(datas);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}