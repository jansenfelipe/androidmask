package br.com.jansenfelipe.androidmask;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;

import java.util.HashSet;
import java.util.Set;

public class MaskEditTextChangedListener implements TextWatcher {
    private String mMask;
    private TextView mTextView;
    private Set<String> symbolMask = new HashSet<String>();
    private boolean isUpdating;
    private String old = "";

    public MaskEditTextChangedListener(String mask, TextView textView) {
        mMask = mask;
        mTextView = textView;
        initSymbolMask();
    }

    private void initSymbolMask(){
        for (int i=0; i < mMask.length(); i++){
            char ch = mMask.charAt(i);
            if (ch != '#')
                symbolMask.add(String.valueOf(ch));
        }
    }

    @Override
    public void onTextChanged(CharSequence s, int start, int before, int count) {
        String str = Utils.unmask(s.toString(), symbolMask);
        String mascara = str.length() > old.length() ? Utils.mask(mMask,str) : s.toString();

        if (isUpdating) {
            old = str;
            isUpdating = false;
            return;
        }

        isUpdating = true;

        mTextView.setText(mascara);
        if (mTextView instanceof EditText) {
            ((EditText) mTextView).setSelection(mascara.length());
        }
    }

    @Override
    public void beforeTextChanged(CharSequence s, int start, int count, int after) {

    }


    @Override
    public void afterTextChanged(Editable s) {

    }
}