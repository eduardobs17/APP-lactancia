package com.example.applactancia;

public enum ModelObjectPosiciones {
    P(1, R.layout.posicion1),
    O(2, R.layout.posicion2),
    S(3, R.layout.posicion3),
    I(4, R.layout.posicion4),
    C(5, R.layout.posicion5),
    N(6, R.layout.posicion6);

    private int mTitleResId;
    private int mLayoutResId;

    ModelObjectPosiciones(int titleResId, int layoutResId) {
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
