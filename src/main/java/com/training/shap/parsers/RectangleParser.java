package com.training.shap.parsers;

import java.util.Arrays;

import com.training.shap.shapes.Rectangle;

public final class RectangleParser implements ShapeParser<Rectangle>
{
  @Override
  public Rectangle parseShape(String widthAndHeight)
  {
    final double[] rectangleSides = Arrays.stream(widthAndHeight.split(","))
        .mapToDouble(Double::valueOf)
        .toArray();
    
    return new Rectangle(rectangleSides[0], rectangleSides[1]);
  }
}
