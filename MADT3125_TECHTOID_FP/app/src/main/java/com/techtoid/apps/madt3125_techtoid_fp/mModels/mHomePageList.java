package com.techtoid.apps.madt3125_techtoid_fp.mModels;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;


import java.util.ArrayList;
import android.content.Context;

import com.techtoid.apps.madt3125_techtoid_fp.R;
import com.techtoid.apps.madt3125_techtoid_fp.dData.dDatabase;

public class mHomePageList extends ArrayAdapter<mListItem> {
    // invoke the suitable constructor of the ArrayAdapter class
    public mHomePageList(@NonNull Context context, ArrayList<mListItem> arrayList) {

        // pass the context and arrayList for the super
        // constructor of the ArrayAdapter class
        super(context, 0, arrayList);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        // convertView which is recyclable view
        View currentItemView = convertView;

        // of the recyclable view is null then inflate the custom layout for the same
        if (currentItemView == null) {
            currentItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        // get the position of the view from the ArrayAdapter
        mListItem currentNumberPosition = getItem(position);

        // then according to the position of the view assign the desired image for the same
        ImageView numbersImage = currentItemView.findViewById(R.id.imageView);
        assert currentNumberPosition != null;
        numbersImage.setImageResource(currentNumberPosition.getNumbersImageId());

        // then according to the position of the view assign the desired TextView 1 for the same
        TextView textView1 = currentItemView.findViewById(R.id.emp_name);
        textView1.setText(currentNumberPosition.getmName());

        // then according to the position of the view assign the desired TextView 2 for the same
        TextView textView2 = currentItemView.findViewById(R.id.emp_role);
        textView2.setText(currentNumberPosition.getmRole());

        // then return the recyclable view
        return currentItemView;
    }

}
