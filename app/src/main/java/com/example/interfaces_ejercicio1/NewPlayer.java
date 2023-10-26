package com.example.interfaces_ejercicio1;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import androidx.appcompat.app.AppCompatActivity;

public class NewPlayer extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.newplayer);
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
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);

            // O puedes agregar la lógica para realizar la búsqueda aquí.
            // realizarBusqueda();

            return true; // Indica que el evento del menú ha sido manejado
        }
        // Agrega manejo para otros elementos de menú si es necesario
        return super.onOptionsItemSelected(item);
    }

    // Agrega aquí la lógica para realizar la búsqueda si es necesario
}
