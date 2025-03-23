package lk.java.foodcity.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

import lk.java.foodcity.Domain.ItemDomain;
import lk.java.foodcity.databinding.ViewholderSimilarBinding;

public class SimilarAdapter extends RecyclerView.Adapter<SimilarAdapter.Viewholder> {
    ArrayList<ItemDomain> items;
    Context context;

    public SimilarAdapter(ArrayList<ItemDomain> items) {
        this.items = items;
    }

    @NonNull
    @Override
    public SimilarAdapter.Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        context = parent.getContext();
        ViewholderSimilarBinding binding = ViewholderSimilarBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        return new Viewholder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull SimilarAdapter.Viewholder holder, int position) {
        Glide.with(context).load(items.get(position).getImagePath()).into(holder.binding.img);
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public class Viewholder extends RecyclerView.ViewHolder {
        ViewholderSimilarBinding binding;

        public Viewholder(ViewholderSimilarBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}
