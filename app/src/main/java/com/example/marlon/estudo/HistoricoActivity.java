package com.example.marlon.estudo;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import com.example.marlon.estudo.adapter.HistoricoAdapter;

import java.util.List;

public class HistoricoActivity extends AppCompatActivity {

    private RecyclerView rvHistorico;
    private LinearLayoutManager llm;
    private List historico;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_historico);

        // Handle Toolbar
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("Histórico");
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        rvHistorico=(RecyclerView) findViewById(R.id.rvHistorico);
        llm = new LinearLayoutManager(this);
        rvHistorico.setLayoutManager(llm);
        rvHistorico.setHasFixedSize(true);
        HistoricoAdapter adapter = new HistoricoAdapter(this);
        rvHistorico.setAdapter(adapter);

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    @Override
    public void onBackPressed() {
        finish();
        super.onBackPressed();
    }
}
