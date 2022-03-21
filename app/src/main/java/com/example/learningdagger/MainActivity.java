package com.example.learningdagger;

import android.os.Bundle;

import com.example.learningdagger.dagger.CarComponent;
import com.example.learningdagger.dagger.DaggerCarComponent;
import com.example.learningdagger.dagger.DieselEngineModule;
import com.example.learningdagger.pojo.Car;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.learningdagger.databinding.ActivityMainBinding;

import android.view.Menu;
import android.view.MenuItem;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "car";
    private AppBarConfiguration appBarConfiguration;
    private ActivityMainBinding binding;

    //can't be private or final if you wanna inject it
    @Inject
    Car car;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setSupportActionBar(binding.toolbar);

        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main);
        appBarConfiguration = new AppBarConfiguration.Builder(navController.getGraph()).build();
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);

        binding.fab.setOnClickListener(view -> Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show());

        doDaggerStuff();
    }

    private void doDaggerStuff() {
//        CarComponent component = DaggerCarComponent.create();
//        component.getMyFancyCar().drive();

//        //Field Injection: inject my fields in MainActivity
//        CarComponent component = DaggerCarComponent.create();

        CarComponent component = DaggerCarComponent.builder()
                .dieselEngineModule(new DieselEngineModule(1000))
                .build();
        //take my activity and inject variables annotated with @Inject
        component.inject(this);
        car.drive();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main);
        return NavigationUI.navigateUp(navController, appBarConfiguration)
                || super.onSupportNavigateUp();
    }
}