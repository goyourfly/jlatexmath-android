package ru.noties.jlatexmath.awt.font;

import android.graphics.Paint;
import android.graphics.Rect;

import ru.noties.jlatexmath.awt.Font;
import ru.noties.jlatexmath.awt.Graphics2D;
import ru.noties.jlatexmath.awt.geom.Rectangle2D;

public class TextLayout {

    String text;
    Font font;

    Paint pFont;

    public TextLayout(String str, Font font) {
        this(str, font, null);
    }

    public TextLayout(String str, Font font, FontRenderContext frc) {
        this.text = str;
        this.font = font;

        this.pFont = new Paint();
        pFont.setTypeface(font.typeface());
    }

    public String getText() {
        return text;
    }

    public Rectangle2D getBounds() {

        Rect rect = new Rect();
        pFont.getTextBounds(text, 0, text.length(), rect);

        return new Rectangle2D.Float(rect.left, rect.top, rect.width(), rect.height());
    }

    public void draw(Graphics2D g2, int i, int i1) {
        g2.drawText(text, i, i1, pFont);
    }
}
