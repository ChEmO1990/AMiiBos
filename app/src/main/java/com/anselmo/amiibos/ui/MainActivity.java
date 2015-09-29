package com.anselmo.amiibos.ui;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.anselmo.amiibos.AMiiBos;
import com.anselmo.amiibos.R;
import com.anselmo.amiibos.adapters.AMiiBosAdapter;
import com.anselmo.amiibos.models.AmiiBosModel;
import com.anselmo.amiibos.models.DividerItemDecoration;
import com.anselmo.amiibos.networking.GsonRequest;
import com.anselmo.amiibos.utils.EndPoints;
import com.github.ksoichiro.android.observablescrollview.ObservableRecyclerView;

import java.util.ArrayList;

public class MainActivity extends ToolbarControlBaseActivity<ObservableRecyclerView>  {
    private ObservableRecyclerView recyclerView;
    private ArrayList<AmiiBosModel.Result> items;
    private AMiiBosAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        GsonRequest<AmiiBosModel> request = new GsonRequest<>(Request.Method.GET, EndPoints.BASE_URL, AmiiBosModel.class, successListenerMiibos(), createErrorListener(), null, Request.Priority.HIGH);
        AMiiBos.getInstance().addToRequestQueue( request );
    }

    @Override
    protected ObservableRecyclerView createScrollable() {
        recyclerView = (ObservableRecyclerView) findViewById(R.id.rvAmiibos);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setHasFixedSize(true);
        recyclerView.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL_LIST));


        items = new ArrayList<>();

        adapter = new AMiiBosAdapter(this, items);
        recyclerView.setAdapter(adapter);

        return recyclerView;
    }

    @Override
    protected int getLayoutResId() {
        return R.layout.activity_main;
    }

    private Response.Listener<AmiiBosModel> successListenerMiibos() {
        return new Response.Listener<AmiiBosModel>() {
            @Override
            public void onResponse(AmiiBosModel response) {
                items.addAll( response.getResult() );
                adapter.notifyDataSetChanged();
            }
        };
    }

    private Response.ErrorListener createErrorListener() {
        return new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                error.printStackTrace();
            }
        };
    }
}
