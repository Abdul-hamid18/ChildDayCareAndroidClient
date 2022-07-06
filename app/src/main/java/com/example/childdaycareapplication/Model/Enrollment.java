package com.example.childdaycareapplication.Model;

public class Enrollment {

    private long Id;
    private String ch_Fname;
    private String ch_Lname;
    private String enroll_Date;
    private String ch_Gender;
    private String pr_Fname;
    private String pr_Lname;
    private String pr_Gender;
    private String phone;
    private String email;
    private String category;
    private String address;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCategory() {
        return category;
    }


    public void setCategory(String category) {
        this.category = category;
    }


    public long getId() {
        return Id;
    }



    public void setId(long id) {
        Id = id;
    }

    public String getCh_Fname() {
        return ch_Fname;
    }

    public void setCh_Fname(String ch_Fname) {
        this.ch_Fname = ch_Fname;
    }

    public String getCh_Lname() {
        return ch_Lname;
    }

    public void setCh_Lname(String ch_Lname) {
        this.ch_Lname = ch_Lname;
    }



    public String getEnroll_Date() {
        return enroll_Date;
    }

    public void setEnroll_Date(String enroll_Date) {
        this.enroll_Date = enroll_Date;
    }

    public String getCh_Gender() {
        return ch_Gender;
    }

    public void setCh_Gender(String ch_Gender) {
        this.ch_Gender = ch_Gender;
    }

    public String getPr_Fname() {
        return pr_Fname;
    }

    public void setPr_Fname(String pr_Fname) {
        this.pr_Fname = pr_Fname;
    }

    public String getPr_Lname() {
        return pr_Lname;
    }

    public void setPr_Lname(String pr_Lname) {
        this.pr_Lname = pr_Lname;
    }

    public String getPr_Gender() {
        return pr_Gender;
    }

    public void setPr_Gender(String pr_Gender) {
        this.pr_Gender = pr_Gender;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public  String toString(){
        return "Enrollment ["+
                "id=" + Id +
                ", Child First name: '" + ch_Fname + '\'' +
                ", Child Last name: '" + ch_Lname + '\'' +
                ", Child Gender: '" + ch_Gender + '\'' +
                ", Parent First name: '" + pr_Fname + '\'' +
                ", Parent Last name: '" + pr_Lname + '\'' +
                ", Parent Gender: '" + pr_Gender + '\'' +
                ", Enrollment Date: '" + enroll_Date + '\'' +
                ", Child First name: '" + ch_Fname + '\'' +
                ", Service: '" + category + '\'' +
                ", Phone: '" + phone + '\'' +
                ", Email: '" + email + '\'' +
                ", Address: '" + address + '\'' +


                " ]";
    }

}
