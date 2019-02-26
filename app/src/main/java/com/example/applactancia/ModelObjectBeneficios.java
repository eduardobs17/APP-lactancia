package com.example.applactancia;

public enum ModelObjectBeneficios {
    BEBE(1, R.layout.beneficios_bebe),
    MADRE(2, R.layout.beneficios_madre),
    FAMILIA(3, R.layout.beneficios_familia),
    MEDIOAMBIENTE(4, R.layout.beneficios_ambiente);

    private int mTitleResId;
    private int mLayoutResId;

    ModelObjectBeneficios(int titleResId, int layoutResId) {
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
