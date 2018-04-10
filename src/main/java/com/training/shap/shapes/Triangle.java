package com.training.shap.shapes;

public final class Triangle extends Shape
{
  private final double base;
  private final double height;
  
  public Triangle(double base, double height)
  {
    this.base = base;
    this.height = height;
  }

  @Override
  public double area()
  {
    return base * height / 2;
  }
}
