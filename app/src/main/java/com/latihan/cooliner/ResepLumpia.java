package com.latihan.cooliner;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

public class ResepLumpia extends AppCompatActivity {

    VideoView videoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resep_lumpia);

        videoView = (VideoView) findViewById(R.id.videoView);
        //inisialisasi object videoView
        videoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.vid_lumpia));
        //digunakan untuk mengidentifikasi resource seperti lokasi video
        videoView.setMediaController(new MediaController(this));
        //menampilkan media controller video
        videoView.start();
    }
}