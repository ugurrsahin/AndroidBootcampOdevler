package com.ugursahin.navigationcomponentodev;

import android.os.Binder;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.telephony.BarringInfo;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ugursahin.navigationcomponentodev.databinding.FragmentSayfaXBinding;


public class SayfaXFragment extends Fragment {

    private FragmentSayfaXBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentSayfaXBinding.inflate(inflater, container, false);

        binding.buttonYGecis2.setOnClickListener(view -> {


            Navigation.findNavController(view).navigate(R.id.yGecis);

        });

        return binding.getRoot();
    }
}