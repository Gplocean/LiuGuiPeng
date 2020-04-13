package PictureControl.entity;

import java.util.Date;
/**
 * @Description 轮播图实体类
 * @Author 刘桂鹏
 * @Date 2020-04-01
 */

public class PictureInfo {

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
        private int pictureSortNum;
        /**
         * 轮播图路径
         */
        private String picturePath;
        /**
         * 轮播图状态
         */
        private int pictureState;
        /**
         * 轮播图起始时间
         */
        private Date effectiveDate;
        /**
         * 轮播图截止时间
         */
        private Date expiryDate;
        /**
         * 轮播图对应商品
         */
        private String goodsPicture;
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

        public int getPictureSortNum() {
                return pictureSortNum;
        }

        public String getPicturePath() {
                return picturePath;
        }

        public int getPictureState() {
                return pictureState;
        }

        public Date getEffectiveDate() {
                return effectiveDate;
        }

        public Date getExpiryDate() {
                return expiryDate;
        }

        public String getGoodsPicture() {
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

        public String getVersion() {
                return Version;
        }

        public void setPageSize(int pageSize) {
                this.pageSize = pageSize;
        }

        public void setPageNum(int pageNum) {
                this.pageNum = pageNum;
        }

        public void setPictureSortNum(int pictureSortNum) {
                this.pictureSortNum = pictureSortNum;
        }

        public void setPicturePath(String picturePath) {
                this.picturePath = picturePath;
        }

        public void setPictureState(int pictureState) {
                this.pictureState = pictureState;
        }

        public void setEffectiveDate(Date effectiveDate) {
                this.effectiveDate = effectiveDate;
        }

        public void setExpiryDate(Date expiryDate) {
                this.expiryDate = expiryDate;
        }

        public void setGoodsPicture(String goodsPicture) {
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

        public void setVersion(String version) {
                Version = version;
        }
}
