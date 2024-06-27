package org.example.chapter01;

import java.awt.Menu;
import java.awt.Button;

public class Application  {
    private Menu menu1 = new Menu("menu1");
    private Menu menu2 = new Menu("menu2");
    private Menu menu3 = new Menu("menu3");
    private Button button1 = new Button("button1");

    private ScreenUI currentScreen = null;

    public Application() {
//        menu1.setOnClickListener(this);
//        menu2.setOnClickListener(this);
//        button1.setOnClickListener(this);
    }

//    private OnClickListener menuListener = new OnClickListener() {
//        public void clicked(Component eventSource) {
//            if (eventSource.getId().equals("menu1")) {
//                currentScreen = new Menu1ScreenUI();
//            }else if (eventSource.getId().equals("menu2")) {
//                currentScreen = new Menu2ScreenUI();
//            }else if (eventSource.getId().equals("menu3")) {
//                currentScreen = new Menu3ScreenUI();
//            }
//            currentScreen.show();
//        }
//    }


//    public void clicked(Component eventSource){
//        String sourceId = eventSource.getId();
//        if (sourceId.equals("menu1")){
//            currentScreen = new Menu1ScreenUI();
//            currentScreen.show();
//        }else if(sourceId.equals("menu2")){
//           currentScreen = new Menu2ScreenUI();
//           currentScreen.show();
//        }else if(sourceId.equals("button1")){
//            if(currentScreen == null){
//                return;;
//            }
//            currentScreen.handleButton1Click();
//
//        }
//    }
}
