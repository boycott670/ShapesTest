package com.training.shap.parsers;

import com.training.shap.shapes.Square;

public final class SquareParser implements ShapeParser<Square>
{
  @Override
  public Square parseShape(String side)
  {
    return new Square(Double.valueOf(side));
  }
}
