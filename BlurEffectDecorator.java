package com.company;

public class BlurEffectDecorator extends Decorator{
    public BlurEffectDecorator(PhotoFilter photoFilter) {
        super(photoFilter);
    }
    String applyBlur(){
        return "blue effect is applied \n";
    }

    @Override
    public String edit() {
        return super.edit()+applyBlur();
    }
}
