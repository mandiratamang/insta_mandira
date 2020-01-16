package com.mandira.instagram.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import android.os.Bundle;

import com.mandira.instagram.models.PostModel;
import com.mandira.instagram.R;
import com.mandira.instagram.models.StoryModel;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView btmNav;
//    Fragment selectedFragment = null;

    public static List<PostModel> listPosts = new ArrayList<>();
    public static List<StoryModel> listStories = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btmNav = findViewById(R.id.nav_view);

        getSupportActionBar().hide();

        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
                R.id.navigation_home, R.id.navigation_search, R.id.navigation_add, R.id.navigation_liked, R.id.navigation_profile
        ).build();

        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
        NavigationUI.setupWithNavController(btmNav, navController);


        listPosts.add(new PostModel("1","Luffyfan", "smile", R.drawable.post5, R.drawable.post1));
        listPosts.add(new PostModel("2","dylan wang", "most handsome", R.drawable.post7, R.drawable.post8));
        listPosts.add(new PostModel("3","didi ", "love from china ", R.drawable.post6, R.drawable.profilepic));
        listPosts.add(new PostModel("4","dylan wang", "Meteor Garden love ", R.drawable.post3, R.drawable.post7));


        listStories.add(new StoryModel("1","Luffyfan", R.drawable.post1, 0));
        listStories.add(new StoryModel("zoro", R.drawable.post4));
        listStories.add(new StoryModel("1","luffy", R.drawable.post5, 0));
        listStories.add(new StoryModel("dylan wang", R.drawable.post7));

    }




}
