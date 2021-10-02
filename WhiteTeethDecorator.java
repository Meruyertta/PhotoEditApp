package com.company;

public class WhiteTeethDecorator extends Decorator{

    public WhiteTeethDecorator(PhotoFilter photoFilter) {
        super(photoFilter);
    }
    String whitening (){
        return "teeth have been whitened \n";
    }

    @Override
    public String edit() {
        return super.edit()+whitening();
    }
}
