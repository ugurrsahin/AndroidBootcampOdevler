package com.ugursahin.navigationcomponentodev;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ugursahin.navigationcomponentodev.databinding.FragmentAnasayfaBinding;


public class AnasayfaFragment extends Fragment {
    private FragmentAnasayfaBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        binding = FragmentAnasayfaBinding.inflate(inflater, container, false);

        binding.buttonAGecis.setOnClickListener(view -> {


            Navigation.findNavController(view).navigate(R.id.aGecis);

        });
        binding.buttonXGecis.setOnClickListener(view -> {

            Navigation.findNavController(view).navigate(R.id.xGecis);
        });


        return binding.getRoot();
    }
}