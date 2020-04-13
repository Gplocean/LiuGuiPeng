package GoodsControl.entity;



import java.util.Date;

/**
 * @Description 用户实体类
 * @Author dingning
 * @Date 2020-03-21
 */
public class GoodsInfo {
    /**
     * 页码
     */
    private int pageSize;
    /**
     * 页数
     */
    private int pageNum;
    /**
     * 商品代码
     */
    private String goodsCode;
    /**
     * 商品名称
     */
    private String goodsName;
    /**
     * 商品定价
     */
    private String goodsPricing;
    /**
     * 商品售价
     */
    private String goodsSellPrice;
    /**
     * 销售量
     */
    private String goodsSales;
    /**
     * 一级分类
     */
    private int primaryClass;
    /**
     * 二级分类
     */
    private String secondClass;
    /**
     * 广告词
     */
    private String goodsAd;
    /**
     * 商品介绍
     */
    private String goodsIntroduction;
    /**
     * 商品状态
     */

    private int goodsStatus;
    /**
     * 出版社
     */
    private int press;
    /**
     * 作者
     */
    private int author;
    /**
     * 上架时间
     */
    private int shelfTime;
    /**
     * 商家编码
     */
    private int storeCode;
    /**
     * 商家名称
     */
    private int storeName;
    /***
     * 库存
     */
    private int inventory;
    /**
     * 书号
     */
    private int isBnBookNum;
    /**
     * 商品图片
     */
    private int goodsPicture;

    /**
     * 作废标记 0为正常，1为作废
     */
    private int isDeleted;
    /**
     * 创建时间
     */
    private Date gmtCreate;
    /**
     * 创建者
     */
    private String createBy;
    /**
     * 更新时间
     */
    private Date gmtModified;
    /**
     * 更新者
     */
    private String lastModifiedBy;

    /**
     * 版本号
     * @return
     */
    private String Version;

    public void setVersion(String version) {
        Version = version;
    }

    public String getVersion() {
        return Version;
    }

    public int getPageSize() {
        return pageSize;
    }

    public int getPageNum() {
        return pageNum;
    }

    public String getGoodsCode() {
        return goodsCode;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public String getGoodsPricing() {
        return goodsPricing;
    }

    public String getGoodsSellPrice() {
        return goodsSellPrice;
    }

    public String getGoodsSales() {
        return goodsSales;
    }

    public int getPrimaryClass() {
        return primaryClass;
    }

    public String getSecondClass() {
        return secondClass;
    }

    public String getGoodsAd() {
        return goodsAd;
    }

    public String getGoodsIntroduction() {
        return goodsIntroduction;
    }

    public int getGoodsStatus() {
        return goodsStatus;
    }

    public int getPress() {
        return press;
    }

    public int getAuthor() {
        return author;
    }

    public int getShelfTime() {
        return shelfTime;
    }

    public int getStoreCode() {
        return storeCode;
    }

    public int getStoreName() {
        return storeName;
    }

    public int getInventory() {
        return inventory;
    }


    public int getGoodsPicture() {
        return goodsPicture;
    }

    public int getIsDeleted() {
        return isDeleted;
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public String getCreateBy() {
        return createBy;
    }

    public Date getGmtModified() {
        return gmtModified;
    }

    public String getLastModifiedBy() {
        return lastModifiedBy;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public void setGoodsCode(String goodsCode) {
        this.goodsCode = goodsCode;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public void setGoodsPricing(String goodsPricing) {
        this.goodsPricing = goodsPricing;
    }

    public void setGoodsSellPrice(String goodsSellPrice) {
        this.goodsSellPrice = goodsSellPrice;
    }

    public void setGoodsSales(String goodsSales) {
        this.goodsSales = goodsSales;
    }

    public void setPrimaryClass(int primaryClass) {
        this.primaryClass = primaryClass;
    }

    public void setSecondClass(String secondClass) {
        this.secondClass = secondClass;
    }

    public void setGoodsAd(String goodsAd) {
        this.goodsAd = goodsAd;
    }

    public void setGoodsIntroduction(String goodsIntroduction) {
        this.goodsIntroduction = goodsIntroduction;
    }

    public void setGoodsStatus(int goodsStatus) {
        this.goodsStatus = goodsStatus;
    }

    public void setPress(int press) {
        this.press = press;
    }

    public void setAuthor(int author) {
        this.author = author;
    }

    public void setShelfTime(int shelfTime) {
        this.shelfTime = shelfTime;
    }

    public void setStoreCode(int storeCode) {
        this.storeCode = storeCode;
    }

    public void setStoreName(int storeName) {
        this.storeName = storeName;
    }

    public void setInventory(int inventory) {
        this.inventory = inventory;
    }

    public void setIsBnBookNum(int isBnBookNum) {
        this.isBnBookNum = isBnBookNum;
    }

    public int getIsBnBookNum() {
        return isBnBookNum;
    }

    public void setGoodsPicture(int goodsPicture) {
        this.goodsPicture = goodsPicture;
    }

    public void setIsDeleted(int isDeleted) {
        this.isDeleted = isDeleted;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    public void setLastModifiedBy(String lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }
}