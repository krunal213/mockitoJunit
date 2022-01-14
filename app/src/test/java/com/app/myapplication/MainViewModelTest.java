package com.app.myapplication;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class MainViewModelTest {

    @Test
    public void test_getString() {
       IRepository iRepository =  Mockito.mock(IRepository.class);
       Mockito.when(iRepository.getString()).thenReturn("pankaj") ;
       MainViewModel mainViewModel = new MainViewModel(iRepository);
       assertEquals(mainViewModel.getString(),"pankaj");
    }

}