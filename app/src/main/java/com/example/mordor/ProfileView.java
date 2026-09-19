package com.example.mordor;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.widget.Toast;
import com.example.mordor.databinding.ActivityProfileViewBinding;

public class ProfileView extends AppCompatActivity {

    ActivityProfileViewBinding binding;

    String[] carreras = {
            "Elige tu camino en la Tierra Media",
            "Ingeniería en Ciencias de la Computación (Hobbits)",
            "Ingeniería Industrial (Elfos)",
            "Ingeniería Telemática (Enanos)",
            "Ingeniería Electrónica (Magos)",
            "Ingeniería Mecánica (Herreros)",
            "Ingeniería Química (Alquimistas)",
            "Ingeniería Ambiental (Ents)",
            "Medicina (Sanadores)",
            "Odontología (Maestros del Cincel)",
            "Derecho (El Concilio de Elrond)",
            "Administración de Empresas (Intendentes de Gondor)"
    };

    private Drawable spinnerDfBckColor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityProfileViewBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, R.layout.spinner_carreras, carreras);
        adapter.setDropDownViewResource(R.layout.spinner_carreras_custom);

        binding.spnCarrera.setAdapter(adapter);
        spinnerDfBckColor = binding.spnCarrera.getBackground();

        binding.btnGuardar.setOnClickListener(view -> validationAndSave());
    }

    private void validationAndSave() {
        boolean readyToSave = true;

        if(binding.txtName.getText().toString().isEmpty()){
            binding.txtName.setError("El ojo vigila: campo obligatorio.");
            readyToSave = false;
        }

        if(binding.txtMatricula.getText().toString().isEmpty()){
            binding.txtMatricula.setError("Falta el tributo: campo obligatorio.");
            readyToSave = false;
        }

        if (binding.spnCarrera.getSelectedItemPosition() == 0) {
            binding.spnCarrera.setBackgroundResource(R.drawable.spinner_error_bckgr);
            readyToSave = false;
        } else {
            binding.spnCarrera.setBackground(spinnerDfBckColor);
        }

        if(readyToSave){
            guardarPerfil();
        }
    }

    private void guardarPerfil(){
        String nombre = binding.txtName.getText().toString().trim();
        String matricula = binding.txtMatricula.getText().toString().trim();
        String carrera = binding.spnCarrera.getSelectedItem().toString();

        Toast.makeText(this, "¡Registrado en el Gran Libro de Mordor!", Toast.LENGTH_SHORT).show();

        Intent intent = new Intent(this, ResumenView.class);
        intent.putExtra("nombre", nombre);
        intent.putExtra("matricula", matricula);
        intent.putExtra("carrera", carrera);
        startActivity(intent);
    }
}