package com.training.shap;

import java.io.IOException;
import java.io.Writer;

import com.training.shap.factories.DefaultShapeParserFactory;
import com.training.shap.factories.ShapeParserFactory;

public final class Shapes
{
  private final ShapeParserFactory shapeParserFactory = new DefaultShapeParserFactory();
  
  private final Writer writer;
  
  public Shapes(Writer writer)
  {
    this.writer = writer;
  }

  public void area (final String shapeType, final String shapeSides) throws IOException
  {
    writer.append(String.format("%.0f\n", shapeParserFactory.getShapeParser(shapeType).parseShape(shapeSides).area()));
  }
}
