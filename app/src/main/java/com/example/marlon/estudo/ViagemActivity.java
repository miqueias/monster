package com.example.marlon.estudo;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;

/**
 * Created by Marlon on 03/06/2016.
 */
public class ViagemActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_viagem);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("MOTORISTA A CAMINHO");
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_perfil) {
            Intent it = new Intent(getBaseContext(), PerfilActivity.class);
            startActivity(it);
            // Handle the camera action
        } else if (id == R.id.nav_historico) {
            Intent it = new Intent(getBaseContext(), HistoricoActivity.class);
            startActivity(it);
        } else if (id == R.id.nav_pagamento) {

        } else if (id == R.id.nav_sair) {

        } else if (id == R.id.nav_codigo) {
            Intent it = new Intent(getBaseContext(), CodigoIndicacaoActivity.class);
            startActivity(it);
        } else if (id == R.id.nav_fimcorrida) {
            Intent it = new Intent(getBaseContext(), FimCorridaActivity.class);
            startActivity(it);
        } else if (id == R.id.nav_avaliacao) {
            Intent it = new Intent(getBaseContext(), AvalieMotoristaActivity.class);
            startActivity(it);
        }
        else if (id == R.id.nav_dialog1) {
            LayoutInflater li = LayoutInflater.from(ViagemActivity.this);
            View promptsView = li.inflate(R.layout.dialog_custo_estimado, null);
            final AlertDialog alertDialog = new AlertDialog.Builder(ViagemActivity.this).create();
            alertDialog.setView(promptsView);
            alertDialog.show();
        }
        else if (id == R.id.nav_dialog2) {
            LayoutInflater li = LayoutInflater.from(ViagemActivity.this);
            View promptsView = li.inflate(R.layout.dialog_forma_pagamento, null);
            final AlertDialog alertDialog = new AlertDialog.Builder(ViagemActivity.this).create();
            alertDialog.setView(promptsView);
            alertDialog.show();
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}