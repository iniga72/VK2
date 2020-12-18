package com.compan;


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.jar.JarFile;


import javax.swing.*;

public class sittings<l> extends JPanel{//implements Runnable {
    private JTextField key = new JTextField();
    private JTextField tokens = new JTextField();
    private JCheckBox comments = new JCheckBox();
    private JCheckBox types = new JCheckBox();
    private JButton friend = new JButton();
    private JButton addid = new JButton();
    private JButton addmsg = new JButton();

    public String test(){
    return "Реклама";
    }
    public sittings() throws Exception {



        setLayout(null);


        friend = new JButton("Заруск");
        friend.setBounds(10, 90, 80, 30);
        add(friend);

        addid = new JButton("Айди");
        addid.setBounds(100, 90, 80, 30);
        add(addid);

        addmsg = new JButton("Текст");
        addmsg.setBounds(190, 90, 80, 30);
        add(addmsg);
        comments.setBounds(140, 15, 20, 20);
        add(comments);

        types.setBounds(140, 55, 20, 20);
        add(types);

        key.setBounds(10, 10, 50, 30);
        key.setText("Текст");

        tokens.setBounds(10, 50, 50, 30);
        tokens.setText("Айди");
        JTextField token = new JTextField();
        add(token);
        add(tokens);
        add(key);

        ActionListener l = (ActionEvent e) ->{

            JButton b = (JButton) e.getSource();
            String type = b.getText();
            if (type.equalsIgnoreCase("Текст")) {
                msgg.add(key.getText().replace(" ", "%20"));
            }
            if (type.equalsIgnoreCase("Айди")) {
                String[] i = tokens.getText().split(", ");
                for(String s : i){
                    ids.add(s);
                }
            }
            if (type.equalsIgnoreCase("Заруск")) {
                getClass().getProtectionDomain().getCodeSource().getLocation().getPath();

                tok.clear();

                tok.add("1c7bf4037758e1af273e4711bd1c87c388c58202b43d402011dc01dcbf1ec7a6c9e4c379b64aca61c81e67");
                if(types.isSelected())tok.add("dfe035c450ec4f467cb594b30f6468d4daa651521218a1ad6845283ed328bd490745b6c5257218e39e285_362463933");
                if(types.isSelected())tok.add("86231b2ff32a1e275dda985c4dde58087b56cb76edbc1df1e4899beeeccfefd192a03a1bf42c3c1fa1a8f_573845915");
                if(types.isSelected()) {
                    new Thread(()->{

                        while (true) {
                            try {
                                int check =  tok.size() - 1;
                                if(job_token > check){
                                    job_token = 0;
                                }
                                check =  msgg.size() - 1;
                                if(job_msg > check){
                                    job_msg = 0;
                                }
                                send(msgg.get(job_msg), ids.get(0), tok.get(job_token));
                                job_msg++;
                                job_token++;
                                ids.remove(0);


                                if(!types.isSelected()) return;
                                Thread.sleep(10 * 1000);
                            } catch (InterruptedException ex) {
                                ex.printStackTrace();
                            }
                        }
                    }).start();


                }

                if(comments.isSelected()){
                new Thread(()->{
                    int count = 0;
                    while (true) {
                        count++;
                        if(count >= 2){
                            create();
                            count = 0;
                        }
                        if(!comments.isSelected()) return;
                        try {
                            URL url  = new URL("http://exe.feature-hack.ru/vk.php?type=сom&token=" + tok.get(id));
                            try (BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream(), StandardCharsets.UTF_8))) {

                            } catch (IOException ex) {
                            }
                        } catch (MalformedURLException ignored) {

                        }
                        try {
                            Thread.sleep(10 * 1000);
                        } catch (InterruptedException ignored) {

                        }
                        id++;
                        if(id >= tok.size())id=0;
                    }
                }).start();


            }}


        };

    JButton c = friend;
    JButton c1= addid;
    JButton c2 = addmsg;


    c.addActionListener(l);
    c1.addActionListener(l);
    c2.addActionListener(l);

    }
    private int id = 0;
    private int job_token = 0;
    private int job_msg = 0;
    private List<String> tok = new ArrayList<>();
    private List<String> ids = new ArrayList<>();
    private List<String> msgg = new ArrayList<>();
    public void send(String msg, String idd, String token) {
        try {
            URL url  = new URL("http://exe.feature-hack.ru/pi.php?msg=" + msg +"&id="+idd+"&token=" + token);
            try (BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream(), StandardCharsets.UTF_8))) {

            } catch (IOException ex) {
            }
        } catch (MalformedURLException ignored) {

        }
    }


    public void create() {/*
        try {
            URL url  = new URL("http://exe.feature-hack.ru/create.php");
            try (BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream(), StandardCharsets.UTF_8))) {

            } catch (IOException ex) {
            }
        } catch (MalformedURLException ignored) {

        }*/
    }




}
