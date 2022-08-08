package br.edu.ifsp.ads.pdm.cadastro;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.RadioButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import br.edu.ifsp.ads.pdm.cadastro.databinding.ActivityMainBinding;
import br.edu.ifsp.ads.pdm.cadastro.model.Formulario;
import br.edu.ifsp.ads.pdm.cadastro.model.Genero;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding activityMainBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityMainBinding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(activityMainBinding.getRoot());

        var adapter = ArrayAdapter.createFromResource(
                this,
                R.array.uf_array,
                android.R.layout.simple_spinner_item
        );
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        activityMainBinding.ufSpinner.setAdapter(adapter);

        activityMainBinding.buttonClear.setOnClickListener(v -> clearForm());
        activityMainBinding.buttonSave.setOnClickListener(v -> {
            var nomeCompleto = activityMainBinding.editTextNomeCompleto.getText().toString();
            var telefone = activityMainBinding.editTextTelefone.getText().toString();
            var email = activityMainBinding.editTextEmail.getText().toString();
            var cidade = activityMainBinding.editTextCity.getText().toString();
            var uf = String.valueOf(activityMainBinding.ufSpinner.getSelectedItem());
            var genero = ((RadioButton) findViewById(activityMainBinding.radioGroupGender.getCheckedRadioButtonId())).getText();
            var emailList = activityMainBinding.checkBoxEmailList.isChecked();
            var formulario = new Formulario(
                    nomeCompleto,
                    telefone,
                    email,
                    emailList,
                    Genero.valueOf(genero.toString().toUpperCase()),
                    cidade,
                    uf
            );
            Toast.makeText(getBaseContext(), formulario.toString(), Toast.LENGTH_SHORT).show();
        });
    }

    private void clearForm() {
        activityMainBinding.editTextNomeCompleto.setText(null);
        activityMainBinding.editTextCity.setText(null);
        activityMainBinding.editTextEmail.setText(null);
        activityMainBinding.editTextTelefone.setText(null);
        activityMainBinding.checkBoxEmailList.setChecked(false);
        activityMainBinding.radioGroupGender.clearCheck();
        activityMainBinding.ufSpinner.setSelection(0);
    }
}