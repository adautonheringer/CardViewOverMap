package cozo.cardviewovermap;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by adaut on 12/15/2017.
 */

public class RecyclerViewAdapter extends RecyclerView.Adapter {

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview, parent, false);
        return new RecyclerViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        ((RecyclerViewHolder) holder).bindView(position);
    }

    @Override
    public int getItemCount() {
        return FoodInfo.names.length;
    }

    public class RecyclerViewHolder extends RecyclerView.ViewHolder {

        private ImageView mFoodImage;
        private TextView mFoodTitle;
        private TextView mPrice;

        public RecyclerViewHolder(View itemView) {
            super(itemView);

            mFoodImage = itemView.findViewById(R.id.foodImage);
            mFoodTitle = itemView.findViewById(R.id.foodTitle);
            mPrice = itemView.findViewById(R.id.foodPrice);
        }

        public void bindView(int position) {
            mFoodImage.setImageResource(FoodInfo.resourceIds[position]);
            mFoodTitle.setText(FoodInfo.names[position]);
            mPrice.setText(FoodInfo.prices[position]);

        }
    }
}
