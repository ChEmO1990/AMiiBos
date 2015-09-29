package com.anselmo.amiibos.adapters;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.anselmo.amiibos.R;
import com.anselmo.amiibos.models.AmiiBosModel;
import com.anselmo.amiibos.ui.StoreDetailActivity;
import com.bumptech.glide.Glide;
import com.github.mrengineer13.snackbar.SnackBar;
import com.vstechlab.easyfonts.EasyFonts;

import java.util.List;

/**
 * Created by naranya on 9/28/15.
 */
public class AMiiBosAdapter extends RecyclerView.Adapter<AMiiBosAdapter.ViewHolder> {
    private Activity context;
    private List<AmiiBosModel.Result> mAmiiBos;

    public AMiiBosAdapter(Activity context, List<AmiiBosModel.Result> mAmiiBos) {
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
        AmiiBosModel.Result amiibos = mAmiiBos.get(position);

        Glide.with(context)
                .load(amiibos.getImg())
                .centerCrop()
                .placeholder(R.mipmap.ic_launcher)
                .crossFade()
                .into(viewHolder.image);

        viewHolder.title.setText( amiibos.getTitle() );
        viewHolder.serie.setText( amiibos.getSeries());

        if( amiibos.getStores().isEmpty() ) {
            viewHolder.store.setText( context.getString(R.string.not_available_amiibo) );
        } else {
            if( amiibos.getStores().size() == 1 ) {
                viewHolder.store.setText( context.getString(R.string.available_amiibo) + " (" + amiibos.getStores().size() + ")" + " tienda" );
            } else {
                viewHolder.store.setText( context.getString(R.string.available_amiibo) + " (" + amiibos.getStores().size() + ")" + " tiendas" );
            }
        }
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

            title.setTypeface(EasyFonts.robotoBold(context));
            serie.setTypeface(EasyFonts.robotoLight(context));
            store.setTypeface(EasyFonts.robotoThin(context));

            // Attach a click listener to the entire row view
            itemView.setOnClickListener(this);
        }

        // Handles the row being being clicked
        @Override
        public void onClick(View view) {
            int position = getLayoutPosition();

            if (mAmiiBos.get(position).getStores().isEmpty()) {
                new SnackBar.Builder(context)
                        .withMessage(context.getString(R.string.message_empyt_stores))
                        .withTypeFace(EasyFonts.robotoLight(context))
                        .withTextColorId(R.color.color_primary)
                        .withStyle(SnackBar.Style.DEFAULT)
                        .withDuration(SnackBar.MED_SNACK)
                        .show();
            } else {
                Intent i = new Intent(context, StoreDetailActivity.class);
                i.putExtra("arrayPosition", position);
                context.startActivity(i);
            }
        }
    }

    // Return the total count of items
    @Override
    public int getItemCount() {
        return mAmiiBos.size();
    }
}
