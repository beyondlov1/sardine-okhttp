package com.thegrizzlylabs.sardineandroid.impl;

import com.thegrizzlylabs.sardineandroid.Sardine;
import junit.framework.TestCase;

import java.io.IOException;

public class OkHttpSardineTest extends TestCase {

    public void testPut() throws IOException, InterruptedException {
        Sardine sardine = new OkHttpSardine();
        sardine.setCredentials("beyond","123");
        sardine.put("http://192.168.1.100:8080/webdav/FILE_CLUSTER/app/hello","yes4".getBytes());
        Thread.sleep(1000);
    }
}