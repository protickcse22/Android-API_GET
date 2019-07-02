package com.softbd.apiproject;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class GetResponse {

    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("applicant")
    @Expose
    private Applicant applicant;
    @SerializedName("message")
    @Expose
    private String message;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Applicant getApplicant() {
        return applicant;
    }

    public void setApplicant(Applicant applicant) {
        this.applicant = applicant;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    static public class UsersDetail {

        @SerializedName("id")
        @Expose
        private Integer id;
        @SerializedName("user_id")
        @Expose
        private Integer userId;
        @SerializedName("father_name_en")
        @Expose
        private String fatherNameEn;
        @SerializedName("father_name_bn")
        @Expose
        private String fatherNameBn;
        @SerializedName("mother_name_en")
        @Expose
        private String motherNameEn;
        @SerializedName("mother_name_bn")
        @Expose
        private String motherNameBn;
        @SerializedName("gender")
        @Expose
        private Integer gender;
        @SerializedName("nid_no")
        @Expose
        private String nidNo;
        @SerializedName("birth_date")
        @Expose
        private String birthDate;
        @SerializedName("hus_wife_en")
        @Expose
        private String husWifeEn;
        @SerializedName("hus_wife_bn")
        @Expose
        private String husWifeBn;
        @SerializedName("religion")
        @Expose
        private Integer religion;
        @SerializedName("present_address")
        @Expose
        private String presentAddress;
        @SerializedName("permanent_address")
        @Expose
        private String permanentAddress;
        @SerializedName("status")
        @Expose
        private Object status;
        @SerializedName("created")
        @Expose
        private String created;
        @SerializedName("modified")
        @Expose
        private String modified;

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public Integer getUserId() {
            return userId;
        }

        public void setUserId(Integer userId) {
            this.userId = userId;
        }

        public String getFatherNameEn() {
            return fatherNameEn;
        }

        public void setFatherNameEn(String fatherNameEn) {
            this.fatherNameEn = fatherNameEn;
        }

        public String getFatherNameBn() {
            return fatherNameBn;
        }

        public void setFatherNameBn(String fatherNameBn) {
            this.fatherNameBn = fatherNameBn;
        }

        public String getMotherNameEn() {
            return motherNameEn;
        }

        public void setMotherNameEn(String motherNameEn) {
            this.motherNameEn = motherNameEn;
        }

        public String getMotherNameBn() {
            return motherNameBn;
        }

        public void setMotherNameBn(String motherNameBn) {
            this.motherNameBn = motherNameBn;
        }

        public Integer getGender() {
            return gender;
        }

        public void setGender(Integer gender) {
            this.gender = gender;
        }

        public String getNidNo() {
            return nidNo;
        }

        public void setNidNo(String nidNo) {
            this.nidNo = nidNo;
        }

        public String getBirthDate() {
            return birthDate;
        }

        public void setBirthDate(String birthDate) {
            this.birthDate = birthDate;
        }

        public String getHusWifeEn() {
            return husWifeEn;
        }

        public void setHusWifeEn(String husWifeEn) {
            this.husWifeEn = husWifeEn;
        }

        public String getHusWifeBn() {
            return husWifeBn;
        }

        public void setHusWifeBn(String husWifeBn) {
            this.husWifeBn = husWifeBn;
        }

        public Integer getReligion() {
            return religion;
        }

        public void setReligion(Integer religion) {
            this.religion = religion;
        }

        public String getPresentAddress() {
            return presentAddress;
        }

        public void setPresentAddress(String presentAddress) {
            this.presentAddress = presentAddress;
        }

        public String getPermanentAddress() {
            return permanentAddress;
        }

        public void setPermanentAddress(String permanentAddress) {
            this.permanentAddress = permanentAddress;
        }

        public Object getStatus() {
            return status;
        }

        public void setStatus(Object status) {
            this.status = status;
        }

        public String getCreated() {
            return created;
        }

        public void setCreated(String created) {
            this.created = created;
        }

        public String getModified() {
            return modified;
        }

        public void setModified(String modified) {
            this.modified = modified;
        }

    }

    static public class Applicant {

        @SerializedName("id")
        @Expose
        private Integer id;
        @SerializedName("user_group_id")
        @Expose
        private Integer userGroupId;
        @SerializedName("user_type")
        @Expose
        private String userType;
        @SerializedName("center_id")
        @Expose
        private Integer centerId;
        @SerializedName("office_id")
        @Expose
        private Integer officeId;
        @SerializedName("office_layer_id")
        @Expose
        private Object officeLayerId;
        @SerializedName("loc_division_id")
        @Expose
        private Integer locDivisionId;
        @SerializedName("loc_district_id")
        @Expose
        private Integer locDistrictId;
        @SerializedName("loc_upazila_id")
        @Expose
        private Integer locUpazilaId;
        @SerializedName("username")
        @Expose
        private String username;
        @SerializedName("name_bn")
        @Expose
        private String nameBn;
        @SerializedName("name_en")
        @Expose
        private String nameEn;
        @SerializedName("email")
        @Expose
        private String email;
        @SerializedName("mobile_no")
        @Expose
        private String mobileNo;
        @SerializedName("picture")
        @Expose
        private Object picture;
        @SerializedName("status")
        @Expose
        private Integer status;
        @SerializedName("created_by")
        @Expose
        private Object createdBy;
        @SerializedName("modified_by")
        @Expose
        private Object modifiedBy;
        @SerializedName("created")
        @Expose
        private String created;
        @SerializedName("modified")
        @Expose
        private String modified;
        @SerializedName("users_detail")
        @Expose
        private UsersDetail usersDetail;

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public Integer getUserGroupId() {
            return userGroupId;
        }

        public void setUserGroupId(Integer userGroupId) {
            this.userGroupId = userGroupId;
        }

        public String getUserType() {
            return userType;
        }

        public void setUserType(String userType) {
            this.userType = userType;
        }

        public Integer getCenterId() {
            return centerId;
        }

        public void setCenterId(Integer centerId) {
            this.centerId = centerId;
        }

        public Integer getOfficeId() {
            return officeId;
        }

        public void setOfficeId(Integer officeId) {
            this.officeId = officeId;
        }

        public Object getOfficeLayerId() {
            return officeLayerId;
        }

        public void setOfficeLayerId(Object officeLayerId) {
            this.officeLayerId = officeLayerId;
        }

        public Integer getLocDivisionId() {
            return locDivisionId;
        }

        public void setLocDivisionId(Integer locDivisionId) {
            this.locDivisionId = locDivisionId;
        }

        public Integer getLocDistrictId() {
            return locDistrictId;
        }

        public void setLocDistrictId(Integer locDistrictId) {
            this.locDistrictId = locDistrictId;
        }

        public Integer getLocUpazilaId() {
            return locUpazilaId;
        }

        public void setLocUpazilaId(Integer locUpazilaId) {
            this.locUpazilaId = locUpazilaId;
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getNameBn() {
            return nameBn;
        }

        public void setNameBn(String nameBn) {
            this.nameBn = nameBn;
        }

        public String getNameEn() {
            return nameEn;
        }

        public void setNameEn(String nameEn) {
            this.nameEn = nameEn;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getMobileNo() {
            return mobileNo;
        }

        public void setMobileNo(String mobileNo) {
            this.mobileNo = mobileNo;
        }

        public Object getPicture() {
            return picture;
        }

        public void setPicture(Object picture) {
            this.picture = picture;
        }

        public Integer getStatus() {
            return status;
        }

        public void setStatus(Integer status) {
            this.status = status;
        }

        public Object getCreatedBy() {
            return createdBy;
        }

        public void setCreatedBy(Object createdBy) {
            this.createdBy = createdBy;
        }

        public Object getModifiedBy() {
            return modifiedBy;
        }

        public void setModifiedBy(Object modifiedBy) {
            this.modifiedBy = modifiedBy;
        }

        public String getCreated() {
            return created;
        }

        public void setCreated(String created) {
            this.created = created;
        }

        public String getModified() {
            return modified;
        }

        public void setModified(String modified) {
            this.modified = modified;
        }

        public UsersDetail getUsersDetail() {
            return usersDetail;
        }

        public void setUsersDetail(UsersDetail usersDetail) {
            this.usersDetail = usersDetail;
        }

    }


}



