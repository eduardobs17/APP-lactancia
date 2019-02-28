package com.example.applactancia;

public enum ModelObjectLeyes {
    A(1, R.layout.leyes1),
    B(2, R.layout.leyes2),
    C(3, R.layout.leyes3),
    D(4, R.layout.leyes4);

    private int mTitleResId;
    private int mLayoutResId;

    ModelObjectLeyes(int titleResId, int layoutResId) {
        mTitleResId = titleResId;
        mLayoutResId = layoutResId;
    }

    public int getTitleResId() {
        return mTitleResId;
    }

    public int getLayoutResId() {
        return mLayoutResId;
    }
}
