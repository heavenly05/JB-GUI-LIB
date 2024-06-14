package org.jbguilib.draw;

import org.jbguilib.color.ColorRGBA;
import org.jbguilib.positioning.PercentPoint;
import org.jbguilib.positioning.PixelDimension;
import org.jbguilib.positioning.PixelPoint;
import org.jbguilib.util.Util;
import org.lwjgl.opengl.GL11;

public class Line {

  public static void drawLine(PercentPoint point1, PercentPoint point2, ColorRGBA color) {
    GL11.glBegin(GL11.GL_LINES);
        GL11.glColor4f(color.getRed1f(), color.getGreen1f(), color.getBlue1f(), color.getAlpha());
        GL11.glVertex2f(point1.getX(), point1.getY());
        GL11.glVertex2f(point2.getX(), point2.getY());
    GL11.glEnd();
  }

  public static void drawLine(PixelPoint point1, PixelPoint point2, ColorRGBA color, PixelDimension window) {
    drawLine(Util.pixelToPercentPoint(window, point1), Util.pixelToPercentPoint(window, point1), color);
  }
  
}
