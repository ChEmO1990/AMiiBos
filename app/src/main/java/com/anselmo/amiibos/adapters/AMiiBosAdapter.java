package com.anselmo.amiibos.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.anselmo.amiibos.R;
import com.anselmo.amiibos.models.ItemAmiiBos;
import com.bumptech.glide.Glide;

import java.util.List;

/**
 * Created by naranya on 9/28/15.
 */
public class AMiiBosAdapter extends RecyclerView.Adapter<AMiiBosAdapter.ViewHolder> {
    private Context context;
    private List<ItemAmiiBos> mAmiiBos;

    public AMiiBosAdapter(Context context, List<ItemAmiiBos> mAmiiBos) {
        this.context = context;
        this.mAmiiBos = mAmiiBos;
    }

    @Override
    public AMiiBosAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        // Inflate the custom layout
        View contactView = inflater.inflate(R.layout.item_amiibos, parent, false);

        // Return a new holder instance
        ViewHolder viewHolder = new ViewHolder(contactView);
        return viewHolder;
    }

    // Involves populating data into the item through holder
    @Override
    public void onBindViewHolder(AMiiBosAdapter.ViewHolder viewHolder, int position) {
        // Get the data model based on position
        ItemAmiiBos amiibos = mAmiiBos.get(position);

        Glide.with(context)
                .load(amiibos.getUrlImage())
                .centerCrop()
                //.placeholder(R.drawable.loading_spinner)
                .crossFade()
                .into(viewHolder.image);

        viewHolder.title.setText( amiibos.getTitle() );
        viewHolder.serie.setText( amiibos.getSerie() );
        viewHolder.store.setText( amiibos.getStore() );
    }

    class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        public ImageView image;
        public TextView title;
        public TextView serie;
        public TextView store;

        public ViewHolder(View itemView) {

            super(itemView);

            image = (ImageView) itemView.findViewById(R.id.item_miibos_image);
            title = (TextView) itemView.findViewById(R.id.item_miibos_title);
            serie = (TextView) itemView.findViewById(R.id.item_miibos_serie);
            store = (TextView) itemView.findViewById(R.id.item_miibos_stores);

            // Attach a click listener to the entire row view
            itemView.setOnClickListener(this);
        }

        // Handles the row being being clicked
        @Override
        public void onClick(View view) {
            int position = getLayoutPosition(); // gets item position
            ItemAmiiBos user = mAmiiBos.get(position);
            // We can access the data within the views
            Toast.makeText(context, user.getTitle(), Toast.LENGTH_SHORT).show();
        }

    }

    // Return the total count of items
    @Override
    public int getItemCount() {
        return mAmiiBos.size();
    }
}
