package GoodsSortControl.entity;

import java.util.Date;

/**
 * @Description 轮播图实体类
 * @Author 刘桂鹏
 * @Date 2020-04-01
 */

public class GoodsSortInfo {

        /**
         * 页码
         */
        private int pageSize;
        /**
         * 页数
         */
        private int pageNum;
        /**
         * 商品id
         */
        private String goodsCode;
        /**
         * 商品分类id
         */
        private String classCode;
        /**
         * 商品分类名称
         */
        private String  className;
        /**
         * 商品分类父级编号
         */
        private String classParent;
        /**
         * 商品分类备注
         */
        private String remark;

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

        public String getGoodsCode() {
                return goodsCode;
        }

        public String getClassCode() {
                return classCode;
        }

        public String getClassName() {
                return className;
        }

        public String getClassParent() {
                return classParent;
        }

        public String getRemark() {
                return remark;
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

        public void setGoodsCode(String goodsCode) {
                this.goodsCode = goodsCode;
        }

        public void setClassCode(String classCode) {
                this.classCode = classCode;
        }

        public void setClassName(String className) {
                this.className = className;
        }

        public void setClassParent(String classParent) {
                this.classParent = classParent;
        }

        public void setRemark(String remark) {
                this.remark = remark;
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
