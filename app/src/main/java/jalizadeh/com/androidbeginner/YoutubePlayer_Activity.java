package jalizadeh.com.androidbeginner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

import java.util.ArrayList;
import java.util.List;

import jalizadeh.com.androidbeginner.Classes.YoutubePlayerConfig;

//video #16
public class YoutubePlayer_Activity extends YouTubeBaseActivity {

    YouTubePlayerView mYouTubePlayerView;
    Button btnPlay;
    YouTubePlayer.OnInitializedListener mOninOnInitializedListener;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_youtube_player_);

        btnPlay = (Button) findViewById(R.id.btnPlay);
        mYouTubePlayerView = (YouTubePlayerView) findViewById(R.id.viewYoutube);


        mOninOnInitializedListener = new YouTubePlayer.OnInitializedListener() {
            @Override
            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
                //just pick the last part
                //https://www.youtube.com/watch?v=RQxY7rrZATU
                youTubePlayer.loadVideo("RQxY7rrZATU");

                //OR use a list of videos
                /*
                List<String> videoList = new ArrayList<>();
                videoList.add("RQxY7rrZATU");
                videoList.add("ExcJEP7HJL0");
                youTubePlayer.loadVideos(videoList);
                */

                //OR load a playlist
                //https://www.youtube.com/watch?v=W4hTJybfU7s&list=PLgCYzUzKIBE8TUoCyjomGFqzTFcJ05OaC
                //youTubePlayer.loadPlaylist("PLgCYzUzKIBE8TUoCyjomGFqzTFcJ05OaC");
            }

            @Override
            public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {
                Toast.makeText(YoutubePlayer_Activity.this, "Failed", Toast.LENGTH_SHORT).show();
            }
        };


        btnPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mYouTubePlayerView.initialize(YoutubePlayerConfig.getApiKey(), mOninOnInitializedListener);
            }
        });
    }
}
