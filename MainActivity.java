package com.devevp.fragments;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.recyclerview.widget.RecyclerView;

import com.devevp.fragments.Fragmentos.FragmentDefault;
import com.devevp.fragments.Fragmentos.FragmentA;
import com.devevp.fragments.Fragmentos.FragmentB;
import com.devevp.fragments.Interfaces.IComunicaFragments;
import com.devevp.fragments.PeliculasVo.PeliculasVo;
import com.devevp.fragments.R;


public class MainActivity extends AppCompatActivity implements FragmentA.OnFragmentInteractionListener, FragmentB.OnFragmentInteractionListener, IComunicaFragments{
    RecyclerView recyclerview;
    FragmentA listaFragment;
    FragmentB detalleFragmentB;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listaFragment=new FragmentA();
        getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout, new FragmentDefault()).commit();
    }
    @Override
    public void onFragmentInteraction(Uri uri) {
    }
    @Override
    public void enviarPeliculas(PeliculasVo peliculas) {
        detalleFragmentB= new FragmentB();

        Bundle bundleEnvio= new Bundle();
        bundleEnvio.putSerializable("objeto",peliculas);
        detalleFragmentB.setArguments(bundleEnvio);
        //cargar fragmente en activity
        getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout, detalleFragmentB).addToBackStack(null).commit();

    }
    public void mostrarFdefaut(View view){
        getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout, new FragmentDefault()).commit();
    }
    public void mostrarFA(View view){
        getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout, new FragmentA()).commit();
    }
    public void mostrarFB(View view){
        getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout, new FragmentB()).commit();
    }
}



