package com.anselmo.amiibos.ui;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.anselmo.amiibos.R;
import com.anselmo.amiibos.adapters.AMiiBosAdapter;
import com.anselmo.amiibos.models.DividerItemDecoration;
import com.anselmo.amiibos.models.ItemAmiiBos;

import java.util.ArrayList;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


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


        RecyclerView rvContacts = (RecyclerView) findViewById(R.id.rvAmiibos);

        rvContacts.setLayoutManager(new LinearLayoutManager(this));

        RecyclerView.ItemDecoration itemDecoration = new DividerItemDecoration(this, DividerItemDecoration.VERTICAL_LIST);
        rvContacts.addItemDecoration(itemDecoration);


        AMiiBosAdapter adapter = new AMiiBosAdapter(this, items);


        rvContacts.setAdapter( adapter );

    }

}
