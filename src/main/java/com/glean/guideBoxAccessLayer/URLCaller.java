package com.glean.guideBoxAccessLayer;

import java.io.IOException;

/**
 * Created by justi on 5/16/2017.
 */
public interface URLCaller {
    String makeCall(String url) throws IOException;
}
