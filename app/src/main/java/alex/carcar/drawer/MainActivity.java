package alex.carcar.drawer;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    private NavigationView navigationView;
    private DrawerLayout drawerLayout;
    private Button openDrawer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        drawerLayout = findViewById(R.id.drawer_layout);
        navigationView = findViewById(R.id.navigationview);
        openDrawer = findViewById(R.id.btn_open);

        navigationView.setNavigationItemSelectedListener(this);
        openDrawer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
                    drawerLayout.closeDrawer(GravityCompat.START);
                }
                drawerLayout.openDrawer(GravityCompat.START);
            }
        });
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == R.id.one) {
            Toast.makeText(MainActivity.this, "Timer is clicked!", Toast.LENGTH_SHORT).show();
        } else if (item.getItemId() == R.id.two) {
            Toast.makeText(MainActivity.this, "Timer 2 is clicked!", Toast.LENGTH_SHORT).show();
        } else if (item.getItemId() == R.id.three) {
            Toast.makeText(MainActivity.this, "Timer 3 is clicked!", Toast.LENGTH_SHORT).show();
        } else if (item.getItemId() == R.id.four) {
            Toast.makeText(MainActivity.this, "Timer 4 is clicked!", Toast.LENGTH_SHORT).show();
        } else if (item.getItemId() == R.id.five) {
            Toast.makeText(MainActivity.this, "Timer 5 is clicked!", Toast.LENGTH_SHORT).show();
        } else if (item.getItemId() == R.id.six) {
            Toast.makeText(MainActivity.this, "Timer 6 is clicked!", Toast.LENGTH_SHORT).show();
        }
        return false;
    }
}