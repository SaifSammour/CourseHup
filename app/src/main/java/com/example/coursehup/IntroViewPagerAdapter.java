package com.example.coursehup;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import java.util.List;

public class IntroViewPagerAdapter extends PagerAdapter {
    Context context;
    List<ScreenItem> screenItems;

    public IntroViewPagerAdapter(Context context, List<ScreenItem> screenItems) {
        this.context = context;
        this.screenItems = screenItems;
    }

    @Override
    public int getCount() {
        return screenItems.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == object;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        LayoutInflater inflater= (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View screen_item=inflater.inflate(R.layout.layout_screen,null);
        ImageView imageView=screen_item.findViewById(R.id.img_intro);
        TextView textView=screen_item.findViewById(R.id.tvTitle);
        TextView textView1=screen_item.findViewById(R.id.tv_Description);
        textView.setText(screenItems.get(position).getTitle());
        textView1.setText(screenItems.get(position).getDescription());
        imageView.setImageResource(screenItems.get(position).getScreenImg());
        container.addView(screen_item);
        return screen_item;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
      container.removeView((View) object);
    }
}
