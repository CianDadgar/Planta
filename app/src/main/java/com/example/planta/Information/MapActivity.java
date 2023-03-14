package com.example.planta.Information;

import androidx.fragment.app.FragmentActivity;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import com.example.planta.R;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;


public class MapActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);


    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        LatLng goodday = new LatLng(51.89297795, -8.472754041764782);
        mMap.addMarker(new MarkerOptions().position(goodday).title("Good-Day Deli"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(goodday));
        LatLng iyers = new LatLng(51.9013004, -8.4761633);
        mMap.addMarker(new MarkerOptions().position(iyers).title("Iyers"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(iyers));
        LatLng koto = new LatLng(51.8990809, -8.4740445);
        mMap.addMarker(new MarkerOptions().position(koto).title("Koto"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(koto));
        LatLng liberty = new LatLng(51.8977774, -8.4778516);
        mMap.addMarker(new MarkerOptions().position(liberty).title("Liberty grill"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(liberty));
        LatLng quay = new LatLng(51.8955404, -8.4748706);
        mMap.addMarker(new MarkerOptions().position(quay).title("Quay Co-op"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(quay));
        LatLng umi = new LatLng(51.8987598, -8.473108559400398);
        mMap.addMarker(new MarkerOptions().position(umi).title("Umi Falafel"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(umi));
        LatLng gaff = new LatLng(51.902761, -8.4512237);
        mMap.addMarker(new MarkerOptions().position(gaff).title("143V"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(gaff));
        LatLng Haveli = new LatLng(51.8764022, -8.4386557);
        mMap.addMarker(new MarkerOptions().position(Haveli).title("Haveli"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Haveli));
        LatLng paridiso = new LatLng(51.8971138, -8.4829027);
        mMap.addMarker(new MarkerOptions().position(paridiso).title("Cafe Paridiso"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(paridiso));
        LatLng VeganKo = new LatLng(51.8999872, -8.4775869);
        mMap.addMarker(new MarkerOptions().position(VeganKo).title("VeganKo"));
        float zoomlevel = 14.0f;
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(VeganKo,zoomlevel));
    }

}