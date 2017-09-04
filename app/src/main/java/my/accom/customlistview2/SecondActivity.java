package my.accom.customlistview2;

import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.ImageView;

public class SecondActivity extends AppCompatActivity {

    Toolbar mToolbar;
    ImageView flag;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        mToolbar=(Toolbar) findViewById(R.id.toolbar1);
        flag = (ImageView) findViewById(R.id.imageView);
        Bundle bundle = getIntent().getExtras();

        if(bundle != null){
            mToolbar.setTitle(bundle.getString("CountryName"));
            if(mToolbar.getTitle().toString().equalsIgnoreCase("Australia")){
                flag.setImageDrawable(ContextCompat.getDrawable(SecondActivity.this, R.drawable.au));
            }else if(mToolbar.getTitle().toString().equalsIgnoreCase("Brazil")){
                flag.setImageDrawable(ContextCompat.getDrawable(SecondActivity.this, R.drawable.br));
            }else if(mToolbar.getTitle().toString().equalsIgnoreCase("China")){
                flag.setImageDrawable(ContextCompat.getDrawable(SecondActivity.this, R.drawable.cn));
            }else if(mToolbar.getTitle().toString().equalsIgnoreCase("France")){
                flag.setImageDrawable(ContextCompat.getDrawable(SecondActivity.this, R.drawable.fr));
            }else if(mToolbar.getTitle().toString().equalsIgnoreCase("Germany")){
                flag.setImageDrawable(ContextCompat.getDrawable(SecondActivity.this, R.drawable.de));
            }else if(mToolbar.getTitle().toString().equalsIgnoreCase("India")){
                flag.setImageDrawable(ContextCompat.getDrawable(SecondActivity.this, R.drawable.in));
            }else if(mToolbar.getTitle().toString().equalsIgnoreCase("Italy")){
                flag.setImageDrawable(ContextCompat.getDrawable(SecondActivity.this, R.drawable.it));
            }else if(mToolbar.getTitle().toString().equalsIgnoreCase("Ireland")){
                    flag.setImageDrawable(ContextCompat.getDrawable(SecondActivity.this, R.drawable.ie));
            }else if(mToolbar.getTitle().toString().equalsIgnoreCase("Malaysia")) {
                flag.setImageDrawable(ContextCompat.getDrawable(SecondActivity.this, R.drawable.my));
            }
        }
    }
}
