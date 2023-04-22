package com.example.testcompose.ui.Pages

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.google.android.gms.maps.model.CameraPosition
import com.google.android.gms.maps.model.LatLng
import com.google.maps.android.compose.GoogleMap
import com.google.maps.android.compose.MapUiSettings
import com.google.maps.android.compose.Marker
import com.google.maps.android.compose.rememberCameraPositionState

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun MapViewScreen() {
    val initialLatLng =  LatLng(10.004157883084787, 76.3755452819922)
    val initialCameraPosition = rememberCameraPositionState {
        position = CameraPosition.fromLatLngZoom(initialLatLng, 10f)
    }
    Box(modifier = Modifier.fillMaxSize()) {
        GoogleMap(

            cameraPositionState =initialCameraPosition,
            uiSettings = MapUiSettings(
                zoomControlsEnabled = false,
            )
        ){
            Marker(position = initialLatLng)
        }
    }
}
