package br.com.jansenfelipe.androidmask;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

public class MaskEditTextChangedListener implements TextWatcher{

    private static MaskEditTextChangedListener instance;

    private String mMask;
    private EditText mEditText;

    private boolean isUpdating;
    private String old = "";

    public MaskEditTextChangedListener(String mask, EditText editText) {
        mMask = mask;
        mEditText = editText;
    }

    @Override
    public void onTextChanged(CharSequence s, int start, int before, int count) {
        String str = Utils.unmask(s.toString());
        String mascara = "";

        if (isUpdating) {
            old = str;
            isUpdating = false;
            return;
        }

        if(str.length() > old.length())
            mascara = Utils.mask(mMask,str);
        else
            mascara = s.toString();

        isUpdating = true;

        mEditText.setText(mascara);
        mEditText.setSelection(mascara.length());
    }

    @Override
    public void beforeTextChanged(CharSequence s, int start, int count, int after) {

    }


    @Override
    public void afterTextChanged(Editable s) {

    }
}
