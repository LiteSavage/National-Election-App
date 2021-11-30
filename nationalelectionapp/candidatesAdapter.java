package com.example.nationalelectionapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;


public class candidatesAdapter extends ArrayAdapter<candidates>{

        public candidatesAdapter(Context context, ArrayList<candidates> candidatesList) {
            super(context, 0, candidatesList);
        }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        return initView(position, convertView, parent);
    }

    @Override
    public View getDropDownView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        return initView(position, convertView, parent);
    }

    private View initView(int position, View convertView, ViewGroup parent) {
            if (convertView == null) {
                convertView = LayoutInflater.from(getContext()).inflate(R.layout.vpresidents_spinner_row, parent, false);
            }

            ImageView imageViewFlag = convertView.findViewById(R.id.indaysara);
            TextView textViewName = convertView.findViewById(R.id.sarah);

            candidates currentcandidates = getItem(position);

            if (currentcandidates != null) {
                imageViewFlag.setImageResource(currentcandidates.getflagImage());
                textViewName.setText(currentcandidates.getcandidatesName());
            }
            return convertView;
    }
}
