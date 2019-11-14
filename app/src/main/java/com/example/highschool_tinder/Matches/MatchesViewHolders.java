package com.example.highschool_tinder.Matches;


import android.view.View;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.highschool_tinder.R;

public class MatchesViewHolders extends RecyclerView.ViewHolder implements View.OnClickListener {
    public TextView mMatchId;
    public MatchesViewHolders(View itemView)
    {
        super(itemView);

        mMatchId = itemView.findViewById(R.id.MatchId);
    }
    @Override
    public void onClick(View v) {

    }
}
