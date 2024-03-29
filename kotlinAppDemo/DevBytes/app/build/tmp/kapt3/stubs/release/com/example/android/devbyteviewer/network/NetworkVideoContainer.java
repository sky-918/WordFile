package com.example.android.devbyteviewer.network;

import java.lang.System;

/**
 * VideoHolder holds a list of Videos.
 *
 * This is to parse first level of our network result which looks like
 *
 * {
 *  "videos": []
 * }
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0011"}, d2 = {"Lcom/example/android/devbyteviewer/network/NetworkVideoContainer;", "", "videos", "", "Lcom/example/android/devbyteviewer/network/NetworkVideo;", "(Ljava/util/List;)V", "getVideos", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_release"})
@com.squareup.moshi.JsonClass(generateAdapter = true)
public final class NetworkVideoContainer {
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.example.android.devbyteviewer.network.NetworkVideo> videos = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.android.devbyteviewer.network.NetworkVideo> getVideos() {
        return null;
    }
    
    public NetworkVideoContainer(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.android.devbyteviewer.network.NetworkVideo> videos) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.android.devbyteviewer.network.NetworkVideo> component1() {
        return null;
    }
    
    /**
     * VideoHolder holds a list of Videos.
     *
     * This is to parse first level of our network result which looks like
     *
     * {
     *  "videos": []
     * }
     */
    @org.jetbrains.annotations.NotNull()
    public final com.example.android.devbyteviewer.network.NetworkVideoContainer copy(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.android.devbyteviewer.network.NetworkVideo> videos) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
}