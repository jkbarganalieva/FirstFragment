package com.geektech.firstfragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class ThirdFragment extends Fragment {

    private TextView tvResult2;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_third, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initView();

        String result_et=getArguments().getString(SecondFragment.KEY_EDIT_TEXT);
        Integer result_age=getArguments().getInt(SecondFragment.KEY_AGE);

        //tvResult2.setText(result_age.toString());
        tvResult2.setText(result_et);

    }

    private void initView() {
        tvResult2=requireActivity().findViewById(R.id.tv_result2);
    }
}