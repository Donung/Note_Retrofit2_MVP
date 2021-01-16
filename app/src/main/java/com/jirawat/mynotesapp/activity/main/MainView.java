package com.jirawat.mynotesapp.activity.main;

import com.jirawat.mynotesapp.model.Note;

import java.util.List;

public interface MainView {
    void showLoading();
    void hideLoading();
    void onGetResult(List<Note> notes);
    void onErrorLoading(String message);
}
