package com.training.shap.factories;

import com.training.shap.parsers.ShapeParser;
import com.training.shap.shapes.Shape;

public interface ShapeParserFactory
{
  ShapeParser<? extends Shape> getShapeParser (final String shapeType);
}
