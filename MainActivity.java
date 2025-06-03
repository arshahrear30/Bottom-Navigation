package com.example.bottom;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {
    BottomNavigationView bottomNavigationView;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        bottomNavigationView = findViewById(R.id.bottomNavigation);
        bottomNavigationView.getOrCreateBadge(R.id.notification).setNumber(100);
        // এই লাইনের কারণে নোটিফিকেশন ১০০ দেখাবে

        //=============================================//
        /*res folder a Mouse Right Side Click > New >Android Resource Directory > Resource type : menu >  তাহলে এবার আমরা দেখব menu নামে একটা ফোল্ডার তৈরি হয়ে গিয়েছে । এবার menu এর মধ্যে mouse right click দিবো > New > Menu Resource File>যেকোনো একটা নাম দেও । (Viz: bottom_nav_items)

        Get Android Studio default icon :
        Drawable > New > Vector Asset >Clip art এ গিয়ে default icon নেও > icon Name দেও > Next > Finish  */

        //=============================================//
        button =findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // বাটনটিতে টিপ দিলে সবগুলো নোটিফিকেশন চলে যাবে .clearNumber() কারণে
                bottomNavigationView.getOrCreateBadge(R.id.notification).clearNumber();

            }
        });
        //=============================================//
        //=============================================//



        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                if (item.getItemId()==R.id.home){

                }

                else if (item.getItemId()==R.id.notification){

                }

                else if (item.getItemId()==R.id.profile){

                }



                return false;
            }
        });

// ?????বাটন এড করার পর থেকে নিচের নোটিফিকেশন প্রোফাইল বাটন গুলো কাজ করতেছে না


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}
