package com.example.travelor.fragment;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.travelor.LoginActivity;
import com.example.travelor.PageJumpActivity;
import com.example.travelor.R;
import com.example.travelor.SparkAiActivity;

public class SparkAiFragment extends Fragment {

    private TextView tvStart;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_monitoring, container, false);

        return rootView;
    }

}