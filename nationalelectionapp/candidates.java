package com.example.nationalelectionapp;

public class candidates {
    private String mcandidatesName;
    private int mflagImage;
    
    public candidates(String candidatesName, int flagImage) {
        mcandidatesName = candidatesName;
        mflagImage = flagImage;
    }


    public String getcandidatesName() {
        return mcandidatesName;
    }

    public int getflagImage(){
        return mflagImage;
    }


}
