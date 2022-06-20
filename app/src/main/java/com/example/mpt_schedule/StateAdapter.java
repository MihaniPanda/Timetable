package com.example.mpt_schedule;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class StateAdapter extends RecyclerView.Adapter<StateAdapter.ViewHolder>{

    private final LayoutInflater inflater;
    private final List<Schedule> schedules;

    StateAdapter(Context context, List<Schedule> states) {
        this.schedules = states;
        this.inflater = LayoutInflater.from(context);
    }
    @Override
    public StateAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = inflater.inflate(R.layout.item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(StateAdapter.ViewHolder holder, int position) {
        Schedule schedule = schedules.get(position);

        holder.txtDayOfWeek.setText(schedule.getDayOfWeek());
        holder.txtBuild.setText(schedule.getBuild());

        for (int i = 0; i<5; i++){
            holder.tableTxts[i][0].setText(String.valueOf(i + 1));
        }
        for (int i = 0; i<5; i++){
            try{
                holder.tableTxts[i][1].setText(schedule.getLessons()[i]);
            }catch (ArrayIndexOutOfBoundsException e){
                break;
            }
        }
    }

    @Override
    public int getItemCount() {
        return schedules.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        final TextView txtDayOfWeek, txtBuild;
        TextView[][] tableTxts = new TextView[5][2];
        ViewHolder(View view){
            super(view);
            txtDayOfWeek = view.findViewById(R.id.txtDayOfWeek);
            txtBuild = view.findViewById(R.id.txtBuild);

            for (int i = 0; i<5; i++){
                for (int y = 0; y < 2; y++){
                    String txtID = "txt" + i + y;
                    int resultID =  view.getResources().getIdentifier(txtID, "id",
                            "com.example.mpt_schedule");
                    tableTxts[i][y] = view.findViewById(resultID);
                }
            }
        }
    }
}