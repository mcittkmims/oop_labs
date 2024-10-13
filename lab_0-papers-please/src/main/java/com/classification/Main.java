package com.classification;
import java.util.List;
import java.util.Scanner;

import com.classification.aliens.Alien;

import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    Alien thor = new Alien(1,true, "Asgard",1500, Arrays.asList("BLONDE", "TALL", "MUSCULAR"));
    System.out.println(thor);
  }
}

