/*
* File: Cone.java
* Author:  Molnár Csenge Anna
* Copyright: 2023, Molnár Csenge Anna
* Group: Szoft I-1 N
* Date: 2023-02-13
* Github: https://github.com/Verfarkas02/
* Licenc: GNU GPL
*/
public class Cone {
    double calcVolume(double radius, double height){
        //ide jön a képlet
        double Volume=(1.0/3.0)* 
        Math.pow(radius, 2) *
        Math.PI * height;
        return Volume;
        }
}
