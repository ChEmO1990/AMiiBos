package com.anselmo.amiibos.adapters;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.anselmo.amiibos.R;
import com.anselmo.amiibos.models.AmiiBosModel;
import com.bumptech.glide.Glide;
import com.vstechlab.easyfonts.EasyFonts;

import java.util.List;

import mehdi.sakout.fancybuttons.FancyButton;

/**
 * Created by naranya on 9/28/15.
 */
public class AMiiBosStoreAdapter extends RecyclerView.Adapter<AMiiBosStoreAdapter.ViewHolder> {
    private Activity context;
    private List<AmiiBosModel.Store> mStore;

    public AMiiBosStoreAdapter(Activity context, List<AmiiBosModel.Store> mAmiiBos) {
        this.context = context;
        this.mStore = mAmiiBos;
    }

    @Override
    public AMiiBosStoreAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        // Inflate the custom layout
        View contactView = inflater.inflate(R.layout.item_amiibos_store, parent, false);

        // Return a new holder instance
        ViewHolder viewHolder = new ViewHolder(contactView);
        return viewHolder;
    }

    // Involves populating data into the item through holder
    @Override
    public void onBindViewHolder(AMiiBosStoreAdapter.ViewHolder viewHolder, final int position) {
        // Get the data model based on position
        final AmiiBosModel.Store store = mStore.get(position);

        Glide.with(context)
                .load(store.getStoreLogo())
                .fitCenter()
                .placeholder(R.mipmap.ic_launcher)
                .crossFade()
                .into(viewHolder.image);

        viewHolder.title.setText(store.getTitle());
        viewHolder.nameStore.setText( store.getStoreName() );

        viewHolder.btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(mStore.get(position).getLink()));
                context.startActivity(browserIntent);
            }
        });
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        public ImageView image;
        public TextView title;
        public TextView nameStore;
        public FancyButton btn;

        public ViewHolder(View itemView) {

            super(itemView);

            image = (ImageView) itemView.findViewById(R.id.item_store_image);
            title = (TextView) itemView.findViewById(R.id.item_store_title_miibos);
            nameStore = (TextView) itemView.findViewById(R.id.item_store_title);
            btn = (FancyButton) itemView.findViewById(R.id.btn_store);

            title.setTypeface( EasyFonts.robotoBold(context) );
            nameStore.setTypeface(EasyFonts.robotoLight(context));
        }
    }

    // Return the total count of items
    @Override
    public int getItemCount() {
        return mStore.size();
    }
}
