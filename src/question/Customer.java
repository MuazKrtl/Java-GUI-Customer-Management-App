/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package question;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Muaz
 */
public class Customer{

    private String id;
    private String name;
    private String surname;
    private String phoneNum;
    private String subType;
    private String balance;
    private String followersNum;
    private Customer nextCustomer;

    public Customer(String id, String name, String surname, String phoneNum, String subType, String balance, String followersNum) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.phoneNum = phoneNum;
        this.subType = subType;
        this.balance = balance;
        this.followersNum = followersNum;
        nextCustomer = null;
    }

    public Customer getNextCustomer() {
        return nextCustomer;
    }

    public void setNextCustomer(Customer nextCustomer) {
        this.nextCustomer = nextCustomer;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getSubType() {
        return subType;
    }

    public void setSubType(String subType) {
        this.subType = subType;
    }

    public String getBalance() {
        return balance;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }

    public String getFollowersNum() {
        return followersNum;
    }

    public void setFollowersNum(String followersNum) {
        this.followersNum = followersNum;
    }

   
}
