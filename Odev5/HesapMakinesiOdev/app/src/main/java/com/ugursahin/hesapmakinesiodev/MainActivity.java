package com.ugursahin.hesapmakinesiodev;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.ugursahin.hesapmakinesiodev.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.sifir.setOnClickListener(view -> {
            String text = binding.textViewSonuc.getText().toString();

            if(text == ""){
                binding.textViewSonuc.setText("0");
            }else{
                binding.textViewSonuc.setText(text+"0");
            }

        });
        binding.bir.setOnClickListener(view -> {

            String text = binding.textViewSonuc.getText().toString();

            if(text == ""){
                binding.textViewSonuc.setText("1");
            }else{
                binding.textViewSonuc.setText(text+"1");
            }

        });
        binding.iki.setOnClickListener(view -> {
            String text = binding.textViewSonuc.getText().toString();

            if(text == ""){
                binding.textViewSonuc.setText("2");
            }else{
                binding.textViewSonuc.setText(text+"2");
            }

        });
        binding.uc.setOnClickListener(view -> {
            String text = binding.textViewSonuc.getText().toString();

            if(text == ""){
                binding.textViewSonuc.setText("3");
            }else{
                binding.textViewSonuc.setText(text+"3");
            }

        });
        binding.dort.setOnClickListener(view -> {
            String text = binding.textViewSonuc.getText().toString();

            if(text == ""){
                binding.textViewSonuc.setText("4");
            }else{
                binding.textViewSonuc.setText(text+"4");
            }

        });
        binding.bes.setOnClickListener(view -> {
            String text = binding.textViewSonuc.getText().toString();

            if(text == ""){
                binding.textViewSonuc.setText("5");
            }else{
                binding.textViewSonuc.setText(text+"5");
            }

        });
        binding.alti.setOnClickListener(view -> {
            String text = binding.textViewSonuc.getText().toString();

            if(text == ""){
                binding.textViewSonuc.setText("6");
            }else{
                binding.textViewSonuc.setText(text+"6");
            }

        });
        binding.yedi.setOnClickListener(view -> {
            String text = binding.textViewSonuc.getText().toString();

            if(text == ""){
                binding.textViewSonuc.setText("7");
            }else{
                binding.textViewSonuc.setText(text+"7");
            }

        });
        binding.sekiz.setOnClickListener(view -> {
            String text = binding.textViewSonuc.getText().toString();

            if(text == ""){
                binding.textViewSonuc.setText("8");
            }else{
                binding.textViewSonuc.setText(text+"8");
            }

        });
        binding.dokuz.setOnClickListener(view -> {
            String text = binding.textViewSonuc.getText().toString();

            if(text == ""){
                binding.textViewSonuc.setText("9");
            }else{
                binding.textViewSonuc.setText(text+"9");
            }

        });
        binding.arti.setOnClickListener(view -> {
            String text = binding.textViewSonuc.getText().toString();
            if (text == ""){

            }else {
                binding.textViewSonuc.setText(text+"+");

            }

        });
        binding.esittir.setOnClickListener(view -> {
            String text = binding.textViewSonuc.getText().toString();

            if (text == ""){

            }else {
                int toplam = 0;
                String[] sonuc = text.split("\\+");
                int[] sonuc2 = new int[sonuc.length];
                System.out.println("sonuc "+sonuc);
               for(int i = 0;i<sonuc.length;i++){
                    sonuc2[i] = Integer.parseInt(sonuc[i]);
                }
               for (int i = 0; i < sonuc2.length;i++){
                   toplam += sonuc2[i];
               }
                String toplamSonuc = String.valueOf(toplam);
               binding.textViewSonuc.setText(toplamSonuc);

            }

        });

        binding.sifirla.setOnClickListener(view -> {
            binding.textViewSonuc.setText("");
        });

    }
}