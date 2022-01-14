package com.app.myapplication;

import androidx.lifecycle.ViewModel;

public class MainViewModel extends ViewModel {

    private final IRepository iRepository;

    public MainViewModel(IRepository iRepository) {
        this.iRepository = iRepository;
    }

    String getString(){
        return iRepository.getString();
    }

}
