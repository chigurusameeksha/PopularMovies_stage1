package com.example.sameeksha.popularmovies;

import java.util.List;

public interface OnResponseListener<T extends List> {
    public void onSuccess(int tag, T object);
    void onError( Exception e);
}
