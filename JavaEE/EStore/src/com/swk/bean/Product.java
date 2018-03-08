package com.swk.bean;

/**
 * Description:产品bean
 * @author Vico
 *
 */
public class Product {
    /*
        id	int(11)
	name	varchar(255)
	category	varchar(255)
	marketprice	double
	estoreprice	double
	pnum	int(11)
	imgurl	varchar(255)
	description	varchar(255)
    */
    private int id;
    private String name;
    private String category;
    private double marketprice;
    private double estoreprice;
    private int pnum;
    private String imgurl;
    private String description;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public double getMarketprice() {
        return marketprice;
    }
    public void setMarketprice(double marketprice) {
        this.marketprice = marketprice;
    }
    public double getEstoreprice() {
        return estoreprice;
    }
    public void setEstoreprice(double estoreprice) {
        this.estoreprice = estoreprice;
    }
    public int getPnum() {
        return pnum;
    }
    public void setPnum(int pnum) {
        this.pnum = pnum;
    }
    public String getImgurl() {
        return imgurl;
    }
    public void setImgurl(String imgurl) {
        this.imgurl = imgurl;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    
    
    
}
