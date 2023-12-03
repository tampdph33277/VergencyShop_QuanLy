package tampdph33277.fpoly.vergencyshop_quanly;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

import tampdph33277.fpoly.vergencyshop_quanly.FRAGMENT.DoanhThuFragment;
import tampdph33277.fpoly.vergencyshop_quanly.FRAGMENT.HoSoFragment;
import tampdph33277.fpoly.vergencyshop_quanly.FRAGMENT.QuanLySanPhamFragment;

public class MainActivity extends AppCompatActivity {
    DrawerLayout drawerLayout ;
    Toolbar toolbar ;
    BottomNavigationView bottomNavigationView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        drawerLayout = findViewById(R.id.layout_all);
        toolbar = findViewById(R.id.jl_toolbar);
        bottomNavigationView = findViewById(R.id.jl_btton_nav);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Trang chủ");
//        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(MainActivity.this , drawerLayout , toolbar , R.string.open,R.string.close);
//        toggle.setDrawerIndicatorEnabled(true);
//        toggle.syncState();
//        drawerLayout.addDrawerListener(toggle);


        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                if (item.getItemId() == R.id.bt_quanly){
                    callFragment(new QuanLySanPhamFragment());
                //    toolbar.setTitle("Sản phẩm");
                }
                if (item.getItemId() == R.id.bt_doanhthu){
                    callFragment(new DoanhThuFragment());
                 //   toolbar.setTitle("Doanh thu");
                }
                if (item.getItemId() == R.id.bt_nguoidung){
                    callFragment(new HoSoFragment());
                   // toolbar.setTitle("Hồ sơ");
                }
                return true;
            }

            private void callFragment(Fragment fragment) {
                FragmentTransaction manager = getSupportFragmentManager().beginTransaction();
                manager.replace(R.id.jl_fragment,fragment).commit();
             //   drawerLayout.close();
            }
        });



    }



}
