package com.example.movielistings.home;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.movielistings.R;
import com.example.movielistings.databinding.ActivityHomeBinding;
import com.example.movielistings.fragments.BlogFragment;
import com.example.movielistings.fragments.HomeFragment;
import com.example.movielistings.fragments.SearchFragment;
import com.google.android.material.navigation.NavigationBarView;

import java.io.FileReader;

public class HomeActivity extends AppCompatActivity {

    private ActivityHomeBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityHomeBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
                R.id.bnHome, R.id.bnSearch, R.id.bnBlog

        ).build();
        NavController navController = Navigation.findNavController(this, R.id.framentHost);
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
        NavigationUI.setupWithNavController(binding.bottomNavigationView, navController);
    }

//        binding.bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
//            @Override
//            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
////                int id = item.getItemId();
////
////                if (id == R.id.bnHome){
////                    replaceFragment(new HomeFragment());
////                } else if (id == R.id.bnSearch) {
////                    replaceFragment(new SearchFragment());
////                } else if (id == R.id.bnBlog) {
////                    replaceFragment(new BlogFragment());
////                }
////                return true;
//            }
//        });
//    }
//
//    private void bnViewScreen(){
//
//    }
//
////    private void replaceFragment(Fragment fragment){
////        //FragmentManager fragmentManager = getSupportFragmentManager();
////        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
////        transaction.replace(R.id.viewFrameLayout, fragment);
////        transaction.commit();
////    }
}