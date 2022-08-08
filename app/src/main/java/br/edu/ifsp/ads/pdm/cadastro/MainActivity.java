package br.edu.ifsp.ads.pdm.cadastro;

import android.os.Bundle;
import android.widget.ArrayAdapter;

import androidx.appcompat.app.AppCompatActivity;

import br.edu.ifsp.ads.pdm.cadastro.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding activityMainBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityMainBinding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(activityMainBinding.getRoot());

        try {
            var adapter = ArrayAdapter.createFromResource(
                    this,
                    R.array.uf_array,
                    android.R.layout.simple_spinner_item
            );
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            activityMainBinding.ufSpinner.setAdapter(adapter);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}