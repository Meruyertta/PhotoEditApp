package com.company;

public class ContrastDecorator extends Decorator{

    public ContrastDecorator(PhotoFilter photoFilter) {
        super(photoFilter);
    }
    String applyContrast(){
        return "contrast adjusted \n";
    }

    @Override
    public String edit() {
        return super.edit()+applyContrast();
    }
}
