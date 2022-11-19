package br.inatel.cdg;

import VotoInvalidoExcpetion.VotoInvalidoException;

import java.io.*;
import java.util.ArrayList;
import java.util.Objects;

public class Arquivo {

    public void adicionarPaulinho(Pessoa p){

        OutputStream os = null;
        OutputStreamWriter osw = null;
        BufferedWriter bw = null;
        String linhaEscrever;

        try{
            //append = true adiciona um texto em seguida do outro / append = false sobrescreve o txt antigo
            os = new FileOutputStream("votoPaulinho.txt",true);
            osw = new OutputStreamWriter(os);
            bw = new BufferedWriter(osw);

            try{
                if(p.getCpf().length() != 11 || !Objects.equals(p.getVoto(), "77"))
                {
                    throw new VotoInvalidoException();
                } else{
                    bw.write("Voto");
                    bw.newLine();
                    bw.write(p.getCpf() + "\n");
                    System.out.println("Voto confirmado!");
                }
            }catch(VotoInvalidoException e){
            }

        }catch (Exception e){
            System.out.println(e);
        }finally {
            try{
                bw.close();
            }catch(Exception e){
                System.out.println(e);
            }
        }
    }

    public void adicionarRogerao(Pessoa p){

        OutputStream os = null;
        OutputStreamWriter osw = null;
        BufferedWriter bw = null;
        String linhaEscrever;

        try{
            //append = true adiciona um texto em seguida do outro / append = false sobrescreve o txt antigo
            os = new FileOutputStream("votoRogerao.txt",true);
            osw = new OutputStreamWriter(os);
            bw = new BufferedWriter(osw);

            try{
                if(p.getCpf().length() != 11 || !Objects.equals(p.getVoto(), "51"))
                {
                    throw new VotoInvalidoException();
                } else{
                    bw.write("Voto");
                    bw.newLine();
                    bw.write(p.getCpf() + "\n");
                    System.out.println("Voto confirmado!");
                }
            }catch(VotoInvalidoException e){
            }

        }catch (Exception e){
            System.out.println(e);
        }finally {
            try{
                bw.close();
            }catch(Exception e){
                System.out.println(e);
            }
        }
    }

    public void adicionarDarth(Pessoa p){

        OutputStream os = null;
        OutputStreamWriter osw = null;
        BufferedWriter bw = null;
        String linhaEscrever;

        try{
            //append = true adiciona um texto em seguida do outro / append = false sobrescreve o txt antigo
            os = new FileOutputStream("votoDarth.txt",true);
            osw = new OutputStreamWriter(os);
            bw = new BufferedWriter(osw);

            try{
                if(p.getCpf().length() != 11 || !Objects.equals(p.getVoto(), "43"))
                {
                    throw new VotoInvalidoException();
                } else{
                    bw.write("Voto");
                    bw.newLine();
                    bw.write(p.getCpf() + "\n");
                    System.out.println("Voto confirmado!");
                }
            }catch(VotoInvalidoException e){
            }

        }catch (Exception e){
            System.out.println(e);
        }finally {
            try{
                bw.close();
            }catch(Exception e){
                System.out.println(e);
            }
        }
    }

    public ArrayList<Pessoa> lerPaulinho(){

        InputStream is = null;
        InputStreamReader ir = null;
        BufferedReader br = null;
        String lerLinha;

        ArrayList<Pessoa> al = new ArrayList<>();

        try{

            is = new FileInputStream("votoPaulinho.txt");
            ir = new InputStreamReader(is);
            br = new BufferedReader(ir);

            lerLinha = br.readLine();
            int cont = 0;
            while(lerLinha != null){
                if(lerLinha.contains("Voto")){
                    Pessoa aux = new Pessoa();
                    aux.setCpf(br.readLine());
                    al.add(aux);
                    cont++;
                }
                lerLinha = br.readLine();
            }
            System.out.println("Total votos do Paulinho: " + cont);

        }catch(Exception e){
            System.out.println(e);
        }finally{
            try{
                br.close();
            }catch(Exception e){
                System.out.println(e);
            }
        }

        return al;
    }
    public ArrayList<Pessoa> lerRogerao(){

        InputStream is = null;
        InputStreamReader ir = null;
        BufferedReader br = null;
        String lerLinha;

        ArrayList<Pessoa> al = new ArrayList<>();

        try{

            is = new FileInputStream("votoRogerao.txt");
            ir = new InputStreamReader(is);
            br = new BufferedReader(ir);

            lerLinha = br.readLine();
            int cont = 0;
            while(lerLinha != null){
                if(lerLinha.contains("Voto")){
                    Pessoa aux = new Pessoa();
                    aux.setCpf(br.readLine());
                    al.add(aux);
                    cont++;
                }
                lerLinha = br.readLine();
            }
            System.out.println("Total votos Rogerao: " + cont);

        }catch(Exception e){
            System.out.println(e);
        }finally{
            try{
                br.close();
            }catch(Exception e){
                System.out.println(e);
            }
        }

        return al;
    }
    public ArrayList<Pessoa> lerDarth(){

        InputStream is = null;
        InputStreamReader ir = null;
        BufferedReader br = null;
        String lerLinha;

        ArrayList<Pessoa> al = new ArrayList<>();

        try{

            is = new FileInputStream("votoDarth.txt");
            ir = new InputStreamReader(is);
            br = new BufferedReader(ir);

            lerLinha = br.readLine();
            int cont = 0;
            while(lerLinha != null){
                if(lerLinha.contains("Voto")){
                    Pessoa aux = new Pessoa();
                    aux.setCpf(br.readLine());
                    al.add(aux);
                    cont++;
                }
                lerLinha = br.readLine();
            }
            System.out.println("Total votos do Darth Vader: " + cont);

        }catch(Exception e){
            System.out.println(e);
        }finally{
            try{
                br.close();
            }catch(Exception e){
                System.out.println(e);
            }
        }

        return al;
    }
}