package com.training.shap.parsers;

import com.training.shap.shapes.Shape;

public interface ShapeParser<S extends Shape>
{
  S parseShape (final String shape);
}
