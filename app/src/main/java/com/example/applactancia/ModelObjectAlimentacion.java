package com.example.applactancia;

public enum ModelObjectAlimentacion {
    BEBE(1, R.layout.alimentacion_6meses),
    EMBARAZADA(2, R.layout.alimentacion_embarazo),
    LACTANTE(3, R.layout.alimentacion_lactante);

    private int mTitleResId;
    private int mLayoutResId;

    ModelObjectAlimentacion(int titleResId, int layoutResId) {
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
