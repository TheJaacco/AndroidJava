package com.example.myvideo;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.MediaController;
import android.widget.VideoView;

public class VideoViewClass extends AppCompatActivity {

    public VideoView video;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_view);
        video = (VideoView) findViewById(R.id.video1);

        String vidAddress = "http://techslides.com/demos/sample-videos/small.mp4";
        Uri viUri = Uri.parse(vidAddress);
        video.setVideoURI(viUri);
        MediaController viControl = new MediaController(this);
        viControl.setAnchorView(video);
        video.setMediaController(viControl);


    }
}
