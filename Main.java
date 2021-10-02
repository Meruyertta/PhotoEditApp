package com.company;

public class Main {

    public static void main(String[] args) {
    PhotoFilter crema=new BrightEyesDecorator(new WhiteTeethDecorator(new SelfiePicture()));
        System.out.println(crema.edit());
        PhotoFilter NDGrad=new BlurEffectDecorator(new LandscapePicture());
        System.out.println(NDGrad.edit());
        PhotoFilter alexa=new ContrastDecorator(new BrightEyesDecorator(new SelfiePicture()));
        System.out.println(alexa.edit());
    }
}
