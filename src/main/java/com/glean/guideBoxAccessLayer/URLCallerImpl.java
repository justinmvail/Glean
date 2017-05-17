package com.glean.guideBoxAccessLayer;

/**
 * Created by justi on 12/17/2016.
 */

import java.io.IOException;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.springframework.stereotype.Service;

@Service
public class URLCallerImpl implements URLCaller {

    OkHttpClient client = new OkHttpClient();

    @Override
    public String makeCall(String url) throws IOException {
        Request request = new Request.Builder()
                .url(url)
                .get()
                .build();
        Response response = client.newCall(request).execute();
        return response.body().string();
    }

}
