package com.training.shap.parsers;

import java.util.Arrays;

import com.training.shap.shapes.Triangle;


public final class TriangleParser implements ShapeParser<Triangle>
{
  @Override
  public Triangle parseShape(String baseAndHeight)
  {
    final double[] triangleSides = Arrays.stream(baseAndHeight.split(","))
        .mapToDouble(Double::valueOf)
        .toArray();
    
    return new Triangle(triangleSides[0], triangleSides[1]);
  }
}
