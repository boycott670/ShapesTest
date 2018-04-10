package com.training.shap.factories;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Supplier;

import com.training.shap.parsers.RectangleParser;
import com.training.shap.parsers.ShapeParser;
import com.training.shap.parsers.SquareParser;
import com.training.shap.parsers.TriangleParser;
import com.training.shap.shapes.Shape;

public final class DefaultShapeParserFactory implements ShapeParserFactory
{
  @Override
  public ShapeParser<? extends Shape> getShapeParser(String shapeType)
  {
    final Map<? super String, Supplier<? extends ShapeParser<? extends Shape>>> shapeTypeToShapeParser = new HashMap<>();
    
    shapeTypeToShapeParser.put("SQUARE", SquareParser::new);
    shapeTypeToShapeParser.put("RECTANGLE", RectangleParser::new);
    shapeTypeToShapeParser.put("TRIANGLE", TriangleParser::new);
    
    return Optional.ofNullable(shapeTypeToShapeParser.get(shapeType))
        .orElseThrow(IllegalArgumentException::new)
        .get();
  }
}
