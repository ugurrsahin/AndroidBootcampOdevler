package com.ugursahin.navigationcomponentodev;

import android.os.Binder;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ugursahin.navigationcomponentodev.databinding.FragmentSayfaBBinding;


public class SayfaBFragment extends Fragment {

   private FragmentSayfaBBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentSayfaBBinding.inflate(inflater, container, false);

        binding.buttonYGecis.setOnClickListener(view -> {


            Navigation.findNavController(view).navigate(R.id.y2Gecis);

        });



        return binding.getRoot();
    }
}