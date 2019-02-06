package com.example.edwardswife.interactivestory.model;

public class Choice {
    private int textID;
    private int nextPage;

    public int getTextID() {
        return textID;
    }

    public Choice(int textID, int nextPage) {
        this.textID = textID;
        this.nextPage = nextPage;
    }

    public void setTextID(int textID) {
        this.textID = textID;
    }

    public int getNextPage() {
        return nextPage;
    }

    public void setNextPage(int nextPage) {
        this.nextPage = nextPage;
    }
}
