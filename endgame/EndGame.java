/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.endgame;

/**
 *
 * @author maria
 */
public class EndGame {

    public static void main(String[] args) {
        Heroe blackPanter=new Heroe("Black Panter grr", "Ser el rey de todo Wakanda", "Garras de Vibranium");
        Villano galactus=new Villano("Galactus", "Devorar mundos", "usa de chalan a Silver Surfer");
        Avenger ironMan=new Avenger("Tony Stark", "Genio, Filantropo, Multimillonario, PlayBoy", "Mark 42", "Prime");
        Thanos thanos=new Thanos("Thanos", "El titan loco", "Ejercito chitaury", " Gemas del infinito");
        
        //aplicando polimorfismo
        
        Personaje[] personajes={blackPanter, galactus, ironMan, thanos};
        for(Personaje personaje:personajes){
            personaje.atacar();
        }
        
        //metodo especifico de avenger
        ((Avenger)ironMan).reunirse();
        
        //ejemplo metodo especifico de thanos 
        thanos.chasquearDedos(); 
    }
}