package com.anselmo.amiibos.ui;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;

import com.anselmo.amiibos.R;
import com.anselmo.amiibos.adapters.AMiiBosStoreAdapter;
import com.anselmo.amiibos.models.AmiiBosModel;
import com.anselmo.amiibos.models.DividerItemDecoration;
import com.anselmo.amiibos.models.DummyData;
import com.github.ksoichiro.android.observablescrollview.ObservableRecyclerView;
import com.google.gson.Gson;

import java.util.ArrayList;

/**
 * Created by Anselmo Hernandez on 9/29/15.
 */
public class StoreDetailActivity extends ToolbarControlBaseActivity<ObservableRecyclerView>  {
    private ObservableRecyclerView recyclerView;
    private ArrayList<AmiiBosModel.Store> items;
    private AMiiBosStoreAdapter adapter;
    private int position;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }

    @Override
    protected ObservableRecyclerView createScrollable() {

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            position = extras.getInt("arrayPosition");

            AmiiBosModel model = new Gson().fromJson(DummyData.AMIIBOS_JSON, AmiiBosModel.class);
            getSupportActionBar().setTitle( model.getResult().get(position).getTitle() );

            items = new ArrayList<>();
            items.addAll(model.getResult().get(position).getStores());
        }

        recyclerView = (ObservableRecyclerView) findViewById(R.id.rvAmiibos);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setHasFixedSize(true);
        recyclerView.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL_LIST));

        adapter = new AMiiBosStoreAdapter(this, items);
        recyclerView.setAdapter(adapter);

        return recyclerView;
    }

    @Override
    protected int getLayoutResId() {
        return R.layout.activity_generic;
    }
}
