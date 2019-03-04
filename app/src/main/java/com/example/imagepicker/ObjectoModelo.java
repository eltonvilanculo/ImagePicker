package com.example.imagepicker;

import java.util.ArrayList;
import java.util.List;

public class ObjectoModelo {

    String nome;
    int imageSrc;

    public ObjectoModelo() {
    }

    public ObjectoModelo(String nome, int imageSrc) {
        this.nome = nome;
        this.imageSrc = imageSrc;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getImageSrc() {
        return imageSrc;
    }

    public void setImageSrc(int imageSrc) {
        this.imageSrc = imageSrc;
    }

    public static String []getListaNomes(){

        return new String[]{"Elton Vilacnculo","Angelo Massagem","Socrates Utui","Etc.."};
    }
    public static int [] getListaImagens(){

        return new int[]{R.drawable.ic_launcher_background,R.drawable.ic_launcher_foreground,R.drawable.ic_launcher_foreground_primeira,R.drawable.ic_launcher_foreground_primeira};
    }
    public static List<ObjectoModelo> fillObject(){

        List<ObjectoModelo> listModelo = new ArrayList<>();
        int [] imageDrawable = getListaImagens();
        String [] nomes= getListaNomes();
        for (int i = 0 ; i<imageDrawable.length;i++){


            listModelo.add(new ObjectoModelo(nomes[i],imageDrawable[i]));
        }
        return listModelo;
    }
}
