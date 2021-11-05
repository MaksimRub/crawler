package com.company;

abstract public class Figure {
    public String className(){
        return "Figure";
    }
    abstract public void parties();
}
class Triangle extends Figure implements Moveable {
    float x,y,x1,y1,x2,y2;
    public Triangle(float x,float y,float x1,float y1,float x2,float y2){
        this.x=x;
        this.y=y;
        this.x1=x1;
        this.y1=y1;
        this.x2=x2;
        this.y2=y2;
    }
    public String className(){
        return "Triangle";
    }
    @Override
    public void parties() {
        System.out.println("three");
    }
    @Override
    public void shift(float sx, float sy) {
        this.x=x+sx;
        this.y=y+sy;
        this.x1=x1+sx;
        this.y1=y1+sy;
        this.x2=x2+sx;
        this.y2=y2+sy;
    }
    @Override
    public void turn() {
        //поворот по часовой стрелке на 180 градусов относителнь изначальной точки(x,y)
        this.x1=x1+2*(x1-x);
        this.y1=y1-y*2;
        this.x2=x2-2*(x2-x);
    }
}
class Parallelogram extends Figure implements Moveable{
    float x,y,x1,y1,x2,y2,x3,y3;
    public Parallelogram(float x,float y,float x1,float y1,float x2,float y2,float x3,float y3){
        this.x=x;
        this.y=y;
        this.x1=x1;
        this.y1=y1;
        this.x2=x2;
        this.y2=y2;
        this.x3=x3;
        this.y3=y3;
    }
    @Override
    public void parties() {
        System.out.println("four");
    }
    @Override
    public String className() {
        return "parallelogram";
    }
    @Override
    public void shift(float sx, float sy) {
        this.x=x+sx;
        this.y=y+sy;
        this.x1=x1+sx;
        this.y1=y1+sy;
        this.x2=x2+sx;
        this.y2=y2+sy;
        this.x3=x3+sx;
        this.y3=y3+sy;
    }
    @Override
    public void turn() {
        //поворот по часовой стрелке на 180 градусов относителнь изначальной точки(x,y)
        this.y1=y1-2*(y1-y);
        this.x2=x2+2*(x-x2);
        this.y2=y2-(y2-y);
        this.x3=x3+2*(x-x3);

    }
}
class Square extends Parallelogram {
    public Square(float x, float y, float x1, float y1, float x2, float y2, float x3, float y3) {
        super(x, y, x1, y1, x2, y2, x3, y3);
    }
    @Override
    public String className() {
        return "Square";
    }
}
class Rectangle extends Parallelogram{
    public Rectangle(float x, float y, float x1, float y1, float x2, float y2, float x3, float y3) {
        super(x, y, x1, y1, x2, y2, x3, y3);
    }
    @Override
    public String className() {
        return "Rectangle";
    }
}
class Tringleisosceles extends Triangle{
    public Tringleisosceles(float x, float y, float x1, float y1, float x2, float y2) {
        super(x, y, x1, y1, x2, y2);
    }
    @Override
    public String className() {
        return "Tringleisosceles";
    }
}
class Tringleequilateral extends Triangle{
    public Tringleequilateral(float x, float y, float x1, float y1, float x2, float y2) {
        super(x, y, x1, y1, x2, y2);
    }
    @Override
    public String className() {
        return "Tringleequilateral";
    }
}