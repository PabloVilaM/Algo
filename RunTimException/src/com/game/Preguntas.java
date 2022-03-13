package com.game;

import javax.swing.*;
import java.util.HashMap;
import java.util.Map;

public class Preguntas {

    public static Map crearLista(){
        Map<Integer, String> map = new HashMap<>();
        int a = 2;
        short b = 0;
        //Sección de casteo
        map.put(1, "Se puede hacer casteo de int a double? \na)Si. \nb)No. \nc)No es obligatorio pero puedes.");
        map.put(2, "Se puede hacer casteo de int a double? \na)Si. \nb)No. \nc)No es obligatorio pero puedes.");
         map.put(3, "Se puede hacer casteo de short a byte? \na)Si. \nb)No. \nc)No es obligatorio pero puedes. ");
        map.put(4, "Se puede hacer casteo de float a double? \na)Si. \nb)No. \nc)No es obligatorio pero puedes.");
        map.put(5, "Se puede hacer casteo de double a float? \na)Si. \nb)No. \nc)No es obligatorio pero puedes. ");
        map.put(6, "Se puede hacer casteo de int a long? \na)Si. \nb)No. \nc)No es obligatorio pero puedes. ");
        map.put(7, "Se puede hacer casteo de long a int? \na)Si. \nb)No. \nc)No es obligatorio pero puedes. ");
        map.put(8, "Se puede hacer casteo de short a long? \na)Si. \nb)No. \nc)No es obligatorio pero puedes. ");
        map.put(9, "Se puede hacer casteo de long a short? \na)Si. \nb)No. \nc)No es obligatorio pero puedes.");
        map.put(10, "Se puede hacer casteo de byte a short? \na)Si. \nb)No. \nc)No es obligatorio pero puedes.");
        //Seccion de String
        map.put(11, "Que se puede utilizar para invertir un String? \na)contrary(). \nb)reverse(). \nc)opposite(). \nd).counter()");
        map.put(12, "Que se puede utilizar para dividir un String? \na)divide(). \nb)substring(). \nc)partition(). \nd).separate()");
        map.put(13, "Que se puede utilizar para concatenar Strings? \na)concatenate(). \nb)C y D son correctas(). \nc)+,texto,+. \nd).concat()");
        map.put(14, "Que se puede utilizar para remplazar algun caracter por otro especificado? \na)substitute(). \nb)replace(). \nc)rerun(). \nd).supersede()");
        map.put(15, "Para conseguir un caracter de un String? \na)charIn(). \nb)charAt(). \nc)charOut(). \nd).charPatt()");
        map.put(16, "Cual es la forma incorrecta de pasar un string a minusculas? \na)tolowerCase(). \nb)tolowercase(). \nc)ToLowerCase(). \nd).Ninguna es correcta" );
        map.put(17, "Cual es la forma incorrecta de pasar un string a mayusculas? \na)toupperCase(). \nb)touppercase(). \nc)ToUpperCase(). \nd).Ninguna es correcta");
        map.put(18, "Existe el split()? \na)Existe en StringBuilder. \nb)No en String. \nc)No existe. \nd)Si en String.");
        map.put(19, "Como comparamos (por ejemplo en un if) dos Strings? \na)Con un ==. \nb)Con un compareTo(). \nc)No se puede. \nd)Con equals()");
        map.put(20, "length() en un String que nos da? \na)Los caracteres del String. \nb)El codigo asscii del String. \nc)No nos da nada. \nd)La longitud del String.");
        //Sección de Ficheros
        map.put(21, "Como se llama la comunicación entre el origen y el destino de un Fichero? \na)Flujo o Stream. \nb)Flujo. \nc)No tiene nombre \nd)Stream.");
        map.put(22, "Es importante cerrar el flujo de un Fichero? \na)Si para volver al último lugar que trataste. \nb)No porque el archivo seguira igual. \nc)Si porque luego no se puede abrir. \nd)No porque se cierra solo. ");
        map.put(23, "Formato de un fichero de Bytes? \na).dat. \nb).txt. \nc).sql. \nd).doc. ");
        map.put(24, "Para que se utiliza la serialización? \na)Clases operadas por nosotros. \nb)Datos primitivos. \nc)Los String. \nd)Datos primitivos + String");
        map.put(25, "Que viene en los archivos de Bytes serializado por defecto? \na)Datos primitivos + String. \nb)Datos primitivos. \nc)Los String. \nd)Clases operadas por nosotros.");
        map.put(26, "Que se utiliza cuando un atributo es transitorio (Archivos)? \na)transit. \nb)transitory. \nc)transient. \nd)temporary");
        map.put(27, "Cuantos pasos tenemos que hacer para tratar un Fichero? \na)1. \nb)2. \nc)3. \nd)4.");
        map.put(28, "Se trata con la misma clase la escritura y la lectura? \na)Si. \nb)No es obligatorio. \nc)No.");
        map.put(29, "Que pasa si intentamos escribir en un archivo inexistente? \na)Rompe el programa. \nb)No pasa nada. \nc)Lo crea. \nd)Lo crea pero salta error.");
        map.put(30, "Que tipos de ficheros hemos dado? \na)Texto. \nb)Bytes. \nc)Texto y Bytes. \nd)Texto y Numericos");

        return map;
    }

    public static String darPreguntas(int code, Map mapa){
        String pregunta = (String) mapa.get(code);
        return  pregunta;
    }

    public static boolean comprobarRespuesta(int code, String respuesta){
      boolean correcion = false;
        switch (code){
            case 10:
            case 8:
            case 4:
            case 1:
            case 6:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:

                switch (respuesta){
                    case "c":
                        System.out.println("Correctooooooo");
                        correcion = true;
                        break;
                    case "d":
                    case "a":
                    case "b":
                        System.out.println("De lado");
                        correcion = false;
                        break;
                }
                break;
            case 9:
            case 7:
            case 3:
            case 2:
            case 5:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
                switch (respuesta){
                    case "a":
                        System.out.println("Sorprendentemente correcto");
                        correcion = true;
                        break;
                    case "b":
                    case "c":
                    case "d":
                        System.out.println("Imposible mas incorrecto");
                        correcion = false;
                        break;
                }
                break;
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                switch (respuesta){
                    case "b":
                        System.out.println("Sin fallo");
                        correcion = true;
                        break;
                    case "d":
                    case "c":
                    case "a":
                        System.out.println("Con fallo");
                        correcion = false;
                        break;
                }
                break;
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
                switch (respuesta){
                    case "d":
                        System.out.println("Un buen acierto");
                        correcion = true;
                        break;
                    case "b":
                    case "c":
                    case "a":
                        System.out.println("Un buen fallo");
                        correcion = false;
                        break;
                }
                break;
        }
        return correcion;
    }
}
