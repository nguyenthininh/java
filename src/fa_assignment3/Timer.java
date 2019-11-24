package fa_assignment3;

import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.application.Platform;


    public class Timer {
        public TextField txtMin = new TextField();
        public Text min = new Text();
        public Text sec = new Text();
        public Button btn = new Button();

        public static int s_min;
        public void addTimer(){
            try{
                s_min = Integer.parseInt(txtMin.getText());
            }catch (Exception e){
                s_min = 10;
            }


            Runnable r = new Runnable() {
                @Override
                public void run() {
                    for (Integer i = s_min-1; i>=0; i--){
                        for (Integer j=59; j>=0; j--){
//                        sec.setText(j.toString());
                            min.setText(String.format("%02d",i));
                            sec.setText(String.format("%02d",j));
                            try {
                                Thread.sleep(100);
                            }catch (Exception e){

                            }
                        }
                    }
                    Platform.exit();
                }
            };

            Thread t = new Thread(r);
            t.start();

        }
    }

