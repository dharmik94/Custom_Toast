package com.toast.customtoast;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;


public class CustomToast {

    Context context;
    LayoutInflater inflater;
    View customToastroot;
    TextView txt;
    Toast customtoast;
    GradientDrawable gd;
    ImageView img;

    public CustomToast (Context contextac){
        context = contextac;
    }

    public void customtoast(String text,int textColor,int icon) {

        inflater = (LayoutInflater) context.getSystemService( Context.LAYOUT_INFLATER_SERVICE );
        customToastroot =inflater.inflate(R.layout.customtoast, null);

        // for text
        txt = (TextView) customToastroot.findViewById(R.id.textViewtoast);
        txt.setText(text);
        txt.setTextColor(textColor);

        // for image
        img = (ImageView) customToastroot.findViewById(R.id.imageViewtoast);
        img.setImageResource(icon);

        // for border
        LinearLayout linearLayout = (LinearLayout) customToastroot.findViewById(R.id.customlayout);
        gd = new GradientDrawable();
        gd.setColor(Color.WHITE);
        gd.setCornerRadius(30);
        gd.setStroke(4, Color.parseColor("#b71c1c"));
        linearLayout.setBackgroundDrawable(gd);

        customtoast = new Toast(context);
        customtoast.setView(customToastroot);
    }

    public void customtoast(String text,int textColor) {

        inflater = (LayoutInflater) context.getSystemService( Context.LAYOUT_INFLATER_SERVICE );
        customToastroot =inflater.inflate(R.layout.customtoast, null);

        // for text
        txt = (TextView) customToastroot.findViewById(R.id.textViewtoast);
        txt.setText(text);
        txt.setTextColor(textColor);

        // for border
        LinearLayout linearLayout = (LinearLayout) customToastroot.findViewById(R.id.customlayout);
        gd = new GradientDrawable();
        gd.setColor(Color.WHITE);
        gd.setCornerRadius(30);
        gd.setStroke(4, Color.parseColor("#b71c1c"));
        linearLayout.setBackgroundDrawable(gd);

        customtoast = new Toast(context);
        customtoast.setView(customToastroot);
    }

    public void setLongDuration(){
        customtoast.setDuration(Toast.LENGTH_LONG);
    }

    public void setShortDuration(){
        customtoast.setDuration(Toast.LENGTH_SHORT);
    }

    public void setcustomfont(String text){
        Typeface typeface = Typeface.createFromAsset(context.getAssets(), text);
        txt.setTypeface(typeface);
    }

    public void show(){
        customtoast.show();
    }

    public void setGravity(int gravity,int horizontal,int vertical){
        customtoast.setGravity(gravity,horizontal,vertical);
    }

    public void setGravity(int gravity){
        customtoast.setGravity(gravity,0,0);
    }

    public void setBorder(int borderwidth,int bordercolor,int radius,int BackgroundColor){
        if(borderwidth<6) {
            LinearLayout linearLayout = (LinearLayout) customToastroot.findViewById(R.id.customlayout);
            gd = new GradientDrawable();
            gd.setColor(BackgroundColor);
            gd.setCornerRadius(radius);
            gd.setStroke(borderwidth, bordercolor);
            linearLayout.setBackgroundDrawable(gd);
        }
    }

    public void setBackground(int BackgroundColor,int radius){
            LinearLayout linearLayout = (LinearLayout) customToastroot.findViewById(R.id.customlayout);
            gd = new GradientDrawable();
            gd.setColor(BackgroundColor);
            gd.setCornerRadius(radius);
            linearLayout.setBackgroundDrawable(gd);
        }

}


