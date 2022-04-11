package com.example.HamburgerMenuAPI.entity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Root {
    private List<Datum> data = new ArrayList<Datum>();
    private List<WealthDatum> wealthData = new ArrayList<WealthDatum>();
    private List<MoneyMakerDatum> moneyMakerData = new ArrayList<MoneyMakerDatum>();
    private List<MoneySaverDatum> moneySaverData = new ArrayList<MoneySaverDatum>();
    private List<Bank> bank = new ArrayList<Bank>();
    private List<InsuranceSolutionsDatum> insuranceSolutionsData = new ArrayList<InsuranceSolutionsDatum>();
    private List<InstantLoansDatum> instantLoansData = new ArrayList<InstantLoansDatum>();
    private List<CustomerSupportDatum> customerSupportData = new ArrayList<CustomerSupportDatum>();
    private List<SettingsDatum> settingsData = new ArrayList<SettingsDatum>();
    private List<AboutUsDatum> aboutUsData = new ArrayList<AboutUsDatum>();
    private List<ManageAppLockDatum> manageAppLockData = new ArrayList<ManageAppLockDatum>();
    private List<ThemeDatum> themeData = new ArrayList<ThemeDatum>();
    public List<Datum> getData() {
        return data;
    }
    public void setData(List<Datum> data) {
        this.data = data;
    }
    public List<WealthDatum> getWealthData() {
        return wealthData;
    }
    public void setWealthData(List<WealthDatum> wealthData) {
        this.wealthData = wealthData;
    }
    public List<MoneyMakerDatum> getMoneyMakerData() {
        return moneyMakerData;
    }
    public void setMoneyMakerData(List<MoneyMakerDatum> moneyMakerData) {
        this.moneyMakerData = moneyMakerData;
    }
    public List<MoneySaverDatum> getMoneySaverData() {
        return moneySaverData;
    }
    public void setMoneySaverData(List<MoneySaverDatum> moneySaverData) {
        this.moneySaverData = moneySaverData;
    }
    public List<Bank> getBank() {
        return bank;
    }
    public void setBank(List<Bank> bank) {
        this.bank = bank;
    }
    public List<InsuranceSolutionsDatum> getInsuranceSolutionsData() {
        return insuranceSolutionsData;
    }
    public void setInsuranceSolutionsData(List<InsuranceSolutionsDatum> insuranceSolutionsData) {
        this.insuranceSolutionsData = insuranceSolutionsData;
    }
    public List<InstantLoansDatum> getInstantLoansData() {
        return instantLoansData;
    }
    public void setInstantLoansData(List<InstantLoansDatum> instantLoansData) {
        this.instantLoansData = instantLoansData;
    }
    public List<CustomerSupportDatum> getCustomerSupportData() {
        return customerSupportData;
    }
    public void setCustomerSupportData(List<CustomerSupportDatum> customerSupportData) {
        this.customerSupportData = customerSupportData;
    }
    public List<SettingsDatum> getSettingsData() {
        return settingsData;
    }
    public void setSettingsData(List<SettingsDatum> settingsData) {
        this.settingsData = settingsData;
    }
    public List<AboutUsDatum> getAboutUsData() {
        return aboutUsData;
    }
    public void setAboutUsData(List<AboutUsDatum> aboutUsData) {
        this.aboutUsData = aboutUsData;
    }
    public List<ManageAppLockDatum> getManageAppLockData() {
        return manageAppLockData;
    }
    public void setManageAppLockData(List<ManageAppLockDatum> manageAppLockData) {
        this.manageAppLockData = manageAppLockData;
    }
    public List<ThemeDatum> getThemeData() {
        return themeData;
    }
    public void setThemeData(List<ThemeDatum> themeData) {
        this.themeData = themeData;
    }
}