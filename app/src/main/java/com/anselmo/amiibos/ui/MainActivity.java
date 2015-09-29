package com.anselmo.amiibos.ui;

import android.support.v7.widget.LinearLayoutManager;

import com.anselmo.amiibos.R;
import com.anselmo.amiibos.adapters.AMiiBosAdapter;
import com.anselmo.amiibos.models.ItemAmiiBos;
import com.github.ksoichiro.android.observablescrollview.ObservableRecyclerView;

import java.util.ArrayList;

public class MainActivity extends ToolbarControlBaseActivity<ObservableRecyclerView>  {



    @Override
    protected ObservableRecyclerView createScrollable() {
        ObservableRecyclerView recyclerView = (ObservableRecyclerView) findViewById(R.id.rvAmiibos);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setHasFixedSize(true);

        ArrayList<ItemAmiiBos> items = new ArrayList<>();
        items.add( new ItemAmiiBos("Mario bros", "Super Mario Bros", "5 tiendas", "http://media.nintendo.com/nintendo/bin/HUsC5jjXJ53Crzxll8FFUe-6xklmNbCJ/a4SWrmW_szU_fF8OGtqfmymlF7wEkgD-.png"));
        items.add( new ItemAmiiBos("Mario bros", "Super Mario Bros", "5 tiendas", "http://media.nintendo.com/nintendo/bin/HUsC5jjXJ53Crzxll8FFUe-6xklmNbCJ/a4SWrmW_szU_fF8OGtqfmymlF7wEkgD-.png"));
        items.add( new ItemAmiiBos("Mario bros", "Super Mario Bros", "5 tiendas", "http://media.nintendo.com/nintendo/bin/HUsC5jjXJ53Crzxll8FFUe-6xklmNbCJ/a4SWrmW_szU_fF8OGtqfmymlF7wEkgD-.png"));
        items.add( new ItemAmiiBos("Mario bros", "Super Mario Bros", "5 tiendas", "http://media.nintendo.com/nintendo/bin/HUsC5jjXJ53Crzxll8FFUe-6xklmNbCJ/a4SWrmW_szU_fF8OGtqfmymlF7wEkgD-.png"));
        items.add( new ItemAmiiBos("Mario bros", "Super Mario Bros", "5 tiendas", "http://media.nintendo.com/nintendo/bin/HUsC5jjXJ53Crzxll8FFUe-6xklmNbCJ/a4SWrmW_szU_fF8OGtqfmymlF7wEkgD-.png"));
        items.add( new ItemAmiiBos("Mario bros", "Super Mario Bros", "5 tiendas", "http://media.nintendo.com/nintendo/bin/HUsC5jjXJ53Crzxll8FFUe-6xklmNbCJ/a4SWrmW_szU_fF8OGtqfmymlF7wEkgD-.png"));
        items.add( new ItemAmiiBos("Mario bros", "Super Mario Bros", "5 tiendas", "http://media.nintendo.com/nintendo/bin/HUsC5jjXJ53Crzxll8FFUe-6xklmNbCJ/a4SWrmW_szU_fF8OGtqfmymlF7wEkgD-.png"));
        items.add( new ItemAmiiBos("Mario bros", "Super Mario Bros", "5 tiendas", "http://media.nintendo.com/nintendo/bin/HUsC5jjXJ53Crzxll8FFUe-6xklmNbCJ/a4SWrmW_szU_fF8OGtqfmymlF7wEkgD-.png"));
        items.add(new ItemAmiiBos("Mario bros", "Super Mario Bros", "5 tiendas", "http://media.nintendo.com/nintendo/bin/HUsC5jjXJ53Crzxll8FFUe-6xklmNbCJ/a4SWrmW_szU_fF8OGtqfmymlF7wEkgD-.png"));
        items.add(new ItemAmiiBos("Mario bros", "Super Mario Bros", "5 tiendas", "http://media.nintendo.com/nintendo/bin/HUsC5jjXJ53Crzxll8FFUe-6xklmNbCJ/a4SWrmW_szU_fF8OGtqfmymlF7wEkgD-.png"));
        items.add( new ItemAmiiBos("Mario bros", "Super Mario Bros", "5 tiendas", "http://media.nintendo.com/nintendo/bin/HUsC5jjXJ53Crzxll8FFUe-6xklmNbCJ/a4SWrmW_szU_fF8OGtqfmymlF7wEkgD-.png"));
        items.add( new ItemAmiiBos("Mario bros", "Super Mario Bros", "5 tiendas", "http://media.nintendo.com/nintendo/bin/HUsC5jjXJ53Crzxll8FFUe-6xklmNbCJ/a4SWrmW_szU_fF8OGtqfmymlF7wEkgD-.png"));
        items.add( new ItemAmiiBos("Mario bros", "Super Mario Bros", "5 tiendas", "http://media.nintendo.com/nintendo/bin/HUsC5jjXJ53Crzxll8FFUe-6xklmNbCJ/a4SWrmW_szU_fF8OGtqfmymlF7wEkgD-.png"));
        items.add( new ItemAmiiBos("Mario bros", "Super Mario Bros", "5 tiendas", "http://media.nintendo.com/nintendo/bin/HUsC5jjXJ53Crzxll8FFUe-6xklmNbCJ/a4SWrmW_szU_fF8OGtqfmymlF7wEkgD-.png"));
        items.add( new ItemAmiiBos("Mario bros", "Super Mario Bros", "5 tiendas", "http://media.nintendo.com/nintendo/bin/HUsC5jjXJ53Crzxll8FFUe-6xklmNbCJ/a4SWrmW_szU_fF8OGtqfmymlF7wEkgD-.png"));
        items.add( new ItemAmiiBos("Mario bros", "Super Mario Bros", "5 tiendas", "http://media.nintendo.com/nintendo/bin/HUsC5jjXJ53Crzxll8FFUe-6xklmNbCJ/a4SWrmW_szU_fF8OGtqfmymlF7wEkgD-.png"));
        items.add( new ItemAmiiBos("Mario bros", "Super Mario Bros", "5 tiendas", "http://media.nintendo.com/nintendo/bin/HUsC5jjXJ53Crzxll8FFUe-6xklmNbCJ/a4SWrmW_szU_fF8OGtqfmymlF7wEkgD-.png"));
        items.add( new ItemAmiiBos("Mario bros", "Super Mario Bros", "5 tiendas", "http://media.nintendo.com/nintendo/bin/HUsC5jjXJ53Crzxll8FFUe-6xklmNbCJ/a4SWrmW_szU_fF8OGtqfmymlF7wEkgD-.png"));
        items.add( new ItemAmiiBos("Mario bros", "Super Mario Bros", "5 tiendas", "http://media.nintendo.com/nintendo/bin/HUsC5jjXJ53Crzxll8FFUe-6xklmNbCJ/a4SWrmW_szU_fF8OGtqfmymlF7wEkgD-.png"));
        items.add( new ItemAmiiBos("Mario bros", "Super Mario Bros", "5 tiendas", "http://media.nintendo.com/nintendo/bin/HUsC5jjXJ53Crzxll8FFUe-6xklmNbCJ/a4SWrmW_szU_fF8OGtqfmymlF7wEkgD-.png"));

        AMiiBosAdapter adapter = new AMiiBosAdapter(this, items);


        recyclerView.setAdapter(adapter);


        return recyclerView;
    }

    @Override
    protected int getLayoutResId() {
        return R.layout.activity_main;
    }
}
