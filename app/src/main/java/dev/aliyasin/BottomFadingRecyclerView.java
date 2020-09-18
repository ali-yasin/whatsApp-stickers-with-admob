package dev.aliyasin;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

public class BottomFadingRecyclerView extends RecyclerView {
    public BottomFadingRecyclerView(Context context) {
        super(context);
    }

    public BottomFadingRecyclerView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public BottomFadingRecyclerView(Context context, @Nullable AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    @Override
    protected float getTopFadingEdgeStrength() {
        return 0.0f;
    }
}