package com.example.mordor;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.example.mordor.databinding.ActivityResumenViewBinding;

public class ResumenView extends AppCompatActivity {

    ActivityResumenViewBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityResumenViewBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        String nombre = getIntent().getStringExtra("nombre");
        String matricula = getIntent().getStringExtra("matricula");
        String carrera = getIntent().getStringExtra("carrera");

        binding.lblSaludo.setText(String.format("¡Salve, %s!", nombre));
        binding.lblResumenNombre.setText(String.format("Siervo: %s", nombre));
        binding.lblResumenMatricula.setText("Código: " + matricula);
        binding.lblResumenCarrera.setText("Sendero: " + carrera);

        binding.btnEditar.setOnClickListener(view -> finish());
    }
}