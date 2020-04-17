package HotGoodsControl.entity;

import java.util.Date;

/**
 * @Description 热门商品实体类
 * @Author 刘桂鹏
 * @Date 2020-04-14
 */

public class HotGoodsInfo {

        /**
         * 页码
         */
        private int pageSize;
        /**
         * 页数
         */
        private int pageNum;
        /**
         * 轮播图排序号
         */
        private int goodsCode;
        /**
         * 轮播图id
         */
        private String hotGoodsCode;
        /**
         * 轮播图路径
         */
        private String goodsName;
        /**
         * 轮播图状态
         */
        private int hotGoodsNum;
        /**
         * 轮播图起始时间
         */
        private Date goodsPrice;
        /**
         * 轮播图截止时间
         */
        private Date GoodsIntroduction;
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

        public int getPageSize() {
                return pageSize;
        }

        public int getPageNum() {
                return pageNum;
        }

        public int getGoodsCode() {
                return goodsCode;
        }

        public String getHotGoodsCode() {
                return hotGoodsCode;
        }

        public String getGoodsName() {
                return goodsName;
        }

        public int getHotGoodsNum() {
                return hotGoodsNum;
        }

        public Date getGoodsPrice() {
                return goodsPrice;
        }

        public Date getGoodsIntroduction() {
                return GoodsIntroduction;
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

        public String getVersion() {
                return Version;
        }

        public void setPageSize(int pageSize) {
                this.pageSize = pageSize;
        }

        public void setPageNum(int pageNum) {
                this.pageNum = pageNum;
        }

        public void setGoodsCode(int goodsCode) {
                this.goodsCode = goodsCode;
        }

        public void setHotGoodsCode(String hotGoodsCode) {
                this.hotGoodsCode = hotGoodsCode;
        }

        public void setGoodsName(String goodsName) {
                this.goodsName = goodsName;
        }

        public void setHotGoodsNum(int hotGoodsNum) {
                this.hotGoodsNum = hotGoodsNum;
        }

        public void setGoodsPrice(Date goodsPrice) {
                this.goodsPrice = goodsPrice;
        }

        public void setGoodsIntroduction(Date goodsIntroduction) {
                GoodsIntroduction = goodsIntroduction;
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

        public void setVersion(String version) {
                Version = version;
        }
}
