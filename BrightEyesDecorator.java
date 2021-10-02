package com.company;

public class BrightEyesDecorator extends Decorator{
    public BrightEyesDecorator(PhotoFilter photoFilter) {
        super(photoFilter);
    }
    String makeEyes (){
        return "eyes are brighter \n ";
    }
    @Override
    public String edit() {
        return super.edit()+makeEyes();
    }

}
