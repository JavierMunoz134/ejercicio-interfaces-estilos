package com.example.interfaces_ejercicio1;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button jugador1 = findViewById(R.id.button1);
        jugador1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lanzarNewPlayer();
            }
        });
    }

    private void lanzarNewPlayer() {
        Intent intent = new Intent(this, NewPlayer.class);
        startActivity(intent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_buscar) {
            // Manejar la selección de la opción "Buscar" en el menú
            // Por ejemplo, puedes abrir una nueva actividad de búsqueda o realizar alguna acción.
            // Si deseas abrir una nueva actividad:
            Intent intent = new Intent(this, NewPlayer.class);
            startActivity(intent);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
