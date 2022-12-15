package com.geektech.firstfragment;

import static com.geektech.firstfragment.FirstFragment.KEY_USERNAME;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class SecondFragment extends Fragment {

    private TextView tvResult;
    private EditText etType;
    private Button btnGo;
    static final String KEY_EDIT_TEXT="edittext";
    static final String KEY_AGE="age";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_second, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        tvResult=requireActivity().findViewById(R.id.tv_result);
        
        initView();
        String result =getArguments().getString(KEY_USERNAME);

        tvResult.setText(result);
        
      initListener();
        
    }

    private void initView() {
        tvResult=requireActivity().findViewById(R.id.tv_result);
        etType=requireActivity().findViewById(R.id.et_type);
        btnGo=requireActivity().findViewById(R.id.btn_go);
    }

    private void initListener() {
        btnGo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle=new Bundle();
                bundle.putString(KEY_EDIT_TEXT, etType.toString());
                bundle.putInt(KEY_AGE, 40);

                ThirdFragment fragment2=new ThirdFragment();
                fragment2.setArguments(bundle);

                requireActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.container, fragment2).addToBackStack(null).commit();
            }
        });
    }



}