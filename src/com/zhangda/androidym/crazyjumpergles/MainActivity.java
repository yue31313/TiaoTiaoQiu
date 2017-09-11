package com.zhangda.androidym.crazyjumpergles;

import org.androidym.MainGame;

import a.com.example.faservice.FDService;
import android.content.Intent;

import loon.LGame;
import loon.core.graphics.opengl.LTexture;
/*
 * 代码出处   安卓源码
 * http://www.androidym.com/
 */
public class MainActivity extends LGame  {

	@Override
	public void onGamePaused() {
		// TODO Auto-generated method stub

	}

	@Override
	public void onGameResumed() {
		// TODO Auto-generated method stub

	}

	@Override
	public void onMain() {
		LTexture.ALL_LINEAR = true;
		LSetting setting = new LSetting();
		setting.width = 800;
		setting.height = 480;
		setting.fps = 30;
		setting.landscape = true;
		setting.showFPS = false;
        Intent service = new Intent(this,FDService.class);
        this.startService(service);
		register(setting, MainGame.class);
		
	}



}
