package com.deepshikha.video;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.VideoView;

import uk.co.senab.photoview.PhotoViewAttacher;

public class Activity_galleryview extends Activity {

    String str_video;
    ImageView vv_video;

    // variable for pinch to Zoom enable
    PhotoViewAttacher pAttacher;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_galleryview);
        init();
    }

    private void init() {

        vv_video = (ImageView) findViewById(R.id.vv_video);
        str_video = getIntent().getStringExtra("video");
        vv_video.setImageURI(Uri.parse(str_video));

        // pinch to zoom implementation
        pAttacher = new PhotoViewAttacher(vv_video);
        pAttacher.update();
    }


}
