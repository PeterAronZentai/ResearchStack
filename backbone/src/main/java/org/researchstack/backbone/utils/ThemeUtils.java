package org.researchstack.backbone.utils;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.TypedValue;

import org.researchstack.backbone.R;

public class ThemeUtils
{

    public static int getTextColorPrimary(Context context)
    {
        TypedValue typedValue = new TypedValue();
        int[] attribute = new int[] {android.R.attr.textColorPrimary};
        TypedArray array = context.obtainStyledAttributes(typedValue.resourceId, attribute);
        int color = array.getColor(0, Color.BLACK);
        array.recycle();
        return color;
    }

    public static int getAccentColor(Context context)
    {
        TypedValue typedValue = new TypedValue();
        TypedArray a = context.obtainStyledAttributes(typedValue.data,
                new int[] {R.attr.colorAccent});
        int color = a.getColor(0, 0);
        a.recycle();
        return color;
    }

    public static int getPassCodeTheme(Context context)
    {
        TypedValue typedValue = new TypedValue();
        TypedArray a = context.obtainStyledAttributes(typedValue.data,
                new int[] {R.attr.passcodeTheme});
        int themeResId = a.getResourceId(0, 0);
        if (themeResId == 0)
        {
            throw new RuntimeException("Theme must define attribute passCodeTheme or extend from @style/Base.Theme.Backbone");
        }

        a.recycle();
        return themeResId;
    }
}
