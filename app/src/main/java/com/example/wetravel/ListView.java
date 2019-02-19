package com.example.wetravel;

public class ListView {
    private int icon;
    private String title;

    private boolean isGroupHeader = false;

    public ListView(int icon, String title) {
        this.icon = icon;
        this.title = title;
    }

    public ListView(int icon, String title, boolean isGroupHeader) {
        this.icon = icon;
        this.title = title;
        this.isGroupHeader = isGroupHeader;
    }

    public int getIcon() {
        return icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isGroupHeader() {
        return isGroupHeader;
    }

    public void setGroupHeader(boolean groupHeader) {
        isGroupHeader = groupHeader;
    }
}
