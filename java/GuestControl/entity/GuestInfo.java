package GuestControl.entity;

import java.util.Date;

/**
 * @Description 轮播图实体类
 * @Author 刘桂鹏
 * @Date 2020-04-01
 */

public class GuestInfo {

        /**
         * 页码
         */
        private int pageSize;
        /**
         * 页数
         */
        private int pageNum;
        /**
         * 客户id
         */
        private String guestCode;
        /**
         * 客户账号
         */
        private String userAccount;
        /**
         * 客户名
         */
        private String guestName;
        /**
         * 客户身份证号
         */
        private String guestIdCard;
        /**
         * 客户性别
         */
        private String sex;
        /**
         * 客户电话
         */
        private String telephone;
        /**
         * 客户邮箱
         */
        private String email;

        /**
         * 客户角色
         */
        private  int role;

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

        public String getGuestCode() {
                return guestCode;
        }

        public String getUserAccount() {
                return userAccount;
        }

        public String getGuestName() {
                return guestName;
        }

        public String getGuestIdCard() {
                return guestIdCard;
        }

        public String getSex() {
                return sex;
        }

        public String getTelephone() {
                return telephone;
        }

        public String getEmail() {
                return email;
        }

        public int getRole() {
                return role;
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

        public void setGuestCode(String guestCode) {
                this.guestCode = guestCode;
        }

        public void setUserAccount(String guestAccount) {
                this.userAccount = guestAccount;
        }

        public void setGuestName(String guestName) {
                this.guestName = guestName;
        }

        public void setGuestIdCard(String guestIdCard) {
                this.guestIdCard = guestIdCard;
        }

        public void setSex(String sex) {
                this.sex = sex;
        }

        public void setTelephone(String telephone) {
                this.telephone = telephone;
        }

        public void setEmail(String email) {
                this.email = email;
        }

        public void setRole(int role) {
                this.role = role;
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
