package com.company;

public class Decorator implements PhotoFilter{
    private PhotoFilter photoFilter;

    public Decorator(PhotoFilter photoFilter) {
        this.photoFilter = photoFilter;
    }

    @Override
    public String edit() {
        return photoFilter.edit();
    }
}
