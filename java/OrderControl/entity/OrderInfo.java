package OrderControl.entity;

import java.util.Date;

/**
 * @Description 轮播图实体类
 * @Author 刘桂鹏
 * @Date 2020-04-01
 */

public class OrderInfo {

        /**
         * 页码
         */
        private int pageSize;
        /**
         * 页数
         */
        private int pageNum;
        /**
         * 订单id
         */
        private String orderCode;
        /**
         * 订单总价
         */
        private String orderPrice;
        /**
         * 订单状态
         */
        private String  orderStatus;
        /**
         * 门店编号
         */
        private String storeCode;
        /**
         * 下单人名
         */
        private String orderName;
        /**
         * 下单人手机
         */
        private int phone;
        /**
         * 下单人id
         */
        private  String userCode;
        /**
         * 商品id
         */
        private String goodsCode;

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

        public String getOrderCode() {
                return orderCode;
        }

        public String getOrderPrice() {
                return orderPrice;
        }

        public String getOrderStatus() {
                return orderStatus;
        }

        public String getStoreCode() {
                return storeCode;
        }

        public String getOrderName() {
                return orderName;
        }

        public int getPhone() {
                return phone;
        }

        public String getUserCode() {
                return userCode;
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

        public void setOrderCode(String orderCode) {
                this.orderCode = orderCode;
        }

        public void setOrderPrice(String orderPrice) {
                this.orderPrice = orderPrice;
        }

        public void setOrderStatus(String orderStatus) {
                this.orderStatus = orderStatus;
        }

        public void setStoreCode(String storeCode) {
                this.storeCode = storeCode;
        }

        public void setOrderName(String orderName) {
                this.orderName = orderName;
        }

        public void setPhone(int phone) {
                this.phone = phone;
        }

        public void setUserCode(String userCode) {
                this.userCode = userCode;
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
