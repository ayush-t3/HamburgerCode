package com.example.HamburgerMenuAPI.entity;

import java.util.HashMap;
import java.util.Map;
public class WealthDatum {
    private String icons;
    private String title;
    private String kycStatus;
    private String notifyLine;
    public String getIcons() {
        return icons;
    }
    public void setIcons(String icons) {
        this.icons = icons;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getKycStatus() {
        return kycStatus;
    }
    public void setKycStatus(String kycStatus) {
        this.kycStatus = kycStatus;
    }
    public String getNotifyLine() {
        return notifyLine;
    }
    public void setNotifyLine(String notifyLine) {
        this.notifyLine = notifyLine;
    }
}