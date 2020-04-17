package StoreControl.entity;
import java.util.Date;
/**
 * @Description 热门商品实体类
 * @Author 刘桂鹏
 * @Date 2020-04-14
 */
public class StoreInfo {

        /**
         * 页码
         */
        private int pageSize;
        /**
         * 页数
         */
        private int pageNum;
        /**
         * 商店id
         */
        private int storeCode;
        /**
         * 商店名
         */
        private String storeName;
        /**
         * 商店名
         */
        private String storeAccount;
        /**
         * 手机号
         */
        private String phone;
        /**
         * 店主id
         */
        private int hostCode;
        /**
         * 营业执照
         */
        private String license;
        /**
         * 门店邀请码
         */
        private String inviteCode;
        /**
         * 省id
         */
        private String provinceCode;
        /**
         * 城市id
         */
        private String cityCode;
        /**
         * 区域id
         */
        private String areaCode;
        /**
         * 详细地址
         */
        private String address;
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

        public int getStoreCode() {
                return storeCode;
        }

        public String getStoreName() {
                return storeName;
        }

        public String getPhone() {
                return phone;
        }

        public int getHostCode() {
                return hostCode;
        }

        public String getLicense() {
                return license;
        }

        public String getProvinceCode() {
                return provinceCode;
        }

        public String getCityCode() {
                return cityCode;
        }

        public String getAreaCode() {
                return areaCode;
        }

        public String getAddress() {
                return address;
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

        public void setStoreCode(int storeCode) {
                this.storeCode = storeCode;
        }

        public void setStoreName(String storeName) {
                this.storeName = storeName;
        }

        public void setPhone(String phone) {
                this.phone = phone;
        }

        public void setHostCode(int hostCode) {
                this.hostCode = hostCode;
        }

        public void setLicense(String license) {
                this.license = license;
        }

        public void setProvinceCode(String provinceCode) {
                this.provinceCode = provinceCode;
        }

        public void setCityCode(String cityCode) {
                this.cityCode = cityCode;
        }

        public void setAreaCode(String areaCode) {
                this.areaCode = areaCode;
        }

        public void setAddress(String address) {
                this.address = address;
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
