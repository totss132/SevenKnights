/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gjrxk
 */
import java.awt.Image;
import java.awt.Toolkit;
import java.lang.reflect.Array;
import java.math.*;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.Icon;
import java.io.File;
import java.io.InputStream;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

import java.util.Timer;

public class MainFrame extends javax.swing.JFrame{
    Timer timer = new Timer();
    Random ran = new Random();
    String[] card3arr = {"3성영웅/Aaron3_Icon.png","3성영웅/Ahri3_Icon.png","3성영웅/Alli3_Icon.png",
    "3성영웅/Archon3_Icon.png","3성영웅/Babel3_Icon.png",
    "3성영웅/Bane3_Icon.png","D:3성영웅/Baron3_Icon.png","3성영웅/Bella3_Icon.png","3성영웅/Beskin3_Icon.png","3성영웅/Cellops3_Icon.png",
    "3성영웅/Charles3_Icon.png","3성영웅/Clops3_Icon.png","3성영웅/Cocoon3_Icon.png","3성영웅/Cooper3_Icon.png","3성영웅/Derik3_Icon.png",
    "3성영웅/Ellen3_Icon.png","3성영웅/Ellin3_Icon.png","3성영웅/Frose3_Icon.png","3성영웅/Fruna3_Icon.png","3성영웅/Guppy3_Icon.png",
    "3성영웅/Happy3_Icon.png","3성영웅/Hokin3_Icon.png","3성영웅/Howl3_Icon.png","3성영웅/Jak3_Icon.png","3성영웅/Jas3_Icon.png",
    "3성영웅/Kai3_Icon.png","3성영웅/Leo3_Icon.png","3성영웅/Loto3_Icon.png","3성영웅/Nami3_Icon.png","3성영웅/Pepe3_Icon.png",
    "3성영웅/Pon3_Icon.png","3성영웅/Pooki3_Icon.png","3성영웅/Popo3_Icon.png","3성영웅/Raccoon3_Icon.png","3성영웅/Raul3_Icon.png",
    "3성영웅/Reaper3_Icon.png","3성영웅/Ricky3_Icon.png","3성영웅/Rowl3_Icon.png","3성영웅/Sarah3_Icon.png","3성영웅/Skud3_Icon.png",
    "3성영웅/Skull3_Icon.png","3성영웅/Smoky3_Icon.png","3성영웅/Syllops3_Icon.png","3성영웅/Toto3_Icon.png","3성영웅/Wendy3_Icon.png",
    "3성영웅/Yuri3_Icon.png"}; 
    String[] card4arr = {"일반영웅/Nia4_Icon.png","일반영웅/Ariel4_Icon.png",
    "일반영웅/Aaron4_Icon.png","일반영웅/Alli4_Icon.png","일반영웅/Archon4_Icon.png",
    "일반영웅/Asura4_Icon.png","일반영웅/Bai_Jiao4_Icon.png","일반영웅/Ballista4_Icon.png",
    "일반영웅/Bane4_Icon.png","일반영웅/Baron4_Icon.png","일반영웅/Bella4_Icon.png",
    "일반영웅/Black_Rose4_Icon.png","일반영웅/Catty4_Icon.png","일반영웅/Chancellor4_Icon.png",
    "일반영웅/Chloe4_Icon.png","일반영웅/Cleo4_Icon.png","일반영웅/Clops4_Icon.png",
    "일반영웅/Coco4_Icon.png","일반영웅/Da_Qiao4_Icon.png","일반영웅/Daisy4_Icon.png",
    "일반영웅/Derik4_Icon.png","일반영웅/Diaochan4_Icon.png","일반영웅/Dragon4_Icon.png",
    "일반영웅/Ellen4_Icon.png","일반영웅/Ellin4_Icon.png","일반영웅/Espada4_Icon.png",
    "일반영웅/Evan4_Icon.png","일반영웅/Feng_Yan4_Icon.png","일반영웅/Guan_Yu4_Icon.png",
    "일반영웅/Guppy4_Icon.png","일반영웅/Hayoung4_Icon.png","일반영웅/Hokin4_Icon.png",
    "일반영웅/Jake4_Icon.png","일반영웅/Jane4_Icon.png","일반영웅/Jin4_Icon.png",
    "일반영웅/Joker4_Icon.png","일반영웅/Jupy4_Icon.png","일반영웅/Kai4_Icon.png",
    "일반영웅/Kang_Jae4_Icon.png","일반영웅/Karin4_Icon.png","일반영웅/Karon4_Icon.png",
    "일반영웅/Knox4_Icon.png","일반영웅/Kwonho4_Icon.png","일반영웅/Lania4_Icon.png",
    "일반영웅/Lee_Jung4_Icon.png","일반영웅/Leo4_Icon.png","일반영웅/Li4_Icon.png",
    "일반영웅/Lina4_Icon.png","일반영웅/Ling_Ling4_Icon.png","일반영웅/Lucy4_Icon.png",
    "일반영웅/Mao_Song4_Icon.png","일반영웅/May4_Icon.png","일반영웅/Ming_Ming4_Icon.png",
    "일반영웅/Nezha4_Icon.png","일반영웅/Pepe4_Icon.png","일반영웅/Phoenix4_Icon.png",
    "일반영웅/Raccoon4_Icon.png","일반영웅/Rei4_Icon.png","일반영웅/Rook4_Icon.png",
    "일반영웅/Ruri4_Icon.png","일반영웅/Sarah4_Icon.png","일반영웅/Sera4_Icon.png",
    "일반영웅/Shane4_Icon.png","일반영웅/Sieg4_Icon.png","일반영웅/Snipper4_Icon.png",
    "일반영웅/Soi4_Icon.png","일반영웅/Spina4_Icon.png","일반영웅/Sylvia4_Icon.png",
    "일반영웅/Tsing_Tao4_Icon.png","일반영웅/Velika4_Icon.png","일반영웅/Victoria4_Icon.png",
    "일반영웅/Wendy4_Icon.png","일반영웅/Xiao4_Icon.png","일반영웅/Yu_Shin4_Icon.png",
    "일반영웅/Yui4_Icon.png","일반영웅/Yuri4_Icon.png","일반영웅/Zhao_Yun4_Icon.png",
    "일반영웅/Zhuge_Liang4_Icon.png"};
    
    
    String[] card5arr = {"일반영웅/Nia5_Icon.png","일반영웅/Ariel5_Icon.png",
    "일반영웅/Alli5_Icon.png","일반영웅/Asura5_Icon.png","일반영웅/Bai_Jiao5_Icon.png","일반영웅/Ballista5_Icon.png",
    "일반영웅/Bane5_Icon.png","일반영웅/Bella5_Icon.png",
    "일반영웅/Black_Rose5_Icon.png","일반영웅/Catty5_Icon.png","일반영웅/Chancellor5_Icon.png",
    "일반영웅/Chloe5_Icon.png","일반영웅/Cleo5_Icon.png",
    "일반영웅/Coco5_Icon.png","일반영웅/Da_Qiao5_Icon.png","일반영웅/Daisy5_Icon.png",
    "일반영웅/Diaochan5_Icon.png","일반영웅/Dragon5_Icon.png",
    "일반영웅/Ellen5_Icon.png","일반영웅/Ellin5_Icon.png","일반영웅/Espada5_Icon.png",
    "일반영웅/Evan5_Icon.png","일반영웅/Feng_Yan5_Icon.png","일반영웅/Guan_Yu5_Icon.png",
    "일반영웅/Hayoung5_Icon.png","일반영웅/Jake5_Icon.png","일반영웅/Jane5_Icon.png","일반영웅/Jin5_Icon.png",
    "일반영웅/Joker5_Icon.png","일반영웅/Jupy5_Icon.png","일반영웅/Kai5_Icon.png",
    "일반영웅/Kang_Jae5_Icon.png","일반영웅/Karin5_Icon.png","일반영웅/Karon5_Icon.png",
    "일반영웅/Knox5_Icon.png","일반영웅/Kwonho5_Icon.png","일반영웅/Lania5_Icon.png",
    "일반영웅/Lee_Jung5_Icon.png","일반영웅/Leo5_Icon.png","일반영웅/Li5_Icon.png",
    "일반영웅/Lina5_Icon.png","일반영웅/Ling_Ling5_Icon.png","일반영웅/Lucy5_Icon.png",
    "일반영웅/Mao_Song5_Icon.png","일반영웅/May5_Icon.png","일반영웅/Ming_Ming5_Icon.png",
    "일반영웅/Nezha5_Icon.png","일반영웅/Phoenix5_Icon.png",
    "일반영웅/Raccoon5_Icon.png","일반영웅/Rei5_Icon.png","일반영웅/Rook5_Icon.png",
    "일반영웅/Ruri5_Icon.png","일반영웅/Sarah5_Icon.png","일반영웅/Sera5_Icon.png",
    "일반영웅/Shane5_Icon.png","일반영웅/Sieg5_Icon.png","일반영웅/Snipper5_Icon.png",
    "일반영웅/Soi5_Icon.png","일반영웅/Spina5_Icon.png","일반영웅/Sylvia5_Icon.png",
    "일반영웅/Tsing_Tao5_Icon.png","일반영웅/Velika5_Icon.png","일반영웅/Victoria5_Icon.png",
    "일반영웅/Xiao5_Icon.png","일반영웅/Yu_Shin5_Icon.png",
    "일반영웅/Yui5_Icon.png","일반영웅/Yuri5_Icon.png","일반영웅/Zhao_Yun5_Icon.png",
    "일반영웅/Zhuge_Liang5_Icon.png"};
    
    
    String[] card6arr = {"일반영웅/Nia6_Icon.png","일반영웅/Ariel6_Icon.png",
    "일반영웅/Asura6_Icon.png","일반영웅/Bai_Jiao6_Icon.png","일반영웅/Ballista6_Icon.png",
    "일반영웅/Bane6_Icon.png","일반영웅/Black_Rose6_Icon.png","일반영웅/Zhao_Yun6_Icon.png",
    "일반영웅/Chancellor6_Icon.png","일반영웅/Chloe6_Icon.png","일반영웅/Cleo6_Icon.png",
    "일반영웅/Da_Qiao6_Icon.png","일반영웅/Daisy6_Icon.png","일반영웅/Karon6_Icon.png",
    "일반영웅/Diaochan6_Icon.png","일반영웅/Espada6_Icon.png","일반영웅/Evan6_Icon.png",
    "일반영웅/Feng_Yan5_Icon.png","일반영웅/Guan_Yu5_Icon.png","일반영웅/Jin6_Icon.png",
    "일반영웅/Hayoung6_Icon.png","일반영웅/Jake6_Icon.png","일반영웅/Jane6_Icon.png",
    "일반영웅/Joker6_Icon.png","일반영웅/Jupy6_Icon.png","일반영웅/Karin6_Icon.png",
    "일반영웅/Knox6_Icon.png","일반영웅/Kwonho6_Icon.png","일반영웅/Lania6_Icon.png",
    "일반영웅/Lee_Jung6_Icon.png","일반영웅/Leo6_Icon.png","일반영웅/Li6_Icon.png",
    "일반영웅/Lina6_Icon.png","일반영웅/Ling_Ling6_Icon.png","일반영웅/Lucy6_Icon.png",
    "일반영웅/Mao_Song6_Icon.png","일반영웅/May6_Icon.png","일반영웅/Ming_Ming6_Icon.png",
    "일반영웅/Nezha6_Icon.png","일반영웅/Rei6_Icon.png","일반영웅/Rook6_Icon.png",
    "일반영웅/Ruri6_Icon.png","일반영웅/Sarah6_Icon.png","일반영웅/Sera6_Icon.png",
    "일반영웅/Shane6_Icon.png","일반영웅/Sieg6_Icon.png","일반영웅/Snipper6_Icon.png",
    "일반영웅/Soi6_Icon.png","일반영웅/Spina6_Icon.png","일반영웅/Sylvia6_Icon.png",
    "일반영웅/Tsing_Tao6_Icon.png","일반영웅/Velika6_Icon.png","일반영웅/Victoria6_Icon.png",
    "일반영웅/Xiao6_Icon.png","일반영웅/Yu_Shin6_Icon.png","일반영웅/Yui6_Icon.png",
    "일반영웅/Yuri6_Icon.png","일반영웅/Zhuge_Liang6_Icon.png"};
    
    
    String[] spcard4arr = {"스페셜초상화/Ace4_Icon.png","스페셜초상화/Sun_Wukong4_Icon.png",
    "스페셜초상화/Lu_Bu4_Icon.png","스페셜초상화/Vanessa4_Icon.png","스페셜초상화/Yeonhee4_Icon.png",
    "스페셜초상화/Sylvester4_Icon.png","스페셜초상화/Teo4_Icon.png","스페셜초상화/Rudy4_Icon.png",
    "스페셜초상화/Spike4_Icon.png","스페셜초상화/Platin4_Icon.png","스페셜초상화/Rachel4_Icon.png",
    "스페셜초상화/Rin4_Icon.png","스페셜초상화/Mercure4_Icon.png","스페셜초상화/Pallanus4_Icon.png",
    "스페셜초상화/Kyle4_Icon.png","스페셜초상화/Kris4_Icon.png","스페셜초상화/Karma4_Icon.png",
    "스페셜초상화/Dellons4_Icon.png","스페셜초상화/Branze_&_Bransel4_Icon.png","스페셜초상화/Jave4_Icon.png",
    "스페셜초상화/Colt4_Icon.png","스페셜초상화/Eileene4_Icon.png","스페셜초상화/트루드4.png"};
    
    String[] spcard5arr = {"스페셜초상화/Ace5_Icon.png","스페셜초상화/Sun_Wukong5_Icon.png",
    "스페셜초상화/Lu_Bu5_Icon.png","스페셜초상화/Vanessa5_Icon.png","스페셜초상화/Yeonhee5_Icon.png",
    "스페셜초상화/Sylvester5_Icon.png","스페셜초상화/Teo5_Icon.png","스페셜초상화/Rudy5_Icon.png",
    "스페셜초상화/Spike5_Icon.png","스페셜초상화/Platin5_Icon.png","스페셜초상화/Rachel5_Icon.png",
    "스페셜초상화/Rin5_Icon.png","스페셜초상화/Mercure5_Icon.png","스페셜초상화/Pallanus5_Icon.png",
    "스페셜초상화/Kyle5_Icon.png","스페셜초상화/Kris5_Icon.png","스페셜초상화/Karma5_Icon.png",
    "스페셜초상화/Dellons5_Icon.png","스페셜초상화/Branze_&_Bransel5_Icon.png","스페셜초상화/Jave5_Icon.png",
    "스페셜초상화/Colt5_Icon.png","스페셜초상화/Eileene5_Icon.png","스페셜초상화/트루드5.png"};
    
    String[] spcard6arr = {"스페셜초상화/Ace6_Icon.png","스페셜초상화/Sun_Wukong6_Icon.png",
    "스페셜초상화/Lu_Bu6_Icon.png","스페셜초상화/Vanessa6_Icon.png","스페셜초상화/Yeonhee6_Icon.png",
    "스페셜초상화/Sylvester6_Icon.png","스페셜초상화/Teo6_Icon.png","스페셜초상화/Rudy6_Icon.png",
    "스페셜초상화/Spike6_Icon.png","스페셜초상화/Platin6_Icon.png","스페셜초상화/Rachel6_Icon.png",
    "스페셜초상화/Rin6_Icon.png","스페셜초상화/Mercure6_Icon.png","스페셜초상화/Pallanus6_Icon.png",
    "스페셜초상화/Kyle6_Icon.png","스페셜초상화/Kris6_Icon.png","스페셜초상화/Karma6_Icon.png",
    "스페셜초상화/Dellons6_Icon.png","스페셜초상화/Branze_&_Bransel6_Icon.png","스페셜초상화/Jave6_Icon.png",
    "스페셜초상화/Colt6_Icon.png","스페셜초상화/Eileene6_Icon.png","스페셜초상화/트루드6.png",
    "준스페셜초상화/Amelia6_Icon.png","준스페셜초상화/Aquila6_Icon.png","준스페셜초상화/Atalanta6_Icon.png",
    "준스페셜초상화/Aris6_Icon.png","준스페셜초상화/Ingrid6_Icon.png","준스페셜초상화/Elysia6_Icon.png",
    "준스페셜초상화/Clemis6_Icon.png","준스페셜초상화/Klahan6_Icon.png","준스페셜초상화/Kagura6_Icon.png",
    "준스페셜초상화/Miho6_Icon.png","준스페셜초상화/Kyrielle6_Icon.png","준스페셜초상화/Orly6_Icon.png",
    "준스페셜초상화/Mulan6_Icon.png","준스페셜초상화/Ryan6_Icon.png","준스페셜초상화/Roro6_Icon.png",
    "준스페셜초상화/Taka6_Icon.png","준스페셜초상화/Karl_Heron6_Icon.png"};
    
    String[] jspcard4arr = {"준스페셜초상화/Amelia4_Icon.png","준스페셜초상화/Aquila4_Icon.png","준스페셜초상화/Atalanta4_Icon.png",
    "준스페셜초상화/Aris4_Icon.png","준스페셜초상화/Ingrid4_Icon.png","준스페셜초상화/Elysia4_Icon.png",
    "준스페셜초상화/Clemis4_Icon.png","준스페셜초상화/Klahan4_Icon.png","준스페셜초상화/Kagura4_Icon.png",
    "준스페셜초상화/Miho4_Icon.png","준스페셜초상화/Kyrielle4_Icon.png","준스페셜초상화/Orly4_Icon.png",
    "준스페셜초상화/Mulan4_Icon.png","준스페셜초상화/Ryan4_Icon.png","준스페셜초상화/Roro4_Icon.png",
    "준스페셜초상화/Taka4_Icon.png","준스페셜초상화/Karl_Heron4_Icon.png"};
    
    String[] jspcard5arr = {"준스페셜초상화/Amelia5_Icon.png","준스페셜초상화/Aquila5_Icon.png","준스페셜초상화/Atalanta5_Icon.png",
    "준스페셜초상화/Aris5_Icon.png","준스페셜초상화/Ingrid5_Icon.png","준스페셜초상화/Elysia5_Icon.png",
    "준스페셜초상화/Clemis5_Icon.png","준스페셜초상화/Klahan5_Icon.png","준스페셜초상화/Kagura5_Icon.png",
    "준스페셜초상화/Miho5_Icon.png","준스페셜초상화/Kyrielle5_Icon.png","준스페셜초상화/Orly5_Icon.png",
    "준스페셜초상화/Mulan5_Icon.png","준스페셜초상화/Ryan5_Icon.png","준스페셜초상화/Roro5_Icon.png",
    "준스페셜초상화/Taka5_Icon.png","준스페셜초상화/Karl_Heron5_Icon.png"};
    
    String[] jspcard6arr = {"준스페셜초상화/Amelia6_Icon.png","준스페셜초상화/Aquila6_Icon.png","준스페셜초상화/Atalanta6_Icon.png",
    "준스페셜초상화/Aris6_Icon.png","준스페셜초상화/Ingrid6_Icon.png","준스페셜초상화/Elysia6_Icon.png",
    "준스페셜초상화/Clemis6_Icon.png","준스페셜초상화/Klahan6_Icon.png","준스페셜초상화/Kagura6_Icon.png",
    "준스페셜초상화/Miho6_Icon.png","준스페셜초상화/Kyrielle6_Icon.png","준스페셜초상화/Orly6_Icon.png",
    "준스페셜초상화/Mulan6_Icon.png","준스페셜초상화/Ryan6_Icon.png","준스페셜초상화/Roro6_Icon.png",
    "준스페셜초상화/Taka6_Icon.png","준스페셜초상화/Karl_Heron6_Icon.png"};
//    javax.swing.Icon card5hero = new ImageIcon("일반영웅/Nia5_Icon.png");
//    javax.swing.Icon card6hero = new ImageIcon("일반영웅/Nia6_Icon.png");
    Icon gdcdimg = new ImageIcon(getClass().getClassLoader().getResource("etc/4성이상카드11.PNG"));
    Icon svcdimg = new ImageIcon(getClass().getClassLoader().getResource("etc/영웅카드11.PNG"));
    javax.swing.Icon freegdcd = new ImageIcon(getClass().getClassLoader().getResource("etc/보너스카드.PNG"));
//    javax.swing.Icon nmhero0;
//    javax.swing.Icon star4nmhero[i];
//    javax.swing.Icon star5nmhero[i];
//    javax.swing.Icon star6nmhero[i];
//    javax.swing.Icon starsp4hero[i];
//    javax.swing.Icon starsp5hero[i];
//    javax.swing.Icon sphero6;
//    javax.swing.Icon starjsp4hero[i];
//    javax.swing.Icon jstarsp5hero[i];
//    javax.swing.Icon jsphero6;
    javax.swing.Icon[] arr = new ImageIcon[11];
    javax.swing.Icon[] star3nmhero = new ImageIcon[10];
    javax.swing.Icon[] star4nmhero = new ImageIcon[10];
    javax.swing.Icon[] star5nmhero = new ImageIcon[10];
    javax.swing.Icon[] star6nmhero = new ImageIcon[10];
    //javax.swing.Icon[] starjsphero = new ImageIcon[10];
    javax.swing.Icon[] starsp4hero = new ImageIcon[10];
    javax.swing.Icon[] starsp5hero = new ImageIcon[10];
    javax.swing.Icon[] starsp6hero = new ImageIcon[10];
    javax.swing.Icon[] starjsp4hero = new ImageIcon[10];
    javax.swing.Icon[] starjsp5hero = new ImageIcon[10];
    javax.swing.Icon[] starjsp6hero = new ImageIcon[10];
    int gdcd = 1525;
    int normal3hero = 9000;
    int normal4hero = 9794;
    int normal5hero = 179;
    int normal6hero = 90;
    int jspeical4hero = 89;
    int jspeical5hero = 11;
    int jspeical6hero = 5;
    int speical4hero = 86;
    int speical5hero = 10;
    int speical6hero = 5;
    
    int count = 1;
    int smcnt = 1;
    int spherocnt = 0;
    int cardcount = 0;
    String getnick = "";
    String setnick = "";
    public void SpHeroCount(){
        spherocnt++;
        spcnt.setText(String.valueOf(spherocnt));
        spcnt.getText();
    }
    
    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        initComponents();
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Image jframeicon = toolkit.getImage(getClass().getClassLoader().getResource("etc/세나아이콘.png"));
        setIconImage(jframeicon);
        jFrame1.setIconImage(jframeicon);
//      bgmPlay("bgm/bgm_00_gacha_shop.wav");
        bgmPlay();
        
        
        summoncnt.setText(String.valueOf(smcnt));
        summoncnt.getText();
        spcnt.setText(String.valueOf(spherocnt));
        spcnt.getText();
       
     
        
    }
//    public void nm3heros(){
//        for(int i = 0; i<=card3arr.length; i++){
//            card3arr[i] = new ImageIcon(i + "D:\\문서\\3성영웅\\" +".png");
//        }
//        
//    }
        
    
     public void bgmPlay(){
        try{
            //AudioInputStream ais = AudioSystem.getAudioInputStream(new File(fileName));
            InputStream is = getClass().getResourceAsStream("bgm/bgm_00_gacha_shop.wav");
            AudioInputStream ais = AudioSystem.getAudioInputStream(is);
            
            Clip clip = AudioSystem.getClip();
            clip.open(ais);
            
            clip.start();
            clip.loop(-1);
            
        }catch (Exception e){
            e.printStackTrace();
        }
    }
     public void clickPlay(){
        try{
            //AudioInputStream ais = AudioSystem.getAudioInputStream(new File(fileName));
            InputStream is = getClass().getResourceAsStream("bgm/ui_click_simple_01.wav");
            AudioInputStream ais = AudioSystem.getAudioInputStream(is);
            Clip clip = AudioSystem.getClip();
            clip.open(ais);
            
            clip.start();
            
            
        }catch (Exception e){
            e.printStackTrace();
        }
    }
     public void nmcardclickPlay(){
        try{
            //AudioInputStream ais = AudioSystem.getAudioInputStream(new File(fileName));
            InputStream is = getClass().getResourceAsStream("bgm/ui_gacha_sparkling.wav");
            AudioInputStream ais = AudioSystem.getAudioInputStream(is);
            Clip clip = AudioSystem.getClip();
            clip.open(ais);
            
            clip.start();
            
            
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
     
     public void timesleep(){
         try {
             
                Thread.sleep(300);      // 1초씩 딜레이. for문에 넣어놨으니 결과는 1초마다 실행됨.
                
 
            } catch (InterruptedException e) {    //sleep에서 생기는 방해오류(InterruptedException)를 처리.
                e.printStackTrace();
            }
     }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        herocard1 = new javax.swing.JLabel();
        herocard2 = new javax.swing.JLabel();
        herocard3 = new javax.swing.JLabel();
        herocard4 = new javax.swing.JLabel();
        herocard5 = new javax.swing.JLabel();
        herocard6 = new javax.swing.JLabel();
        herocard7 = new javax.swing.JLabel();
        herocard8 = new javax.swing.JLabel();
        herocard9 = new javax.swing.JLabel();
        herocard10 = new javax.swing.JLabel();
        herocard11 = new javax.swing.JLabel();
        allOpenbtn = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        getNick = new javax.swing.JLabel();
        summoncnt = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        spcnt = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        smname = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        jFrame1.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        jFrame1.setTitle("세븐나이츠 영웅 소환");
        jFrame1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        herocard1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/etc/영웅카드11.PNG"))); // NOI18N
        herocard1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                herocard1MouseClicked(evt);
            }
        });

        herocard2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/etc/영웅카드11.PNG"))); // NOI18N
        herocard2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                herocard2MouseClicked(evt);
            }
        });

        herocard3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/etc/영웅카드11.PNG"))); // NOI18N
        herocard3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                herocard3MouseClicked(evt);
            }
        });

        herocard4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/etc/영웅카드11.PNG"))); // NOI18N
        herocard4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                herocard4MouseClicked(evt);
            }
        });

        herocard5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/etc/영웅카드11.PNG"))); // NOI18N
        herocard5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                herocard5MouseClicked(evt);
            }
        });

        herocard6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/etc/영웅카드11.PNG"))); // NOI18N
        herocard6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                herocard6MouseClicked(evt);
            }
        });

        herocard7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/etc/영웅카드11.PNG"))); // NOI18N
        herocard7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                herocard7MouseClicked(evt);
            }
        });

        herocard8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/etc/영웅카드11.PNG"))); // NOI18N
        herocard8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                herocard8MouseClicked(evt);
            }
        });

        herocard9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/etc/영웅카드11.PNG"))); // NOI18N
        herocard9.setPreferredSize(new java.awt.Dimension(99, 139));
        herocard9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                herocard9MouseClicked(evt);
            }
        });

        herocard10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/etc/영웅카드11.PNG"))); // NOI18N
        herocard10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                herocard10MouseClicked(evt);
            }
        });

        herocard11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/etc/보너스카드.png"))); // NOI18N
        herocard11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                herocard11MouseClicked(evt);
            }
        });

        allOpenbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/etc/한번에열기.png"))); // NOI18N
        allOpenbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                allOpenbtnMouseClicked(evt);
            }
        });
        allOpenbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                allOpenbtnActionPerformed(evt);
            }
        });

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/etc/10회소환.jpg"))); // NOI18N
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/etc/루뽑배경2.png"))); // NOI18N

        getNick.setBackground(new java.awt.Color(204, 204, 204));
        getNick.setFont(new java.awt.Font("휴먼모음T", 0, 18)); // NOI18N
        getNick.setForeground(new java.awt.Color(255, 255, 255));
        getNick.setText("니아");
        getNick.setToolTipText("");

        summoncnt.setFont(new java.awt.Font("휴먼모음T", 1, 18)); // NOI18N
        summoncnt.setForeground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("휴먼모음T", 0, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("뽑은 횟수");

        jLabel6.setFont(new java.awt.Font("휴먼모음T", 0, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("스페셜영웅 횟수");

        jLabel7.setFont(new java.awt.Font("휴먼모음T", 0, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("닉네임");

        spcnt.setFont(new java.awt.Font("휴먼모음T", 1, 18)); // NOI18N
        spcnt.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrame1Layout.createSequentialGroup()
                .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jFrame1Layout.createSequentialGroup()
                        .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jFrame1Layout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jFrame1Layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jFrame1Layout.createSequentialGroup()
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(getNick, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jFrame1Layout.createSequentialGroup()
                                        .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel6))
                                        .addGap(29, 29, 29)
                                        .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(spcnt, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(summoncnt, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(herocard8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(herocard9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(herocard7, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54))
                    .addGroup(jFrame1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(herocard10, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)))
                .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jFrame1Layout.createSequentialGroup()
                        .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(herocard6, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(herocard11, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(herocard1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(58, 58, 58)
                        .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(herocard2, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(herocard5, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42)
                        .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(herocard3, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                            .addComponent(herocard4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(239, 239, 239))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jFrame1Layout.createSequentialGroup()
                        .addComponent(allOpenbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(149, 149, 149))))
            .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jFrame1Layout.createSequentialGroup()
                    .addComponent(jLabel2)
                    .addGap(0, 33, Short.MAX_VALUE)))
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jFrame1Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(herocard2, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(herocard10, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jFrame1Layout.createSequentialGroup()
                        .addComponent(herocard7, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(127, 127, 127))
                    .addGroup(jFrame1Layout.createSequentialGroup()
                        .addComponent(herocard5, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jFrame1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(herocard1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addComponent(herocard11, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jFrame1Layout.createSequentialGroup()
                .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jFrame1Layout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addComponent(getNick, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jFrame1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(summoncnt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                    .addComponent(spcnt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(allOpenbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jFrame1Layout.createSequentialGroup()
                .addContainerGap(127, Short.MAX_VALUE)
                .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jFrame1Layout.createSequentialGroup()
                        .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(herocard4, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(herocard8, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(193, 193, 193))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jFrame1Layout.createSequentialGroup()
                        .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(herocard9, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(herocard3, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(378, 378, 378))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jFrame1Layout.createSequentialGroup()
                        .addComponent(herocard6, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(101, 101, 101))))
            .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("세븐나이츠 영웅소환");
        setIconImages(null);
        setPreferredSize(new java.awt.Dimension(1280, 483));

        jLabel1.setBackground(new java.awt.Color(153, 153, 153));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/etc/닉네임.PNG"))); // NOI18N

        smname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                smnameActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/etc/루뽑버튼.PNG"))); // NOI18N
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/etc/루뽑배경.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(509, 509, 509)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(29, 29, 29)
                        .addComponent(smname, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(539, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel3)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(197, 197, 197)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(smname, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(64, 64, 64)
                .addComponent(jButton1)
                .addContainerGap(111, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        getnick = smname.getText();
        getNick.setText(smname.getText());     
        setVisible(false);
        System.out.println(getnick);
        jFrame1.setVisible(true);
        jButton4.setVisible(false);
        jFrame1.setSize(1270, 662);
        cardSummon();
        clickPlay();
        jFrame1.revalidate();
        jFrame1.repaint();
        
       
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        // TODO add your handling code here:
        cardSummon();
        allOpenbtn.setVisible(true);
        cardcount = 0;
        jButton4.setVisible(false);
        clickPlay();
        smcnt++;
        summoncnt.setText(String.valueOf(smcnt));
        summoncnt.getText();
    }//GEN-LAST:event_jButton4MouseClicked

    private void herocard11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_herocard11MouseClicked
         //TODO add your handling code here:
        for(int i = 0; i<=0; i++){
            if(herocard11.getIcon() == freegdcd){
                int r = ran.nextInt(10000);
                int r2 = (int)(Math.random() * card4arr.length);
                int r3 = (int)(Math.random() * card5arr.length);
                int r4 = (int)(Math.random() * card6arr.length);
                int r5 = (int)(Math.random() * spcard4arr.length);
                int r6 = (int)(Math.random() * spcard5arr.length);
                int r7 = (int)(Math.random() * spcard6arr.length);
                int r8 = (int)(Math.random() * jspcard4arr.length);
                int r9 = (int)(Math.random() * jspcard5arr.length);
                int r10 = (int)(Math.random() * jspcard6arr.length);
                if(r <= speical6hero){
                    starsp6hero[i] = new ImageIcon(getClass().getClassLoader().getResource(spcard6arr[r7]));
//                   starsp6hero[i]= starsp6hero[i];
                    herocard11.setIcon(starsp6hero[i]);
                    cardcount++;
                    SpHeroCount();
                    nmcardclickPlay();
                }
                else if(r <= speical5hero){
                    starsp5hero[i] = new ImageIcon(getClass().getClassLoader().getResource(spcard5arr[r6]));
//                    starsp5hero[i]= starsp5hero[i];
                    herocard11.setIcon(starsp5hero[i]);
                    cardcount++;
                    SpHeroCount();
                    nmcardclickPlay();
                }
                else if(r <= jspeical5hero){
                    starjsp5hero[i] = new ImageIcon(getClass().getClassLoader().getResource(jspcard5arr[r9]));
//                    starsp5hero[i]= starjsp5hero[i];
                    herocard11.setIcon(starjsp5hero[i]);
                    cardcount++;
                    SpHeroCount();
                    nmcardclickPlay();
                }
                else if(r <= speical4hero){
                    starsp4hero[i] = new ImageIcon(getClass().getClassLoader().getResource(spcard4arr[r5]));
//                    starsp4hero[i]= starsp4hero[i];
                    herocard11.setIcon(starsp4hero[i]);
                    cardcount++;
                    SpHeroCount();
                    nmcardclickPlay();
                } 
               
                else if(r <= jspeical4hero){
                    starjsp4hero[i] = new ImageIcon(getClass().getClassLoader().getResource(jspcard4arr[r8]));
//                    starsp4hero[i]= starjsp4hero[i];
                    herocard11.setIcon(starjsp4hero[i]);
                    cardcount++;
                    SpHeroCount();
                    nmcardclickPlay();
                }
                else if(r <= normal6hero){
                    star6nmhero[i] = new ImageIcon(getClass().getClassLoader().getResource(card6arr[r4]));
//                    star6nmhero[i]= star6nmhero[i];
                    herocard11.setIcon(star6nmhero[i]);
                    cardcount++;
                    nmcardclickPlay();
                }
                else if(r <= normal5hero){
                    star5nmhero[i] = new ImageIcon(getClass().getClassLoader().getResource(card5arr[r3]));
//                    star5nmhero[i]= star5nmhero[i];
                    herocard11.setIcon(star5nmhero[i]);
                    cardcount++;
                    nmcardclickPlay();
                } 
                else if(r <= normal4hero){
                    star4nmhero[i] = new ImageIcon(getClass().getClassLoader().getResource(card4arr[r2]));
                    star4nmhero[i]= star4nmhero[i];
                    herocard11.setIcon(star4nmhero[i]);
                    cardcount++;
                    nmcardclickPlay();
                }else if(herocard11.getIcon() == svcdimg || herocard11.getIcon() == gdcdimg){
                if(cardcount < 11){
                    jButton4.setVisible(false);
                }
            }
            
        }
        if(cardcount == 11){
                    allOpenbtn.setVisible(false);
                    jButton4.setVisible(true);
                    cardcount = 0;
        }
        }
    }//GEN-LAST:event_herocard11MouseClicked

    private void smnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_smnameActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_smnameActionPerformed

    private void herocard1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_herocard1MouseClicked
        // TODO add your handling code here:
        for(int i = 0; i<=0; i++){
            if(herocard1.getIcon() == gdcdimg){
                int r = ran.nextInt(10000);
                int r2 = (int)(Math.random() * card4arr.length);
                int r3 = (int)(Math.random() * card5arr.length);
                int r4 = (int)(Math.random() * card6arr.length);
                int r5 = (int)(Math.random() * spcard4arr.length);
                int r6 = (int)(Math.random() * spcard5arr.length);
                int r7 = (int)(Math.random() * spcard6arr.length);
                int r8 = (int)(Math.random() * jspcard4arr.length);
                int r9 = (int)(Math.random() * jspcard5arr.length);
                int r10 = (int)(Math.random() * jspcard6arr.length);
                if(r <= speical6hero){
                    starsp6hero[i] = new ImageIcon(getClass().getClassLoader().getResource(spcard6arr[r7]));
//                    starsp6hero[i]= starsp6hero[i];
                    herocard1.setIcon(starsp6hero[i]);
                    cardcount++;
                    SpHeroCount();
                    nmcardclickPlay();
                }
                else if(r <= speical5hero){
                    starsp5hero[i] = new ImageIcon(getClass().getClassLoader().getResource(spcard5arr[r6]));
//                    starsp5hero[i]= starsp5hero[i];
                    herocard1.setIcon(starsp5hero[i]);
                    cardcount++;
                    SpHeroCount();
                    nmcardclickPlay();
                }
                else if(r <= jspeical5hero){
                    starjsp5hero[i] = new ImageIcon(getClass().getClassLoader().getResource(jspcard5arr[r9]));
//                    starsp5hero[i]= starjsp5hero[i];
                    herocard1.setIcon(starjsp5hero[i]);
                    cardcount++;
                    nmcardclickPlay();
                }
                else if(r <= speical4hero){
                    starsp4hero[i] = new ImageIcon(getClass().getClassLoader().getResource(spcard4arr[r5]));
//                    starsp4hero[i]= starsp4hero[i];
                    herocard1.setIcon(starsp4hero[i]);
                    cardcount++;
                    SpHeroCount();
                    nmcardclickPlay();
                } 
                
                else if(r <= jspeical4hero){
                    starjsp4hero[i] = new ImageIcon(getClass().getClassLoader().getResource(jspcard4arr[r8]));
//                    starsp4hero[i]= starjsp4hero[i];
                    herocard1.setIcon(starjsp4hero[i]);
                    cardcount++;
                    SpHeroCount();
                    nmcardclickPlay();
                }
                else if(r <= normal6hero){
                    star6nmhero[i] = new ImageIcon(getClass().getClassLoader().getResource(card6arr[r4]));
//                    star6nmhero[i]= star6nmhero[i];
                    herocard1.setIcon(star6nmhero[i]);
                    cardcount++;
                    nmcardclickPlay();
                }
                else if(r <= normal5hero){
                    star5nmhero[i] = new ImageIcon(getClass().getClassLoader().getResource(card5arr[r3]));
//                    star5nmhero[i]= star5nmhero[i];
                    herocard1.setIcon(star5nmhero[i]);
                    cardcount++;
                    nmcardclickPlay();
                } 
                else if(r <= normal4hero){
                    star4nmhero[i] = new ImageIcon(getClass().getClassLoader().getResource(card4arr[r2]));
//                    star4nmhero[i]= star4nmhero[i];
                    herocard1.setIcon(star4nmhero[i]);
                    cardcount++;
                    nmcardclickPlay();
                }
            }       
            else if(herocard1.getIcon() == svcdimg){
                int r1 = (int)(Math.random() * card3arr.length);
                star3nmhero[i] = new ImageIcon(getClass().getClassLoader().getResource(card3arr[r1]));
                //star3nmhero[i]= nmhero0;
                herocard1.setIcon(star3nmhero[i]);
                cardcount++;
                nmcardclickPlay();
            }else if(herocard1.getIcon() == svcdimg || herocard1.getIcon() == gdcdimg){
                if(cardcount < 11){
                    jButton4.setVisible(false);
                }
            }
            
        }
        if(cardcount == 11){
                    allOpenbtn.setVisible(false);
                    jButton4.setVisible(true);
                    cardcount = 0;
        }
        
        
    }//GEN-LAST:event_herocard1MouseClicked

    private void herocard2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_herocard2MouseClicked
        // TODO add your handling code here:
        for(int i = 0; i<=0; i++){
            if(herocard2.getIcon() == gdcdimg){
                int r = ran.nextInt(10000);
                int r2 = (int)(Math.random() * card4arr.length);
                int r3 = (int)(Math.random() * card5arr.length);
                int r4 = (int)(Math.random() * card6arr.length);
                int r5 = (int)(Math.random() * spcard4arr.length);
                int r6 = (int)(Math.random() * spcard5arr.length);
                int r7 = (int)(Math.random() * spcard6arr.length);
                int r8 = (int)(Math.random() * jspcard4arr.length);
                int r9 = (int)(Math.random() * jspcard5arr.length);
                int r10 = (int)(Math.random() * jspcard6arr.length);
                if(r <= speical6hero){
                    starsp6hero[i] = new ImageIcon(getClass().getClassLoader().getResource(spcard6arr[r7]));
//                    starsp6hero[i]= starsp6hero[i];
                    herocard2.setIcon(starsp6hero[i]);
                    cardcount++;
                    SpHeroCount();
                    nmcardclickPlay();
                }
                else if(r <= speical5hero){
                    starsp5hero[i] = new ImageIcon(getClass().getClassLoader().getResource(spcard5arr[r6]));
//                    starsp5hero[i]= starsp5hero[i];
                    herocard2.setIcon(starsp5hero[i]);
                    cardcount++;
                    SpHeroCount();
                    nmcardclickPlay();
                }
                else if(r <= jspeical5hero){
                    starjsp5hero[i] = new ImageIcon(getClass().getClassLoader().getResource(jspcard5arr[r9]));
//                    starsp5hero[i]= starjsp5hero[i];
                    herocard2.setIcon(starjsp5hero[i]);
                    cardcount++;
                    SpHeroCount();
                    nmcardclickPlay();
                }
                else if(r <= speical4hero){
                    starsp4hero[i] = new ImageIcon(getClass().getClassLoader().getResource(spcard4arr[r5]));
//                    starsp4hero[i]= starsp4hero[i];
                    herocard2.setIcon(starsp4hero[i]);
                    cardcount++;
                    SpHeroCount();
                    nmcardclickPlay();
                } 
                
                else if(r <= jspeical4hero){
                    starjsp4hero[i] = new ImageIcon(getClass().getClassLoader().getResource(jspcard4arr[r8]));
//                    starsp4hero[i]= starjsp4hero[i];
                    herocard2.setIcon(starjsp4hero[i]);
                    cardcount++;
                    SpHeroCount();
                    nmcardclickPlay();
                }
                else if(r <= normal6hero){
                    star6nmhero[i] = new ImageIcon(getClass().getClassLoader().getResource(card6arr[r4]));
//                    star6nmhero[i]= star6nmhero[i];
                    herocard2.setIcon(star6nmhero[i]);
                    cardcount++;
                    nmcardclickPlay();
                }
                else if(r <= normal5hero){
                    star5nmhero[i] = new ImageIcon(getClass().getClassLoader().getResource(card5arr[r3]));
//                    star5nmhero[i]= star5nmhero[i];
                    herocard2.setIcon(star5nmhero[i]);
                    cardcount++;
                    nmcardclickPlay();
                } 
                else if(r <= normal4hero){
                    star4nmhero[i] = new ImageIcon(getClass().getClassLoader().getResource(card4arr[r2]));
//                    star4nmhero[i]= star4nmhero[i];
                    herocard2.setIcon(star4nmhero[i]);
                    cardcount++;
                    nmcardclickPlay();
                }
            }       
            else if(herocard2.getIcon() == svcdimg){
                int r1 = (int)(Math.random() * card3arr.length);
                star3nmhero[i] = new ImageIcon(getClass().getClassLoader().getResource(card3arr[r1]));
                //star3nmhero[i]= nmhero0;
                herocard2.setIcon(star3nmhero[i]);
                cardcount++;
                nmcardclickPlay();
            }else if(herocard2.getIcon() == svcdimg || herocard2.getIcon() == gdcdimg){
                if(cardcount < 11){
                    jButton4.setVisible(false);
                }
            }
            
        }
        if(cardcount == 11){
                    allOpenbtn.setVisible(false);
                    jButton4.setVisible(true);
                    cardcount = 0;
        }
       
    }//GEN-LAST:event_herocard2MouseClicked

    private void herocard3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_herocard3MouseClicked
        // TODO add your handling code here:
        for(int i = 0; i<=0; i++){
            if(herocard3.getIcon() == gdcdimg){
                int r = ran.nextInt(10000);
                int r2 = (int)(Math.random() * card4arr.length);
                int r3 = (int)(Math.random() * card5arr.length);
                int r4 = (int)(Math.random() * card6arr.length);
                int r5 = (int)(Math.random() * spcard4arr.length);
                int r6 = (int)(Math.random() * spcard5arr.length);
                int r7 = (int)(Math.random() * spcard6arr.length);
                int r8 = (int)(Math.random() * jspcard4arr.length);
                int r9 = (int)(Math.random() * jspcard5arr.length);
                int r10 = (int)(Math.random() * jspcard6arr.length);
                if(r <= speical6hero){
                    starsp6hero[i] = new ImageIcon(getClass().getClassLoader().getResource(spcard6arr[r7]));
//                    starsp6hero[i]= starsp6hero[i];
                    herocard3.setIcon(starsp6hero[i]);
                    cardcount++;
                    SpHeroCount();
                    nmcardclickPlay();
                }
                else if(r <= speical5hero){
                    starsp5hero[i] = new ImageIcon(getClass().getClassLoader().getResource(spcard5arr[r6]));
//                    starsp5hero[i]= starsp5hero[i];
                    herocard3.setIcon(starsp5hero[i]);
                    cardcount++;
                    SpHeroCount();
                    nmcardclickPlay();
                }
                else if(r <= jspeical5hero){
                    starjsp5hero[i] = new ImageIcon(getClass().getClassLoader().getResource(jspcard5arr[r9]));
//                    starsp5hero[i]= starjsp5hero[i];
                    herocard3.setIcon(starjsp5hero[i]);
                    cardcount++;
                    SpHeroCount();
                    nmcardclickPlay();
                }
                else if(r <= speical4hero){
                    starsp4hero[i] = new ImageIcon(getClass().getClassLoader().getResource(spcard4arr[r5]));
//                    starsp4hero[i]= starsp4hero[i];
                    herocard3.setIcon(starsp4hero[i]);
                    cardcount++;
                    SpHeroCount();
                    nmcardclickPlay();
                } 
                
                else if(r <= jspeical4hero){
                    starjsp4hero[i] = new ImageIcon(getClass().getClassLoader().getResource(jspcard4arr[r8]));
//                    starsp4hero[i]= starjsp4hero[i];
                    herocard3.setIcon(starjsp4hero[i]);
                    cardcount++;
                    SpHeroCount();
                    nmcardclickPlay();
                }
                else if(r <= normal6hero){
                    star6nmhero[i] = new ImageIcon(getClass().getClassLoader().getResource(card6arr[r4]));
//                    star6nmhero[i]= star6nmhero[i];
                    herocard3.setIcon(star6nmhero[i]);
                    cardcount++;
                    nmcardclickPlay();
                }
                else if(r <= normal5hero){
                    star5nmhero[i] = new ImageIcon(getClass().getClassLoader().getResource(card5arr[r3]));
//                    star5nmhero[i]= star5nmhero[i];
                    herocard3.setIcon(star5nmhero[i]);
                    cardcount++;
                    nmcardclickPlay();
                } 
                else if(r <= normal4hero){
                    star4nmhero[i] = new ImageIcon(getClass().getClassLoader().getResource(card4arr[r2]));
//                    star4nmhero[i]= star4nmhero[i];
                    herocard3.setIcon(star4nmhero[i]);
                    cardcount++;
                    nmcardclickPlay();
                }
            }       
            else  if(herocard3.getIcon() == svcdimg){
                int r1 = (int)(Math.random() * card3arr.length);
                star3nmhero[i] = new ImageIcon(getClass().getClassLoader().getResource(card3arr[r1]));
                //star3nmhero[i]= nmhero0;
                herocard3.setIcon(star3nmhero[i]);
                cardcount++;
                nmcardclickPlay();
            }else if(herocard3.getIcon() == svcdimg || herocard3.getIcon() == gdcdimg){
                if(cardcount < 11){
                    jButton4.setVisible(false);
                }
            }
            
        }
        if(cardcount == 11){
                    allOpenbtn.setVisible(false);
                    jButton4.setVisible(true);
                    cardcount = 0;
        }
        
        
    }//GEN-LAST:event_herocard3MouseClicked

    private void herocard4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_herocard4MouseClicked
         //TODO add your handling code here:
        for(int i = 0; i<=0; i++){
            if(herocard4.getIcon() == gdcdimg){
                int r = ran.nextInt(10000);
                int r2 = (int)(Math.random() * card4arr.length);
                int r3 = (int)(Math.random() * card5arr.length);
                int r4 = (int)(Math.random() * card6arr.length);
                int r5 = (int)(Math.random() * spcard4arr.length);
                int r6 = (int)(Math.random() * spcard5arr.length);
                int r7 = (int)(Math.random() * spcard6arr.length);
                int r8 = (int)(Math.random() * jspcard4arr.length);
                int r9 = (int)(Math.random() * jspcard5arr.length);
                int r10 = (int)(Math.random() * jspcard6arr.length);
                if(r <= speical6hero){
                    starsp6hero[i] = new ImageIcon(getClass().getClassLoader().getResource(spcard6arr[r7]));
//                    starsp6hero[i]= starsp6hero[i];
                    herocard4.setIcon(starsp6hero[i]);
                    cardcount++;
                    SpHeroCount();
                    nmcardclickPlay();
                }
                else if(r <= speical5hero){
                    starsp5hero[i] = new ImageIcon(getClass().getClassLoader().getResource(spcard5arr[r6]));
//                    starsp5hero[i]= starsp5hero[i];
                    herocard4.setIcon(starsp5hero[i]);
                    cardcount++;
                    SpHeroCount();
                    nmcardclickPlay();
                }
                 else if(r <= jspeical5hero){
                    starjsp5hero[i] = new ImageIcon(getClass().getClassLoader().getResource(jspcard5arr[r9]));
//                    starsp5hero[i]= starjsp5hero[i];
                    herocard4.setIcon(starjsp5hero[i]);
                    cardcount++;
                    SpHeroCount();
                    nmcardclickPlay();
                }
                else if(r <= speical4hero){
                    starsp4hero[i] = new ImageIcon(getClass().getClassLoader().getResource(spcard4arr[r5]));
//                    starsp4hero[i]= starsp4hero[i];
                    herocard4.setIcon(starsp4hero[i]);
                    cardcount++;
                    SpHeroCount();
                    nmcardclickPlay();
                } 
               
                else if(r <= jspeical4hero){
                    starjsp4hero[i] = new ImageIcon(getClass().getClassLoader().getResource(jspcard4arr[r8]));
//                    starsp4hero[i]= starjsp4hero[i];
                    herocard4.setIcon(starjsp4hero[i]);
                    
                    cardcount++;
                    SpHeroCount();
                    nmcardclickPlay();
                }
                else if(r <= normal6hero){
                    star6nmhero[i] = new ImageIcon(getClass().getClassLoader().getResource(card6arr[r4]));
//                    star6nmhero[i]= star6nmhero[i];
                    herocard4.setIcon(star6nmhero[i]);
                    cardcount++;
                    nmcardclickPlay();
                }
                else if(r <= normal5hero){
                    star5nmhero[i] = new ImageIcon(getClass().getClassLoader().getResource(card5arr[r3]));
//                    star5nmhero[i]= star5nmhero[i];
                    herocard4.setIcon(star5nmhero[i]);
                    cardcount++;
                    nmcardclickPlay();
                } 
                else if(r <= normal4hero){
                    star4nmhero[i] = new ImageIcon(getClass().getClassLoader().getResource(card4arr[r2]));
//                    star4nmhero[i]= star4nmhero[i];
                    herocard4.setIcon(star4nmhero[i]);
                    cardcount++;
                    nmcardclickPlay();
                }
            }       
            else if(herocard4.getIcon() == svcdimg){
                int r1 = (int)(Math.random() * card3arr.length);
                star3nmhero[i] = new ImageIcon(getClass().getClassLoader().getResource(card3arr[r1]));
                //star3nmhero[i]= nmhero0;
                herocard4.setIcon(star3nmhero[i]);
                cardcount++;
                nmcardclickPlay();
            }else if(herocard4.getIcon() == svcdimg || herocard4.getIcon() == gdcdimg){
                if(cardcount < 11){
                    jButton4.setVisible(false);
                }
            }
            
        }
        if(cardcount == 11){
                    allOpenbtn.setVisible(false);
                    jButton4.setVisible(true);
                    cardcount = 0;
        }         
      
    }//GEN-LAST:event_herocard4MouseClicked

    private void herocard5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_herocard5MouseClicked
        // TODO add your handling code here:
        for(int i = 0; i<=0; i++){
            if(herocard5.getIcon() == gdcdimg){
                int r = ran.nextInt(10000);
                int r2 = (int)(Math.random() * card4arr.length);
                int r3 = (int)(Math.random() * card5arr.length);
                int r4 = (int)(Math.random() * card6arr.length);
                int r5 = (int)(Math.random() * spcard4arr.length);
                int r6 = (int)(Math.random() * spcard5arr.length);
                int r7 = (int)(Math.random() * spcard6arr.length);
                int r8 = (int)(Math.random() * jspcard4arr.length);
                int r9 = (int)(Math.random() * jspcard5arr.length);
                int r10 = (int)(Math.random() * jspcard6arr.length);
                if(r <= speical6hero){
                    starsp6hero[i] = new ImageIcon(getClass().getClassLoader().getResource(spcard6arr[r7]));
//                    starsp6hero[i]= starsp6hero[i];
                    herocard5.setIcon(starsp6hero[i]);
                    cardcount++;
                    SpHeroCount();
                    nmcardclickPlay();
                }
                else if(r <= speical5hero){
                    starsp5hero[i] = new ImageIcon(getClass().getClassLoader().getResource(spcard5arr[r6]));
//                    starsp5hero[i]= starsp5hero[i];
                    herocard5.setIcon(starsp5hero[i]);
                    cardcount++;
                    SpHeroCount();
                    nmcardclickPlay();
                }
                else if(r <= jspeical5hero){
                    starjsp5hero[i] = new ImageIcon(getClass().getClassLoader().getResource(jspcard5arr[r9]));
//                    starsp5hero[i]= starjsp5hero[i];
                    herocard5.setIcon(starjsp5hero[i]);
                    cardcount++;
                    SpHeroCount();
                    nmcardclickPlay();
                }
                else if(r <= speical4hero){
                    starsp4hero[i] = new ImageIcon(getClass().getClassLoader().getResource(spcard4arr[r5]));
//                    starsp4hero[i]= starsp4hero[i];
                    herocard5.setIcon(starsp4hero[i]);
                    cardcount++;
                    SpHeroCount();
                    nmcardclickPlay();
                } 
                
                else if(r <= jspeical4hero){
                    starjsp4hero[i] = new ImageIcon(getClass().getClassLoader().getResource(jspcard4arr[r8]));
//                    starsp4hero[i]= starjsp4hero[i];
                    herocard5.setIcon(starjsp4hero[i]);
                    cardcount++;
                    SpHeroCount();
                    nmcardclickPlay();
                }
                else if(r <= normal6hero){
                    star6nmhero[i] = new ImageIcon(getClass().getClassLoader().getResource(card6arr[r4]));
//                    star6nmhero[i]= star6nmhero[i];
                    herocard5.setIcon(star6nmhero[i]);
                    cardcount++;
                    nmcardclickPlay();
                }
                else if(r <= normal5hero){
                    star5nmhero[i] = new ImageIcon(getClass().getClassLoader().getResource(card5arr[r3]));
//                    star5nmhero[i]= star5nmhero[i];
                    herocard5.setIcon(star5nmhero[i]);
                    cardcount++;
                    nmcardclickPlay();
                } 
                else if(r <= normal4hero){
                    star4nmhero[i] = new ImageIcon(getClass().getClassLoader().getResource(card4arr[r2]));
//                    star4nmhero[i]= star4nmhero[i];
                    herocard5.setIcon(star4nmhero[i]);
                    cardcount++;
                    nmcardclickPlay();
                }
            }       
            else if(herocard5.getIcon() == svcdimg){
                int r1 = (int)(Math.random() * card3arr.length);
                star3nmhero[i] = new ImageIcon(getClass().getClassLoader().getResource(card3arr[r1]));
                //star3nmhero[i]= nmhero0;
                herocard5.setIcon(star3nmhero[i]);
                cardcount++;
                nmcardclickPlay();
            }else if(herocard5.getIcon() == svcdimg || herocard5.getIcon() == gdcdimg){
                if(cardcount < 11){
                    jButton4.setVisible(false);
                }
            }
            
        }
        if(cardcount == 11){
                    allOpenbtn.setVisible(false);
                    jButton4.setVisible(true);
                    cardcount = 0;
        }
       
        
    }//GEN-LAST:event_herocard5MouseClicked

    private void herocard6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_herocard6MouseClicked

        // TODO add your handling code here:
        for(int i = 0; i<=0; i++){
            if(herocard6.getIcon() == gdcdimg){
                int r = ran.nextInt(10000);
                int r2 = (int)(Math.random() * card4arr.length);
                int r3 = (int)(Math.random() * card5arr.length);
                int r4 = (int)(Math.random() * card6arr.length);
                int r5 = (int)(Math.random() * spcard4arr.length);
                int r6 = (int)(Math.random() * spcard5arr.length);
                int r7 = (int)(Math.random() * spcard6arr.length);
                int r8 = (int)(Math.random() * jspcard4arr.length);
                int r9 = (int)(Math.random() * jspcard5arr.length);
                int r10 = (int)(Math.random() * jspcard6arr.length);
                if(r <= speical6hero){
                    starsp6hero[i] = new ImageIcon(getClass().getClassLoader().getResource(spcard6arr[r7]));
//                    starsp6hero[i]= starsp6hero[i];
                    herocard6.setIcon(starsp6hero[i]);
                    cardcount++;
                    SpHeroCount();
                    nmcardclickPlay();
                }
                else if(r <= speical5hero){
                    starsp5hero[i] = new ImageIcon(getClass().getClassLoader().getResource(spcard5arr[r6]));
//                    starsp5hero[i]= starsp5hero[i];
                    herocard6.setIcon(starsp5hero[i]);
                    cardcount++;
                    SpHeroCount();
                    nmcardclickPlay();
                }
                else if(r <= jspeical5hero){
                    starjsp5hero[i] = new ImageIcon(getClass().getClassLoader().getResource(jspcard5arr[r9]));
//                    starsp5hero[i]= starjsp5hero[i];
                    herocard6.setIcon(starjsp5hero[i]);
                    cardcount++;
                    SpHeroCount();
                    nmcardclickPlay();
                }
                else if(r <= jspeical4hero){
                    starjsp4hero[i] = new ImageIcon(getClass().getClassLoader().getResource(jspcard4arr[r8]));
//                    starsp4hero[i]= starjsp4hero[i];
                    herocard6.setIcon(starjsp4hero[i]);
                    cardcount++;
                    nmcardclickPlay();
                }
                else if(r <= speical4hero){
                    starsp4hero[i] = new ImageIcon(getClass().getClassLoader().getResource(spcard4arr[r5]));
//                    starsp4hero[i]= starsp4hero[i];
                    herocard6.setIcon(starsp4hero[i]);
                    cardcount++;
                    SpHeroCount();
                    nmcardclickPlay();
                } 
                
                
                else if(r <= normal6hero){
                    star6nmhero[i] = new ImageIcon(getClass().getClassLoader().getResource(card6arr[r4]));
//                    star6nmhero[i]= star6nmhero[i];
                    herocard6.setIcon(star6nmhero[i]);
                    cardcount++;
                    SpHeroCount();
                    nmcardclickPlay();
                }
                else if(r <= normal5hero){
                    star5nmhero[i] = new ImageIcon(getClass().getClassLoader().getResource(card5arr[r3]));
//                    star5nmhero[i]= star5nmhero[i];
                    herocard6.setIcon(star5nmhero[i]);
                    cardcount++;
                    SpHeroCount();
                    nmcardclickPlay();
                } 
                else if(r <= normal4hero){
                    star4nmhero[i] = new ImageIcon(getClass().getClassLoader().getResource(card4arr[r2]));
//                    star4nmhero[i]= star4nmhero[i];
                    herocard6.setIcon(star4nmhero[i]);
                    cardcount++;
                    nmcardclickPlay();
                }
            }       
            else if(herocard6.getIcon() == svcdimg){
                int r1 = (int)(Math.random() * card3arr.length);
                star3nmhero[i] = new ImageIcon(getClass().getClassLoader().getResource(card3arr[r1]));
                //star3nmhero[i]= nmhero0;
                herocard6.setIcon(star3nmhero[i]);
                cardcount++;
                nmcardclickPlay();
            }else if(herocard6.getIcon() == svcdimg || herocard6.getIcon() == gdcdimg){
                if(cardcount < 11){
                    jButton4.setVisible(false);
                }
            }
            
        }
        if(cardcount == 11){
                    allOpenbtn.setVisible(false);
                    jButton4.setVisible(true);
                    cardcount = 0;
        }
            
    }//GEN-LAST:event_herocard6MouseClicked

    private void herocard7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_herocard7MouseClicked

        // TODO add your handling code here:
        for(int i = 0; i<=0; i++){
            if(herocard7.getIcon() == gdcdimg){
                int r = ran.nextInt(10000);
                int r2 = (int)(Math.random() * card4arr.length);
                int r3 = (int)(Math.random() * card5arr.length);
                int r4 = (int)(Math.random() * card6arr.length);
                int r5 = (int)(Math.random() * spcard4arr.length);
                int r6 = (int)(Math.random() * spcard5arr.length);
                int r7 = (int)(Math.random() * spcard6arr.length);
                int r8 = (int)(Math.random() * jspcard4arr.length);
                int r9 = (int)(Math.random() * jspcard5arr.length);
                int r10 = (int)(Math.random() * jspcard6arr.length);
                if(r <= speical6hero){
                    starsp6hero[i] = new ImageIcon(getClass().getClassLoader().getResource(spcard6arr[r7]));
//                    starsp6hero[i]= starsp6hero[i];
                    herocard7.setIcon(starsp6hero[i]);
                    cardcount++;
                    SpHeroCount();
                    nmcardclickPlay();
                }
                else if(r <= speical5hero){
                    starsp5hero[i] = new ImageIcon(getClass().getClassLoader().getResource(spcard5arr[r6]));
//                    starsp5hero[i]= starsp5hero[i];
                    herocard7.setIcon(starsp5hero[i]);
                    cardcount++;
                    SpHeroCount();
                    nmcardclickPlay();
                }
                else if(r <= jspeical5hero){
                    starjsp5hero[i] = new ImageIcon(getClass().getClassLoader().getResource(jspcard5arr[r9]));
//                    starsp5hero[i]= starjsp5hero[i];
                    herocard7.setIcon(starjsp5hero[i]);
                    cardcount++;
                    SpHeroCount();
                    nmcardclickPlay();
                }
                else if(r <= speical4hero){
                    starsp4hero[i] = new ImageIcon(getClass().getClassLoader().getResource(spcard4arr[r5]));
//                    starsp4hero[i]= starsp4hero[i];
                    herocard7.setIcon(starsp4hero[i]);
                    cardcount++;
                    SpHeroCount();
                    nmcardclickPlay();
                } 
                
                else if(r <= jspeical4hero){
                    starjsp4hero[i] = new ImageIcon(getClass().getClassLoader().getResource(jspcard4arr[r8]));
//                    starsp4hero[i]= starjsp4hero[i];
                    herocard7.setIcon(starjsp4hero[i]);
                    cardcount++;
                    SpHeroCount();
                    nmcardclickPlay();
                }
                else if(r <= normal6hero){
                    star6nmhero[i] = new ImageIcon(getClass().getClassLoader().getResource(card6arr[r4]));
//                    star6nmhero[i]= star6nmhero[i];
                    herocard7.setIcon(star6nmhero[i]);
                    cardcount++;
                    nmcardclickPlay();
                }
                else if(r <= normal5hero){
                    star5nmhero[i] = new ImageIcon(getClass().getClassLoader().getResource(card5arr[r3]));
//                    star5nmhero[i]= star5nmhero[i];
                    herocard7.setIcon(star5nmhero[i]);
                    cardcount++;
                    nmcardclickPlay();
                } 
                else if(r <= normal4hero){
                    star4nmhero[i] = new ImageIcon(getClass().getClassLoader().getResource(card4arr[r2]));
//                    star4nmhero[i]= star4nmhero[i];
                    herocard7.setIcon(star4nmhero[i]);
                    cardcount++;
                    nmcardclickPlay();
                }
            }       
            else if(herocard7.getIcon() == svcdimg){
                int r1 = (int)(Math.random() * card3arr.length);
                star3nmhero[i] = new ImageIcon(getClass().getClassLoader().getResource(card3arr[r1]));
                //star3nmhero[i]= nmhero0;
                herocard7.setIcon(star3nmhero[i]);
                cardcount++;
                nmcardclickPlay();
            }else if(herocard7.getIcon() == svcdimg || herocard7.getIcon() == gdcdimg){
                if(cardcount < 11){
                    jButton4.setVisible(false);
                }
            }
            
        }
        if(cardcount == 11){
                    allOpenbtn.setVisible(false);
                    jButton4.setVisible(true);
                    cardcount = 0;
        }
        
    }//GEN-LAST:event_herocard7MouseClicked

    private void herocard8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_herocard8MouseClicked
        // TODO add your handling code here:
        for(int i = 0; i<=0; i++){
            if(herocard8.getIcon() == gdcdimg){
                int r = ran.nextInt(10000);
                int r2 = (int)(Math.random() * card4arr.length);
                int r3 = (int)(Math.random() * card5arr.length);
                int r4 = (int)(Math.random() * card6arr.length);
                int r5 = (int)(Math.random() * spcard4arr.length);
                int r6 = (int)(Math.random() * spcard5arr.length);
                int r7 = (int)(Math.random() * spcard6arr.length);
                int r8 = (int)(Math.random() * jspcard4arr.length);
                int r9 = (int)(Math.random() * jspcard5arr.length);
                int r10 = (int)(Math.random() * jspcard6arr.length);
                if(r <= speical6hero){
                    starsp6hero[i] = new ImageIcon(getClass().getClassLoader().getResource(spcard6arr[r7]));
//                    starsp6hero[i]= starsp6hero[i];
                    herocard8.setIcon(starsp6hero[i]);
                    cardcount++;
                    SpHeroCount();
                    nmcardclickPlay();
                }
                else if(r <= speical5hero){
                    starsp5hero[i] = new ImageIcon(getClass().getClassLoader().getResource(spcard5arr[r6]));
//                    starsp5hero[i]= starsp5hero[i];
                    herocard8.setIcon(starsp5hero[i]);
                    cardcount++;
                    SpHeroCount();
                    nmcardclickPlay();
                }
                else if(r <= jspeical5hero){
                    starjsp5hero[i] = new ImageIcon(getClass().getClassLoader().getResource(jspcard5arr[r9]));
//                    starsp5hero[i]= starjsp5hero[i];
                    herocard8.setIcon(starjsp5hero[i]);
                    cardcount++;
                    SpHeroCount();
                    nmcardclickPlay();
                }
                else if(r <= speical4hero){
                    starsp4hero[i] = new ImageIcon(getClass().getClassLoader().getResource(spcard4arr[r5]));
//                    starsp4hero[i]= starsp4hero[i];
                    herocard8.setIcon(starsp4hero[i]);
                    cardcount++;
                    SpHeroCount();
                    nmcardclickPlay();
                } 
                
                else if(r <= jspeical4hero){
                    starjsp4hero[i] = new ImageIcon(getClass().getClassLoader().getResource(jspcard4arr[r8]));
//                    starsp4hero[i]= starjsp4hero[i];
                    herocard8.setIcon(starjsp4hero[i]);
                    cardcount++;
                    SpHeroCount();
                    nmcardclickPlay();
                }
                else if(r <= normal6hero){
                    star6nmhero[i] = new ImageIcon(getClass().getClassLoader().getResource(card6arr[r4]));
//                    star6nmhero[i]= star6nmhero[i];
                    herocard8.setIcon(star6nmhero[i]);
                    cardcount++;
                    nmcardclickPlay();
                }
                else if(r <= normal5hero){
                    star5nmhero[i] = new ImageIcon(getClass().getClassLoader().getResource(card5arr[r3]));
//                    star5nmhero[i]= star5nmhero[i];
                    herocard8.setIcon(star5nmhero[i]);
                    cardcount++;
                    nmcardclickPlay();
                } 
               else if(r <= normal4hero){
                    star4nmhero[i] = new ImageIcon(getClass().getClassLoader().getResource(card4arr[r2]));
//                    star4nmhero[i]= star4nmhero[i];
                    herocard8.setIcon(star4nmhero[i]);
                    cardcount++;
                    nmcardclickPlay();
                }
            }       
            else if(herocard8.getIcon() == svcdimg){
                int r1 = (int)(Math.random() * card3arr.length);
                star3nmhero[i] = new ImageIcon(getClass().getClassLoader().getResource(card3arr[r1]));
                //star3nmhero[i]= nmhero0;
                herocard8.setIcon(star3nmhero[i]);
                cardcount++;
                nmcardclickPlay();
            }else if(herocard8.getIcon() == svcdimg || herocard8.getIcon() == gdcdimg){
                if(cardcount < 11){
                    jButton4.setVisible(false);
                }
            }
            
        }
        if(cardcount == 11){
                    allOpenbtn.setVisible(false);
                    jButton4.setVisible(true);
                    cardcount = 0;
        }
        
    }//GEN-LAST:event_herocard8MouseClicked

    private void herocard9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_herocard9MouseClicked

        // TODO add your handling code here:
        for(int i = 0; i<=0; i++){
            if(herocard9.getIcon() == gdcdimg){
                int r = ran.nextInt(10000);
                int r2 = (int)(Math.random() * card4arr.length);
                int r3 = (int)(Math.random() * card5arr.length);
                int r4 = (int)(Math.random() * card6arr.length);
                int r5 = (int)(Math.random() * spcard4arr.length);
                int r6 = (int)(Math.random() * spcard5arr.length);
                int r7 = (int)(Math.random() * spcard6arr.length);
                int r8 = (int)(Math.random() * jspcard4arr.length);
                int r9 = (int)(Math.random() * jspcard5arr.length);
                int r10 = (int)(Math.random() * jspcard6arr.length);
                if(r <= speical6hero){
                    starsp6hero[i] = new ImageIcon(getClass().getClassLoader().getResource(spcard6arr[r7]));
//                    starsp6hero[i]= starsp6hero[i];
                    herocard9.setIcon(starsp6hero[i]);
                    cardcount++;
                    SpHeroCount();
                    nmcardclickPlay();
                }
                else if(r <= speical5hero){
                    starsp5hero[i] = new ImageIcon(getClass().getClassLoader().getResource(spcard5arr[r6]));
//                    starsp5hero[i]= starsp5hero[i];
                    herocard9.setIcon(starsp5hero[i]);
                    cardcount++;
                    SpHeroCount();
                    nmcardclickPlay();
                }
                else if(r <= jspeical5hero){
                    starjsp5hero[i] = new ImageIcon(getClass().getClassLoader().getResource(jspcard5arr[r9]));
//                    starsp5hero[i]= starjsp5hero[i];
                    herocard9.setIcon(starjsp5hero[i]);
                    cardcount++;
                    SpHeroCount();
                    nmcardclickPlay();
                }
                else if(r <= speical4hero){
                    starsp4hero[i] = new ImageIcon(getClass().getClassLoader().getResource(spcard4arr[r5]));
//                    starsp4hero[i]= starsp4hero[i];
                    herocard9.setIcon(starsp4hero[i]);
                    cardcount++;
                    SpHeroCount();
                    nmcardclickPlay();
                } 
                
                else if(r <= jspeical4hero){
                    starjsp4hero[i] = new ImageIcon(getClass().getClassLoader().getResource(jspcard4arr[r8]));
//                    starsp4hero[i]= starjsp4hero[i];
                    herocard9.setIcon(starjsp4hero[i]);
                    cardcount++;
                    SpHeroCount();
                    nmcardclickPlay();
                }
                else if(r <= normal6hero){
                    star6nmhero[i] = new ImageIcon(getClass().getClassLoader().getResource(card6arr[r4]));
//                    star6nmhero[i]= star6nmhero[i];
                    herocard9.setIcon(star6nmhero[i]);
                    cardcount++;
                    nmcardclickPlay();
                }
                else if(r <= normal5hero){
                    star5nmhero[i] = new ImageIcon(getClass().getClassLoader().getResource(card5arr[r3]));
//                    star5nmhero[i]= star5nmhero[i];
                    herocard9.setIcon(star5nmhero[i]);
                    cardcount++;
                    nmcardclickPlay();
                } 
                else if(r <= normal4hero){
                    star4nmhero[i] = new ImageIcon(getClass().getClassLoader().getResource(card4arr[r2]));
//                    star4nmhero[i]= star4nmhero[i];
                    herocard9.setIcon(star4nmhero[i]);
                    cardcount++;
                    nmcardclickPlay();
                }
            }       
            else if(herocard9.getIcon() == svcdimg){
                int r1 = (int)(Math.random() * card3arr.length);
                star3nmhero[i] = new ImageIcon(getClass().getClassLoader().getResource(card3arr[r1]));
                //star3nmhero[i]= nmhero0;
                herocard9.setIcon(star3nmhero[i]);
                cardcount++;
                nmcardclickPlay();
            }else if(herocard9.getIcon() == svcdimg || herocard9.getIcon() == gdcdimg){
                if(cardcount < 11){
                    jButton4.setVisible(false);
                }
            }
            
        }
        if(cardcount == 11){
                    allOpenbtn.setVisible(false);
                    jButton4.setVisible(true);
                    cardcount = 0;
        }
        
    }//GEN-LAST:event_herocard9MouseClicked

    private void herocard10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_herocard10MouseClicked
        // TODO add your handling code here:
        for(int i = 0; i<=0; i++){
              if(herocard10.getIcon() == gdcdimg){
                int r = ran.nextInt(10000);
                int r2 = (int)(Math.random() * card4arr.length);
                int r3 = (int)(Math.random() * card5arr.length);
                int r4 = (int)(Math.random() * card6arr.length);
                int r5 = (int)(Math.random() * spcard4arr.length);
                int r6 = (int)(Math.random() * spcard5arr.length);
                int r7 = (int)(Math.random() * spcard6arr.length);
                int r8 = (int)(Math.random() * jspcard4arr.length);
                int r9 = (int)(Math.random() * jspcard5arr.length);
                int r10 = (int)(Math.random() * jspcard6arr.length);
                if(r <= speical6hero){
                    starsp6hero[i] = new ImageIcon(getClass().getClassLoader().getResource(spcard6arr[r7]));
//                    starsp6hero[i]= starsp6hero[i];
                    herocard10.setIcon(starsp6hero[i]);
                    cardcount++;
                    SpHeroCount();
                    nmcardclickPlay();
                }
                else if(r <= speical5hero){
                    starsp5hero[i] = new ImageIcon(getClass().getClassLoader().getResource(spcard5arr[r6]));
//                    starsp5hero[i]= starsp5hero[i];
                    herocard10.setIcon(starsp5hero[i]);
                    cardcount++;
                    SpHeroCount();
                    nmcardclickPlay();
                }
                else if(r <= jspeical5hero){
                    starjsp5hero[i] = new ImageIcon(getClass().getClassLoader().getResource(jspcard5arr[r9]));
//                    starsp5hero[i]= starjsp5hero[i];
                    herocard10.setIcon(starjsp5hero[i]);
                    cardcount++;
                    SpHeroCount();
                    nmcardclickPlay();
                }
                else if(r <= speical4hero){
                    starsp4hero[i] = new ImageIcon(getClass().getClassLoader().getResource(spcard4arr[r5]));
//                    starsp4hero[i]= starsp4hero[i];
                    herocard10.setIcon(starsp4hero[i]);
                    cardcount++;
                    SpHeroCount();
                    nmcardclickPlay();
                } 
                
                else if(r <= jspeical4hero){
                    starjsp4hero[i] = new ImageIcon(getClass().getClassLoader().getResource(jspcard4arr[r8]));
//                    starsp4hero[i]= starjsp4hero[i];
                    herocard10.setIcon(starjsp4hero[i]);
                    cardcount++;
                    SpHeroCount();
                    nmcardclickPlay();
                }
                else if(r <= normal6hero){
                    star6nmhero[i] = new ImageIcon(getClass().getClassLoader().getResource(card6arr[r4]));
//                    star6nmhero[i]= star6nmhero[i];
                    herocard10.setIcon(star6nmhero[i]);
                    cardcount++;
                    nmcardclickPlay();
                }
                else if(r <= normal5hero){
                    star5nmhero[i] = new ImageIcon(getClass().getClassLoader().getResource(card5arr[r3]));
//                    star5nmhero[i]= star5nmhero[i];
                    herocard10.setIcon(star5nmhero[i]);
                    cardcount++;
                    nmcardclickPlay();
                } 
                else if(r <= normal4hero){
                    star4nmhero[i] = new ImageIcon(getClass().getClassLoader().getResource(card4arr[r2]));
//                    star4nmhero[i]= star4nmhero[i];
                    herocard10.setIcon(star4nmhero[i]);
                    cardcount++;
                    nmcardclickPlay();
                }
            }
            else if(herocard10.getIcon() == svcdimg){
                int r1 = (int)(Math.random() * card3arr.length);
                star3nmhero[i] = new ImageIcon(getClass().getClassLoader().getResource(card3arr[r1]));
                //star3nmhero[i]= nmhero0;
                herocard10.setIcon(star3nmhero[i]);
                cardcount++;
                nmcardclickPlay();
            }else if(herocard10.getIcon() == svcdimg || herocard10.getIcon() == gdcdimg){
                if(cardcount < 11){
                    jButton4.setVisible(false);
                }
            }
            
        }
        if(cardcount == 11){
                    allOpenbtn.setVisible(false);
                    jButton4.setVisible(true);
                    cardcount = 0;
        }
        
    }//GEN-LAST:event_herocard10MouseClicked

    private void allOpenbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_allOpenbtnMouseClicked
        // TODO add your handling code here:
        jButton4.setVisible(true);
        //cardcount = 11;
        clickPlay();
        herocard10MouseClicked(evt);
        herocard9MouseClicked(evt);
        herocard8MouseClicked(evt);
        herocard7MouseClicked(evt);
        herocard6MouseClicked(evt);
        herocard5MouseClicked(evt);
        herocard4MouseClicked(evt);
        herocard3MouseClicked(evt);
        herocard2MouseClicked(evt);
        herocard1MouseClicked(evt);
        herocard11MouseClicked(evt);
      
        allOpenbtn.setVisible(false);
        
        
    }//GEN-LAST:event_allOpenbtnMouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void allOpenbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_allOpenbtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_allOpenbtnActionPerformed
    
    
    /**
     * @param args the command line arguments
     */
    
    public void cardSummon(){
        int gdcount = 1;
        herocard11.setIcon(freegdcd);
        for(int i=0; i<8; i++){
            int r = ran.nextInt(10000);
            if (r <= gdcd){
                arr[i] = gdcdimg;
                gdcount++;
            }else{
                arr[i] = svcdimg;
            }
        }
        for(int j=8; j<=arr.length-1; j++){
            int r = ran.nextInt(10000);
            if(gdcount <= 3){
               arr[j] = gdcdimg;
               gdcount++;  
            }else{
                arr[j] = svcdimg;
            }
            
            
        }
        herocard1.setIcon(arr[0]);
        herocard2.setIcon(arr[1]);
        herocard3.setIcon(arr[2]);
        herocard4.setIcon(arr[3]);
        herocard5.setIcon(arr[4]);
        herocard6.setIcon(arr[5]);
        herocard7.setIcon(arr[6]);
        herocard8.setIcon(arr[7]);
        herocard9.setIcon(arr[8]);
        herocard10.setIcon(arr[9]);
        
        
         
    }
 
    public static void main(String args[]) {
        
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton allOpenbtn;
    private javax.swing.JLabel getNick;
    private javax.swing.JLabel herocard1;
    private javax.swing.JLabel herocard10;
    private javax.swing.JLabel herocard11;
    private javax.swing.JLabel herocard2;
    private javax.swing.JLabel herocard3;
    private javax.swing.JLabel herocard4;
    private javax.swing.JLabel herocard5;
    private javax.swing.JLabel herocard6;
    private javax.swing.JLabel herocard7;
    private javax.swing.JLabel herocard8;
    private javax.swing.JLabel herocard9;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField smname;
    private javax.swing.JLabel spcnt;
    private javax.swing.JLabel summoncnt;
    // End of variables declaration//GEN-END:variables

  
}
